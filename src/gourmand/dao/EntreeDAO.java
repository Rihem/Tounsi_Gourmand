/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gourmand.dao;

import gourmand.entities.Entrees;
import gourmand.util.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mahdouch
 */
public class EntreeDAO implements Crud{

    static int idConnexion;
    
    @Override
    public void ajouter(Object o) {
        String url = " INSERT INTO entrees(libelleEntree,prix,idMenu) VALUES (?,?,?)";
        try {
            PreparedStatement prst = MyConnection.getInstance().conn.prepareStatement(url);
            Entrees c = (Entrees) o;
            prst.setString(1, c.getLibelleEntree());
            prst.setInt(2, c.getPrix());
            prst.setInt(3, c.getIdMenu());
            prst.executeUpdate();
            System.out.println("Insertion effectuée!");
        } catch (SQLException ex) {
            System.err.println("Probleme d'insertion");
        }
    }

    @Override
    public void supprimer(Object o) {
        DessertDAO a = new DessertDAO();
        String url = " DELETE FROM entrees WHERE id=" + a.idConnexion;
        try {
            PreparedStatement prst = MyConnection.getInstance().conn.prepareStatement(url);
            Entrees c = (Entrees) o;

            prst.executeUpdate();
            System.out.println("Suppression effectuée!");
        } catch (SQLException ex) {
            System.err.println("Probleme de suppression");
        }
    }

    @Override
    public void modifier(Object o) {
        try {
            String url = " UPDATE entrees SET libelleEntree=? , prix=? , idMenu=? WHERE id=" + idConnexion;
            PreparedStatement prst = MyConnection.getInstance().conn.prepareStatement(url);
            Entrees c = (Entrees) o;
            prst.setString(1, c.getLibelleEntree());
            prst.setInt(2, c.getPrix());
            prst.setInt(3, c.getIdMenu());
            prst.executeUpdate();
            System.out.println("Modification avec succes");
        } catch (SQLException ex) {
            System.err.println("Echec de modification!");
        }
    }

    @Override
    public List display() {
        List<Entrees> listeDesserts = new ArrayList<Entrees>();
        String url = "SELECT * FROM desserts";
        try {
            Statement st = MyConnection.getInstance().conn.createStatement();
            ResultSet rst = st.executeQuery(url);
            while (rst.next()) {
                Entrees c = new Entrees();
                c.setLibelleEntree(rst.getString(2));
                c.setPrix(rst.getInt(3));
                c.setIdMenu(rst.getInt(3));
            }
            return listeDesserts;
        } catch (SQLException ex) {
            return null;
        }
    }
    
}
