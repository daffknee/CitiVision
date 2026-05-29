package com.mycompany.citivision.ui;

import com.mycompany.citivision.dao.ComplaintDAO;
import com.mycompany.citivision.model.Complaint;
import javax.swing.*;

public class AdminViewDetails extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(AdminViewDetails.class.getName());
    private int complaintID; // global variable to store the passed ID

    public AdminViewDetails(int id) {
        this.complaintID = id; // change constructor to accept the ID
        initComponents();
        loadComplaintData(); // fetches the data right when the window opens
    }

    // method to get citizen's data from the database
    private void loadComplaintData() {
        txtLoc.setEditable(false);
        txtDesc.setEditable(false);
        categoryLoc.setEnabled(false);

        ComplaintDAO dao = new ComplaintDAO();
        Complaint comp = dao.getComplaintDetails(complaintID);

        if (comp.getCategory() != null) {
            categoryLoc.setText(comp.getCategory());
            txtLoc.setText(comp.getLocation());
            txtDesc.setText(comp.getDescription());
            statusChange.setSelectedItem(comp.getStatus());

            // render image
            byte[] imgBytes = comp.getImageBytes();
            if (imgBytes != null) {
                java.awt.Image img = new javax.swing.ImageIcon(imgBytes).getImage();
                java.awt.Image scaledImg = img.getScaledInstance(490, 350, java.awt.Image.SCALE_SMOOTH);
                photoLabel.setIcon(new javax.swing.ImageIcon(scaledImg));
            }
        } else {
            JOptionPane.showMessageDialog(this, "Failed to load complaint details.");
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        updateBtn = new javax.swing.JButton();
        adminDashboard = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtLoc = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDesc = new javax.swing.JTextArea();
        photoLabel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        statusChange = new javax.swing.JComboBox<>();
        categoryLoc = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(247, 247, 247));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(1180, 620));
        jPanel2.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(0, 29, 61));
        jPanel3.setPreferredSize(new java.awt.Dimension(1180, 100));

        jLabel1.setFont(new java.awt.Font("Poppins Black", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Details of Complaint");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(431, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(413, 413, 413))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(29, 29, 29))
        );

        jPanel2.add(jPanel3);
        jPanel3.setBounds(0, 0, 1180, 100);

        updateBtn.setBackground(new java.awt.Color(245, 188, 0));
        updateBtn.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        updateBtn.setText("Update");
        updateBtn.setPreferredSize(new java.awt.Dimension(180, 40));
        updateBtn.addActionListener(this::updateBtnActionPerformed);
        jPanel2.add(updateBtn);
        updateBtn.setBounds(379, 560, 180, 40);

        adminDashboard.setBackground(new java.awt.Color(245, 188, 0));
        adminDashboard.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        adminDashboard.setText("Back to Dashboard");
        adminDashboard.setPreferredSize(new java.awt.Dimension(180, 40));
        adminDashboard.addActionListener(this::adminDashboardActionPerformed);
        jPanel2.add(adminDashboard);
        adminDashboard.setBounds(621, 560, 180, 40);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Category:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(70, 140, 66, 20);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Location:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(70, 210, 61, 20);

        txtLoc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtLoc.addActionListener(this::txtLocActionPerformed);
        jPanel2.add(txtLoc);
        txtLoc.setBounds(70, 240, 480, 26);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Description");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(70, 280, 76, 20);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        txtDesc.setColumns(20);
        txtDesc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDesc.setRows(5);
        jScrollPane1.setViewportView(txtDesc);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(70, 310, 480, 140);

        photoLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 188, 208)));
        photoLabel.setPreferredSize(new java.awt.Dimension(490, 350));
        jPanel2.add(photoLabel);
        photoLabel.setBounds(610, 170, 490, 350);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Change Status To:");

        statusChange.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        statusChange.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PENDING VERIFICATION", "VERIFIED", "IN PROGRESS", "RESOLVED" }));
        statusChange.addActionListener(this::statusChangeActionPerformed);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(statusChange, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(statusChange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4);
        jPanel4.setBounds(70, 470, 480, 60);

        categoryLoc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel2.add(categoryLoc);
        categoryLoc.setBounds(70, 170, 480, 26);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(50, 50, 1180, 620);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        String newStatus = (String) statusChange.getSelectedItem();
    
    ComplaintDAO dao = new ComplaintDAO();
    if (dao.updateStatus(complaintID, newStatus)) {
        JOptionPane.showMessageDialog(this, "Status Successfully Updated!");
        AdminDashboard AdminFrame = new AdminDashboard();
        AdminFrame.pack();
        AdminFrame.setLocationRelativeTo(null); 
        AdminFrame.setVisible(true);
        this.dispose();
    } else {
        JOptionPane.showMessageDialog(this, "Failed to update status in the database.");   
    }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void adminDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminDashboardActionPerformed
        AdminDashboard AdminFrame = new AdminDashboard();
        AdminFrame.pack();
        AdminFrame.setLocationRelativeTo(null); 
        AdminFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_adminDashboardActionPerformed

    private void txtLocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocActionPerformed
        
    }//GEN-LAST:event_txtLocActionPerformed

    private void statusChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusChangeActionPerformed
        
    }//GEN-LAST:event_statusChangeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminDashboard;
    private javax.swing.JTextField categoryLoc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel photoLabel;
    private javax.swing.JComboBox<String> statusChange;
    private javax.swing.JTextArea txtDesc;
    private javax.swing.JTextField txtLoc;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
