/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.Doctor;

import Model.EcoSystem.EcoSystem;
import Model.EcoSystem.Network;
import Model.Enterprise.Enterprise;
import Model.Organization.Organization;
import Model.Orphan.Orphan;
import Model.UserAccount.UserAccount;
import Model.WorkQueue.MedCareRequest;
import Model.WorkQueue.WorkRequest;
import UI.Basic.LoginJFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ma2017
 */
public class DoctorWorkAreaJFrame extends javax.swing.JFrame {

    EcoSystem ecosys;
    Network network;
    Enterprise enterprise;
    Organization org;
    UserAccount useraccount;

    /**
     * Creates new form DoctorWorkAreaJFrame
     */
    public DoctorWorkAreaJFrame() {
        initComponents();
    }

    public DoctorWorkAreaJFrame(EcoSystem ecosys, Network network, Enterprise enterprise, Organization org, UserAccount useraccount) {
        initComponents();
        this.setVisible(true);
        this.ecosys = ecosys;
        this.network = network;
        this.enterprise = enterprise;
        this.org = org;
        this.useraccount = useraccount;

        for (Network net : ecosys.getNetworkList()) {

            for (Enterprise ent : net.getEnterpriseDirectory().getEnterpriseList()) {

                if (ent.equals(enterprise)) {

                    network = net;
                }
            }
        }

        populateRequestTable();
    }

    public void populateRequestTable() {

        //populate request table
        DefaultTableModel model = (DefaultTableModel) tblWorkRequests.getModel();

        model.setRowCount(0);

        for (WorkRequest request : network.getWorkQueue().getWorkRequestList()) {

            if (request instanceof MedCareRequest) {

                Object[] row = new Object[model.getColumnCount()];

                row[0] = request;
                row[1] = request.getOrphan().getId();
                row[2] = request.getOrphan().getName();
                row[3] = request.getSender();
                row[4] = request.getReceiver() == null ? null : request.getReceiver();

                row[5] = request.getStatus();

                String result = ((MedCareRequest) request).getDoctorResult();

                row[6] = result == null ? "Waiting" : result;

                model.addRow(row);
            }
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

        jSplitPane1 = new javax.swing.JSplitPane();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblWorkRequests = new javax.swing.JTable();
        AssignBtn = new javax.swing.JButton();
        viewdetailBtn = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        logoutBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        kGradientPanel2.setkEndColor(new java.awt.Color(240, 80, 83));
        kGradientPanel2.setkStartColor(new java.awt.Color(225, 238, 195));
        kGradientPanel2.setPreferredSize(new java.awt.Dimension(800, 520));
        kGradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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

        kGradientPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 760, 290));

        AssignBtn.setBackground(new java.awt.Color(195, 55, 100));
        AssignBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AssignBtn.setForeground(new java.awt.Color(255, 255, 255));
        AssignBtn.setText("Receive the request");
        AssignBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AssignBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AssignBtnActionPerformed(evt);
            }
        });
        kGradientPanel2.add(AssignBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 410, 194, 30));

        viewdetailBtn.setBackground(new java.awt.Color(195, 55, 100));
        viewdetailBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        viewdetailBtn.setForeground(new java.awt.Color(255, 255, 255));
        viewdetailBtn.setText("View Detail");
        viewdetailBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        viewdetailBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewdetailBtnActionPerformed(evt);
            }
        });
        kGradientPanel2.add(viewdetailBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 410, 194, 30));

        btnRefresh.setBackground(new java.awt.Color(195, 55, 100));
        btnRefresh.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(255, 255, 255));
        btnRefresh.setText("Refresh");
        btnRefresh.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        kGradientPanel2.add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(674, 50, 100, 30));

        jSplitPane1.setRightComponent(kGradientPanel2);

        jPanel1.setBackground(new java.awt.Color(240, 80, 83));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 80));

        logoutBtn.setBackground(new java.awt.Color(195, 55, 100));
        logoutBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        logoutBtn.setForeground(new java.awt.Color(255, 255, 255));
        logoutBtn.setText("LOG OUT");
        logoutBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(672, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutBtn)
                .addGap(27, 27, 27))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AssignBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AssignBtnActionPerformed
        // TODO add your handling code here:

        int selectedRow = tblWorkRequests.getSelectedRow();

        //if select a row
        if (selectedRow >= 0) {

            WorkRequest request = (WorkRequest) tblWorkRequests.getValueAt(selectedRow, 0);

            if (request.getStatus().equalsIgnoreCase("Processed")) {

                JOptionPane.showMessageDialog(this, "Request has already been processed.", "Warning",
                        JOptionPane.WARNING_MESSAGE);

                return;

                //if the request has been completed
            } else if (request.getStatus().equalsIgnoreCase("Completed")) {

                JOptionPane.showMessageDialog(this, "Request has already been completed.", "Thank you!",
                        JOptionPane.INFORMATION_MESSAGE);

                return;

            } else {

                request.setReceiver(useraccount);

                request.setStatus("Processed");

                populateRequestTable();

            }

            //if no request selected
        } else {
            JOptionPane.showMessageDialog(this, "Please select a request.", "Warning",
                    JOptionPane.WARNING_MESSAGE);

            return;

        }


    }//GEN-LAST:event_AssignBtnActionPerformed

    private void viewdetailBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewdetailBtnActionPerformed
        // TODO add your handling code here:

        int selectedRow = tblWorkRequests.getSelectedRow();

        //if no row selected
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "You should select a row first", "Warning",
                    JOptionPane.WARNING_MESSAGE);

            return;

        }

        WorkRequest wr = (WorkRequest) tblWorkRequests.getValueAt(selectedRow, 0);

        if (wr.getReceiver() != useraccount) {
            //if the request has been assigned

            JOptionPane.showMessageDialog(this, "This request is not assigned to you.", "Warning",
                    JOptionPane.WARNING_MESSAGE);

            return;

        }
        MedCareRequest request = (MedCareRequest) tblWorkRequests.getValueAt(selectedRow, 0);

        if (request.getStatus().equalsIgnoreCase("Completed")) {

            //if the selected request is completed
            JOptionPane.showMessageDialog(this, "Request has already been completed.", "Warning",
                    JOptionPane.WARNING_MESSAGE);

            return;
        }

        Orphan or = wr.getOrphan();
        ViewOrphanDetailJFrame vodj = new ViewOrphanDetailJFrame(this.ecosys, this.network, this.enterprise, this.org, this.useraccount, or, request);

        vodj.setVisible(true);
    }//GEN-LAST:event_viewdetailBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new LoginJFrame(this.ecosys, this.useraccount);
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        populateRequestTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

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
            java.util.logging.Logger.getLogger(DoctorWorkAreaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorWorkAreaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorWorkAreaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorWorkAreaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorWorkAreaJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AssignBtn;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JTable tblWorkRequests;
    private javax.swing.JButton viewdetailBtn;
    // End of variables declaration//GEN-END:variables
}
