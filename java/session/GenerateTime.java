/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import java.sql.Timestamp;

/**
 *
 * @author Jonah
 */
public class GenerateTime {
    
    public static Timestamp currentTime()
    {
	 java.util.Date date= new java.util.Date();
	 java.sql.Timestamp currentTimeStamp = new Timestamp(date.getTime());
         return currentTimeStamp;
    }   
    
}
