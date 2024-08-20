package com.example.demo.api.models;

public class LoginModel {

    private String email;
    private String Password;

    public LoginModel(String email,
            String Password) {
        this.email = email;
        this.Password = Password;
    }

    // getters and setters

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
