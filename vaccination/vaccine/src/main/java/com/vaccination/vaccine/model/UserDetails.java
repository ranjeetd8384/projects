package com.vaccination.vaccine.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="vaccinationdetails")
public class UserDetails {
    @Column
    @GeneratedValue
    @Id
 private Long id;

    @NotBlank(message = "ID Details is required")
    private String idDetails;

    @NotBlank(message = "ID Type is required")
    private String idType;

    @NotBlank(message = "Name is required")
    private String name;

    @NotBlank(message = "Contact Number is required")
    @Pattern(regexp = "\\d{10}", message = "Invalid phone number")
    private String contactNumber;

    @NotBlank(message = "Vaccine Name is required")
    private String vaccineName;
    

    public UserDetails() {
    }
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getIdDetails() {
        return idDetails;
    }
    public void setIdDetails(String idDetails) {
        this.idDetails = idDetails;
    }
    public String getIdType() {
        return idType;
    }
    public void setIdType(String idType) {
        this.idType = idType;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getContactNumber() {
        return contactNumber;
    }
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
    public String getVaccineName() {
        return vaccineName;
    }
    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }

    @Override
    public String toString() {
        return "UserDetails [id=" + id + ", idDetails=" + idDetails + ", idType=" + idType + ", name=" + name
                + ", contactNumber=" + contactNumber + ", vaccineName=" + vaccineName + "]";
    }

    
}
