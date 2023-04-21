/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.OrphanRegister;

import Model.EcoSystem.EcoSystem;
import Model.EcoSystem.Network;
import Model.Enterprise.Enterprise;
import Model.Enterprise.OrphanShelterEnterprise;
import Model.Organization.Organization;
import Model.Organization.OrphanManagementOrganization;

import Model.UserAccount.UserAccount;
import UI.Basic.LoginJFrame;

/**
 *
 * @author alilovepeach
 */
public class OrphanRegisterJFrame extends javax.swing.JFrame {

    private EcoSystem ecosys;
    private Network network;
    private Organization org;
    private Enterprise enterprise;
    private UserAccount userAccount;

    /**
     * Creates new form OrphanRegisterJFrame
     */
    public OrphanRegisterJFrame() {
        initComponents();
    }
    
    public OrphanRegisterJFrame(EcoSystem ecosys, Network network, Enterprise enterprise, 
            Organization org, UserAccount useraccount) {
        initComponents();
        this.setVisible(true);
        this.ecosys = ecosys;
        this.network = network;
        this.enterprise = enterprise;
        this.org = org;
        this.userAccount = useraccount;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        btnLogOut = new javax.swing.JButton();
        btnRegOrphan = new javax.swing.JButton();
        btnRequestVolunteer = new javax.swing.JButton();
        kGradientPanel2 = new keeptoo.KGradientPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setSize(new java.awt.Dimension(800, 600));

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        kGradientPanel1.setkEndColor(new java.awt.Color(101, 78, 163));
        kGradientPanel1.setkStartColor(new java.awt.Color(101, 78, 163));
        kGradientPanel1.setMinimumSize(new java.awt.Dimension(800, 80));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(800, 80));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLogOut.setText("Log Out");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btnLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        btnRegOrphan.setText("Register Orphan");
        btnRegOrphan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegOrphanActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btnRegOrphan, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 23, 190, 40));

        btnRequestVolunteer.setText("Request Volunteer");
        btnRequestVolunteer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestVolunteerActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btnRequestVolunteer, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 23, 190, 40));

        jSplitPane1.setTopComponent(kGradientPanel1);

        kGradientPanel2.setkEndColor(new java.awt.Color(101, 78, 163));
        kGradientPanel2.setkStartColor(new java.awt.Color(234, 175, 200));
        kGradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jSplitPane1.setRightComponent(kGradientPanel2);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnLogOutActionPerformed
        this.setVisible(false);
        new LoginJFrame(this.ecosys, this.userAccount);
    }// GEN-LAST:event_btnLogOutActionPerformed

    private void btnRegOrphanActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnRegOrphanActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new OrphanRegisterJPanel());
    }// GEN-LAST:event_btnRegOrphanActionPerformed

    private void btnRequestVolunteerActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnRequestVolunteerActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new VolunteerRequestJPanel());
    }// GEN-LAST:event_btnRequestVolunteerActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OrphanRegisterJFrame.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrphanRegisterJFrame.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrphanRegisterJFrame.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrphanRegisterJFrame.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrphanRegisterJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnRegOrphan;
    private javax.swing.JButton btnRequestVolunteer;
    private javax.swing.JSplitPane jSplitPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    // End of variables declaration//GEN-END:variables
}
