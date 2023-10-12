package com.practice.firstproject.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="people")
public class User {
    @Column
    @GeneratedValue
    @Id
    private int id;
    // @Column(name="Username")
    private String uname;
    private String uemail;
    private String upassword;
    private String ucontact;

    
    public User() {
    }

    public String getUname() {
        return uname;
    }
    public void setUname(String uname) {
        this.uname = uname;
    }
    public String getUemail() {
        return uemail;
    }
    public void setUemail(String uemail) {
        this.uemail = uemail;
    }
    public String getUpassword() {
        return upassword;
    }
    public void setUpassword(String upassword) {
        this.upassword = upassword;
    }
    public String getUcontact() {
        return ucontact;
    }
    public void setUcontact(String ucontact) {
        this.ucontact = ucontact;
    }

    @Override
    public String toString() {
        return "User [uname=" + uname + ", uemail=" + uemail + ", upassword=" + upassword + ", ucontact=" + ucontact
                + "]";
    }
    
    

}
