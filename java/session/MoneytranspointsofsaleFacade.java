/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entity.Moneytranspointsofsale;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Jonah
 */
@Stateless
public class MoneytranspointsofsaleFacade extends AbstractFacade<Moneytranspointsofsale> {
    @PersistenceContext(unitName = "theBankingGuidePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MoneytranspointsofsaleFacade() {
        super(Moneytranspointsofsale.class);
    }
    
}
