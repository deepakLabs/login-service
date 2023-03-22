package com.platform.loginservice.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class User {

    @Size(min = 4 , max = 10 , message = "Username is of invalid size")
    private String username;
    @Size(min = 6, max = 10 , message = "Password is invalid")
    private String password;
    @Size(min = 6, max = 10 , message = "Repeat password is invalid")
    private String repeatPassword;
    @Email
    private String emailAddress;
}
