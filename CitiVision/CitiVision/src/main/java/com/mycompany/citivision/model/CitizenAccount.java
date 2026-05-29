package com.mycompany.citivision.model;

import com.mycompany.citivision.ui.CitizenDashboard;
import javax.swing.JFrame;

// inheritance
public class CitizenAccount extends Account {

    public CitizenAccount(String username, String password) {
        super(username, password); 
    }

    @Override
    public String getRole() { 
        return "Citizen"; 
    }

    // poly
    @Override
    public void navigateToDashboard(JFrame currentFrame) {
        CitizenDashboard dashboard = new CitizenDashboard(this.username);
        dashboard.pack();
        dashboard.setLocationRelativeTo(null);
        dashboard.setVisible(true);
        currentFrame.dispose();
    }
}