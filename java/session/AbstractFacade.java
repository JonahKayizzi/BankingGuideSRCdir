/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Jonah
 */
public abstract class AbstractFacade<T> {
    private Class<T> entityClass;

    public AbstractFacade(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    protected abstract EntityManager getEntityManager();

    public void create(T entity) {
        getEntityManager().persist(entity);
    }

    public void edit(T entity) {
        getEntityManager().merge(entity);
    }

    public void remove(T entity) {
        
        System.out.println(entity);
       
        getEntityManager().remove(getEntityManager().merge(entity));
    }
    
    public T find(Object id) {
        return getEntityManager().find(entityClass, id);
    }

    public List<T> findAll() {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
      
        return getEntityManager().createQuery(cq).getResultList();
//        EntityManager em = getEntityManager();
//        List<T> results = null;
//        try{
//            Query query = em.createNamedQuery(entityClass.getSimpleName()+".findAll");
//            results = (List<T>) query.getResultList();
//           }finally{
////            em.close();
//        }
//        return results;
        
    }


    public List<T> findByRecent (){
   // return getEntityManager().createNamedQuery(
    //        "SELECT u.userAccessRightsId, u.usrAcsRtsUserType, u.usrAcsRtsFunction, u.usrAcsRtsStatus, MAX(u.usrAcsRtsTime) FROM Useraccessrights u GROUP BY u.usrAcsRtsUserType, u.usrAcsRtsFunction")
    //        .getResultList();
        EntityManager em = getEntityManager();
        List<T> results = null;
        try{
            Query query = em.createNamedQuery("Useraccessrights.findAllRecent");
            results = (List<T>) query.getResultList();
           }finally{
//            em.close();
        }
        return results;
    }
    
    public List<T> findByUserRecent (Object type){
     EntityManager em = getEntityManager();
        List<T> results = null;
        try{
            Query query = em.createNamedQuery("Useraccessrights.findUserRecent")
                    .setParameter("usrAcsRtsUserType", type);
            results = (List<T>) query.getResultList();
           }finally{
//            em.close();
        }
        return results;
    }
    
    public List<T> findRange(int[] range) {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        javax.persistence.Query q = getEntityManager().createQuery(cq);
        q.setMaxResults(range[1] - range[0] + 1);
        q.setFirstResult(range[0]);
        return q.getResultList();
    }

    public int count() {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        javax.persistence.criteria.Root<T> rt = cq.from(entityClass);
        cq.select(getEntityManager().getCriteriaBuilder().count(rt));
        javax.persistence.Query q = getEntityManager().createQuery(cq);
        return ((Long) q.getSingleResult()).intValue();
    }
    
    public List<T> findByUsrTypeNFunction (Object type, Object function){

     EntityManager em = getEntityManager();

        List<T> results = null;

        try{

            Query query = em.createNamedQuery("Useraccessrights.findByUserTypeNRtsFunction")

                    .setParameter("usrAcsRtsUserType", type)

                .setParameter("usrAcsRtsFunction", function);

            results = (List<T>) query.getResultList();

           }finally{

//            em.close();

        }

        return results;

    }
    
//    public List<T> findByUserName (Object username){
//     EntityManager em = getEntityManager();
//        List<T> results = null;
//        try{
//            Query query = em.createNamedQuery("Systemusers.findByUserName")
//                    .setParameter("userName", username);
//            results = (List<T>) query.getResultList();
//           }finally{
////            em.close();
//        }
//        return results;
//    }
    public T findByUserName (Object username){
     EntityManager em = getEntityManager();
        T result;
        try{
            Query query = em.createNamedQuery("Systemusers.findByUserName")
                    .setParameter("userName", username);
            result = (T) query.getSingleResult();
           }finally{
//            em.close();
        }
        return result;
    }
}
