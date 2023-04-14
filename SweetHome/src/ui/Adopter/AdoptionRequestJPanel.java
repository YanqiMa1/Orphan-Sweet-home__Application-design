/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Adopter;

/**
 *
 * @author hp
 */
public class AdoptionRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdopterWorkAreaJPanel
     */
    public AdoptionRequestJPanel() {
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
        btnBack = new javax.swing.JButton();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        lblAuthorizationStatus = new javax.swing.JLabel();
        txtAuthorizationStatus = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbOrphanList = new javax.swing.JTable();
        lblOrphanSelection = new javax.swing.JLabel();
        btnViewDetails = new javax.swing.JButton();
        btnSendRequest = new javax.swing.JButton();
        lblAdoptionRequest = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbAdoptionRequests = new javax.swing.JTable();

        setBackground(new java.awt.Color(252, 74, 26));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setLayout(new java.awt.BorderLayout());

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        kGradientPanel1.setkEndColor(new java.awt.Color(247, 183, 51));
        kGradientPanel1.setkStartColor(new java.awt.Color(252, 74, 26));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(800, 80));

        btnBack.setBackground(new java.awt.Color(252, 74, 26));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("<< Back");
        btnBack.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(btnBack)
                .addContainerGap(795, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(16, 16, 16))
        );

        jSplitPane1.setTopComponent(kGradientPanel1);

        kGradientPanel2.setkEndColor(new java.awt.Color(247, 183, 51));
        kGradientPanel2.setkStartColor(new java.awt.Color(252, 74, 26));
        kGradientPanel2.setPreferredSize(new java.awt.Dimension(800, 520));

        lblAuthorizationStatus.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblAuthorizationStatus.setForeground(new java.awt.Color(255, 255, 255));
        lblAuthorizationStatus.setText("Authorization Status:");

        tbOrphanList.setBackground(new java.awt.Color(204, 204, 204));
        tbOrphanList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "Sex", "Age", "Manager", "Orphan Shelter"
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
        jScrollPane1.setViewportView(tbOrphanList);

        lblOrphanSelection.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblOrphanSelection.setForeground(new java.awt.Color(255, 255, 255));
        lblOrphanSelection.setText("Orphan Selection");

        btnViewDetails.setBackground(new java.awt.Color(252, 74, 26));
        btnViewDetails.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnViewDetails.setForeground(new java.awt.Color(255, 255, 255));
        btnViewDetails.setText("View");
        btnViewDetails.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnViewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetailsActionPerformed(evt);
            }
        });

        btnSendRequest.setBackground(new java.awt.Color(252, 74, 26));
        btnSendRequest.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSendRequest.setForeground(new java.awt.Color(255, 255, 255));
        btnSendRequest.setText("Adopt");
        btnSendRequest.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSendRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendRequestActionPerformed(evt);
            }
        });

        lblAdoptionRequest.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblAdoptionRequest.setForeground(new java.awt.Color(255, 255, 255));
        lblAdoptionRequest.setText("Your Adoption Request");

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

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnViewDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSendRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(172, 172, 172))
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAdoptionRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                .addComponent(lblAuthorizationStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(txtAuthorizationStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblOrphanSelection, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(237, Short.MAX_VALUE))
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblAuthorizationStatus)
                    .addComponent(txtAuthorizationStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(lblOrphanSelection, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewDetails)
                    .addComponent(btnSendRequest))
                .addGap(13, 13, 13)
                .addComponent(lblAdoptionRequest)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        jSplitPane1.setRightComponent(kGradientPanel2);

        add(jSplitPane1, java.awt.BorderLayout.PAGE_START);
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetailsActionPerformed


    }//GEN-LAST:event_btnViewDetailsActionPerformed

    private void btnSendRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendRequestActionPerformed


    }//GEN-LAST:event_btnSendRequestActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSendRequest;
    private javax.swing.JButton btnViewDetails;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private javax.swing.JLabel lblAdoptionRequest;
    private javax.swing.JLabel lblAuthorizationStatus;
    private javax.swing.JLabel lblOrphanSelection;
    private javax.swing.JTable tbAdoptionRequests;
    private javax.swing.JTable tbOrphanList;
    private javax.swing.JTextField txtAuthorizationStatus;
    // End of variables declaration//GEN-END:variables
}