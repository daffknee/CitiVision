package com.mycompany.citivision.dao;

import com.mycompany.citivision.db.DatabaseConnection;
import com.mycompany.citivision.model.Complaint;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

public class ComplaintDAO {

    public boolean insertComplaint(Complaint comp) {
        String query = "INSERT INTO complaints (compUser, compDate, compCategory, compLoc, compDesc, compImage, compStatus) VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement pst = con.prepareStatement(query)) {
            
            pst.setString(1, comp.getCompUser());
            pst.setDate(2, comp.getCompDate());
            pst.setString(3, comp.getCategory());
            pst.setString(4, comp.getLocation());
            pst.setString(5, comp.getDescription());
            
            if (comp.getImageFile() != null) {
                FileInputStream fis = new FileInputStream(comp.getImageFile());
                pst.setBlob(6, fis);
            } else {
                pst.setNull(6, java.sql.Types.BLOB);
            }
            
            pst.setString(7, comp.getStatus());
            pst.executeUpdate();
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

   
    public TableModel getComplaintsByUser(String username) {
        String query = "SELECT compID, compDate, compCategory, compLoc, compDesc, compStatus FROM complaints WHERE compUser = ?";
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement pst = con.prepareStatement(query)) {
            
            pst.setString(1, username);
            try (ResultSet rs = pst.executeQuery()) {
                return DbUtils.resultSetToTableModel(rs);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return new DefaultTableModel(); 
        }
    }

    
    public TableModel getAllComplaints() {
        String query = "SELECT compID, compUser, compDate, compCategory, compLoc, compDesc, compStatus FROM complaints";
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement pst = con.prepareStatement(query);
             ResultSet rs = pst.executeQuery()) {
            
            return DbUtils.resultSetToTableModel(rs);
        } catch (SQLException ex) {
            ex.printStackTrace();
            return new DefaultTableModel();
        }
    }

    
    public Complaint getComplaintDetails(int compID) {
        Complaint comp = new Complaint();
        String query = "SELECT compCategory, compLoc, compDesc, compStatus, compImage FROM complaints WHERE compID = ?";
        
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement pst = con.prepareStatement(query)) {
            
            pst.setInt(1, compID);
            try (ResultSet rs = pst.executeQuery()) {
                if (rs.next()) {
                    comp.setCategory(rs.getString("compCategory"));
                    comp.setLocation(rs.getString("compLoc"));
                    comp.setDescription(rs.getString("compDesc"));
                    comp.setStatus(rs.getString("compStatus"));
                    
                    java.sql.Blob blob = rs.getBlob("compImage");
                    if (blob != null) {
                        comp.setImageBytes(blob.getBytes(1, (int) blob.length()));
                    }
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return comp;
    }

    public boolean updateStatus(int compID, String newStatus) {
        String query = "UPDATE complaints SET compStatus = ? WHERE compID = ?";
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement pst = con.prepareStatement(query)) {
            
            pst.setString(1, newStatus);
            pst.setInt(2, compID);
            pst.executeUpdate();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
}