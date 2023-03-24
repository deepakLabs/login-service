package com.platform.loginservice.service;

import com.platform.loginservice.dto.UserDto;
import com.platform.loginservice.entity.User;
import com.platform.loginservice.exception.PasswordMismatchException;
import com.platform.loginservice.exception.UserExistsException;
import com.platform.loginservice.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class LoginService {
    private UserRepository userRepository;

    public String createUser(final UserDto userDto) {
        if(!userDto.getRepeatPassword().equals(userDto.getPassword())){
            throw new PasswordMismatchException("Passwords are not equal");
        }
        if(userRepository.findByEmailAddress(userDto.getEmailAddress())!=null){
            throw new UserExistsException("User already exists");
        }
        User user = new User(userDto);
        userRepository.save(user);
        return "User is saved";
    }


}
