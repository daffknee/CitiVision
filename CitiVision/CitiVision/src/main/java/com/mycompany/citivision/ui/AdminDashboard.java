package com.mycompany.citivision.ui;

import com.mycompany.citivision.dao.ComplaintDAO;
import java.awt.Font;
import java.sql.SQLException;
import javax.swing.table.JTableHeader;
import java.awt.Color;

public class AdminDashboard extends javax.swing.JFrame {
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(AdminDashboard.class.getName());
    public AdminDashboard() {
        initComponents();
        try {
            populateTable();
        } catch (SQLException ex) {
            System.getLogger(AdminDashboard.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }
    
    private void populateTable() throws SQLException {
        ComplaintDAO dao = new ComplaintDAO();
        adminTable.setModel(dao.getAllComplaints());

        JTableHeader header = adminTable.getTableHeader();
        header.setFont(new Font("Segui UI", Font.BOLD, 14));
        header.setOpaque(false);
        header.setBackground(Color.decode("#FFF1AD"));
        adminTable.setFont(new Font("Segui UI", Font.PLAIN, 14));
        adminTable.getColumnModel().getColumn(0).setPreferredWidth(1);
        adminTable.getColumnModel().getColumn(1).setPreferredWidth(1);
        adminTable.setRowHeight(30);
        adminTable.setShowGrid(true);
        adminTable.getColumnModel().getColumn(0).setHeaderValue("ID");
        adminTable.getColumnModel().getColumn(1).setHeaderValue("Username");
        adminTable.getColumnModel().getColumn(2).setHeaderValue("Date");
        adminTable.getColumnModel().getColumn(3).setHeaderValue("Category");
        adminTable.getColumnModel().getColumn(4).setHeaderValue("Location");
        adminTable.getColumnModel().getColumn(5).setHeaderValue("Description");
        adminTable.getColumnModel().getColumn(6).setHeaderValue("Status");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        adminTable = new javax.swing.JTable();
        openDetailsBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(247, 247, 247));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(1180, 620));

        jPanel3.setBackground(new java.awt.Color(0, 29, 61));
        jPanel3.setPreferredSize(new java.awt.Dimension(1180, 100));

        jLabel1.setFont(new java.awt.Font("Poppins Black", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Administrator Dashboard");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(377, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(378, 378, 378))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(30, 30, 30))
        );

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        adminTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "", "", "", "", "", ""
            }
        ));
        adminTable.setGridColor(new java.awt.Color(0, 0, 0));
        adminTable.setSelectionBackground(new java.awt.Color(169, 188, 208));
        jScrollPane1.setViewportView(adminTable);

        openDetailsBtn.setBackground(new java.awt.Color(245, 188, 0));
        openDetailsBtn.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        openDetailsBtn.setText("Open Details");
        openDetailsBtn.addActionListener(this::openDetailsBtnActionPerformed);

        exitBtn.setBackground(new java.awt.Color(245, 188, 0));
        exitBtn.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        exitBtn.setText("Exit");
        exitBtn.addActionListener(this::exitBtnActionPerformed);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1070, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(openDetailsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(377, 377, 377))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(exitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(openDetailsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 21, Short.MAX_VALUE))
        );

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

    private void openDetailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openDetailsBtnActionPerformed
    int selectedRow = adminTable.getSelectedRow(); // gets the selected row index
    if (selectedRow == -1) { // check if a row is actually selected (-1 means walang nakaselect)
        javax.swing.JOptionPane.showMessageDialog(this, "Please select a complaint from the table first.");
        return;
    }
    String compIDStr = adminTable.getValueAt(selectedRow, 0).toString();// get  compID from the first column (index 0) of the selected row
    int compID = Integer.parseInt(compIDStr);
    // i-pass nya yung compID to the AdminViewDetails window
    AdminViewDetails viewDetailFrame = new AdminViewDetails(compID); 
    viewDetailFrame.pack();
    viewDetailFrame.setLocationRelativeTo(null);
    viewDetailFrame.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_openDetailsBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        Login LoginFrame = new Login();
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null); // centers
        LoginFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_exitBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable adminTable;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton openDetailsBtn;
    // End of variables declaration//GEN-END:variables
}
