/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.VolunteerManagement;

import Model.EcoSystem.EcoSystem;
import Model.EcoSystem.Network;
import Model.Enterprise.Enterprise;
import Model.Organization.Organization;
import Model.Role.VolunteerRole;
import Model.UserAccount.UserAccount;
import Model.WorkQueue.VolunteerRequest;
import Model.WorkQueue.WorkRequest;
import UI.Basic.LoginJFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ma2017
 */
public class VolunteerManagerJFrame extends javax.swing.JFrame {

    EcoSystem ecosys;
    Network network;
    Enterprise enterprise;
    Organization org;
    UserAccount useraccount;
    
    /**
     * Creates new form VolunteerManagerJFrame
     */
    public VolunteerManagerJFrame() {
        initComponents();
    }

    public VolunteerManagerJFrame(EcoSystem ecosys, Network network, Enterprise enterprise, Organization org, UserAccount useraccount) {
        initComponents();
        this.setVisible(true);
        this.ecosys = ecosys;
        this.network = network;
        this.enterprise = enterprise;
        this.org = org;
        this.useraccount = useraccount;
        populateCombo();
        populateTable();
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
        kGradientPanel2 = new keeptoo.KGradientPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblWorkRequests = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        assignBtn = new javax.swing.JButton();
        volunteerComboBox = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel1.setBackground(new java.awt.Color(101, 78, 163));

        logoutBtn.setBackground(new java.awt.Color(234, 175, 200));
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
                .addGap(22, 22, 22)
                .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(677, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(logoutBtn)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        kGradientPanel2.setkEndColor(new java.awt.Color(101, 78, 163));
        kGradientPanel2.setkStartColor(new java.awt.Color(234, 175, 200));
        kGradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblWorkRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Message", "Sender", "Orphan Shelter", "Volunteer Manager", "Volunteer Assigned", "Enterprise", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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

        kGradientPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 780, 280));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Assign Volunteer");
        kGradientPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, -1, -1));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Volunteer");
        kGradientPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, 160, -1));

        assignBtn.setBackground(new java.awt.Color(234, 175, 200));
        assignBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        assignBtn.setForeground(new java.awt.Color(255, 255, 255));
        assignBtn.setText("Assign");
        assignBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        assignBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignBtnActionPerformed(evt);
            }
        });
        kGradientPanel2.add(assignBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 460, 150, 40));

        kGradientPanel2.add(volunteerComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 460, 450, 40));

        jSplitPane1.setRightComponent(kGradientPanel2);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void assignBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignBtnActionPerformed
        // TODO add your handling code here:
        
        UserAccount selectedVolunteer = (UserAccount) volunteerComboBox.getSelectedItem();
        
        int selectedRow = tblWorkRequests.getSelectedRow();
        
        //if no row selected
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "please select a row", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        VolunteerRequest selectedRequest = (VolunteerRequest) tblWorkRequests.getValueAt(selectedRow, 0);
        
        //if the selectedrequest has been completed
        
        if (selectedRequest.getStatus().equals("Completed")) {
            JOptionPane.showMessageDialog(this, "This Request already completed. Please select another one.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        
        //if selected request has assigned a volunteer
        
        if (selectedRequest.getStatus().equals("Assigned")) {
            JOptionPane.showMessageDialog(this, "This request has assigned a volunteer. Please select another request.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        for (WorkRequest request : network.getWorkQueue().getWorkRequestList()){
            
            if (request instanceof VolunteerRequest) {
                
                VolunteerRequest vr = (VolunteerRequest)request;
                
                if (vr.getAssignedVolunteer() == selectedVolunteer 
                        
                && !request.getStatus().equals("Completed")){
                    
                JOptionPane.showMessageDialog(this, "This volunteer is busy, Please select another one.", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
                }
            }
        }

        selectedVolunteer.getWorkQueue().getWorkRequestList().add(selectedRequest);
        selectedRequest.setReceiver(useraccount);
        selectedRequest.setStatus("Assigned");
        selectedRequest.setAssignedVolunteer(selectedVolunteer);
        
        JOptionPane.showMessageDialog(this, "Volunteer Assigned","Information",JOptionPane.INFORMATION_MESSAGE);
        populateTable();
                         
    }//GEN-LAST:event_assignBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new LoginJFrame(this.ecosys, this.useraccount);
    }//GEN-LAST:event_logoutBtnActionPerformed

        private void populateCombo() {

        volunteerComboBox.removeAllItems();
        
        for (UserAccount ua : ecosys.getUserAccountDirectory().getUserAccountList()) {
            
            if (ua.getRole() instanceof VolunteerRole && ua.getEnterprise() == enterprise) {
                
                volunteerComboBox.addItem(ua);
            }
        }
        
    }
        
    private void populateTable() {

        DefaultTableModel model = (DefaultTableModel) tblWorkRequests.getModel();
        model.setRowCount(0);
        
        for (WorkRequest request : network.getWorkQueue().getWorkRequestList()){
            
            if (request instanceof VolunteerRequest){
                
                Object[] row = new Object[7];
                row[0] = request;
                row[1] = request.getSender();
                row[2] = request.getSender().getEnterprise();
                row[3] = request.getReceiver() == null ? null : request.getReceiver();
                row[4] = ((VolunteerRequest) request).getAssignedVolunteer();
                row[5] = request.getReceiver() == null ? null :request.getReceiver().getEnterprise();
                row[6] = request.getStatus();
                
                model.addRow(row);
            }
        }
        

    }

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
            java.util.logging.Logger.getLogger(VolunteerManagerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VolunteerManagerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VolunteerManagerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VolunteerManagerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VolunteerManagerJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignBtn;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JTable tblWorkRequests;
    private javax.swing.JComboBox volunteerComboBox;
    // End of variables declaration//GEN-END:variables
}
