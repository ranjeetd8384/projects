package com.practice.firstproject.model;

public class UserLogin {
    private String username;
    private String userpassword;

     public UserLogin() {
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getUserpassword() {
        return userpassword;
    }
    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    @Override
    public String toString() {
        return "UserLogin [username=" + username + ", userpassword=" + userpassword + "]";
    }
   
    
    
}
