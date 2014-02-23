/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gourmand.dao;

import gourmand.entities.Menu;
import gourmand.util.*;
import java.sql.*;

/**
 *
 * @author Mahdouch
 */
public class MenuDAO {
    
    private Connection con=MyConnection.getInstance();    
    
    //insertion d'une reservation dans la table reservation

    public void AjoutMenu(Menu M){
         try
         {
            String requete="insert into menu (idEntrees,idDesserts,idPlats,idBoissons,date) values(?,?,?,?,?)";
            PreparedStatement ps=con.prepareStatement(requete);
            
            ps.setInt(1, M.getIdEntrees());
            ps.setInt(2, M.getIdDesserts());
            ps.setInt(3, M.getIdPlats());
            ps.setInt(4, M.getIdBoissons());
            ps.setString(5, M.getDate());
            ps.executeUpdate();
        }
        catch(SQLException e)
        {
            System.out.println("Erreur d'insertion"+e.getMessage());
        }
    }
    
    //cette methode permet d'afficher les reservation 
    public void AfficherMenu (){
        try
        {
            String requete ="select * from menu";
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
    public void DeleteParID(Menu C){
         try
         {
            String requete="delete from menu where idMenu=?";
            PreparedStatement ps=con.prepareStatement(requete);
            
            ps.setInt(1,C.getIdMenu());
            ps.executeUpdate();
        }
        catch(SQLException e)
        {
            System.out.println("Erreur de suppression "+e.getMessage());
        }
    }
    
    //modifier une reservation 
    public void ModifierReservation(Menu M){
         try
         {
            String requete="update menu set idEntrees=?,idDesserts=?,idPLats=?,idBoissons=?,date=? where idMenu=?";
            PreparedStatement ps=con.prepareStatement(requete);
            //System.out.println("affichage1 :  " + ps);//c'est une ligne pour le test 
            ps.setInt(1, M.getIdEntrees());
            ps.setInt(2, M.getIdDesserts());
            ps.setInt(3, M.getIdPlats());
            ps.setInt(4, M.getIdBoissons());
            ps.setString(5, M.getDate());
            //System.out.println("affichage2 :  " + ps);//c'est une ligne pour le test
        }
        catch(SQLException e)
        {
            System.out.println("Erreur de mise a jour "+e.getMessage());
        }
     }
}
