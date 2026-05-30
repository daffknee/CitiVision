package com.mycompany.citivision.dao;

import com.mycompany.citivision.db.DatabaseConnection;
import com.mycompany.citivision.model.CitizenAccount;
import com.mycompany.citivision.model.AdminAccount;
import com.mycompany.citivision.model.Account;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountDAO {

    public boolean registerAccount(Account newAccount) {
        String query = "INSERT INTO accountdetails(accUsername, accPassword, accRole) VALUES (?, ?, ?)";

        try (Connection con = DatabaseConnection.getConnection(); PreparedStatement pst = con.prepareStatement(query)) {

            pst.setString(1, newAccount.getUsername());
            pst.setString(2, newAccount.getPassword());
            pst.setString(3, newAccount.getRole()); // works for both Citizen and Admin!

            pst.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Database error during registration: " + ex.getMessage());
            return false;
        }
    }

    // returns an Account object (poly)
    public Account validateLogin(String username, String password) {
        String query = "SELECT accRole FROM accountdetails WHERE accUsername = ? AND accPassword = ?";

        try (Connection con = DatabaseConnection.getConnection(); PreparedStatement pst = con.prepareStatement(query)) {

            pst.setString(1, username);
            pst.setString(2, password);

            try (ResultSet rs = pst.executeQuery()) {
                if (rs.next()) {
                    String role = rs.getString("accRole");

                    // return the specific subclass based on database role
                    if ("Citizen".equalsIgnoreCase(role)) {
                        return new CitizenAccount(username, password);
                    } else if ("Administrator".equalsIgnoreCase(role)) {
                        return new AdminAccount(username, password);
                    }
                }
            }
        } catch (SQLException ex) {
            System.err.println("Database error during registration: " + ex.getMessage());
        }
        return null; // Login failed
    }
}
