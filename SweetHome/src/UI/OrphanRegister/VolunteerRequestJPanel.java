/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.OrphanRegister;

import Model.EcoSystem.EcoSystem;
import Model.EcoSystem.Network;
import Model.Enterprise.OrphanShelterEnterprise;
import Model.Organization.OrphanManagementOrganization;
import Model.UserAccount.UserAccount;
import Model.WorkQueue.VolunteerRequest;
import Model.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alilovepeach
 */
public class VolunteerRequestJPanel extends javax.swing.JPanel {

    private EcoSystem ecosys;
    private Network network;
    private OrphanManagementOrganization org;
    private OrphanShelterEnterprise enterprise;
    private UserAccount userAccount;
    /**
     * Creates new form OrphanVolunteerRequest
     */
    public VolunteerRequestJPanel() {
        initComponents();
    }
    
    VolunteerRequestJPanel(EcoSystem ecosys, Network network, OrphanShelterEnterprise enterprise, 
            OrphanManagementOrganization org, UserAccount useraccount) {
        initComponents();
        this.ecosys=ecosys;
        this.network=network;
        this.enterprise=enterprise;
        this.org=org;
        this.userAccount=useraccount;
        
        populateVolunteerRequestTable();
    }

    public void populateVolunteerRequestTable(){
        DefaultTableModel model = (DefaultTableModel) SendVolunteerRequestJTable.getModel();
        
        model.setRowCount(0);
        
        for (WorkRequest request : this.userAccount.getWorkQueue().getWorkRequestList()){
            if (request instanceof VolunteerRequest){
            Object[] row = new Object[6];
            row[0] = request.getMessage();
            row[1] = request.getSender();
            row[2] = request.getReceiver();
            row[3] = ((VolunteerRequest) request).getAssignedVolunteer() == null ? null : ((VolunteerRequest) request).getAssignedVolunteer();
            row[4] = request.getReceiver() == null ? null : request.getReceiver().getEnterprise();
            row[5] = request.getStatus();

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

        kGradientPanel1 = new keeptoo.KGradientPanel();
        lblTitle = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        SendVolunteerRequestJTable = new javax.swing.JTable();
        btnReqVolunteer = new javax.swing.JButton();
        fieldVolunteerMessage = new javax.swing.JTextField();
        lblTitle1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 255));
        setMinimumSize(new java.awt.Dimension(800, 520));
        setPreferredSize(new java.awt.Dimension(800, 520));
        setSize(new java.awt.Dimension(800, 520));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(101, 78, 163));
        kGradientPanel1.setkStartColor(new java.awt.Color(234, 175, 200));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setText("Write message here:");
        kGradientPanel1.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, -1, -1));

        SendVolunteerRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Sender", "Volunteer Manager", "Volunteer Assigned", "Enterprise", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(SendVolunteerRequestJTable);

        kGradientPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 570, 250));

        btnReqVolunteer.setText("Request");
        btnReqVolunteer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReqVolunteerActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btnReqVolunteer, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 430, -1, -1));
        kGradientPanel1.add(fieldVolunteerMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 430, 350, -1));

        lblTitle1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle1.setText("Request Volunteer");
        kGradientPanel1.add(lblTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, -1, -1));

        add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 520));
    }// </editor-fold>//GEN-END:initComponents

    private void btnReqVolunteerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReqVolunteerActionPerformed

        String requestVolunteerMessage = fieldVolunteerMessage.getText();
        
        if(requestVolunteerMessage.equals("") || requestVolunteerMessage.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter something to send.","Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        VolunteerRequest request = new VolunteerRequest();
        request.setMessage(requestVolunteerMessage);
        request.setSender(userAccount);
        request.setStatus("Pending");
        
        network.getWorkQueue().getWorkRequestList().add(request);
        userAccount.getWorkQueue().getWorkRequestList().add(request);
        
        JOptionPane.showMessageDialog(this, "Request message sent","Information",JOptionPane.INFORMATION_MESSAGE);
        fieldVolunteerMessage.setText("");
        
        populateVolunteerRequestTable();
    }//GEN-LAST:event_btnReqVolunteerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable SendVolunteerRequestJTable;
    private javax.swing.JButton btnReqVolunteer;
    private javax.swing.JTextField fieldVolunteerMessage;
    private javax.swing.JScrollPane jScrollPane2;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTitle1;
    // End of variables declaration//GEN-END:variables
}
