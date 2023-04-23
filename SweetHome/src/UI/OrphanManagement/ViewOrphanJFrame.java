/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.OrphanManagement;

import Model.EcoSystem.EcoSystem;
import Model.EcoSystem.Network;
import Model.Enterprise.Enterprise;
import Model.Organization.Organization;
import Model.Orphan.Orphan;
import Model.UserAccount.UserAccount;
import Model.WorkQueue.MedCareRequest;
import Model.WorkQueue.WorkRequest;
import java.awt.Image;
import java.nio.file.Paths;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alilovepeach
 */
public class ViewOrphanJFrame extends javax.swing.JFrame {
    EcoSystem ecosys;
    Network network;
    Enterprise enterprise;
    Orphan orphan;
    Organization org;
    UserAccount useraccount;
    /**
     * Creates new form ViewOrphanJFrame
     */
    public ViewOrphanJFrame() {
        initComponents();
    }
    
    public ViewOrphanJFrame(EcoSystem ecosys, Network network, Enterprise enterprise, Organization org, UserAccount useraccount, Orphan orphan) {
        initComponents();
        this.ecosys=ecosys;
        this.network=network;
        this.enterprise=enterprise;
        this.org=org;
        this.useraccount=useraccount;
        this.orphan=orphan;
        
        showOrphanDetails();
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
        lblMessage8 = new javax.swing.JLabel();
        lblMessage10 = new javax.swing.JLabel();
        lblMessage11 = new javax.swing.JLabel();
        btnMedicalCareRequest = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrphanManagerWorkArea = new javax.swing.JTable();
        lblMessage13 = new javax.swing.JLabel();
        lblPhoto = new javax.swing.JLabel();
        lblMedicalCareMessage = new javax.swing.JLabel();
        txtSendMedicalCareMessage = new javax.swing.JTextField();
        btnClose = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtPharmacyMessage = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtDoctorMessage = new javax.swing.JTextArea();
        txtRace = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setkEndColor(new java.awt.Color(101, 78, 163));
        kGradientPanel1.setkStartColor(new java.awt.Color(234, 175, 200));
        kGradientPanel1.setMinimumSize(new java.awt.Dimension(800, 600));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(800, 600));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setText("On Going Orphan");
        kGradientPanel1.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 160, 20));

        txtOrphanName.setEnabled(false);
        kGradientPanel1.add(txtOrphanName, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 150, 30));

        lblMessage5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMessage5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMessage5.setText("Name:");
        kGradientPanel1.add(lblMessage5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 50, 20));

        txtAge.setEnabled(false);
        kGradientPanel1.add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 150, 30));

        lblMessage6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMessage6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMessage6.setText("Age:");
        kGradientPanel1.add(lblMessage6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 50, 20));

        txtSex.setEnabled(false);
        kGradientPanel1.add(txtSex, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 150, 30));

        lblMessage7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMessage7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMessage7.setText("Sex:");
        kGradientPanel1.add(lblMessage7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 50, 20));

        lblMessage8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMessage8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMessage8.setText("Race:");
        kGradientPanel1.add(lblMessage8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 50, 20));

        lblMessage10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMessage10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMessage10.setText("Doctor Feedback:");
        kGradientPanel1.add(lblMessage10, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 120, 20));

        lblMessage11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMessage11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMessage11.setText("Pharmacy Feedback:");
        kGradientPanel1.add(lblMessage11, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, -1, 20));

        btnMedicalCareRequest.setText("Request Medical Care");
        btnMedicalCareRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedicalCareRequestActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btnMedicalCareRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 470, 160, 40));

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

        kGradientPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 770, 110));

        lblMessage13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMessage13.setText("Medical Care Status:");
        kGradientPanel1.add(lblMessage13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 120, 30));
        kGradientPanel1.add(lblPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 200, 200));

        lblMedicalCareMessage.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblMedicalCareMessage.setText("Message:");
        kGradientPanel1.add(lblMedicalCareMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 70, 40));
        kGradientPanel1.add(txtSendMedicalCareMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, 360, 40));

        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, 80, -1));

        txtPharmacyMessage.setEditable(false);
        txtPharmacyMessage.setColumns(20);
        txtPharmacyMessage.setRows(5);
        jScrollPane2.setViewportView(txtPharmacyMessage);

        kGradientPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 180, -1, -1));

        txtDoctorMessage.setEditable(false);
        txtDoctorMessage.setColumns(20);
        txtDoctorMessage.setRows(5);
        jScrollPane3.setViewportView(txtDoctorMessage);

        kGradientPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, -1, -1));

        txtRace.setText("Race");
        kGradientPanel1.add(txtRace, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, -1, -1));

        getContentPane().add(kGradientPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMedicalCareRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedicalCareRequestActionPerformed

        String requestVetMessage = txtSendMedicalCareMessage.getText();
        if(requestVetMessage.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter something to send.","Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        MedCareRequest request = new MedCareRequest();
        request.setMessage(requestVetMessage);
        request.setSender(useraccount);
        request.setStatus("Pending for Doctor");
        request.setOrphan(orphan);

        network.getWorkQueue().getWorkRequestList().add(request);
        orphan.getWorkQueue().getWorkRequestList().add(request);

        JOptionPane.showMessageDialog(this, "Medical Request sent.", "Information",JOptionPane.INFORMATION_MESSAGE);
        populateTable();
        txtSendMedicalCareMessage.setText("");

    }//GEN-LAST:event_btnMedicalCareRequestActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnCloseActionPerformed

        private void showOrphanDetails() {

        txtOrphanName.setText(orphan.getName());
        txtAge.setText(String.valueOf(orphan.getAge()));
        txtSex.setText(orphan.getSex());
        txtRace.setText(orphan.getRace());
        txtDoctorMessage.setText(orphan.getDoctorMessage());
        txtPharmacyMessage.setText(orphan.getPharmacyMessage());
        
        if (orphan.getPhoto()!=null){
            String path = Paths.get(orphan.getPhoto()).toAbsolutePath().toString();
            ImageIcon icon = seticon(path, null);
            lblPhoto.setIcon(icon);
        }

        populateTable();
        
    }
    
    public ImageIcon seticon(String m, byte[] image){
        
        ImageIcon i = null;
        
        if (m != null) {
            i = new ImageIcon(m);
        } else {
            i = new ImageIcon(image);
        }

        Image img1 = i.getImage();
        Image img2 = img1.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        ImageIcon img = new ImageIcon(img2);
        return img;
    }
    
    private void populateTable() {

        DefaultTableModel model = (DefaultTableModel) tblOrphanManagerWorkArea.getModel();
        model.setRowCount(0);
        
        if (!orphan.getWorkQueue().getWorkRequestList().isEmpty()){
            for (WorkRequest request : orphan.getWorkQueue().getWorkRequestList()){
                if (request instanceof MedCareRequest){
                    Object[] row = new Object[4];
                    row[0] = request;
                    row[1] = orphan.getManager();
                    row[2] = request.getReceiver() == null ? null : request.getReceiver();
                    row[3] = request.getStatus();
                    model.addRow(row);
                }   
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
            java.util.logging.Logger.getLogger(ViewOrphanJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewOrphanJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewOrphanJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewOrphanJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewOrphanJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnMedicalCareRequest;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
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
    private javax.swing.JTextArea txtDoctorMessage;
    private javax.swing.JTextField txtOrphanName;
    private javax.swing.JTextArea txtPharmacyMessage;
    private javax.swing.JLabel txtRace;
    private javax.swing.JTextField txtSendMedicalCareMessage;
    private javax.swing.JTextField txtSex;
    // End of variables declaration//GEN-END:variables
}
