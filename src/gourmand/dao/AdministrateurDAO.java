/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gourmand.dao;

import gourmand.util.MyConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Wael
 */
public class AdministrateurDAO {
    
    private Connection con=MyConnection.getCurrentConnection();
    
    public static int IDconnexion;
    public int AuthentificationAdmin (String login, String password){
         int key = 0;
         try
        {
            String requete ="select * from administrateur where password='"+password+"' and login='"+login+"'";
            Statement stm = con.createStatement();
            ResultSet res = stm.executeQuery(requete);
            while(res.next()){
                key = res.getInt(1);
                
            }
        }
        catch(SQLException e)
        {
            System.out.println("erreur ??");
            System.out.println("erreur d'authentification"+e.getMessage());
        }
        IDconnexion=key;
        return key;
     }
    
}
