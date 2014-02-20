/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gourmand.dao;

import gourmand.entities.*;
import gourmand.util.MyConnection;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * cette classe est a verfiee avec la tutrice :)
 * @author Wael
 */
public class ReservationDAO {
    
    private Connection con=MyConnection.getCurrentConnection();    
    
    //insertion d'une reservation dans la table reservation
    //a verifier avec la tutrice
    public void AjoutCommentaire(Reservation R){
         try
         {
            String requete="insert into resevation (nombrePersonne,numCompte,idEspaceGourmand,dateReservation) values(?,?,?,?)";
            PreparedStatement ps=con.prepareStatement(requete);
            
            ps.setInt(1, R.getNombrePersonne());
            ps.setInt(2, R.getNumCompte());
            ps.setInt(3, R.getIdEspaceGourmand());
            ps.setDate(4, (Date) R.getDateReservation());
            ps.executeUpdate();
        }
        catch(SQLException e)
        {
            System.out.println("Erreur d'insertion"+e.getMessage());
        }
    }
    
    //cette methode permet d'afficher les reservation 
    public void AfficherCommentaire (){
        try
        {
            String requete ="select * from resrvation";
            Statement stm = con.createStatement();
            ResultSet res = stm.executeQuery(requete);
            while(res.next()){
                System.out.println(res.getString(1)+" "+res.getString(2));
                
            }
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
     }
    
    //supprimer une reservation de la table
    public void DeleteParID(Reservation C){
         try
         {
            String requete="delete from reservation where numReservation=?";
            PreparedStatement ps=con.prepareStatement(requete);
            
            ps.setInt(1,C.getNumReservation());
            ps.executeUpdate();
        }
        catch(SQLException e)
        {
            System.out.println("Erreur de suppression "+e.getMessage());
        }
    }
    
    //modifier une reservation 
    public void ModifierReservation(Reservation R){
         try
         {
            String requete="update reservation set nombrePersonne=?,numCompte=?,idEspaceGourmand=?,dateReservation=? where numReservation=?";
            PreparedStatement ps=con.prepareStatement(requete);
            //System.out.println("affichage1 :  " + ps);//c'est une ligne pour le test 
            ps.setInt(1, R.getNombrePersonne());
            ps.setInt(2, R.getNumCompte());
            ps.setInt(3, R.getIdEspaceGourmand());
            ps.setDate(4, (Date) R.getDateReservation());
            //System.out.println("affichage2 :  " + ps);//c'est une ligne pour le test
        }
        catch(SQLException e)
        {
            System.out.println("Erreur de mise a jour "+e.getMessage());
        }
     }
    
}
