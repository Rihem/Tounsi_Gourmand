/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gourmand.dao;

import gourmand.entities.Client;
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
public class ClientDAO 
{

    private Connection con=MyConnection.getCurrentConnection();    
    
    //insertion d'un client dans la table client
    public void AjoutClients(Client C){
         try
         {
            String requete="insert into client(nom,prenom,login,password,email,tel) values(?,?,?,?,?,?)";
            PreparedStatement ps=con.prepareStatement(requete);
            
            ps.setString(1, C.getNom());
            ps.setString(2, C.getPrenom());
            ps.setString(3, C.getLogin());
            ps.setString(4, C.getPassword());
            ps.setString(5, C.getEmail());
            ps.setInt(6, C.getTel());
            ps.executeUpdate();
        }
        catch(SQLException e)
        {
            System.out.println("Erreur d'insertion"+e.getMessage());
        }
    }
    
    //cette methode permet d'afficher le nom et le prenom seulement 
    public void AfficherClient (){
        try
        {
            String requete ="select * from client";
            Statement stm = con.createStatement();
            ResultSet res = stm.executeQuery(requete);
            while(res.next()){
                System.out.println(res.getString(2)+" "+res.getString(3));
                
            }
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
     }
   
    // cette methode permet d'afficher tous les champs de la table client
    public void AfficherDetailClient (){
        try
        {
            String requete ="select * from client";
            Statement stm = con.createStatement();
            ResultSet res = stm.executeQuery(requete);
            while(res.next()){
            System.out.println(res.getString(2)+" "+res.getString(3)+" "+res.getString(4)+" "+res.getString(5)+" "+res.getString(6)+" "+res.getInt(7));
                
            }
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
     }
    
    //supprimer un client de la table
    public void DeleteParID(Client C){
         try
         {
            String requete="delete from client where numCompte=?";
            PreparedStatement ps=con.prepareStatement(requete);
            
            ps.setInt(1,C.getNumCompte());
            ps.executeUpdate();
        }
        catch(SQLException e)
        {
            System.out.println("Erreur de suppression "+e.getMessage());
        }
    }
    
    //modifier un client
    public void ModifierObjetParNom(Client C){
            try
         {
            String requete="update client set nom=?,prenom=?,=?,login=?,password=?,email=?,tel=?,critereSpecialite=? where idR=?";
            PreparedStatement ps=con.prepareStatement(requete);
            //System.out.println("affichage1 :  " + ps);//c'est une ligne pour le test 
            ps.setString(1, C.getNom());
            ps.setString(2, C.getPrenom());
            ps.setString(3, C.getLogin());
            ps.setString(4, C.getPassword());
            ps.setString(5, C.getEmail());
            ps.setInt(6, C.getTel());
            ps.executeUpdate();
            //System.out.println("affichage2 :  " + ps);//c'est une ligne pour le test
        }
        catch(SQLException e)
        {
            System.out.println("Erreur de mise a jour "+e.getMessage());
        }
     }
    
    //Authentification Client
    public static int IDconnexion;
    public int AuthentificationAdmin (String login, String password){
         int key = 0;
         try
        {
            String requete ="select * from client where password='"+password+"' and login='"+login+"'";
            Statement stm = con.createStatement();
            ResultSet res = stm.executeQuery(requete);
            while(res.next()){
                key = res.getInt(1);
                
            }
        }
        catch(SQLException e)
        {
            
            System.out.println("errer d'authentification "+e.getMessage());
        }
        IDconnexion=key;
        return key;
     }
}
