/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gourmand.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/** 
 *
 * @author Hell
 */
public class MyConnection {
    public static MyConnection instance;
    public static Connection conn;
    
    private MyConnection() {
        String url = "jdbc:mysql://localhost:3306/projet_restaurant";
        String user = "root";
        String pwd = "";
        try {
            Class.forName("com.mysql.jdbc.Driver"); //charger drive au niveau memoire
            System.out.println("Driver chargé!");
        } catch (ClassNotFoundException ex) {
            System.err.println("Driver non chargé!"); //msg erreur en rouge
        }
        try {
            conn = DriverManager.getConnection(url, user, pwd);
        } catch (SQLException ex) {
            Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Connection établie!");
    }
    public static MyConnection getInstance() {
        if (instance == null) {
            instance = new MyConnection();
        }
        return instance;
    }
    public static Connection getConnection() {
        return conn;
        //commit
    }
}
