package com.example.demo.Models;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Set;

public class SignUpForm {
    @NotBlank
    @Size(min=3, max=50)
    private String name;
    @NotBlank
    @Size(min=3, max=50)
    private String username;
    @NotBlank
    @Size(min=3, max=50)
    private String email;
    private Set Role;
    @NotBlank
    @Size(min=6, max=40)
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set getRole() {
        return Role;
    }

    public void setRole(Set role) {
        Role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
