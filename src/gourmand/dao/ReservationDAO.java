/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gourmand.dao;


import java.util.*;
import gourmand.entities.*;
import gourmand.util.MyConnection;
import java.sql.*;

/**
 * @author Wael
 */
public class ReservationDAO implements Crud {
    
    private static int idConnexion;
    
    @Override
    public void ajouter(Object o) {
        try
         {
            String requete="insert into resevation (nombrePersonne,numCompte,idEspaceGourmand,dateReservation,ok) values(?,?,?,?,?)";
            PreparedStatement ps=MyConnection.getInstance().conn.prepareStatement(requete);
            Reservation R = new Reservation();
            ps.setInt(1, R.getNombrePersonne());
            ps.setInt(2, R.getNumCompte());
            ps.setInt(3, R.getIdEspaceGourmand());
            ps.setString(4, R.getDateReservation());
            ps.setBoolean(5, R.getOk());
            ps.executeUpdate();
        }
        catch(SQLException e)
        {
            System.out.println("Erreur d'insertion"+e.getMessage());
        }
    }

    @Override
    public void supprimer(Object o) {
         Reservation R = (Reservation) o;
        String url = " DELETE FROM reservation WHERE numReservation=" +R.getNumReservation();
        try {
            PreparedStatement prst = MyConnection.getInstance().conn.prepareStatement(url);
           

            prst.executeUpdate();
            System.out.println("Suppression effectuée!");
        } catch (SQLException ex) {
            System.err.println("Probleme de suppression");
        }
    }

    @Override
    public void modifier(Object o) {
        try {
            String url = " UPDATE reservation SET dateReservation=? , nombtrePersonne=?,numCompte=?,idEspaceGourmand=?,ok=? WHERE numReservation=" + idConnexion;
            PreparedStatement prst = MyConnection.getInstance().conn.prepareStatement(url);
            Reservation R = (Reservation) o;
            prst.setString(1, R.getDateReservation());
            prst.setInt(2, R.getNombrePersonne());
            prst.setInt(3, R.getNumCompte());
            prst.setInt(4, R.getIdEspaceGourmand());
            prst.setBoolean(5, R.getOk());
            prst.executeUpdate();
            System.out.println("Modification avec succes");
        } catch (SQLException ex) {
            System.err.println("Echec de modification!");
        }
    }

    @Override
    public List<Reservation> display() {
        List<Reservation> listeReservation = new ArrayList<Reservation>();
        String url = "SELECT * FROM reservation";
        try {
            Statement st = MyConnection.getInstance().conn.createStatement();
            ResultSet rst = st.executeQuery(url);
            while (rst.next()) {
                Reservation R = new Reservation();
                R.setDateReservation(rst.getString(2));
                R.setNombrePersonne(rst.getInt(3));
                R.setNumCompte(rst.getInt(4));
                R.setIdEspaceGourmand(rst.getInt(5));
                R.setOk(rst.getBoolean(6));

                listeReservation.add(R);
            }
            return listeReservation;
        } catch (SQLException ex) {
            return null;
        }
    }
   
    
    public void ReservationClient(String idEG,String date,String nb) {
      
         String url = " insert into reservation set dateReservation='"+date+"', nombrePersonne="+nb+", numCompte="+ClientDAO.idConnexion+",idEspaceGourmand=(select idEspaceGourmand from espacegourmand where nomEspaceGourmand='"+idEG+"' ),ok=0";
        try {
            PreparedStatement prst = MyConnection.conn.prepareStatement(url);
            
          
            prst.executeUpdate();
            System.out.println("Insertion effectuée!");
            System.out.println(url);
        } catch (SQLException ex) {
            System.out.println(url);
            System.err.println("Probleme d'insertion");
        }

    }
    
}
    
