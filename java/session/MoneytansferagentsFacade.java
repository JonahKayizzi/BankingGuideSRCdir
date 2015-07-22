/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entity.Moneytansferagents;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Jonah
 */
@Stateless
public class MoneytansferagentsFacade extends AbstractFacade<Moneytansferagents> {
    @PersistenceContext(unitName = "theBankingGuidePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MoneytansferagentsFacade() {
        super(Moneytansferagents.class);
    }
    
}
