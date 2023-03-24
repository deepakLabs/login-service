package com.platform.loginservice.util;

import org.springframework.security.crypto.bcrypt.BCrypt;

public class PasswordEncyrption {
    public static String hashPassword(String plaintextPassword){
        return BCrypt.hashpw(plaintextPassword,BCrypt.gensalt());
    }

    public static boolean checkPass(String plaintextPassword,String hashedPassword){
        if(BCrypt.checkpw(plaintextPassword,hashedPassword)){
            return true;
        }
        return false;
    }
}
