package com.platform.loginservice.controller;

import com.platform.loginservice.dto.LoginUserDto;
import com.platform.loginservice.dto.UserDto;
import com.platform.loginservice.service.LoginService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
@AllArgsConstructor
public class LoginController {
    private LoginService loginService;
    final static private String CREATE_USER_URI = "createUser";
    final static private String LOGIN_URI = "login";

    @PostMapping
    @RequestMapping(CREATE_USER_URI)
    public ResponseEntity<String> createUser(@RequestBody @Valid final UserDto userDto){
        return ResponseEntity.ok(loginService.createUser(userDto));
    }

    @PostMapping
    @RequestMapping(LOGIN_URI)
    public ResponseEntity<String> handleLoginActivity(@RequestBody @Valid final LoginUserDto loginUserDto){
        return ResponseEntity.ok(loginService.loginUser(loginUserDto));
    }
}
