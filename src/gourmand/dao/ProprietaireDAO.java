/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gourmand.dao;

import gourmand.entities.Client;
import gourmand.entities.ProprietaireEspaceGourmand;
import gourmand.util.MyConnection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author hajer.BENSALEM
 */
public class ProprietaireDAO implements Crud {

    @Override
    public void ajouter(Object o) {
        String url = " INSERT INTO Proprietaireespacegourmand(nom,prenom,login,password,email,tel,sexe,age) VALUES (?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement prst = MyConnection.getInstance().conn.prepareStatement(url);
            ProprietaireEspaceGourmand p= ( ProprietaireEspaceGourmand) o;
            prst.setString(1, p.getNom());
            prst.setString(2, p.getPrenom());
            prst.setString(3, p.getLogin());
            prst.setString(4, p.getPassword());
            prst.setString(5, p.getEmail());
            prst.setInt(6, p.getTel());
            prst.setString(7, p.getSexe());
            prst.setInt(8, p.getAge());
            prst.executeUpdate();
            System.out.println("Insertion effectuée!");
        } catch (SQLException ex) {
            System.err.println("Probleme d'insertion");
        }
    }

    @Override
    public void supprimer(Object o) {
    }

    @Override
    public void modifier(Object o) {
    }

    @Override
    public List display() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    ///////hhhhhhhh mathama chay stanou chouya :p
    
}
