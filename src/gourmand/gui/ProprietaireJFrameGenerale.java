/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gourmand.gui;

/**
 *
 * @author Mahdouch
 */
public class ProprietaireJFrameGenerale extends javax.swing.JFrame {

    /**
     * Creates new form ProprietaireJFrameGenerale
     */
    public ProprietaireJFrameGenerale() {
        initComponents();
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
        gestionEspace = new javax.swing.JButton();
        gestionCompte = new javax.swing.JButton();
        consulterStat = new javax.swing.JButton();
        gestionReservation = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        gestionEspace.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        gestionEspace.setText("Gestion Espace Gourmand");
        gestionEspace.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        gestionEspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestionEspaceActionPerformed(evt);
            }
        });

        gestionCompte.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        gestionCompte.setText("Gestion Compte");
        gestionCompte.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        gestionCompte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestionCompteActionPerformed(evt);
            }
        });

        consulterStat.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        consulterStat.setText("Consultation  statistiques");
        consulterStat.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        consulterStat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consulterStatActionPerformed(evt);
            }
        });

        gestionReservation.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        gestionReservation.setText("Gestion Reservation");
        gestionReservation.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        gestionReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestionReservationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(gestionReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gestionCompte, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(consulterStat, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gestionEspace, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {consulterStat, gestionCompte, gestionEspace, gestionReservation});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gestionEspace, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gestionCompte, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gestionReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consulterStat, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {consulterStat, gestionCompte, gestionEspace, gestionReservation});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gestionCompteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestionCompteActionPerformed
        GestionCompteProprietaire gCompteProp = new GestionCompteProprietaire();
        gCompteProp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_gestionCompteActionPerformed

    private void gestionReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestionReservationActionPerformed
        GestionReservationJFrame gReservation = new GestionReservationJFrame();
        gReservation.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_gestionReservationActionPerformed

    private void gestionEspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestionEspaceActionPerformed
        GestionEspaceGourmand gEspaceGourmand = new GestionEspaceGourmand();
        gEspaceGourmand.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_gestionEspaceActionPerformed

    private void consulterStatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consulterStatActionPerformed
        ConsulterStatPropJFrame consulterStatP = new ConsulterStatPropJFrame();
        consulterStatP.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_consulterStatActionPerformed

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
            java.util.logging.Logger.getLogger(ProprietaireJFrameGenerale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProprietaireJFrameGenerale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProprietaireJFrameGenerale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProprietaireJFrameGenerale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProprietaireJFrameGenerale().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton consulterStat;
    private javax.swing.JButton gestionCompte;
    private javax.swing.JButton gestionEspace;
    private javax.swing.JButton gestionReservation;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
