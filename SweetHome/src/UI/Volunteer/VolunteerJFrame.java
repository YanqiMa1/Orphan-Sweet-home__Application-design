/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.Volunteer;

import Model.EcoSystem.EcoSystem;
import Model.EcoSystem.Network;
import Model.Enterprise.Enterprise;
import Model.Enterprise.VolunteerEnterprise;
import Model.Organization.Organization;
import Model.Organization.VolunteerManagementOrganization;
import Model.UserAccount.UserAccount;
import Model.WorkQueue.VolunteerRequest;
import Model.WorkQueue.WorkRequest;
import UI.Basic.LoginJFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alilovepeach
 */
public class VolunteerJFrame extends javax.swing.JFrame {

    EcoSystem ecosys;
    Network network;
    VolunteerEnterprise enterprise;
    VolunteerManagementOrganization org;
    UserAccount useraccount;

    /**
     * Creates new form VolunteerJFrame
     */
    public VolunteerJFrame() {
        initComponents();
    }
    
    public VolunteerJFrame(EcoSystem ecosys, Network network, VolunteerEnterprise enterprise, 
            VolunteerManagementOrganization org, UserAccount useraccount) {
        initComponents();
        this.setVisible(true);
        this.ecosys = ecosys;
        this.network = network;
        this.enterprise = enterprise;
        this.org = org;
        this.useraccount = useraccount;
        
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
        kGradientPanel1 = new keeptoo.KGradientPanel();
        btnLogOut = new javax.swing.JButton();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblWorkRequests = new javax.swing.JTable();
        btnComplete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(600, 600));

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

        jSplitPane1.setTopComponent(kGradientPanel1);

        kGradientPanel2.setkEndColor(new java.awt.Color(101, 78, 163));
        kGradientPanel2.setkStartColor(new java.awt.Color(234, 175, 200));
        kGradientPanel2.setMinimumSize(new java.awt.Dimension(800, 520));
        kGradientPanel2.setPreferredSize(new java.awt.Dimension(800, 520));
        kGradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setText("Help Request");
        kGradientPanel2.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, -1, -1));

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

        kGradientPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 780, 350));

        btnComplete.setText("Complete");
        btnComplete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompleteActionPerformed(evt);
            }
        });
        kGradientPanel2.add(btnComplete, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 470, -1, -1));

        jSplitPane1.setRightComponent(kGradientPanel2);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCompleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompleteActionPerformed

        int selectedRow = tblWorkRequests.getSelectedRow();

        
        if (selectedRow >= 0) {
            
            VolunteerRequest selectedRequest = (VolunteerRequest) tblWorkRequests.getValueAt(selectedRow, 0);
            
            if (selectedRequest.getStatus().equalsIgnoreCase("Completed")) {
                
                JOptionPane.showMessageDialog(this, "Request has already been completed.","Warning",JOptionPane.WARNING_MESSAGE);
            } else {
                selectedRequest.setStatus("Completed");
                JOptionPane.showMessageDialog(this, "Request completed!", "Information",JOptionPane.INFORMATION_MESSAGE);
                populateTable();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a requestx", "Warning", JOptionPane.WARNING_MESSAGE);
        }  
        
    }//GEN-LAST:event_btnCompleteActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        this.setVisible(false);
        new LoginJFrame(this.ecosys, this.useraccount);
    }//GEN-LAST:event_btnLogOutActionPerformed

        private void populateTable() {

        //populate table
        DefaultTableModel model = (DefaultTableModel) tblWorkRequests.getModel();
        model.setRowCount(0);
        
        for (WorkRequest request : useraccount.getWorkQueue().getWorkRequestList()){
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
            java.util.logging.Logger.getLogger(VolunteerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VolunteerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VolunteerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VolunteerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VolunteerJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComplete;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblWorkRequests;
    // End of variables declaration//GEN-END:variables
}
