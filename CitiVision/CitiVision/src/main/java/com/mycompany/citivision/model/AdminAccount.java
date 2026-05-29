package com.mycompany.citivision.model;

import com.mycompany.citivision.ui.AdminDashboard;
import javax.swing.JFrame;

// inheritance
public class AdminAccount extends Account {

    public AdminAccount(String username, String password) {
        super(username, password);
    }

    @Override
    public String getRole() { 
        return "Administrator"; 
    }

    // poly
    @Override
    public void navigateToDashboard(JFrame currentFrame) {
        AdminDashboard dashboard = new AdminDashboard();
        dashboard.pack();
        dashboard.setLocationRelativeTo(null);
        dashboard.setVisible(true);
        currentFrame.dispose(); // Close the login frame
    }
}
