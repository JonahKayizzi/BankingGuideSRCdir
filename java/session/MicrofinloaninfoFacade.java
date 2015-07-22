/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entity.Microfinloaninfo;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Jonah
 */
@Stateless
public class MicrofinloaninfoFacade extends AbstractFacade<Microfinloaninfo> {
    @PersistenceContext(unitName = "theBankingGuidePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MicrofinloaninfoFacade() {
        super(Microfinloaninfo.class);
    }
    
}
