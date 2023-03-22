package com.platform.loginservice.entity;

import com.platform.loginservice.dto.UserDto;
import jakarta.persistence.*;

@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private final String username;
    private final String password;
    private final String emailAddress;

    public User(String username, String password, String repeatPassword, String emailAddress) {
        this.username = username;
        this.password = password;
        this.emailAddress = emailAddress;
    }

    public User(UserDto userDto){
        this.emailAddress = userDto.getEmailAddress();
        this.password = userDto.getPassword();
        this.username = userDto.getUsername();
    }

}
