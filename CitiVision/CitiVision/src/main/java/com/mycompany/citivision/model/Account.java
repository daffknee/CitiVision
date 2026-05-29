package com.mycompany.citivision.model;

import javax.swing.JFrame;

//abstraction
public abstract class Account {

    protected String username;
    protected String password;
    //constructor
    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }

    //getter
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    
    public abstract String getRole();

    public abstract void navigateToDashboard(JFrame currentFrame);
}
