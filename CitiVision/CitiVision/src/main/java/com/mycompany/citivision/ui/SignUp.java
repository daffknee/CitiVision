package com.mycompany.citivision.ui;

import com.mycompany.citivision.dao.AccountDAO;
import com.mycompany.citivision.model.CitizenAccount;
import com.mycompany.citivision.model.Account;

public class SignUp extends javax.swing.JFrame {

    public SignUp() {
        initComponents();
        
    }
    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        MiddleBox = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        accSignUsername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        accSignPassword = new javax.swing.JPasswordField();
        createAccount = new javax.swing.JButton();
        loginButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        accSignRole = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel1.setLayout(null);

        MiddleBox.setBackground(new java.awt.Color(0, 29, 61));
        MiddleBox.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        MiddleBox.setPreferredSize(new java.awt.Dimension(640, 720));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\danie\\Documents\\NetBeansProjects\\CitiVision\\src\\icon\\logowhite.png")); // NOI18N

        jLabel5.setFont(new java.awt.Font("Swis721 BT", 2, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Barangay Complaint Management System");

        javax.swing.GroupLayout MiddleBoxLayout = new javax.swing.GroupLayout(MiddleBox);
        MiddleBox.setLayout(MiddleBoxLayout);
        MiddleBoxLayout.setHorizontalGroup(
            MiddleBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MiddleBoxLayout.createSequentialGroup()
                .addGroup(MiddleBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MiddleBoxLayout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel6))
                    .addGroup(MiddleBoxLayout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel5)))
                .addContainerGap(159, Short.MAX_VALUE))
        );
        MiddleBoxLayout.setVerticalGroup(
            MiddleBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MiddleBoxLayout.createSequentialGroup()
                .addGap(275, 275, 275)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(245, Short.MAX_VALUE))
        );

        jPanel1.add(MiddleBox);
        MiddleBox.setBounds(0, 0, 642, 721);

        jLabel1.setFont(new java.awt.Font("Poppins Black", 1, 50)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 29, 61));
        jLabel1.setText("SIGN UP");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(860, 110, 210, 76);

        jPanel2.setPreferredSize(new java.awt.Dimension(480, 480));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Create Username:");

        accSignUsername.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Create Password:");

        accSignPassword.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        createAccount.setBackground(new java.awt.Color(0, 29, 61));
        createAccount.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        createAccount.setForeground(new java.awt.Color(255, 255, 255));
        createAccount.setText("CREATE ACCOUNT");
        createAccount.addActionListener(this::createAccountActionPerformed);

        loginButton.setText("LOG IN");
        loginButton.addActionListener(this::loginButtonActionPerformed);

        jLabel4.setText("Already have an account?");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Select Account Type:");

        accSignRole.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        accSignRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Role", "Citizen", "Administrator" }));
        accSignRole.addActionListener(this::accSignRoleActionPerformed);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(createAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel4)))
                .addContainerGap(160, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(accSignUsername)
                    .addComponent(jLabel3)
                    .addComponent(accSignPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                    .addComponent(jLabel7)
                    .addComponent(accSignRole, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(53, 53, 53))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(accSignUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(accSignPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(accSignRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(createAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        accSignUsername.getAccessibleContext().setAccessibleName("");

        jPanel1.add(jPanel2);
        jPanel2.setBounds(732, 205, 480, 480);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        Login LoginFrame = new Login();
        LoginFrame.setLocationRelativeTo(null);
        LoginFrame.pack();
        LoginFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_loginButtonActionPerformed

    private void createAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAccountActionPerformed
        String usernameInput = accSignUsername.getText().trim();
        String passwordInput = new String(accSignPassword.getPassword());
        String roleInput = (String)accSignRole.getSelectedItem();
        
        if (usernameInput.isEmpty() || passwordInput.isEmpty() || roleInput.equals("Select Role")) {
            javax.swing.JOptionPane.showMessageDialog(this, "Please fill in all fields (Username, Password, and Role).",
                    "Missing Information",
                    javax.swing.JOptionPane.WARNING_MESSAGE);
            return; // makes sure the acc isn't saved
        }

        Account newAccount = new CitizenAccount(usernameInput, passwordInput);

        AccountDAO dao = new AccountDAO();
        if (dao.registerAccount(newAccount)) {
            javax.swing.JOptionPane.showMessageDialog(this, "Registration Successful! \n Please procedd to log in.");

            // balik login
            Login loginFrame = new Login();
            loginFrame.setLocationRelativeTo(null);
            loginFrame.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_createAccountActionPerformed

    private void accSignRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accSignRoleActionPerformed

    }//GEN-LAST:event_accSignRoleActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MiddleBox;
    private javax.swing.JPasswordField accSignPassword;
    private javax.swing.JComboBox<String> accSignRole;
    private javax.swing.JTextField accSignUsername;
    private javax.swing.JButton createAccount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton loginButton;
    // End of variables declaration//GEN-END:variables
}
