/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gourmand.dao;

import gourmand.entities.Plats;
import gourmand.util.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Wael
 */
public class PlatDAO implements Crud{

    static int idConnexion;

    
    @Override
    public void ajouter(Object o) {
        String url = " INSERT INTO plats(libellePlat,prix,idMenu) VALUES (?,?,?)";
        try {
            PreparedStatement prst = MyConnection.getInstance().conn.prepareStatement(url);
            Plats c = (Plats) o;
            prst.setString(1, c.getLibellePlat());
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
        PlatDAO a = new PlatDAO();
        String url = " DELETE FROM plats WHERE id=" + a.idConnexion;
        try {
            PreparedStatement prst = MyConnection.getInstance().conn.prepareStatement(url);
            Plats c = (Plats) o;

            prst.executeUpdate();
            System.out.println("Suppression effectuée!");
        } catch (SQLException ex) {
            System.err.println("Probleme de suppression");
        }

    }

    @Override
    public void modifier(Object o) {
        try {
            String url = " UPDATE plats SET libellePlats=? , prix=? , idMenu=? WHERE id=" + idConnexion;
            PreparedStatement prst = MyConnection.getInstance().conn.prepareStatement(url);
            Plats c = (Plats) o;
            prst.setString(1, c.getLibellePlat());
            prst.setInt(2, c.getPrix());
            prst.setInt(3, c.getIdMenu());
            prst.executeUpdate();
            System.out.println("Modification avec succes");
        } catch (SQLException ex) {
            System.err.println("Echec de modification!");
        }
    }

    @Override
    public List<Plats> display() {
        List<Plats> listePlats = new ArrayList<Plats>();
        String url = "SELECT * FROM Plats";
        try {
            Statement st = MyConnection.getInstance().conn.createStatement();
            ResultSet rst = st.executeQuery(url);
            while (rst.next()) {
                Plats c = new Plats();
                c.setLibellePlat(rst.getString(2));
                c.setPrix(rst.getInt(3));
                c.setIdMenu(rst.getInt(3));
            }
            return listePlats;
        } catch (SQLException ex) {
            return null;
        }
    }
    
}
