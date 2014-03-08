/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gourmand.gui;

import gourmand.dao.ClientDAO;
import gourmand.dao.EspaceGourmandDAO;
import gourmand.entities.EspaceGourmand;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class ClientListeEG_GUI extends javax.swing.JFrame {

   public static String a;

    /**
     * Creates new form ClientListeEG_GUI
     */
    public ClientListeEG_GUI() {

        initComponents();

        EspaceGourmandDAO cDAO = new EspaceGourmandDAO();
        List<EspaceGourmand> ListeEG = cDAO.display();
        DefaultTableModel DTM = new DefaultTableModel();
        DefaultTableModel dtm = new DefaultTableModel(); //Definition du model utilisé par notre tableau
        dtm.addColumn("NomEspaceGourmand"); //Elaboration de la partie Header
        dtm.addColumn("Adresse");
        dtm.addColumn("NumTel");
        dtm.addColumn("Email");
        dtm.addColumn("Type");

        try { //Elaboration de la partie DATA
            dtm.setRowCount(0);
            for (EspaceGourmand c : ListeEG) {

                String nom = c.getNomEspaceGourmand();
                String adresse = c.getAdresse();
                int tel = c.getNumTel();
                String mail = c.getEmail();
                String type = c.getType();

                Object[] obj = {nom, adresse, tel, mail, type};
                dtm.addRow(obj); //Affectation de l'objet obj de type Tableau d'Object à notre model

            }
            jTable1.setModel(dtm); // Association du model à notre tableau nommé jTable2
        } catch (Exception e) {
            System.err.println("Erreur " + e.getMessage());
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

        jButRetour = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        But_Commenter = new javax.swing.JButton();
        But_Statistiques = new javax.swing.JButton();
        But_Reserver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButRetour.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ressources/fleche-gauche-icone-7633-16.png"))); // NOI18N
        jButRetour.setText("Retour");
        jButRetour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButRetour(evt);
            }
        });
        jButRetour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButRetourActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "NomEspaceGourmand", "Adresse", "NumTel", "Email", "Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        But_Commenter.setText("Commenter");
        But_Commenter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                But_CommenterActionPerformed(evt);
            }
        });

        But_Statistiques.setText("Afficher les Statistiques");
        But_Statistiques.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                But_StatistiquesActionPerformed(evt);
            }
        });

        But_Reserver.setText("Reserver");
        But_Reserver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                But_ReserverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(But_Commenter, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(But_Statistiques, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(But_Reserver, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jButRetour, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(But_Commenter)
                    .addComponent(But_Statistiques)
                    .addComponent(But_Reserver)
                    .addComponent(jButRetour, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButRetour(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButRetour
        // TODO add your handling code here:
        AcceuilClient_Gui a = new AcceuilClient_Gui();
        this.setVisible(false);
        a.setVisible(true);
    }//GEN-LAST:event_jButRetour

    private void But_CommenterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_But_CommenterActionPerformed
        // TODO add your handling code here:
        Commentaires C = new Commentaires();
        this.setVisible(false);
        C.setVisible(true);

    }//GEN-LAST:event_But_CommenterActionPerformed

    private void But_StatistiquesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_But_StatistiquesActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_But_StatistiquesActionPerformed

    private void But_ReserverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_But_ReserverActionPerformed
        // TODO add your handling code here:
    int rowS = jTable1.getSelectedRow();
    String ID = jTable1.getModel().getValueAt(rowS, 0).toString();
    a=ID;
        ClientReserve_GUI CR = new ClientReserve_GUI();
        this.setVisible(false);
        CR.setVisible(true);

    }//GEN-LAST:event_But_ReserverActionPerformed

    private void jButRetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButRetourActionPerformed
        // TODO add your handling code here:
        AcceuilClient_Gui AG = new AcceuilClient_Gui();
        this.setVisible(false);
        AG.setVisible(true);
    }//GEN-LAST:event_jButRetourActionPerformed

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
            java.util.logging.Logger.getLogger(ClientListeEG_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientListeEG_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientListeEG_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientListeEG_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientListeEG_GUI().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton But_Commenter;
    private javax.swing.JButton But_Reserver;
    private javax.swing.JButton But_Statistiques;
    private javax.swing.JButton jButRetour;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
