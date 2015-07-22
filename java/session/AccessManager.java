/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import java.sql.Timestamp;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import entity.Useraccessrights;

/**
 *
 * @author Jonah
 */
@Stateless
public class AccessManager {
 
    @PersistenceContext(unitName = "theBankingGuidePU" )
    private EntityManager em;

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    public void addAccessRights(String usertype, String function, Boolean accessright, Timestamp accesstimestamp) {
        
        Useraccessrights  useraccessrights = addNewRights(usertype, function, accessright, accesstimestamp);
    }
    
    private Useraccessrights addNewRights(String usertype, String function, Boolean accessright, Timestamp accesstimestamp) {
        //To change body of generated methods, choose Tools | Templates.
        Useraccessrights useraccessrights = new Useraccessrights();
        useraccessrights.setUsrAcsRtsUserType(usertype);
        useraccessrights.setUsrAcsRtsFunction(function);
        useraccessrights.setUsrAcsRtsStatus(accessright);
        useraccessrights.setUsrAcsRtsTime(accesstimestamp);
        
        
        em.persist(useraccessrights);
        
        return useraccessrights;
    }
}
