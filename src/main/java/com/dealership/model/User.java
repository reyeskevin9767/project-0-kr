package com.dealership.model;

public class User {

<<<<<<< HEAD
    // Instance Variables
=======
>>>>>>> b0375adfa9b976815d4b636cc14d401b0f332807
    private String username;
    private String password;
    private String phoneNumber;
    private String email;

<<<<<<< HEAD
    // TODO : Could change this to using an enum
    private boolean customerAccount;


    // Getter And Setters
=======
    // TODO: Should change this to using enum
    private boolean customerAccount;

    //Getter and Setters


>>>>>>> b0375adfa9b976815d4b636cc14d401b0f332807
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isCustomerAccount() {
        return customerAccount;
    }

    public void setCustomerAccount(boolean customerAccount) {
        this.customerAccount = customerAccount;
    }

    // Constructors
    public User(String username, String password, String phoneNumber, String email, boolean customerAccount) {
        this.username = username;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.customerAccount = customerAccount;
    }

    public User(String username, String password, String phoneNumber, String email) {
        this.username = username;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.email = email;
<<<<<<< HEAD
=======
        System.out.println("User was created");
>>>>>>> b0375adfa9b976815d4b636cc14d401b0f332807
    }


}
