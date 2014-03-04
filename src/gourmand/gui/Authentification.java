package gourmand.gui;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BENAMARA
 */
import gourmand.dao.*;
import javax.swing.*;
import java.sql.*;
import org.jfree.ui.RefineryUtilities;

public class Authentification extends javax.swing.JFrame {

    /**
     * Creates new form Authentification
     */
    Connection con ;
    Statement st ;
    ResultSet rs ; 
     
    
   public Authentification() {
        initComponents();
        RefineryUtilities.centerFrameOnScreen(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_login = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        cmd_login = new javax.swing.JButton();
        cmd_Back = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Authentification ");
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(200, 200));
        setName("Authetification"); // NOI18N
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Authentification", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cooper Black", 1, 18), new java.awt.Color(0, 51, 255))); // NOI18N
        jPanel1.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 255));
        jLabel4.setText("Authentification");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 10, 160, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("Login : ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 60, 80, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("Password :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(50, 110, 100, 30);

        txt_login.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_login.setToolTipText("Nom d’utilisateur ou Adresse électronique");
        jPanel1.add(txt_login);
        txt_login.setBounds(160, 60, 180, 30);

        txt_password.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_password.setToolTipText("Mot de passe:");
        jPanel1.add(txt_password);
        txt_password.setBounds(160, 110, 180, 30);

        cmd_login.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmd_login.setText("Login");
        cmd_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_loginActionPerformed(evt);
            }
        });
        jPanel1.add(cmd_login);
        cmd_login.setBounds(60, 170, 120, 30);

        cmd_Back.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmd_Back.setText("Retour");
        cmd_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_BackActionPerformed(evt);
            }
        });
        jPanel1.add(cmd_Back);
        cmd_Back.setBounds(220, 170, 120, 30);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/facebook1.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(320, 220, 190, 20);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Goldenlock.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(380, 60, 100, 90);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 255));
        jLabel6.setText("Mot de passe oublié ? ");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6);
        jLabel6.setBounds(370, 150, 130, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background0.gif"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, -30, 530, 310);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmd_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_loginActionPerformed
        // TODO add your handling code here:
        if(!(txt_login.getText().isEmpty()  &&  txt_password.getText().isEmpty()))

        {
            
            AuthentificationAdminDAO AutAdmDAO = new AuthentificationAdminDAO();
            AuthentificationClientDAO AutCliDAO = new AuthentificationClientDAO();
            AuthentificationPropEspDAO AuthProDAO = new AuthentificationPropEspDAO();
                       
            int x = AutAdmDAO.AuthentificationAdmin (txt_login.getText(),txt_password.getText());
            int a = AutCliDAO.AuthentificationClient(txt_login.getText(),txt_password.getText());
            int b = AuthProDAO.AuthentificationProp (txt_login.getText(),txt_password.getText());
            
            if ( x==0  ) {
            //JOptionPane.showMessageDialog(this, "Informations Invalides !!");  

            // txt_login.setText("");
            //txt_password.setText("");
            System.out.println("Erreur de login Admin ");
            //System.err.println("Erreur de login") ;
            //         JOptionPane.showMessageDialog
            //        (this, "Information Invalide !!!", "About", JOptionPane.ERROR_MESSAGE, 
            //          new ImageIcon("/img/Error_Message.jpg"));
            }
            else if ( x !=0 ){
           // JOptionPane.showMessageDialog(this, "Bienvenue dans votre espace Administration " );
           
           Icon image = new ImageIcon( getClass().getResource("/img/admin.png"));     
           JOptionPane.showMessageDialog(this,"Bienvenue dans votre espace Administration ","Administrateur ",
            JOptionPane.OK_OPTION, image);
                
            ProprietaireJFrameGenerale GComProp = null;
            GComProp = new ProprietaireJFrameGenerale();
            this.setVisible(false);
            GComProp.setVisible(true);
            }
        
      ////////////////////Client///////////////////////////////////
        
             if ( a==0  ) {
            //JOptionPane.showMessageDialog(this, "Informations Invalides !!");  

            // txt_login.setText("");
            //txt_password.setText("");
            System.out.println("Erreur de login Client");
            //System.err.println("Erreur de login") ;
            //         JOptionPane.showMessageDialog
            //        (this, "Information Invalide !!!", "About", JOptionPane.ERROR_MESSAGE, 
            //          new ImageIcon("/img/Error_Message.jpg"));
            }
            else if ( a !=0 ){
                
            //JOptionPane.showMessageDialog(this,  "Bienvenue dans votre espace client"); 
            Icon image = new ImageIcon( getClass().getResource("/img/customer.png"));     
            JOptionPane.showMessageDialog(this,"Bienvenue dans votre espace Client ","Espace Client ",
            JOptionPane.OK_OPTION, image);
            
                
            ProprietaireJFrameGenerale GComProp = null;
            GComProp = new ProprietaireJFrameGenerale();
            this.setVisible(false);
            GComProp.setVisible(true);
            }
        //////////////////PropEspGourm////////////////////////////////
        
             if ( b==0  ) {
            // JOptionPane.showMessageDialog(this, "Informations Invalides !!");  

            // txt_login.setText("");
            //txt_password.setText("");
            System.out.println("Erreur de login PropEspGroum");
            //System.err.println("Erreur de login") ;
            //         JOptionPane.showMessageDialog
            //        (this, "Information Invalide !!!", "About", JOptionPane.ERROR_MESSAGE, 
            //          new ImageIcon("/img/Error_Message.jpg"));
            }
            else if ( b !=0 ){
            Icon image = new ImageIcon( getClass().getResource("/img/restaurant.png"));     
            JOptionPane.showMessageDialog(this,"Bienvenue dans votre espace Gourmand ","Espace Gourmand  ",
            JOptionPane.OK_OPTION, image);          


//  JOptionPane.showMessageDialog(this,  "Bienvenue dans votre espace Gourmand");
            ProprietaireJFrameGenerale GComProp = null;
            GComProp = new ProprietaireJFrameGenerale();
            this.setVisible(false);
            GComProp.setVisible(true);
            }

        
        ///////////////////sinon////////////////////////////////
        
            if((( a==0 )&& (b==0)) && (x==0)) {
            JOptionPane.showMessageDialog(this, "Informations Invalides !!","",JOptionPane.ERROR );
            txt_login.setText("");
            txt_password.setText("");
            
            }
            }
        
        //////////////////////////////////////////////////////
        else {
            JOptionPane.showMessageDialog(this, "Champs Vides !!");
//         JOptionPane.showMessageDialog
//        (this, "Information Invalide !!!", "About", JOptionPane.ERROR_MESSAGE, 
//                new ImageIcon("/img/Error_Message.jpg"));
        
        }
    }//GEN-LAST:event_cmd_loginActionPerformed

    private void cmd_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_BackActionPerformed
        // TODO add your handling code here:
        Bienvenue bienV = null;
        bienV = new Bienvenue();
        this.setVisible(false);
        bienV.setVisible(true);
        
    }//GEN-LAST:event_cmd_BackActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        MotdePasseOublie MPO = null;
        MPO = new MotdePasseOublie();
        MPO.setVisible(true);
        
        
// TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseClicked

    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Authentification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Authentification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Authentification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Authentification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

         
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Authentification().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmd_Back;
    private javax.swing.JButton cmd_login;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_login;
    private javax.swing.JPasswordField txt_password;
    // End of variables declaration//GEN-END:variables
}