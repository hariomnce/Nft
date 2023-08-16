package com.example.student_management.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SignupRequest {

    @NotEmpty
    @Email(message = "Email Id is not valid !!!")
    private String email;

    @NotEmpty
    @Size(min = 6, max = 15, message = "Password must be minimum of 6 characters & maximum 15 characters !!!")
    @Pattern(regexp = "((?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@%#$]).{8,20})", message = "password must be at least 6 characters & maximum 15 characters containing one Uppercase letter, one Lowercase letter, Special character and one Number")
    private String password;

    @Size(min = 4, max = 15, message = "Name must be minimum of 4 characters & maximum 15 characters !!!")
    private String name;

}
