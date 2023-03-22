package com.platform.loginservice.controller;

import com.platform.loginservice.exception.PasswordMismatchException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice(assignableTypes = {LoginController.class})
public class ExceptionHandlerAdvice {
    @ExceptionHandler(PasswordMismatchException.class)
    public ResponseEntity<String> handlePasswordMismatchException(final PasswordMismatchException exception){
        return ResponseEntity.badRequest().body(exception.getMessage());
    }
}
