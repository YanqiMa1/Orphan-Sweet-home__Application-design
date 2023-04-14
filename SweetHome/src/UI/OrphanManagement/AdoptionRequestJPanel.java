/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.OrphanManagement;

/**
 *
 * @author alilovepeach
 */
public class AdoptionRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdoptionRequestJPanel
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

        kGradientPanel1 = new keeptoo.KGradientPanel();
        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAnimalAdoptionWorkQueue = new javax.swing.JTable();
        btnApproveAnimalAdoptionRequest = new javax.swing.JButton();
        btnRejectAnimalAdoptionRequest = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 204));
        setSize(new java.awt.Dimension(800, 520));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(101, 78, 163));
        kGradientPanel1.setkStartColor(new java.awt.Color(234, 175, 200));
        kGradientPanel1.setMinimumSize(new java.awt.Dimension(800, 520));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setText("Adoption Request");
        kGradientPanel1.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, -1, -1));

        tblAnimalAdoptionWorkQueue.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Message", "Applicant", "Applicant Name", "Organization", "Status"
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
        jScrollPane1.setViewportView(tblAnimalAdoptionWorkQueue);

        kGradientPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 770, 350));

        btnApproveAnimalAdoptionRequest.setText("Approve");
        btnApproveAnimalAdoptionRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveAnimalAdoptionRequestActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btnApproveAnimalAdoptionRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 460, 170, 40));

        btnRejectAnimalAdoptionRequest.setText("Reject");
        btnRejectAnimalAdoptionRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectAnimalAdoptionRequestActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btnRejectAnimalAdoptionRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 460, 170, 40));

        add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 520));
    }// </editor-fold>//GEN-END:initComponents

    private void btnApproveAnimalAdoptionRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveAnimalAdoptionRequestActionPerformed

    }//GEN-LAST:event_btnApproveAnimalAdoptionRequestActionPerformed

    private void btnRejectAnimalAdoptionRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectAnimalAdoptionRequestActionPerformed

    }//GEN-LAST:event_btnRejectAnimalAdoptionRequestActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApproveAnimalAdoptionRequest;
    private javax.swing.JButton btnRejectAnimalAdoptionRequest;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblAnimalAdoptionWorkQueue;
    // End of variables declaration//GEN-END:variables
}