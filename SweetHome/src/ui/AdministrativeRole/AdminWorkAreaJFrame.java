/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.AdministrativeRole;

/**
 *
 * @author hp
 */
public class AdminWorkAreaJFrame extends javax.swing.JFrame {

    /**
     * Creates new form AdminWorkAreaJFrame
     */
    public AdminWorkAreaJFrame() {
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

        jSplitPane1 = new javax.swing.JSplitPane();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        lblTitle = new javax.swing.JLabel();
        btnManageEnterprise = new javax.swing.JButton();
        btnManageUsers = new javax.swing.JButton();
        btnManageOrganization = new javax.swing.JButton();
        btnViewDashboard = new javax.swing.JButton();
        btnManageNetwork = new javax.swing.JButton();
        kGradientPanel2 = new keeptoo.KGradientPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        kGradientPanel1.setkEndColor(new java.awt.Color(255, 221, 225));
        kGradientPanel1.setkStartColor(new java.awt.Color(238, 156, 167));

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("System Admin Work Area");

        btnManageEnterprise.setBackground(new java.awt.Color(238, 156, 167));
        btnManageEnterprise.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnManageEnterprise.setForeground(new java.awt.Color(255, 255, 255));
        btnManageEnterprise.setText("Manage Enterprise");
        btnManageEnterprise.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnManageUsers.setBackground(new java.awt.Color(238, 156, 167));
        btnManageUsers.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnManageUsers.setForeground(new java.awt.Color(255, 255, 255));
        btnManageUsers.setText("Manage Users");
        btnManageUsers.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnManageOrganization.setBackground(new java.awt.Color(238, 156, 167));
        btnManageOrganization.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnManageOrganization.setForeground(new java.awt.Color(255, 255, 255));
        btnManageOrganization.setText("Manage Organizations");
        btnManageOrganization.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnViewDashboard.setBackground(new java.awt.Color(238, 156, 167));
        btnViewDashboard.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnViewDashboard.setForeground(new java.awt.Color(255, 255, 255));
        btnViewDashboard.setText("Dashboard");
        btnViewDashboard.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnManageNetwork.setBackground(new java.awt.Color(238, 156, 167));
        btnManageNetwork.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnManageNetwork.setForeground(new java.awt.Color(255, 255, 255));
        btnManageNetwork.setText("Manage Network");
        btnManageNetwork.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(btnManageNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnManageEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnManageOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnManageUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnViewDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(lblTitle)
                        .addGap(254, 254, 254))))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnManageEnterprise)
                    .addComponent(btnManageOrganization)
                    .addComponent(btnManageUsers)
                    .addComponent(btnViewDashboard)
                    .addComponent(btnManageNetwork))
                .addGap(21, 21, 21))
        );

        jSplitPane1.setTopComponent(kGradientPanel1);

        kGradientPanel2.setkEndColor(new java.awt.Color(255, 221, 225));
        kGradientPanel2.setkStartColor(new java.awt.Color(238, 156, 167));

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 803, Short.MAX_VALUE)
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 495, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(kGradientPanel2);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(AdminWorkAreaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminWorkAreaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminWorkAreaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminWorkAreaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminWorkAreaJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageEnterprise;
    private javax.swing.JButton btnManageNetwork;
    private javax.swing.JButton btnManageOrganization;
    private javax.swing.JButton btnManageUsers;
    private javax.swing.JButton btnViewDashboard;
    private javax.swing.JSplitPane jSplitPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
