/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.EnterpriseAdminRole;

import Model.EcoSystem.EcoSystem;
import Model.EcoSystem.Network;
import Model.Enterprise.Enterprise;
import Model.Organization.Organization;
import Model.Organization.Organization.Type;
import Model.UserAccount.UserAccount;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ma2017
 */
public class ManageOrganization1JPanel extends javax.swing.JPanel {
    EcoSystem ecosys;
    Network network;
    Enterprise enterprise;
    UserAccount useraccount;
    /**
     * Creates new form ManageOrganizationJPanel
     */
    public ManageOrganization1JPanel() {
        initComponents();
    }
public ManageOrganization1JPanel(EcoSystem ecosys, UserAccount useraccount, Network nw, Enterprise enterp) {
        initComponents();
        this.setVisible(true);
        this.ecosys = ecosys;
        this.useraccount = useraccount;
        this.network = nw;
        this.enterprise = enterp;
        populateOrganizationCombo() ;
        refreshOrganizationList();
        titleLabel.setText("Welcome! " + this.useraccount.getUsername() + "   You are in:  " + this.enterprise.getName());
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
        lblOrganizationList = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrganizations = new javax.swing.JTable();
        lblSelectOrgType = new javax.swing.JLabel();
        cmbOrganizations = new javax.swing.JComboBox();
        lblOrganizationName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();

        kGradientPanel1.setkEndColor(new java.awt.Color(217, 167, 174));
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 252, 220));

        lblOrganizationList.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblOrganizationList.setText("Organization List:");

        tblOrganizations.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Type", "Enterprise", "Network"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblOrganizations);

        lblSelectOrgType.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSelectOrgType.setForeground(new java.awt.Color(255, 255, 255));
        lblSelectOrgType.setText("Select Organization Type:");

        lblOrganizationName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblOrganizationName.setForeground(new java.awt.Color(255, 255, 255));
        lblOrganizationName.setText("Organization Name:");

        btnCreate.setBackground(new java.awt.Color(238, 156, 167));
        btnCreate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCreate.setForeground(new java.awt.Color(255, 255, 255));
        btnCreate.setText("Create Organization");
        btnCreate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(238, 156, 167));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update Organization");
        btnUpdate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(238, 156, 167));
        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete Organization");
        btnDelete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        titleLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblOrganizationList, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSelectOrgType, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbOrganizations, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblOrganizationName, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblOrganizationList)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(lblSelectOrgType)
                        .addGap(20, 20, 20)
                        .addComponent(cmbOrganizations, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(lblOrganizationName)
                        .addGap(10, 10, 10)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        try {

            String name = txtName.getText();

            if (!name.isEmpty()) {
                if (enterprise.getOrganizationDirectory().nameIsUnique(name)) {
                    Type type = (Organization.Type) cmbOrganizations.getSelectedItem();
                    enterprise.getOrganizationDirectory().createOrganization(name, type);
                    JOptionPane.showMessageDialog(this, "new Organization added", "Information", JOptionPane.INFORMATION_MESSAGE);
                    txtName.setText("");
                    refreshOrganizationList();
                } else {
                    JOptionPane.showMessageDialog(this, "Organization name alreay existed", "Warning", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Name cannot be empty.", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Name cannot be empty.", "Warning", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try {
            String keyword = txtName.getText();
            int selectedRow = tblOrganizations.getSelectedRow();

            Organization or = (Organization) tblOrganizations.getValueAt(selectedRow, 0);

            if (selectedRow >= 0) {
                if (!keyword.isEmpty()) {
                    if (enterprise.getOrganizationDirectory().nameIsUnique(keyword)) {
                        or.setName(keyword);
                        JOptionPane.showMessageDialog(this, " Organization aupdated", "Information", JOptionPane.INFORMATION_MESSAGE);
                        txtName.setText("");
                        refreshOrganizationList();
                    } else {
                        JOptionPane.showMessageDialog(this, "Organization name alreay existed", "Warning", JOptionPane.WARNING_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Name cannot be empty.", "Warning", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please choose an Organization");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please choose an Organization.", "Warning", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            int selectedRow = tblOrganizations.getSelectedRow();

            Organization or = (Organization) tblOrganizations.getValueAt(selectedRow, 0);

            if (selectedRow >= 0) {

                this.enterprise.getOrganizationDirectory().deleteOrganization(or);
                txtName.setText("");
                refreshOrganizationList();
                JOptionPane.showMessageDialog(this, "Organization deleted", "Information", JOptionPane.INFORMATION_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(null, "Please choose an Organization");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please choose an Organization.", "Warning", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void populateOrganizationCombo() {

            String type = this.enterprise.getType().getValue();

            switch (type) {
                case "OrphanShelterEnterprise":
                    cmbOrganizations.removeAllItems();
                    for (Organization.Type organizationType : Organization.Type.values()) {
                        if (organizationType.getValue().equals("Orphan Management Organization")) {
                            cmbOrganizations.addItem(organizationType);
                        }
                        
                    }
                    break;
                case "MedicalCareEnterprise":
                    cmbOrganizations.removeAllItems();
                    for (Organization.Type organizationType : Organization.Type.values()) {
                        if (organizationType.getValue().equals("Doctor Organization")) {
                            cmbOrganizations.addItem(organizationType);
                        }
                        if (organizationType.getValue().equals("Pharmacy Organization")) {
                            cmbOrganizations.addItem(organizationType);
                        }
                    }
                    break;
                case "AdoptionEnterprise":
                    cmbOrganizations.removeAllItems();
                    for (Organization.Type organizationType : Organization.Type.values()) {
                        if (organizationType.getValue().equals("Adopter Management Organization")) {
                            cmbOrganizations.addItem(organizationType);
                        }
                        if (organizationType.getValue().equals("Authority Organization")) {
                            cmbOrganizations.addItem(organizationType);
                        }
                     
                    }
                    break;
                case "VolunteerEnterprise":
                    cmbOrganizations.removeAllItems();
                    for (Organization.Type organizationType : Organization.Type.values()) {
                        if (organizationType.getValue().equals("Volunteer Management Organization")) {
                            cmbOrganizations.addItem(organizationType);
                        }
              
                    }
                    break;
                default:
                    cmbOrganizations.removeAllItems();
            }
        
    }
    
    private void refreshOrganizationList() {

        DefaultTableModel model = (DefaultTableModel) tblOrganizations.getModel();
        model.setRowCount(0);
  

            for (Organization o : this.enterprise.getOrganizationDirectory().getOrganizationList()) {
                Object[] row = new Object[4];
                row[0] = o;
                row[1] = o.getType();
                row[2] = this.enterprise.getName();
                row[3] = this.getName();

                model.addRow(row);
            }
        

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox cmbOrganizations;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel lblOrganizationList;
    private javax.swing.JLabel lblOrganizationName;
    private javax.swing.JLabel lblSelectOrgType;
    private javax.swing.JTable tblOrganizations;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}