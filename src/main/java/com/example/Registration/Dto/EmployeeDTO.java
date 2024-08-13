package com.example.Registration.Dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class EmployeeDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; // Use 'long' here

    private String fullName;
    private String email;
    private String password;
    private String phone;

    // Default constructor
    public EmployeeDTO() {}

    // Getter and Setter for 'id'
    public long getId() { // Use 'long' here
        return id;
    }

    public void setId(long id) { // Use 'long' here
        this.id = id;
    }

    // Getter and Setter for 'fullName'
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    // Getter and Setter for 'email'
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Getter and Setter for 'password'
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Getter and Setter for 'phone'
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
