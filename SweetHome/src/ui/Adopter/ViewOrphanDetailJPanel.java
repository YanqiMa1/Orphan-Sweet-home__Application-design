/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Adopter;

/**
 *
 * @author hp
 */
public class ViewOrphanDetailJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewOrphanDetailJPanel
     */
    public ViewOrphanDetailJPanel() {
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
        lblTitle = new javax.swing.JLabel();
        lblMessage7 = new javax.swing.JLabel();
        txtOrphanMessageFromDr = new javax.swing.JTextField();
        txtOrphanRace = new javax.swing.JTextField();
        txtOrphanGender = new javax.swing.JTextField();
        lblMessage8 = new javax.swing.JLabel();
        lblPhoto = new javax.swing.JLabel();
        txtOrphanfName = new javax.swing.JTextField();
        txtOrphanAge = new javax.swing.JTextField();
        lblMessage12 = new javax.swing.JLabel();
        lblMessage9 = new javax.swing.JLabel();
        lblMessage5 = new javax.swing.JLabel();
        lblMessage11 = new javax.swing.JLabel();
        txtAnimalMessageFromPharmacy = new javax.swing.JTextField();

        setBackground(new java.awt.Color(247, 183, 51));
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
                .addContainerGap(767, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(16, 16, 16))
        );

        jSplitPane1.setTopComponent(kGradientPanel1);

        kGradientPanel2.setkEndColor(new java.awt.Color(247, 183, 51));
        kGradientPanel2.setkStartColor(new java.awt.Color(252, 74, 26));
        kGradientPanel2.setPreferredSize(new java.awt.Dimension(800, 520));

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText(" Orphan Detail");

        lblMessage7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMessage7.setForeground(new java.awt.Color(255, 255, 255));
        lblMessage7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMessage7.setText("Age:");

        txtOrphanMessageFromDr.setEnabled(false);

        txtOrphanRace.setEnabled(false);

        txtOrphanGender.setEnabled(false);

        lblMessage8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMessage8.setForeground(new java.awt.Color(255, 255, 255));
        lblMessage8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMessage8.setText("Sex:");

        txtOrphanfName.setEnabled(false);

        txtOrphanAge.setEnabled(false);

        lblMessage12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMessage12.setForeground(new java.awt.Color(255, 255, 255));
        lblMessage12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMessage12.setText("Docter Feedback:");

        lblMessage9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMessage9.setForeground(new java.awt.Color(255, 255, 255));
        lblMessage9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMessage9.setText("Race:");

        lblMessage5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMessage5.setForeground(new java.awt.Color(255, 255, 255));
        lblMessage5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMessage5.setText("Name:");

        lblMessage11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMessage11.setForeground(new java.awt.Color(255, 255, 255));
        lblMessage11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMessage11.setText("Pharmacy Feedback:");

        txtAnimalMessageFromPharmacy.setEnabled(false);

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(kGradientPanel2Layout.createSequentialGroup()
                    .addGap(452, 452, 452)
                    .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblMessage8)
                        .addComponent(lblMessage9)
                        .addComponent(lblMessage7))
                    .addGap(28, 28, 28)
                    .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtOrphanRace, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtOrphanGender, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtOrphanAge, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtOrphanfName, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                    .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(kGradientPanel2Layout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addComponent(lblPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                    .addGap(32, 32, 32)
                                    .addComponent(lblMessage12)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblMessage5)
                                    .addGap(28, 28, 28))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblMessage11)
                            .addGap(18, 18, 18)))
                    .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtOrphanMessageFromDr, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                        .addComponent(txtAnimalMessageFromPharmacy))
                    .addGap(186, 186, 186)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                .addComponent(lblTitle)
                .addGap(297, 297, 297))
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addComponent(lblTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtOrphanfName, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMessage5))
                        .addGap(18, 18, 18)
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMessage7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtOrphanAge, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMessage8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtOrphanGender, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMessage9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtOrphanRace, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMessage12, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtOrphanMessageFromDr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMessage11)
                    .addComponent(txtAnimalMessageFromPharmacy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jSplitPane1.setRightComponent(kGradientPanel2);

        add(jSplitPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JSplitPane jSplitPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private javax.swing.JLabel lblMessage11;
    private javax.swing.JLabel lblMessage12;
    private javax.swing.JLabel lblMessage5;
    private javax.swing.JLabel lblMessage7;
    private javax.swing.JLabel lblMessage8;
    private javax.swing.JLabel lblMessage9;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtAnimalMessageFromPharmacy;
    private javax.swing.JTextField txtOrphanAge;
    private javax.swing.JTextField txtOrphanGender;
    private javax.swing.JTextField txtOrphanMessageFromDr;
    private javax.swing.JTextField txtOrphanRace;
    private javax.swing.JTextField txtOrphanfName;
    // End of variables declaration//GEN-END:variables
}