/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author Asus
 */
public class TransCustGUI extends javax.swing.JFrame {

    /**
     * Creates new form TransCustGUI
     */
    public TransCustGUI() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BtBack = new javax.swing.JButton();
        BtReturnCar = new javax.swing.JButton();
        TabelTransCust = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Montserrat Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Transaction");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Montserrat Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("RentCarPro");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, -1, -1));

        BtBack.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        BtBack.setText("Back");
        BtBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtBackActionPerformed(evt);
            }
        });
        getContentPane().add(BtBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, -1, -1));

        BtReturnCar.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        BtReturnCar.setText("Return Car");
        BtReturnCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtReturnCarActionPerformed(evt);
            }
        });
        getContentPane().add(BtReturnCar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 410, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TabelTransCust.setViewportView(jTable1);

        getContentPane().add(TabelTransCust, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 620, 250));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/gui trans mobil - Copy.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtBackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtBackActionPerformed

    private void BtReturnCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtReturnCarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtReturnCarActionPerformed

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
            java.util.logging.Logger.getLogger(TransCustGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TransCustGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TransCustGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TransCustGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TransCustGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtBack;
    private javax.swing.JButton BtReturnCar;
    private javax.swing.JScrollPane TabelTransCust;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
