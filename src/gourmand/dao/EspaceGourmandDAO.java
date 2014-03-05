/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gourmand.dao;

import gourmand.entities.*;
import gourmand.util.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author hajer.BENSALEM
 */
public class EspaceGourmandDAO implements Crud{
    
    static int idConnexion;

    @Override
    public void ajouter(Object o) {
        String url = " INSERT INTO espacegourmand(nomEspaceGourmand,adresse,numTel,email,type,idProprietaire) VALUES (?,?,?,?,?,?)";
        try {
            PreparedStatement prst = MyConnection.getInstance().conn.prepareStatement(url);
            EspaceGourmand EG = (EspaceGourmand) o;
            prst.setString(1, EG.getNomEspaceGourmand());
            prst.setString(2, EG.getAdresse());
            prst.setInt(3, EG.getNumTel());
            prst.setString(4, EG.getEmail());
            prst.setString(5, EG.getType());
            prst.setInt(6, EG.getIdProprietaire());
            prst.executeUpdate();
            System.out.println("Insertion effectuée!");
        } catch (SQLException ex) {
            System.err.println("Probleme d'insertion");
        }
    }

    @Override
    public void supprimer(Object o) {
        EspaceGourmandDAO a = new EspaceGourmandDAO();
        String url = " DELETE FROM espacegourmand WHERE idEspaceGourmand=" + a.idConnexion;
        try {
            PreparedStatement prst = MyConnection.getInstance().conn.prepareStatement(url);
            EspaceGourmand eg = (EspaceGourmand) o;

            prst.executeUpdate();
            System.out.println("Suppression effectuée!");
        } catch (SQLException ex) {
            System.err.println("Probleme de suppression");
        }
    }

    @Override
    public void modifier(Object o) {
        try {
            String url = " UPDATE espacegourmand SET nomEspaceGourmand=? , adresse=?,numTel=?,email=?,type=?,idProprietaire=? WHERE idEspaceGourmand=" + idConnexion;
            PreparedStatement prst = MyConnection.getInstance().conn.prepareStatement(url);
            EspaceGourmand eg = (EspaceGourmand) o;
            prst.setString(1, eg.getNomEspaceGourmand());
            prst.setString(2, eg.getAdresse());
            prst.setInt(3, eg.getNumTel());
            prst.setString(4, eg.getEmail());
            prst.setString(5, eg.getType());
            prst.setInt(6, eg.getIdProprietaire());
            
            prst.executeUpdate();
            System.out.println("Modification avec succes");
        } catch (SQLException ex) {
            System.err.println("Echec de modification!");
        }
    }

    @Override
    public List display() {
        List<EspaceGourmand> listeEspaceGourmand = new ArrayList<EspaceGourmand>();
        String url = "SELECT * FROM espacegourmand where idProprietaire="+idConnexion;
        try {
            Statement st = MyConnection.getInstance().conn.createStatement();
            ResultSet rst = st.executeQuery(url);
            while (rst.next()) {
                EspaceGourmand eg = new EspaceGourmand();
                eg.setNomEspaceGourmand(rst.getString(2));
                eg.setAdresse(rst.getString(3));
                eg.setNumTel(rst.getInt(4));
                eg.setEmail(rst.getString(5));
                eg.setType(rst.getString(6));
                eg.setIdProprietaire(rst.getInt(7));
                listeEspaceGourmand.add(eg);
            }
            return listeEspaceGourmand;
        } catch (SQLException ex) {
            return null;
        }
    }
    ///dima tnasnes mathama chay gayel
}
