package com.mycompany.citivision.ui;

public class CitizenDashboard extends javax.swing.JFrame {
    
    private String loggedInUser; //variable to store yung nakalogin na user
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(CitizenDashboard.class.getName());

    public CitizenDashboard(String username) { //modified para maaccept username 
        this.loggedInUser = username; // stores the username ayye
        initComponents();
    }

    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        submitComplaintBtn = new javax.swing.JButton();
        toComplaints = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1280, 720));

        jPanel1.setBackground(new java.awt.Color(0, 29, 61));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel1.setLayout(null);

        jPanel2.setPreferredSize(new java.awt.Dimension(600, 600));

        jLabel2.setFont(new java.awt.Font("Poppins Black", 0, 48)); // NOI18N
        jLabel2.setText("Citizen Dashboard");

        submitComplaintBtn.setBackground(new java.awt.Color(255, 203, 31));
        submitComplaintBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        submitComplaintBtn.setText("Submit a New Complaint");
        submitComplaintBtn.setBorder(null);
        submitComplaintBtn.addActionListener(this::submitComplaintBtnActionPerformed);

        toComplaints.setBackground(new java.awt.Color(255, 203, 31));
        toComplaints.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        toComplaints.setForeground(new java.awt.Color(255, 255, 255));
        toComplaints.setText("View My Submitted Complaints");
        toComplaints.setBorder(null);
        toComplaints.addActionListener(this::toComplaintsActionPerformed);

        logoutButton.setBackground(new java.awt.Color(239, 117, 108));
        logoutButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        logoutButton.setText("Log Out");
        logoutButton.addActionListener(this::logoutButtonActionPerformed);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(toComplaints, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submitComplaintBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(130, 130, 130))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel2)
                .addGap(64, 64, 64)
                .addComponent(submitComplaintBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(toComplaints, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(320, 60, 600, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitComplaintBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitComplaintBtnActionPerformed
        NewComplaint newcomplaintFrame = new NewComplaint(loggedInUser); // papasa yung username don sa new complaint
        newcomplaintFrame.pack();
        newcomplaintFrame.setLocationRelativeTo(null);
        newcomplaintFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_submitComplaintBtnActionPerformed

    private void toComplaintsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toComplaintsActionPerformed
        CitizenComplaints complaintFrame = new CitizenComplaints(loggedInUser); //papasa din yugn username don sa complaints na ginawa niya
        complaintFrame.pack();
        complaintFrame.setLocationRelativeTo(null);
        complaintFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_toComplaintsActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        Login LoginFrame = new Login();
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null); // centers
        LoginFrame.setVisible(true);
        this.dispose();        
    }//GEN-LAST:event_logoutButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton submitComplaintBtn;
    private javax.swing.JButton toComplaints;
    // End of variables declaration//GEN-END:variables
}
