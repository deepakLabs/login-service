package com.platform.loginservice.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class LoginUserDto {
    @Email
    private String emailAddress;

    @Size(min = 6, max = 10 , message = "Password is invalid")
    private String password;
}
