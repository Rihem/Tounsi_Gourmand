/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gourmand.dao;

import gourmand.entities.*;
import gourmand.util.*;
import java.sql.*;
import java.util.List;



/**
 *
 * @author hajer.BENSALEM
 */
public class EspaceGourmandDAO implements Crud{
    
    private static int idConnexion;

    @Override
    public void ajouter(Object o) {
        String url = " INSERT INTO espacegourmand(nomEspaceGourmand,adresse,numTel,email,type,idProprietaire,idMenu,idCommentaire) VALUES (?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement prst = MyConnection.getInstance().conn.prepareStatement(url);
            EspaceGourmand EG = (EspaceGourmand) o;
            prst.setString(1, EG.getNomEspaceGourmand());
            prst.setString(2, EG.getAdresse());
            prst.setInt(3, EG.getNumTel());
            prst.setString(4, EG.getEmail());
            prst.setString(5, EG.getType());
            prst.setInt(6, EG.getIdProprietaire());
            prst.setInt(7, EG.getIdMenu());
            prst.setInt(8, EG.getIdCommentaire());
            prst.executeUpdate();
            System.out.println("Insertion effectuée!");
        } catch (SQLException ex) {
            System.err.println("Probleme d'insertion");
        }
    }

    @Override
    public void supprimer(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modifier(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List display() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    ///dima tnasnes mathama chay gayel
}
