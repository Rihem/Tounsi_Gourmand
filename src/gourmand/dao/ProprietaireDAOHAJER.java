/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gourmand.dao;

import gourmand.entities.ProprietaireEspaceGourmand;
import gourmand.util.MyConnection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;


import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
/**
 *
 * @author hajer.BENSALEM
 */
public class ProprietaireDAOHAJER implements Crud {
 private static int idConnexion;
    @Override
    public void ajouter(Object o) {
        String url = " INSERT INTO Proprietaireespacegourmand(nom,prenom,login,password,email,tel,sexe,age) VALUES (?,?,?,?,?,?,?,?)";
        
        try {
            String req;
            req = "select login from Proprietaireespacegourmand ";
            //ProprietaireEspaceGourmand PP= new ProprietaireEspaceGourmand();
            List<ProprietaireEspaceGourmand> P=new ArrayList<ProprietaireEspaceGourmand>();
            
            PreparedStatement prst = MyConnection.getInstance().conn.prepareStatement(url);
            System.out.println("prst"+prst);
            ProprietaireEspaceGourmand pr= ( ProprietaireEspaceGourmand) o;
            prst.setString(1, pr.getNom());
            prst.setString(2, pr.getPrenom());
            prst.setString(3, pr.getLogin());
            prst.setString(4, pr.getPassword());
            prst.setString(5, pr.getEmail());
            prst.setInt(6, pr.getTel());
            prst.setString(7, pr.getSexe());
            prst.setInt(8, pr.getAge());
            prst.executeUpdate();
            System.out.println("Insertion effectuée!");
        } catch (SQLException ex) {
            System.err.println("Probleme d'insertion");
        }
    }

    @Override
    public void supprimer(Object o) {
        ProprietaireDAOHAJER Pdao = new ProprietaireDAOHAJER();
        String url = " DELETE FROM  Proprietaireespacegourmand WHERE Idproprietaire=" +Pdao.idConnexion;
        try {
            PreparedStatement prst = MyConnection.getInstance().conn.prepareStatement(url);
            ProprietaireEspaceGourmand Pr= (ProprietaireEspaceGourmand) o;

            prst.executeUpdate();
            System.out.println("Suppression reussit!");
        } catch (SQLException ex) {
            System.err.println("Pas de suppression");
        }
    }

    @Override
    public void modifier(Object o) {
        try {
            String url = " UPDATE client SET nom=? , prenom=?,login=?,password=?,email=?,tel=?,sexe=?,age=? WHERE numCompte=" + idConnexion;
            PreparedStatement prst = MyConnection.getInstance().conn.prepareStatement(url);
            ProprietaireEspaceGourmand pr= (ProprietaireEspaceGourmand) o;
            prst.setString(1, pr.getNom());
            prst.setString(2, pr.getPrenom());
            prst.setString(3, pr.getLogin());
            prst.setString(4, pr.getPassword());
            prst.setString(5, pr.getEmail());
            prst.setInt(6, pr.getTel());
            prst.setString(7, pr.getSexe());
            prst.setInt(8, pr.getAge());
            prst.executeUpdate();
            System.out.println("MOdifier :)");
        } catch (SQLException ex) {
            System.err.println("Pas de modification :(");
            
        }
    }

    

    @Override
    public List display() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   
    
}
