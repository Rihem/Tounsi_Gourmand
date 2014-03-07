/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gourmand.dao;

import gourmand.entities.EspaceGourmand;
import gourmand.dao.ProprietaireDAOHAJER;
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
public class EspaceGourmandDAOHAJER implements Crud{

        private static int idConnexion;
    @Override
    public void ajouter(Object o) {
        ProprietaireDAOHAJER a =new ProprietaireDAOHAJER();
      EspaceGourmand EG = (EspaceGourmand) o;
      idConnexion=2;
        String url = " INSERT INTO espacegourmand(nomEspaceGourmand,adresse,numTel,email,type,idProprietaire) "
                + "VALUES (?,?,?,?,?,"+idConnexion+")";
        try {
          
            PreparedStatement prst = MyConnection.getInstance().conn.prepareStatement(url);
              System.out.println("seif");
           
            prst.setString(1, EG.getNomEspaceGourmand());
            prst.setString(2, EG.getAdresse());
            System.out.println(EG.getAdresse()); 
           prst.setInt(3, EG.getNumTel());
            System.out.println(EG.getNumTel());
            prst.setString(4, EG.getEmail());
            System.out.println(EG.getEmail());
            prst.setString(5, EG.getType());
            System.out.println(EG.getEmail());
            // prst.setInt(6, EG.getIdProprietaire());
                 System.out.println(EG.getIdProprietaire());

            prst.executeUpdate();
            System.out.println("Insertion effectuée!");
        } catch (SQLException ex) {
            System.err.println("Probleme d'insertion");
        }
    }
 
        
    

    @Override
    public void supprimer(Object o) {
EspaceGourmand a =(EspaceGourmand) o;
       
        
        String url = "DELETE FROM espacegourmand WHERE IdEspaceGourmand=" + a.getIdEspaceGourmand();
        try {
            System.out.println(url);
            PreparedStatement prst = MyConnection.getInstance().conn.prepareStatement(url);
           //EspaceGourmand c = (EspaceGourmand) o;

            prst.executeUpdate();
            System.out.println("Suppression effectuée!");
        } catch (SQLException ex) {
            System.err.println("Probleme de suppression");
        }
        }

    @Override
    public void modifier(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List display() {
        List<EspaceGourmand> listedepots = new ArrayList<EspaceGourmand>();
        System.out.println("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        idConnexion=    1;
                        
        String requete = "select * from espacegourmand where idProprietaire ='"+idConnexion+"'";
       

        try {
            PreparedStatement prst = MyConnection.getInstance().conn.prepareStatement(requete);          
            ResultSet resultat = prst.executeQuery(requete);
            EspaceGourmandDAOHAJER depotDAO = new EspaceGourmandDAOHAJER();
            while(resultat.next()){
                EspaceGourmand stock =new EspaceGourmand();
             //   stock.S(resultat.getInt(1));
                //stock.setNumero_stock(resultat.getInt(1));
                stock.setNomEspaceGourmand(resultat.getString(2));
                stock.setAdresse(resultat.getString(3));
                stock.setNumTel(resultat.getInt(4));
                stock.setEmail(resultat.getString(5));
                stock.setType(resultat.getString(6));
                //stock.setDepot(depotDAO.findDepotById(resultat.getInt(4)));

                listedepots.add(stock);
            }
            return listedepots;//
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des stocks "+ex.getMessage());
            return null;
        }
    }
    ///dima tnasnes mathama chay gayel
}
