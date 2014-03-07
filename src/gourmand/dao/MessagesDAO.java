/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gourmand.dao;
import gourmand.entities.Messages;
import gourmand.util.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.smslib.CMessage;

/**
 *
 * @author Hell
 */
public class MessagesDAO implements Crud{

    @Override
    public void ajouter(Object o) {
        String url = " INSERT INTO messages(emetteur,destinataire,message) VALUES (?,?,?)";
        try {
            PreparedStatement prst = MyConnection.getInstance().conn.prepareStatement(url);
            Messages m = (Messages) o;
            prst.setString(1, m.getEmetteur());
            prst.setString(2, m.getDestinataire());
            prst.setString(3, m.getMessage());
            prst.executeUpdate();
            System.out.println("Insertion effectuée!");
        } catch (SQLException ex) {
            System.err.println("Probleme d'insertion");
        }
        }

    @Override
    public void supprimer(Object o) {
        Messages m = (Messages)o;
        String url = " DELETE FROM messages WHERE id=" + m.getId();
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
        //On ne peut pas modifier un message
        
    }

    @Override
    public List display() {
        List<Messages> listeMessages = new ArrayList<Messages>();
        String url = "SELECT * FROM messages";
        try {
            Statement st = MyConnection.getInstance().conn.createStatement();
            ResultSet rst = st.executeQuery(url);
            while (rst.next()) {
                Messages m = new Messages();
                m.setId(rst.getInt(1));
                m.setMessage(rst.getString(2));
                m.setEmetteur(rst.getString(3));
                m.setDestinataire(rst.getString(4));
                listeMessages.add(m);
            }
            return listeMessages;
        } catch (SQLException ex) {
            return null;
        }
  
    }
    
}
