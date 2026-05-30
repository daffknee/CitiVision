package com.mycompany.citivision.ui;

import com.mycompany.citivision.dao.ComplaintDAO;
import com.mycompany.citivision.model.Complaint;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

    public class NewComplaint extends javax.swing.JFrame {

        private final String loggedInUser;

        public NewComplaint(String username) {
            this.loggedInUser = username;
            initComponents();
        }

        File selectedFile = null; // global variable to hold the selected image

        //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        categoryCmb = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtLoc = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDesc = new javax.swing.JTextArea();
        photoLabel = new javax.swing.JLabel();
        browseButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        submitBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(247, 247, 247));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(1180, 620));
        jPanel2.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(0, 29, 61));
        jPanel3.setPreferredSize(new java.awt.Dimension(1180, 100));

        jLabel1.setFont(new java.awt.Font("Poppins Black", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Submit a Complaint");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Kindly fill in the following information below to submit a complaint");
        jLabel2.setPreferredSize(new java.awt.Dimension(424, 20));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(392, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(430, 430, 430))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(364, 364, 364))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3);
        jPanel3.setBounds(0, 0, 1180, 100);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Category:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(70, 140, 66, 20);

        categoryCmb.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        categoryCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a Category", "Infrastrcuture (Potholes, Lights, etc.)", "Health Hazard (Mosquitoes, Chemicals)", "Sanitation & Waste (Uncollected Trash)", "Public Disturbance (Noise, Loitering)", "Security & Safety", "Other" }));
        categoryCmb.addActionListener(this::categoryCmbActionPerformed);
        jPanel2.add(categoryCmb);
        categoryCmb.setBounds(70, 170, 480, 26);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Location:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(70, 230, 61, 20);

        txtLoc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtLoc.addActionListener(this::txtLocActionPerformed);
        jPanel2.add(txtLoc);
        txtLoc.setBounds(70, 260, 480, 26);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Description");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(70, 310, 76, 20);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        txtDesc.setColumns(20);
        txtDesc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDesc.setRows(5);
        jScrollPane1.setViewportView(txtDesc);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(70, 350, 480, 190);

        photoLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 188, 208)));
        photoLabel.setPreferredSize(new java.awt.Dimension(490, 350));
        jPanel2.add(photoLabel);
        photoLabel.setBounds(610, 190, 490, 350);

        browseButton.setBackground(new java.awt.Color(169, 188, 208));
        browseButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        browseButton.setText("Browse Image");
        browseButton.addActionListener(this::browseButtonActionPerformed);
        jPanel2.add(browseButton);
        browseButton.setBounds(730, 150, 370, 30);

        cancelButton.setBackground(new java.awt.Color(245, 188, 0));
        cancelButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.setPreferredSize(new java.awt.Dimension(180, 40));
        cancelButton.addActionListener(this::cancelButtonActionPerformed);
        jPanel2.add(cancelButton);
        cancelButton.setBounds(620, 560, 180, 40);

        submitBtn.setBackground(new java.awt.Color(245, 188, 0));
        submitBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        submitBtn.setText("Submit Complaint");
        submitBtn.setPreferredSize(new java.awt.Dimension(180, 40));
        submitBtn.addActionListener(this::submitBtnActionPerformed);
        jPanel2.add(submitBtn);
        submitBtn.setBounds(379, 560, 180, 40);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Insert Image:");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(610, 155, 80, 20);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(50, 50, 1180, 620);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void categoryCmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryCmbActionPerformed
       
    }//GEN-LAST:event_categoryCmbActionPerformed

    private void txtLocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocActionPerformed
        
    }//GEN-LAST:event_txtLocActionPerformed

    private void browseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseButtonActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        selectedFile = chooser.getSelectedFile(); // save to  global variable instead of  local 'File f'
        if (selectedFile != null) {
            String path = selectedFile.getAbsolutePath(); // "path" location of image
            try {
                BufferedImage bi = ImageIO.read(new File(path));
                Image img = bi.getScaledInstance(490, 350, Image.SCALE_SMOOTH);
                ImageIcon icon = new ImageIcon(img); //converts the image to an icon
                photoLabel.setIcon(icon); //sets the icon to JLabel
            } catch (IOException ex) {
                System.err.println("Error reading the selected image file: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_browseButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        CitizenDashboard CitizenFrame = new CitizenDashboard(loggedInUser);
        CitizenFrame.pack();
        CitizenFrame.setLocationRelativeTo(null); 
        CitizenFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        String category = (String) categoryCmb.getSelectedItem();
        String location = txtLoc.getText();
        String description = txtDesc.getText();

        if (location.isEmpty() || description.isEmpty() || "Select a Category".equals(category) || selectedFile == null) {
            JOptionPane.showMessageDialog(this, "Kindly fill in all required fields.");
            return;
        }

        // complaint model
        Complaint comp = new Complaint();
        comp.setCompUser(loggedInUser);
        comp.setCompDate(java.sql.Date.valueOf(java.time.LocalDate.now()));
        comp.setCategory(category);
        comp.setLocation(location);
        comp.setDescription(description);
        comp.setStatus("PENDING VERIFICATION");
        comp.setImageFile(selectedFile); // attaches the file object

        // ipapasa sa dao
        ComplaintDAO dao = new ComplaintDAO();
        if (dao.insertComplaint(comp)) {
            JOptionPane.showMessageDialog(this, "Complaint Successfully Submitted!");
            new CitizenDashboard(loggedInUser).setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Error submitting complaint to database.");
        }
    }//GEN-LAST:event_submitBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton browseButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JComboBox<String> categoryCmb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel photoLabel;
    private javax.swing.JButton submitBtn;
    private javax.swing.JTextArea txtDesc;
    private javax.swing.JTextField txtLoc;
    // End of variables declaration//GEN-END:variables
}
