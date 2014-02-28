/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gourmand.dao;

import gourmand.entities.Administrateur;
import gourmand.util.MyConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author BENAMARA
 */
public class AuthentificationPropEspDAO {
    
    public static int IDconnexion;

    public int AuthentificationProp (String login, String password) {
        int key = 0;
        String requete = "select * from proprietaireespacegourmand where password='" + password + "' and login='" + login + "'";
            
        try {
            
            Statement stm = MyConnection.getInstance().conn.createStatement();
            ResultSet res = stm.executeQuery(requete);
           
            while (res.next()) {
            
               // Administrateur admin = new Administrateur();
                //admin.getLogin((res.getString(key));
                System.out.println("login"+res.getString(1));
                System.out.println("pass"+res.getString(2));
               
                key=res.getInt(1);
                System.out.println("ok id Prop Es Gou  = "+key);
            }
        } catch (SQLException e) {
            System.out.println("erreur ??");
            System.out.println("erreur d'authentification" + e.getMessage());
            key=-1;
            System.out.println("non ok " +key);
            return key;
        }
        System.out.println("Etat "+key);
        IDconnexion = key;
        return key;
    }
    

}