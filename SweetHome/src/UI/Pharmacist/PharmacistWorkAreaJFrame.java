/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.Pharmacist;

import Model.EcoSystem.EcoSystem;
import Model.EcoSystem.Network;
import Model.Enterprise.Enterprise;
import Model.Organization.Organization;
import Model.UserAccount.UserAccount;
import Model.WorkQueue.PharmacistWorkRequest;
import Model.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;

/**
 *
 * @author Ma2017
 */
public class PharmacistWorkAreaJFrame extends javax.swing.JFrame {
    EcoSystem ecosys;
    Network network;
    Enterprise enterprise;
    Organization org;
    UserAccount useraccount;
    /**
     * Creates new form PharmacistWorkAreaJFrame
     */
    public PharmacistWorkAreaJFrame() {
        initComponents();
    }
    
    public PharmacistWorkAreaJFrame(EcoSystem ecosys, Network network, Enterprise enterprise, Organization org, UserAccount useraccount) {
        initComponents();
        this.setVisible(true);
        this.ecosys=ecosys;
        this.network=network;
        this.enterprise=enterprise;
        this.org=org;
        this.useraccount=useraccount;
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
        jPanel1 = new javax.swing.JPanel();
        logoutBtn = new javax.swing.JButton();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblWorkRequests = new javax.swing.JTable();
        ProcessBtn = new javax.swing.JButton();
        AssignBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        jSplitPane1.setMinimumSize(new java.awt.Dimension(800, 600));

        jPanel1.setBackground(new java.awt.Color(172, 182, 229));

        logoutBtn.setBackground(new java.awt.Color(116, 235, 213));
        logoutBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        logoutBtn.setForeground(new java.awt.Color(255, 255, 255));
        logoutBtn.setText("LOG OUT");
        logoutBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(677, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(logoutBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSplitPane1.setTopComponent(jPanel1);

        kGradientPanel1.setkEndColor(new java.awt.Color(172, 182, 229));
        kGradientPanel1.setkStartColor(new java.awt.Color(116, 235, 213));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(800, 520));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblWorkRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Message", "Child ID", "Child Name", "Sender", "Receiver", "Status", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblWorkRequests);

        kGradientPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 770, 320));

        ProcessBtn.setBackground(new java.awt.Color(116, 235, 213));
        ProcessBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ProcessBtn.setForeground(new java.awt.Color(255, 255, 255));
        ProcessBtn.setText("Process");
        ProcessBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ProcessBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProcessBtnActionPerformed(evt);
            }
        });
        kGradientPanel1.add(ProcessBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 450, 160, 40));

        AssignBtn.setBackground(new java.awt.Color(116, 235, 213));
        AssignBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AssignBtn.setForeground(new java.awt.Color(255, 255, 255));
        AssignBtn.setText("Assign to me");
        AssignBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AssignBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AssignBtnActionPerformed(evt);
            }
        });
        kGradientPanel1.add(AssignBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 450, 160, 40));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Request Pharmaceutical Therapy");
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        jSplitPane1.setRightComponent(kGradientPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 562, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AssignBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AssignBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AssignBtnActionPerformed

    private void ProcessBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProcessBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProcessBtnActionPerformed

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
            java.util.logging.Logger.getLogger(PharmacistWorkAreaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PharmacistWorkAreaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PharmacistWorkAreaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PharmacistWorkAreaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PharmacistWorkAreaJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AssignBtn;
    private javax.swing.JButton ProcessBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JTable tblWorkRequests;
    // End of variables declaration//GEN-END:variables
}
