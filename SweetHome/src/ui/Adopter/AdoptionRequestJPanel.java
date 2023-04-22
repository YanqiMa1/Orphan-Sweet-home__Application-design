package UI.Adopter;

import Model.EcoSystem.EcoSystem;
import Model.EcoSystem.Network;
import Model.Enterprise.AdoptionEnterprise;
import Model.Enterprise.Enterprise;
import Model.Enterprise.OrphanShelterEnterprise;
import Model.Organization.AdopterOrganization;
import Model.Orphan.Orphan;
import Model.UserAccount.UserAccount;
import Model.WorkQueue.AdoptionRequest;
import Model.WorkQueue.MedCareRequest;
import Model.WorkQueue.PharmacistWorkRequest;
import Model.WorkQueue.WorkRequest;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
/**
 *
 * @author hp
 */
public class AdoptionRequestJPanel extends javax.swing.JPanel {

    EcoSystem ecosys;
    Network network;
    AdoptionEnterprise enterprise;
    AdopterOrganization org;
    UserAccount useraccount;
    Orphan orphan;

    /**
     * Creates new form AdopterWorkAreaJPanel
     */
    public AdoptionRequestJPanel() {
        initComponents();
    }

    public AdoptionRequestJPanel(EcoSystem ecosys, Network network, AdoptionEnterprise enterprise, AdopterOrganization org, UserAccount useraccount) {
        initComponents();
        this.setVisible(true);
        this.ecosys = ecosys;
        this.network = network;
        this.enterprise = enterprise;
        this.org = org;
        this.useraccount = useraccount;

        String getStatus = this.useraccount.getWorkQueue().findWorkRequestByMessage("New User").getStatus();
        if (getStatus.equalsIgnoreCase("Pending")) {
            statusLabel.setText("Your adopter status is under review......you are not allowed to find details about Orphans");
            lblOrphanSelection.setVisible(false);
           tbOrphanList.setVisible(false);
            btnViewDetails.setVisible(false);
            btnSendRequest.setVisible(false);
            lblAdoptionRequest.setVisible(false);
            tbAdoptionRequests.setVisible(false);
        } else {
            statusLabel.setText("Your adoptive identity has been approved");
            lblOrphanSelection.setVisible(true);
            tbOrphanList.setVisible(true);
            btnViewDetails.setVisible(true);
            btnSendRequest.setVisible(true);
            lblAdoptionRequest.setVisible(true);
            tbAdoptionRequests.setVisible(true);
            //show orphan details and adoper applications
            populateOrphanTable();
            populateRequestTable();
        }

    }

