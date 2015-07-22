/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entity.Systemusers;
import java.sql.Timestamp;
import java.util.Random;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Jonah
 */
@Stateless
public class UserManager {

    public static void Deleteuser(Systemusers user) {
        SystemusersFacade systemuser = new SystemusersFacade();
        systemuser.remove(user);
    }

     
    @PersistenceContext(unitName = "theBankingGuidePU" )
    private EntityManager em;

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    public static String generatePwd (){
        int noOfCAPSAlpha = 1;
        int noOfDigits = 1;
        int noOfSplChars = 1;
        int minLen = 8;
        int maxLen = 12;
        char[] pswd = RandomPasswordGenerator.generatePswd(minLen, maxLen, noOfCAPSAlpha, noOfDigits, noOfSplChars);
        String password = new String(pswd);
        return password;
    }
    
    public void addUser(String username, String userpassword, String useremail, String usertype, Timestamp usertimestamp) {
         //To change body of generated methods, choose Tools | Templates.
        //em.flush();
        
        Systemusers systemusers = addNewUser(username, userpassword, useremail, usertype, usertimestamp);
        
        //return systemusers.getUserId();
    }

    private Systemusers addNewUser(String username, String userpassword, String useremail, String usertype, Timestamp usertimestamp) {
        //To change body of generated methods, choose Tools | Templates.
        Systemusers systemusers = new Systemusers();
        systemusers.setUserName(username);
        systemusers.setUserPassword(userpassword);
        systemusers.setUserEmail(useremail);
        systemusers.setUserType(usertype);
        systemusers.setSystemUsersTime(usertimestamp);
        
        em.persist(systemusers);
        
        return systemusers;
    }
}
