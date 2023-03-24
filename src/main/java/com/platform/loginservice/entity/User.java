package com.platform.loginservice.entity;

import com.platform.loginservice.dto.UserDto;
import com.platform.loginservice.util.PasswordEncyrption;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="users")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String username;
    private String password;
    private String emailAddress;

    public User() {
    }

    public User(String username, String password, String emailAddress) {
        this.username = username;
        this.password = password;
        this.emailAddress = emailAddress;
    }

    public User(UserDto userDto){
        this.emailAddress = userDto.getEmailAddress();
        this.password = PasswordEncyrption.hashPassword(userDto.getPassword());
        this.username = userDto.getUsername();
    }

}
