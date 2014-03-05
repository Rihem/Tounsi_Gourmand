/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gourmand.dao;

import gourmand.entities.Client;
import gourmand.entities.EspaceGourmand;
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
public class ClientDAO implements Crud{

   static int idConnexion;

    @Override
    public void ajouter(Object o) {
        String url = " INSERT INTO client(nom,prenom,login,password,email,tel,sexe,age) VALUES (?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement prst = MyConnection.getInstance().conn.prepareStatement(url);
            Client c = (Client) o;
            prst.setString(1, c.getNom());
            prst.setString(2, c.getPrenom());
            prst.setString(3, c.getLogin());
            prst.setString(4, c.getPassword());
            prst.setString(5, c.getEmail());
            prst.setInt(6, c.getTel());
            prst.setString(7, c.getSexe());
            prst.setInt(8, c.getAge());
            prst.executeUpdate();
            System.out.println("Insertion effectuée!");
        } catch (SQLException ex) {
            System.err.println("Probleme d'insertion");
        }
    }

    @Override
    public void supprimer(Object o) {
        ClientDAO a = new ClientDAO();
        String url = " DELETE FROM client WHERE numCompte=" + a.idConnexion;
        try {
            PreparedStatement prst = MyConnection.getInstance().conn.prepareStatement(url);
            Client c = (Client) o;

            prst.executeUpdate();
            System.out.println("Suppression effectuée!");
        } catch (SQLException ex) {
            System.err.println("Probleme de suppression");
        }
    }

    @Override
    public void modifier(Object o) {
        try {
            String url = " UPDATE client SET nom=? , prenom=?,login=?,password=?,email=?,tel=?,sexe=?,age=? WHERE numCompte=" + idConnexion;
            PreparedStatement prst = MyConnection.getInstance().conn.prepareStatement(url);
            Client c = (Client) o;
            prst.setString(1, c.getNom());
            prst.setString(2, c.getPrenom());
            prst.setString(3, c.getLogin());
            prst.setString(4, c.getPassword());
            prst.setString(5, c.getEmail());
            prst.setInt(6, c.getTel());
            prst.setString(7, c.getSexe());
            prst.setInt(8, c.getAge());
            prst.executeUpdate();
            System.out.println("Modification avec succes");
        } catch (SQLException ex) {
            System.err.println("Echec de modification!");
        }
    }

    @Override
    public List<Client> display() {
        List<Client> listeClient = new ArrayList<Client>();
        String url = "SELECT * FROM client";
        try {
            Statement st = MyConnection.getInstance().conn.createStatement();
            ResultSet rst = st.executeQuery(url);
            while (rst.next()) {
                Client c = new Client();
                c.setNom(rst.getString(2));
                c.setPrenom(rst.getString(3));
                c.setLogin(rst.getString(4));
                c.setPassword(rst.getString(5));
                c.setEmail(rst.getString(6));
                c.setTel(rst.getInt(7));
                c.setSexe(rst.getString(8));
                c.setTel(rst.getInt(9));
                listeClient.add(c);
            }
            return listeClient;
        } catch (SQLException ex) {
            return null;
        }
    }
     public List<EspaceGourmand> display2() {
        List<EspaceGourmand> listeEG = new ArrayList<EspaceGourmand>();
        String url = "SELECT * FROM espacegourmand";
        try {
            Statement st = MyConnection.conn.createStatement();
            ResultSet rst = st.executeQuery(url);
            while (rst.next()) {
                EspaceGourmand c = new EspaceGourmand();
                c.setNomEspaceGourmand(rst.getString(2));
                c.setAdresse(rst.getString(3));
                c.setNumTel(rst.getInt(4));
                c.setEmail(rst.getString(5));
                c.setType(rst.getString(6));
                listeEG.add(c);

            }
            return listeEG;
        } catch (SQLException ex) {
            return null;
        }
    }

    
     public Client InfoClient() {
        String url = "SELECT * FROM client WHERE NumCompte=" + idConnexion;
        try {
            Statement st = MyConnection.conn.createStatement();
            ResultSet rst = st.executeQuery(url);
            Client c = new Client();
            while (rst.next()) {

                c.setNom(rst.getString(2));
                c.setPrenom(rst.getString(3));
                c.setLogin(rst.getString(4));
                c.setPassword(rst.getString(5));
                c.setEmail(rst.getString(6));
                c.setTel(rst.getInt(7));
                c.setSexe(rst.getString(8));
                c.setAge(rst.getInt(9));

            }

            //  System.out.println(c.getCin());
            return c;
        } catch (SQLException ex) {
            return null;
        }
    }

    public static int getIdConnexion() {
        return idConnexion;
    }

    public static void setIdConnexion(int idConnexion) {
        ClientDAO.idConnexion = idConnexion;
    }
}
