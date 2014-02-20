/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gourmand.dao;

import gourmand.entities.Commentaire;
import gourmand.util.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Wael
 */
public class CommentaireDAO {
    
    private Connection con=MyConnection.getCurrentConnection();    
    
    //insertion d'un commentaire dans la table commentaire
    public void AjoutCommentaire(Commentaire C){
         try
         {
            String requete="insert into commentaire(libelle) values(?)";
            PreparedStatement ps=con.prepareStatement(requete);
            
            ps.setString(1, C.getLibelle());
            ps.executeUpdate();
        }
        catch(SQLException e)
        {
            System.out.println("Erreur d'insertion"+e.getMessage());
        }
    }
    
    //cette methode permet d'afficher les commentaires 
    public void AfficherCommentaire (){
        try
        {
            String requete ="select * from commentaire";
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
    
    //supprimer un commentaire de la table
    public void DeleteParID(Commentaire C){
         try
         {
            String requete="delete from commentaire where idCommentaire=?";
            PreparedStatement ps=con.prepareStatement(requete);
            
            ps.setInt(1,C.getIdCommentaire());
            ps.executeUpdate();
        }
        catch(SQLException e)
        {
            System.out.println("Erreur de suppression "+e.getMessage());
        }
    }
    
    //modifier un client
    public void ModifierObjetParNom(Commentaire C){
            try
         {
            String requete="update commentaire set libelle=? where idCommentaire=?";
            PreparedStatement ps=con.prepareStatement(requete);
            //System.out.println("affichage1 :  " + ps);//c'est une ligne pour le test 
            ps.setString(1, C.getLibelle());
            //System.out.println("affichage2 :  " + ps);//c'est une ligne pour le test
        }
        catch(SQLException e)
        {
            System.out.println("Erreur de mise a jour "+e.getMessage());
        }
     }
}
