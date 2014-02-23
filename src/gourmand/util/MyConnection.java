/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gourmand.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Hell
 */
public class MyConnection {

    public static Connection getCurrentConnection() {
        if (con==null){
                con= new MyConnection().getConnection();}
            return con;
    }
   
    private String url="jdbc:mysql://localhost:3306/";
    private String nomUser= "root";
    private String mdp ="0000";
    private String nomBD ="pidev";
    private static Connection con;

    //verfié si la connection est etablite avant
    private  MyConnection() {
        }


    public Connection getConnection() {



        
        try
        {
            //chargement du driver
            Class.forName("com.mysql.jdbc.Driver");
            //etablir la connection
            con = DriverManager.getConnection(url+nomBD,nomUser,mdp);
            System.out.println("connection etablit");
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("erreur chargement de driver"+e.getMessage());
        }
        catch(SQLException s)
        {
            System.out.println("problem de connexion "+s.getMessage());
        }
        return con;
    }

}

