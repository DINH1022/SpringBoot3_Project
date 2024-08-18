package com.example.second_project.dto.request;

import com.example.second_project.entity.User;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;
import java.util.List;

public class UserCreationRequest {
    @Size(min = 5 , message = "UserName must be at least 5 characters.")
    private String username;

    @Size(min = 8 , message = "Password must be at least 8 characters.")
    private String password;
    private String firstname;
    private String lastname;
    private LocalDate dob;

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

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }


}
