package com.example.demo.api.models;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserModel {

    @Autowired
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String FirstName;
    private String LastName;
    private long AadharCard;
    private String PanCard;
    private long MobileNo;
    private String email;
    private String Password;

    public UserModel() {

    }

    public UserModel(String FirstName, String LastName, long AadharCard, String PanCard, long MobileNo, String email,
            String Password) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.AadharCard = AadharCard;
        this.PanCard = PanCard;
        this.MobileNo = MobileNo;
        this.email = email;
        this.Password = Password;
    }

    // getters and setters

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public long getAadharCard() {
        return AadharCard;
    }

    public void setAadharCard(long AadharCard) {
        this.AadharCard = AadharCard;
    }

    public String getPanCard() {
        return PanCard;
    }

    public void setPanCard(String PanCard) {
        this.PanCard = PanCard;
    }

    public long getMobileNo() {
        return MobileNo;
    }

    public void setMobileNo(long MobileNo) {
        this.MobileNo = MobileNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
}
