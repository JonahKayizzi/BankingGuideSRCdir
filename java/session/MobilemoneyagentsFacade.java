/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entity.Mobilemoneyagents;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Jonah
 */
@Stateless
public class MobilemoneyagentsFacade extends AbstractFacade<Mobilemoneyagents> {
    @PersistenceContext(unitName = "theBankingGuidePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MobilemoneyagentsFacade() {
        super(Mobilemoneyagents.class);
    }
    
}
