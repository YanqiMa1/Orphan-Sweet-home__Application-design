/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.AdministrativeRole;

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
 * @author hp
 */
public class ManageOrganizationJPanel extends javax.swing.JPanel {

    EcoSystem ecosys;
    UserAccount useraccount;

    /**
     * Creates new form ManageOrganizationJPanel
     */
    public ManageOrganizationJPanel() {
        initComponents();
    }

    public ManageOrganizationJPanel(EcoSystem ecosys, UserAccount useraccount) {
        initComponents();
        this.ecosys = ecosys;
        this.useraccount = useraccount;
        populateNetworkCombo();
        populateEnterpriseCombo();
        populateOrganizationCombo();
        refreshOrganizationList();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblOrganizationPicker = new javax.swing.JLabel();
        cmbNetworkList = new javax.swing.JComboBox();
        kGradientPanel = new keeptoo.KGradientPanel();
        lblTitle = new javax.swing.JLabel();
        lblOrganizationList = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrganizations = new javax.swing.JTable();
        lblOrganizationPicker1 = new javax.swing.JLabel();
        cmbEnterprise = new javax.swing.JComboBox();
        lblSelectOrgType = new javax.swing.JLabel();
        cmbOrganizations = new javax.swing.JComboBox();
        lblOrganizationName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        lblOrganizationPicker2 = new javax.swing.JLabel();
        cmbNetwork = new javax.swing.JComboBox();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        lblOrganizationPicker.setText("Select Region:");

        cmbNetworkList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbNetworkList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNetworkListActionPerformed(evt);
            }
        });

        setLayout(new java.awt.BorderLayout());

        kGradientPanel.setkEndColor(new java.awt.Color(255, 221, 225));
        kGradientPanel.setkStartColor(new java.awt.Color(238, 156, 167));
        kGradientPanel.setPreferredSize(new java.awt.Dimension(800, 520));
        kGradientPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Manage Organizations");
        kGradientPanel.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        lblOrganizationList.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblOrganizationList.setForeground(new java.awt.Color(255, 255, 255));
        lblOrganizationList.setText("Organization List:");
        kGradientPanel.add(lblOrganizationList, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

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

        kGradientPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 490, 370));

        lblOrganizationPicker1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblOrganizationPicker1.setForeground(new java.awt.Color(255, 255, 255));
        lblOrganizationPicker1.setText("Select Enterprise:");
        kGradientPanel.add(lblOrganizationPicker1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, -1, -1));

        cmbEnterprise.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbEnterpriseItemStateChanged(evt);
            }
        });
        kGradientPanel.add(cmbEnterprise, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, 190, -1));

        lblSelectOrgType.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSelectOrgType.setForeground(new java.awt.Color(255, 255, 255));
        lblSelectOrgType.setText("Select Organization Type:");
        kGradientPanel.add(lblSelectOrgType, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, -1, -1));

        kGradientPanel.add(cmbOrganizations, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, 190, -1));

        lblOrganizationName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblOrganizationName.setForeground(new java.awt.Color(255, 255, 255));
        lblOrganizationName.setText("Organization Name:");
        kGradientPanel.add(lblOrganizationName, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, -1, -1));
        kGradientPanel.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, 190, 26));

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
        kGradientPanel.add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 380, 170, 30));

        lblOrganizationPicker2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblOrganizationPicker2.setForeground(new java.awt.Color(255, 255, 255));
        lblOrganizationPicker2.setText("Select Nework:");
        kGradientPanel.add(lblOrganizationPicker2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, -1, 22));

        cmbNetwork.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbNetworkItemStateChanged(evt);
            }
        });
        kGradientPanel.add(cmbNetwork, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 190, -1));

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
        kGradientPanel.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 420, 170, 30));

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
        kGradientPanel.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 460, 170, 30));

        add(kGradientPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbNetworkListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNetworkListActionPerformed

    }//GEN-LAST:event_cmbNetworkListActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try {
            String keyword = txtName.getText();
            int selectedRow = tblOrganizations.getSelectedRow();
            Network network = (Network) cmbNetwork.getSelectedItem();

            String selectedOption = (String) cmbEnterprise.getSelectedItem();
            String enterpriseName = selectedOption.split("\\s\\|\\s")[1];
            Enterprise enterprise = network.getEnterpriseDirectory().getEnterpriseByName(enterpriseName);

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

            Network network = (Network) cmbNetwork.getSelectedItem();
            String selectedOption = (String) cmbEnterprise.getSelectedItem();
            String enterpriseName = selectedOption.split("\\s\\|\\s")[1];
            Enterprise enterprise = network.getEnterpriseDirectory().getEnterpriseByName(enterpriseName);

            Organization or = (Organization) tblOrganizations.getValueAt(selectedRow, 0);

            if (selectedRow >= 0) {

                enterprise.getOrganizationDirectory().deleteOrganization(or);
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

    private void cmbNetworkItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbNetworkItemStateChanged
        populateEnterpriseCombo();
        populateOrganizationCombo();
        refreshOrganizationList();
    }//GEN-LAST:event_cmbNetworkItemStateChanged

    private void cmbEnterpriseItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbEnterpriseItemStateChanged
        populateOrganizationCombo();
        refreshOrganizationList();
    }//GEN-LAST:event_cmbEnterpriseItemStateChanged

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        try {

            Network network = (Network) cmbNetwork.getSelectedItem();

            String selectedOption = (String) cmbEnterprise.getSelectedItem();
            String enterpriseName = selectedOption.split("\\s\\|\\s")[1];
            Enterprise enterprise = network.getEnterpriseDirectory().getEnterpriseByName(enterpriseName);

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
            JOptionPane.showMessageDialog(this, "Network / Enterprise cannot be empty.", "Warning", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_btnCreateActionPerformed
    public void populateNetworkCombo() {
        cmbNetwork.removeAllItems();
        for (Network nw : this.ecosys.getNetworkList()) {
            cmbNetwork.addItem(nw);
        }

    }

    private void populateEnterpriseCombo() {

        cmbEnterprise.removeAllItems();

        Network network = (Network) cmbNetwork.getSelectedItem();

        if (network != null) {
            for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
                cmbEnterprise.addItem(e.getType() + " | " + e);
            }
        }
    }

    private void populateOrganizationCombo() {

        Network network = (Network) cmbNetwork.getSelectedItem();

        if (cmbEnterprise.getSelectedItem() != null) {
            String selectedOption = (String) cmbEnterprise.getSelectedItem();
            String enterpriseName = selectedOption.split("\\s\\|\\s")[1];
            Enterprise enterprise = network.getEnterpriseDirectory().getEnterpriseByName(enterpriseName);

            String type = enterprise.getType().getValue();

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
    }

    private void refreshOrganizationList() {

        DefaultTableModel model = (DefaultTableModel) tblOrganizations.getModel();
        model.setRowCount(0);
        Network selectedNetwork = (Network) cmbNetwork.getSelectedItem();

        if (cmbEnterprise.getSelectedItem() != null) {
            String selectedOption = (String) cmbEnterprise.getSelectedItem();
            String enterpriseName = selectedOption.split("\\s\\|\\s")[1];
            Enterprise enterprise = selectedNetwork.getEnterpriseDirectory().getEnterpriseByName(enterpriseName);

            for (Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
                Object[] row = new Object[4];
                row[0] = o;
                row[1] = o.getType();
                row[2] = enterpriseName;
                row[3] = selectedNetwork.getName();

                model.addRow(row);
            }
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox cmbEnterprise;
    private javax.swing.JComboBox cmbNetwork;
    private javax.swing.JComboBox cmbNetworkList;
    private javax.swing.JComboBox cmbOrganizations;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel;
    private javax.swing.JLabel lblOrganizationList;
    private javax.swing.JLabel lblOrganizationName;
    private javax.swing.JLabel lblOrganizationPicker;
    private javax.swing.JLabel lblOrganizationPicker1;
    private javax.swing.JLabel lblOrganizationPicker2;
    private javax.swing.JLabel lblSelectOrgType;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblOrganizations;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
