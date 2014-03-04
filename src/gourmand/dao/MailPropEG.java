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
public class MailPropEG {
    

    public String MailPropEGPasse (String mail) {
     
        String passeRecover=null;
        String requete = "select * from proprietaireespacegourmand where email='" + mail + "'";
            
        try {
            
            Statement stm = MyConnection.getInstance().conn.createStatement();
            ResultSet res = stm.executeQuery(requete);
           
            while (res.next()) {
            
                
               passeRecover=res.getString(5);
                       
                System.out.println("oOok  Mpasse Propri : = "+passeRecover);
            }
        } catch (SQLException e) {
         
            System.out.println("Mot de passe non retrouver " + e.getMessage());
            passeRecover=null;
            return passeRecover;
        }
        System.out.println("le Mot de passe du Propri est "+passeRecover);
        
        return passeRecover;
    }
    

}