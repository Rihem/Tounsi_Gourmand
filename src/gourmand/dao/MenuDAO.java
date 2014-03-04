/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gourmand.dao;


import gourmand.entities.Menu;
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
public class MenuDAO implements Crud{

    @Override
    public void ajouter(Object o) {
        String url = " INSERT INTO menu(date,idEspaceGourmand) VALUES (?,?)";
        try {
            PreparedStatement prst = MyConnection.getInstance().conn.prepareStatement(url);
            Menu M = (Menu) o;
            prst.setString(1, M.getDate());
            prst.setInt(2, M.getIdEspaceGourmand());
            
            prst.executeUpdate();
            System.out.println("Insertion effectuée!");
        } catch (SQLException ex) {
            System.err.println("Probleme d'insertion");
        }
    }

    @Override
    public void supprimer(Object o) {
        EspaceGourmandDAO a = new EspaceGourmandDAO();
        String url = " DELETE FROM menu WHERE idMenu=" + a.idConnexion;
        try {
            PreparedStatement prst = MyConnection.getInstance().conn.prepareStatement(url);
            Menu M = (Menu) o;

            prst.executeUpdate();
            System.out.println("Suppression effectuée!");
        } catch (SQLException ex) {
            System.err.println("Probleme de suppression");
        }
    }

    @Override
    public void modifier(Object o) {
        try {
            String url = " UPDATE menu SET date=? , idEspaceGourmand=? WHERE idMenu=" ;//=......
            PreparedStatement prst = MyConnection.getInstance().conn.prepareStatement(url);
            Menu M = (Menu) o;
            prst.setString(1, M.getDate());
            prst.setInt(2, M.getIdEspaceGourmand());
            
            prst.executeUpdate();
            System.out.println("Modification avec succes");
        } catch (SQLException ex) {
            System.err.println("Echec de modification!");
        }
    }

    @Override
    public List display() {
        List<Menu> listeMenu = new ArrayList<Menu>();
        String url = "SELECT * FROM menu";
        try {
            Statement st = MyConnection.getInstance().conn.createStatement();
            ResultSet rst = st.executeQuery(url);
            while (rst.next()) {
                Menu M = new Menu();
                M.setDate(rst.getString(2));
                M.setIdEspaceGourmand(rst.getInt(3));

                listeMenu.add(M);
            }
            return listeMenu;
        } catch (SQLException ex) {
            return null;
        }
    }
    
   
}
