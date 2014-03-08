/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gourmand.gui;

import gourmand.dao.MessagesDAO;
import gourmand.entities.Messages;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hell
 */
public class MessagerieAdmin extends javax.swing.JFrame implements KeyListener{

    /**
     * Creates new form MessagerieAdmin
     */
    public MessagerieAdmin() {
        initComponents();
        refresh();
        txtMsg.addKeyListener(this);
    }
    
    public void refresh(){
        MessagesDAO mDAO = new MessagesDAO();
        List<Messages> lm = mDAO.displayAdmin();
        NonEditableDefaultTableModel DTM = new NonEditableDefaultTableModel();
        
        DTM.addColumn("Id");
        DTM.addColumn("Emetteur");
        DTM.addColumn("Message");
        
        try{
            DTM.setRowCount(0);
            
            for(Messages m : lm ){
                int id = m.getId();
                String emetteur = m.getEmetteur();
                String msg = m.getMessage();
                
                Object[] obj = {id,emetteur,msg};
                DTM.addRow(obj);
            }
            TableMsgs.setModel(DTM);
            
        }catch(Exception e)
            {
            System.out.println("erreur "+e.getMessage());

            }
        TableMsgs.getColumn("Id").setMaxWidth(0);
        TableMsgs.getColumn("Id").setMinWidth(0);
        TableMsgs.getColumn("Id").setPreferredWidth(0);
        TableMsgs.getColumn("Emetteur").setResizable(false);
        
        labelDE.setText("Emetteur :");
        txtDE.disable();
        txtMsg.disable();
        txtId.hide();
        ButtRepondre.setText("Repondre");
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
        jScrollPane1 = new javax.swing.JScrollPane();
        TableMsgs = new javax.swing.JTable();
        labelDE = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDE = new javax.swing.JTextField();
        txtMsg = new javax.swing.JTextField();
        ButtRepondre = new javax.swing.JButton();
        ButtRetour = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        ButtDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TableMsgs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Emetteur", "Message"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableMsgs.getTableHeader().setReorderingAllowed(false);
        TableMsgs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableMsgsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableMsgs);
        if (TableMsgs.getColumnModel().getColumnCount() > 0) {
            TableMsgs.getColumnModel().getColumn(0).setResizable(false);
            TableMsgs.getColumnModel().getColumn(1).setResizable(false);
        }

        labelDE.setText("Emetteur :");

        jLabel2.setText("Message :");

        txtMsg.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        ButtRepondre.setText("Repondre");
        ButtRepondre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtRepondreActionPerformed(evt);
            }
        });

        ButtRetour.setText("Retour");
        ButtRetour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtRetourActionPerformed(evt);
            }
        });

        ButtDelete.setText("Supprimer");
        ButtDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMsg)
                    .addComponent(txtDE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelDE)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ButtRepondre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addComponent(ButtRetour)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(ButtDelete)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(labelDE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDE, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMsg)))
                .addGap(18, 18, 18)
                .addComponent(ButtDelete)
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtRepondre)
                    .addComponent(ButtRetour)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(129, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(54, 54, 54))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtRetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtRetourActionPerformed
        AcceuilAdmin aA = new AcceuilAdmin();
        aA.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ButtRetourActionPerformed

    private void TableMsgsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMsgsMouseClicked
                
        txtMsg.disable();
        ButtRepondre.setText("Repondre");
        
        int row = TableMsgs.getSelectedRow();
        
        
        int id = Integer.parseInt(TableMsgs.getModel().getValueAt(row, 0).toString());
        String emetteur = TableMsgs.getModel().getValueAt(row, 1).toString();
        String msg = TableMsgs.getModel().getValueAt(row, 2).toString();
        
        txtId.setText(""+id);
        txtDE.setText(emetteur);
        txtMsg.setText(msg);
    }//GEN-LAST:event_TableMsgsMouseClicked

    
    
    private void ButtDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtDeleteActionPerformed
        Messages m = new Messages();
        int row = TableMsgs.getSelectedRow();
        int id = Integer.parseInt(TableMsgs.getModel().getValueAt(row, 0).toString());
        String emetteur = TableMsgs.getModel().getValueAt(row, 1).toString();
        String msg = TableMsgs.getModel().getValueAt(row, 2).toString();
        
        m.setId(id);
        m.setEmetteur(emetteur);
        m.setMessage(msg);
        m.setDestinataire("Admin");
        m.setMessage(msg);
        
        MessagesDAO messageDao = new MessagesDAO();
        messageDao.supprimer(m);
        System.out.println("c bonnnnnnnnnnnnnnn sa77itniiiii ");
        refresh();
        JOptionPane.showMessageDialog(this, "Suppression effectuée avec succés :)");
    }//GEN-LAST:event_ButtDeleteActionPerformed

    private void ButtRepondreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtRepondreActionPerformed
        if(ButtRepondre.getText().equals("Envoyer")){
                if(!txtMsg.getText().equals("")){
                    Messages msg = new Messages();
                    msg.setDestinataire(txtDE.getText());
                    msg.setMessage(txtMsg.getText());
                    msg.setEmetteur("Admin");
                    MessagesDAO msgDao = new MessagesDAO();
                    msgDao.ajouter(msg);
                    JOptionPane.showMessageDialog(this, "Envoi réussi :)");
                    ButtRepondre.setText("Répondre");
                    txtMsg.disable();
                    txtMsg.setBackground(Color.gray);
                }
                else JOptionPane.showMessageDialog(this, "Veuillez saisir votre message avant de l'envoyer", "Erreur", JOptionPane.ERROR_MESSAGE);
            
        }
        if(ButtRepondre.getText().equals("Repondre")){
            labelDE.setText("Destinataire :");
            txtMsg.enable();
            txtMsg.setBackground(Color.white);
            ButtRepondre.setText("Envoyer");
        }
    }//GEN-LAST:event_ButtRepondreActionPerformed

    
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
            java.util.logging.Logger.getLogger(MessagerieAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MessagerieAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MessagerieAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MessagerieAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MessagerieAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtDelete;
    private javax.swing.JButton ButtRepondre;
    private javax.swing.JButton ButtRetour;
    private javax.swing.JTable TableMsgs;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelDE;
    private javax.swing.JTextField txtDE;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtMsg;
    // End of variables declaration//GEN-END:variables

    @Override
    public void keyTyped(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_ENTER){
            ButtRepondre.doClick();
        }
    }
}
