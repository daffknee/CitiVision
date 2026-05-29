package com.mycompany.citivision.model;

import java.io.File;
import java.sql.Date;

public class Complaint {

    private int compID;
    private String compUser;
    private Date compDate;
    private String category;
    private String location;
    private String description;
    private String status;
    private File imageFile; // used when citizen uploads an image
    private byte[] imageBytes; // used when admin fetches image from database

    // Getters
    public int getCompID() {
        return compID;
    }
    public String getCompUser() {
        return compUser;
    }
    public Date getCompDate() {
        return compDate;
    }
    public String getCategory() {
        return category;
    }
    public String getLocation() {
        return location;
    }
    public String getDescription() {
        return description;
    }
    public String getStatus() {
        return status;
    }
    public File getImageFile() {
        return imageFile;
    }
    public byte[] getImageBytes() {
        return imageBytes;
    }
    // Setters
    public void setCompID(int compID) {
        this.compID = compID;
    }
    public void setCompUser(String compUser) {
        this.compUser = compUser;
    }
    public void setCompDate(Date compDate) {
        this.compDate = compDate;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public void setImageFile(File imageFile) {
        this.imageFile = imageFile;
    }
    public void setImageBytes(byte[] imageBytes) {
        this.imageBytes = imageBytes;
    }
}
