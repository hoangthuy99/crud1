package com.ra.model;

public class User {
    private String userName;
    private String email;
    private String password;
    private String confirmPass;
    private String address;

    public User() {
    }

    public User(String userName, String email, String password, String confirmPass, String address) {
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.confirmPass = confirmPass;
        this.address = address;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPass() {
        return confirmPass;
    }

    public void setConfirmPass(String confirmPass) {
        this.confirmPass = confirmPass;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
