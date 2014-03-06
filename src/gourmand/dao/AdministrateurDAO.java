/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gourmand.dao;

import gourmand.entities.Administrateur;
import gourmand.entities.ProprietaireEspaceGourmand;
import gourmand.util.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
///
/**
 *
 * @author Wael
 */
public class AdministrateurDAO implements Crud {

    public static int IDconnexion;

    public int AuthentificationAdmin(String login, String password) {
        int key = 0;
        try {
            String requete = "select * from administrateur where password='" + password + "' and login='" + login + "'";
            Statement stm = MyConnection.getInstance().conn.createStatement();
            ResultSet res = stm.executeQuery(requete);
            while (res.next()) {
                key = res.getInt(1);
            }
        } catch (SQLException e) {
            System.out.println("erreur ??");
            System.out.println("erreur d'authentification" + e.getMessage());
        }
        IDconnexion = key;
        return key;
    }

    @Override
    public void ajouter(Object o) {
        String url = " INSERT INTO administrateur(login,password) VALUES (?,?)";
        try {
            PreparedStatement prst = MyConnection.getInstance().conn.prepareStatement(url);
            Administrateur c = (Administrateur) o;
            prst.setString(1, c.getLogin());
            prst.setString(2, c.getPassword());
            prst.executeUpdate();
            System.out.println("Insertion effectuée!");
        } catch (SQLException ex) {
            System.err.println("Probleme d'insertion");
        }
    }

    @Override
    public void supprimer(Object o) {
        AdministrateurDAO a = new AdministrateurDAO();
        String url = " DELETE FROM administrateur WHERE id=" + a.IDconnexion;
        try {
            PreparedStatement prst = MyConnection.getInstance().conn.prepareStatement(url);
            Administrateur c = (Administrateur) o;

            prst.executeUpdate();
            System.out.println("Suppression effectuée!");
        } catch (SQLException ex) {
            System.err.println("Probleme de suppression");
        }
    }

    @Override
    public void modifier(Object o) {

        try {
            String url = " UPDATE administrateur SET login=? , password=? WHERE id=" + IDconnexion;
            PreparedStatement prst = MyConnection.getInstance().conn.prepareStatement(url);
            Administrateur c = (Administrateur) o;
            prst.setString(1, c.getLogin());
            prst.setString(2, c.getPassword());
            prst.executeUpdate();
            System.out.println("Modification avec succes");
        } catch (SQLException ex) {
            System.err.println("Echec de modification!");
        }
    }

    @Override
    public List<Administrateur> display() {
        
        List <Administrateur> LA = new ArrayList<Administrateur>();
        String url = "select * fom adminstrateur";
         try {

            
            String req = "select * from user";
            Statement st = MyConnection.getInstance().conn.createStatement();
            ResultSet res = st.executeQuery(req);
            while (res.next()) {

               Administrateur A = new Administrateur();
                A.setPassword(res.getString(1));
                A.setLogin(res.getString(2));
                

                LA.add(A);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdministrateurDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return LA;
        
        
    }
    
    public List<ProprietaireEspaceGourmand> display2() {
        List<ProprietaireEspaceGourmand> listeProprio = new ArrayList<ProprietaireEspaceGourmand>();
        String url = "SELECT * FROM proprietaireEspaceGourmand";
        try {
            Statement st = MyConnection.conn.createStatement();
            ResultSet rst = st.executeQuery(url);
            while (rst.next()) {
                ProprietaireEspaceGourmand c = new ProprietaireEspaceGourmand();

                c.setLogin(rst.getString(1));
                c.setPassword(rst.getString(2));

                listeProprio.add(c);
            }
            return listeProprio;
        } catch (SQLException ex) {
            return null;
        }
    }

}