    private void populateOrphanTable() {

        DefaultTableModel model = (DefaultTableModel) tbOrphanList.getModel();
        model.setRowCount(0);

        for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
            if (e instanceof OrphanShelterEnterprise) {
                for (Orphan o : ((OrphanShelterEnterprise) e).getOrphanDirectory().getOrphanList()) {
                    if (o.getAdoptor() == null && o.getManager() != null) {
                        ArrayList<WorkRequest> list = new ArrayList<WorkRequest>();
                        for (WorkRequest beg : o.getWorkQueue().getWorkRequestList()) {
                            //request
                            if ((beg instanceof MedCareRequest && !beg.getStatus().equalsIgnoreCase("Completed"))
                                    || (beg instanceof PharmacistWorkRequest && !beg.getStatus().equalsIgnoreCase("Completed"))) {
                                list.add(beg);
                            }
                        }
                        if (list.isEmpty()) {
                            //create new row
                            Object[] table = new Object[5];

                            table[0] = o;
                            table[1] = o.getSex();
                            table[2] = o.getAge();
                            table[3] = o.getManager();
                            table[4] = o.getManager().getEnterprise();

                            model.addRow(table);

                        }

                    }
                }
            }
        }
    }

    private void populateRequestTable() {

        DefaultTableModel model = (DefaultTableModel) tbAdoptionRequests.getModel();
        model.setRowCount(0);

        for (WorkRequest request : this.useraccount.getWorkQueue().getWorkRequestList()) {
            if (request instanceof AdoptionRequest) {

                Object[] table = new Object[5];
                table[0] = request.getOrphan().getId();
                table[1] = request.getOrphan().getName();
                table[2] = request.getOrphan().getManager();
                table[3] = request.getOrphan().getManager().getEnterprise();
                table[4] = request.getStatus();

                model.addRow(table);
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

        kGradientPanel3 = new keeptoo.KGradientPanel();
        lblOrphanSelection = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbOrphanList = new javax.swing.JTable();
        btnViewDetails = new javax.swing.JButton();
        btnSendRequest = new javax.swing.JButton();
        lblAdoptionRequest = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbAdoptionRequests = new javax.swing.JTable();
        statusLabel = new javax.swing.JLabel();
        btnDonate = new javax.swing.JButton();

        setBackground(new java.awt.Color(252, 74, 26));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setLayout(new java.awt.BorderLayout());

        kGradientPanel3.setkEndColor(new java.awt.Color(247, 183, 51));
        kGradientPanel3.setkStartColor(new java.awt.Color(252, 74, 26));
        kGradientPanel3.setPreferredSize(new java.awt.Dimension(800, 520));

        lblOrphanSelection.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblOrphanSelection.setForeground(new java.awt.Color(255, 255, 255));
        lblOrphanSelection.setText("Orphans who are waiting for a sweet home");

        tbOrphanList.setBackground(new java.awt.Color(204, 204, 204));
        tbOrphanList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "Sex", "Age", "Manager", "OrphanShelterEnterprise"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbOrphanList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbOrphanListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbOrphanList);

        btnViewDetails.setBackground(new java.awt.Color(252, 74, 26));
        btnViewDetails.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnViewDetails.setForeground(new java.awt.Color(255, 255, 255));
        btnViewDetails.setText("View orphan detail");
        btnViewDetails.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnViewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetailsActionPerformed(evt);
            }
        });

        btnSendRequest.setBackground(new java.awt.Color(252, 74, 26));
        btnSendRequest.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSendRequest.setForeground(new java.awt.Color(255, 255, 255));
        btnSendRequest.setText("Request Application");
        btnSendRequest.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSendRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendRequestActionPerformed(evt);
            }
        });

        lblAdoptionRequest.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblAdoptionRequest.setForeground(new java.awt.Color(255, 255, 255));
        lblAdoptionRequest.setText("Your Adoption Application");

        tbAdoptionRequests.setBackground(new java.awt.Color(204, 204, 204));
        tbAdoptionRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Manager", "Enterprise", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbAdoptionRequests);

        statusLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        statusLabel.setForeground(new java.awt.Color(255, 255, 255));
        statusLabel.setText("Your adopter status is under review......you are not allowed to find details about Orphans");

        btnDonate.setBackground(new java.awt.Color(252, 74, 26));
        btnDonate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDonate.setForeground(new java.awt.Color(255, 255, 255));
        btnDonate.setText("Donate for the Sweet Home");
        btnDonate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDonate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDonateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel3Layout = new javax.swing.GroupLayout(kGradientPanel3);
        kGradientPanel3.setLayout(kGradientPanel3Layout);
        kGradientPanel3Layout.setHorizontalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel3Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblOrphanSelection, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAdoptionRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(statusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE))))
                    .addGroup(kGradientPanel3Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(btnDonate, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btnViewDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSendRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        kGradientPanel3Layout.setVerticalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(statusLabel)
                .addGap(33, 33, 33)
                .addComponent(lblOrphanSelection)
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSendRequest)
                    .addComponent(btnViewDetails)
                    .addComponent(btnDonate))
                .addGap(18, 18, 18)
                .addComponent(lblAdoptionRequest)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        add(kGradientPanel3, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetailsActionPerformed
//        try {

        int selectedRow = tbOrphanList.getSelectedRow();
        Orphan or = (Orphan) tbOrphanList.getValueAt(selectedRow, 0);

        ViewOrphanDetailJFrame newJFrame = new ViewOrphanDetailJFrame(this.ecosys, this.network, this.enterprise, this.org, this.useraccount, or);
        newJFrame.setLocationRelativeTo(null);
        newJFrame.setVisible(true);


    }//GEN-LAST:event_btnViewDetailsActionPerformed

    private void tbOrphanListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbOrphanListMouseClicked

    }//GEN-LAST:event_tbOrphanListMouseClicked

    private void btnSendRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendRequestActionPerformed
        int selectedRow = tbOrphanList.getSelectedRow();

        if (selectedRow >= 0) {

            Orphan selectedOr = (Orphan) tbOrphanList.getValueAt(selectedRow, 0);

            for (WorkRequest request : this.useraccount.getWorkQueue().getWorkRequestList()) {
                if (request.getOrphan() == selectedOr) {
                    JOptionPane.showMessageDialog(this, "Your have already sent Application for this kid.", "Warning", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            }

            AdoptionRequest request = new AdoptionRequest();
            request.setMessage("New Adoption Request");
            request.setOrphan(selectedOr);
            request.setSender(this.useraccount);
            request.setStatus("Pending Review");

            network.getWorkQueue().getWorkRequestList().add(request);
            this.useraccount.getWorkQueue().getWorkRequestList().add(request);
            JOptionPane.showMessageDialog(this, "Adoption application has been sent.", "Information", JOptionPane.INFORMATION_MESSAGE);
            populateRequestTable();

        } else {
            JOptionPane.showMessageDialog(this, "Please choose first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_btnSendRequestActionPerformed

    private void btnDonateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDonateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDonateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDonate;
    private javax.swing.JButton btnSendRequest;
    private javax.swing.JButton btnViewDetails;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private keeptoo.KGradientPanel kGradientPanel3;
    private javax.swing.JLabel lblAdoptionRequest;
    private javax.swing.JLabel lblOrphanSelection;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JTable tbAdoptionRequests;
    private javax.swing.JTable tbOrphanList;
    // End of variables declaration//GEN-END:variables

}
