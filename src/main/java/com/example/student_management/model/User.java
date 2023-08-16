package com.example.student_management.model;

import com.example.student_management.dto.UserDto;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "email", nullable = false, unique = true, length = 20)
    @Email(message = "Email Id is not valid !!!")
    private String email;

    @NotEmpty
//    @Size(min = 6, max = 15, message = "Password must be minimum of 6 characters & maximum 15 characters !!!")
    private String password;

    @NotEmpty
    @Size(min = 4, max = 15, message = "Name must be minimum of 4 characters & maximum 15 characters !!!")
    @Column(name = "name", nullable = false, unique = true)
    private String name;

    public User() {
    }

    public User(String email, String password, String name) {
        this.email = email;
        this.password = password;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public UserDto mapUsertoUserDto() {
        return new UserDto(id, email, name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
