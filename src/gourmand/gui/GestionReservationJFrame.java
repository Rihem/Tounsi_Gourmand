/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gourmand.gui;

import gourmand.dao.ReservationDAO;
import gourmand.entities.Reservation;
import gourmand.util.MyConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mahdouch
 */
public class GestionReservationJFrame extends javax.swing.JFrame {

    /**
     * Creates new form GestionReservationJFrame
     */
    public GestionReservationJFrame(){
        
        initComponents();
        ReservationDAO RDAO = new ReservationDAO();
        List<Reservation> LReservation = RDAO.display();
        DefaultTableModel DTM = new DefaultTableModel();
        DTM.addColumn("Nom");
        DTM.addColumn("Prenom");
        DTM.addColumn("Etat");
        try
        {
            DTM.setRowCount(0);
            for(Reservation res : LReservation)
            {
                String nom = "select nom from client where numCompte ='"+ res.getNumCompte() +"'";
                String prenom ="select prenom from client where numCompte ='"+ res.getNumCompte() +"'";
                boolean ok = res.getOk();
                String v="";
                if(ok == true)
                {
                    v="Valide";
                }
                else
                    v="En Attente";
                
                Object [] obj = {nom,prenom,v};
                DTM.addRow(obj);
                
            }
            TableReservation.setModel(DTM);
        }
        catch(Exception e)
                    {
                    System.out.println("erreur"+e.getMessage());
                    
                    }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableReservation = new javax.swing.JTable();
        butAccepter = new javax.swing.JButton();
        butRefuser = new javax.swing.JButton();
        butRetour = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestion des réservations");
        setBackground(new java.awt.Color(255, 204, 204));

        TableReservation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nom", "Prenom", "OK"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TableReservation);

        butAccepter.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mahdouch\\Desktop\\iconsPI\\ok-icon (1).png")); // NOI18N
        butAccepter.setText("    Accepter");
        butAccepter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butAccepterActionPerformed(evt);
            }
        });

        butRefuser.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mahdouch\\Desktop\\iconsPI\\no-icon.png")); // NOI18N
        butRefuser.setText("    Refuser");
        butRefuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butRefuserActionPerformed(evt);
            }
        });

        butRetour.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mahdouch\\Desktop\\iconsPI\\back-icon.png")); // NOI18N
        butRetour.setText("     Retour");
        butRetour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butRetourActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 153, 204));
        jLabel13.setText("Gestion Réservation");

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mahdouch\\Desktop\\iconsPI\\Restaurant-Empire-2-1-icon.png")); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mahdouch\\Desktop\\iconsPI\\Coffee-icon (2).png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(butRefuser)
                    .addComponent(butRetour)
                    .addComponent(butAccepter, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {butAccepter, butRefuser, butRetour});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(47, 47, 47)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addComponent(butAccepter, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(butRefuser)
                        .addGap(32, 32, 32)
                        .addComponent(butRetour)
                        .addGap(58, 58, 58))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {butAccepter, butRefuser, butRetour});

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
 /*   private void TableGPEGMouseClicked(java.awt.event.MouseEvent evt) {                                       
        int rows = TableReservation.getSelectedRow();
        String a=TableReservation.getModel().getValueAt(rows, 1).toString();
        System.out.println(a);
        try {
            Statement st =(Statement) MyConnection.getInstance().conn.createStatement();
            int row = TableReservation.getSelectedRow();
            String Table_Click =(TableReservation.getModel().getValueAt(row, 1).toString());
            String sql = "select nom,prenom,ok from reservation where nom='"+ Table_Click+"'";
            ResultSet res = st.executeQuery(sql);
            while(res.next())
            {
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(GestionReservationJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
    */
    private void butRetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butRetourActionPerformed
        ProprietaireJFrameGenerale prGeneral = new ProprietaireJFrameGenerale();
        prGeneral.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_butRetourActionPerformed

    private void butAccepterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butAccepterActionPerformed
        ReservationDAO RDAO = new ReservationDAO();
        Reservation R = new Reservation();
        R.setOk(true);
        
        RDAO.modifier(R);
    }//GEN-LAST:event_butAccepterActionPerformed

    private void butRefuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butRefuserActionPerformed
        ReservationDAO RDAO = new ReservationDAO();
        Reservation R = new Reservation();
        RDAO.supprimer(R);
    }//GEN-LAST:event_butRefuserActionPerformed

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
            java.util.logging.Logger.getLogger(GestionReservationJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionReservationJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionReservationJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionReservationJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionReservationJFrame().setVisible(true);
                RefineryUtilities.centerFrameOnScreen(this);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableReservation;
    private javax.swing.JButton butAccepter;
    private javax.swing.JButton butRefuser;
    private javax.swing.JButton butRetour;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
