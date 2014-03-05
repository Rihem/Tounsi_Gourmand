/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gourmand.dao;

import gourmand.util.MyConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author BENAMARA
 */
public class MailClient {
    

    public String MailClientPasse (String mail) {
     
        String passeRecover=null;
        String requete = "select * from client where email='" + mail + "'";
            
        try {
            
            Statement stm = MyConnection.getInstance().conn.createStatement();
            ResultSet res = stm.executeQuery(requete);
           
            while (res.next()) {
            
                
               passeRecover=res.getString(5);
                       
                System.out.println("oOok  le Mpasse Client est : = "+passeRecover);
            }
        } catch (SQLException e) {
         
            System.out.println("Mot de passe non retrouver " + e.getMessage());
            passeRecover=null;
            return passeRecover;
        }
        System.out.println("le Mot de passe du Client est : "+passeRecover);
        
        return passeRecover;
    }
    

    
    public String MailClientlogin (String mail) {
     
        String loginRecover=null;
        String requete = "select * from client where email='" + mail + "'";
            
        try {
            
            Statement stm = MyConnection.getInstance().conn.createStatement();
            ResultSet res = stm.executeQuery(requete);
           
            while (res.next()) {
            
                
               loginRecover=res.getString(4);
                       
                System.out.println("oOok  le login Client est : = "+loginRecover);
            }
        } catch (SQLException e) {
         
            System.out.println("login  non retrouver " + e.getMessage());
            loginRecover=null;
            return loginRecover;
        }
        System.out.println("le login du Client est : "+loginRecover);
        
        return loginRecover;
    }
    
    
}