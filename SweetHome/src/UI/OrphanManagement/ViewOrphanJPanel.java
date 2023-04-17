/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.OrphanManagement;

import Model.EcoSystem.EcoSystem;
import Model.EcoSystem.Network;
import Model.Enterprise.Enterprise;
import Model.Organization.Organization;
import Model.UserAccount.UserAccount;

/**
 *
 * @author alilovepeach
 */
public class ViewOrphanJPanel extends javax.swing.JPanel {
    EcoSystem ecosys;
    Network network;
    Enterprise enterprise;
    Organization org;
    UserAccount useraccount;
    /**
     * Creates new form ViewOrphanJPanel
     */
    public ViewOrphanJPanel(EcoSystem ecosys, Network network, Enterprise enterprise, Organization org, UserAccount useraccount) {
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

        kGradientPanel1 = new keeptoo.KGradientPanel();
        lblTitle = new javax.swing.JLabel();
        txtOrphanName = new javax.swing.JTextField();
        lblMessage5 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        lblMessage6 = new javax.swing.JLabel();
        txtSex = new javax.swing.JTextField();
        lblMessage7 = new javax.swing.JLabel();
        txtRace = new javax.swing.JTextField();
        lblMessage8 = new javax.swing.JLabel();
        txtDoctorMessage = new javax.swing.JTextField();
        lblMessage10 = new javax.swing.JLabel();
        txtPharmacyMessage = new javax.swing.JTextField();
        lblMessage11 = new javax.swing.JLabel();
        btnMedicalCareRequest = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrphanManagerWorkArea = new javax.swing.JTable();
        lblMessage13 = new javax.swing.JLabel();
        lblPhoto = new javax.swing.JLabel();
        lblMedicalCareMessage = new javax.swing.JLabel();
        txtSendMedicalCareMessage = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 204, 204));
        setPreferredSize(new java.awt.Dimension(800, 520));
        setRequestFocusEnabled(false);
        setSize(new java.awt.Dimension(800, 520));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(101, 78, 163));
        kGradientPanel1.setkStartColor(new java.awt.Color(234, 175, 200));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setText("On Going Orphan");
        kGradientPanel1.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 160, 20));

        txtOrphanName.setEnabled(false);
        kGradientPanel1.add(txtOrphanName, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 140, 20));

        lblMessage5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMessage5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMessage5.setText("Name:");
        kGradientPanel1.add(lblMessage5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 50, 20));

        txtAge.setEnabled(false);
        kGradientPanel1.add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 140, 20));

        lblMessage6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMessage6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMessage6.setText("Age:");
        kGradientPanel1.add(lblMessage6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 50, 20));

        txtSex.setEnabled(false);
        kGradientPanel1.add(txtSex, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 140, 20));

        lblMessage7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMessage7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMessage7.setText("Sex:");
        kGradientPanel1.add(lblMessage7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 50, 20));

        txtRace.setEnabled(false);
        kGradientPanel1.add(txtRace, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 140, 20));

        lblMessage8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMessage8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMessage8.setText("Race:");
        kGradientPanel1.add(lblMessage8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 50, 20));

        txtDoctorMessage.setEnabled(false);
        kGradientPanel1.add(txtDoctorMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, 200, 40));

        lblMessage10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMessage10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMessage10.setText("Doctor Feedback:");
        kGradientPanel1.add(lblMessage10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 120, 20));

        txtPharmacyMessage.setEnabled(false);
        kGradientPanel1.add(txtPharmacyMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, 200, 40));

        lblMessage11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMessage11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMessage11.setText("Pharmacy Feedback:");
        kGradientPanel1.add(lblMessage11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, -1, 20));

        btnMedicalCareRequest.setText("Request Medical Care");
        btnMedicalCareRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedicalCareRequestActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btnMedicalCareRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 410, 160, 40));

        tblOrphanManagerWorkArea.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Message", "Sender", "Recipient", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblOrphanManagerWorkArea);

        kGradientPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 770, 110));

        lblMessage13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMessage13.setText("Medical Care Status:");
        kGradientPanel1.add(lblMessage13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 120, 30));
        kGradientPanel1.add(lblPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 200, 200));

        lblMedicalCareMessage.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblMedicalCareMessage.setText("Message:");
        kGradientPanel1.add(lblMedicalCareMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 70, 40));
        kGradientPanel1.add(txtSendMedicalCareMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 360, 40));

        add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 520));
    }// </editor-fold>//GEN-END:initComponents

    private void btnMedicalCareRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedicalCareRequestActionPerformed

    }//GEN-LAST:event_btnMedicalCareRequestActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMedicalCareRequest;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel lblMedicalCareMessage;
    private javax.swing.JLabel lblMessage10;
    private javax.swing.JLabel lblMessage11;
    private javax.swing.JLabel lblMessage13;
    private javax.swing.JLabel lblMessage5;
    private javax.swing.JLabel lblMessage6;
    private javax.swing.JLabel lblMessage7;
    private javax.swing.JLabel lblMessage8;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblOrphanManagerWorkArea;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtDoctorMessage;
    private javax.swing.JTextField txtOrphanName;
    private javax.swing.JTextField txtPharmacyMessage;
    private javax.swing.JTextField txtRace;
    private javax.swing.JTextField txtSendMedicalCareMessage;
    private javax.swing.JTextField txtSex;
    // End of variables declaration//GEN-END:variables
}
