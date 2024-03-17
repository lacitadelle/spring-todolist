package com.jkomala.springboot.todolist.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    public boolean authenticate(String username, String password) {
        boolean isValidUsername = username.equals("james");
        boolean isValidPassword = password.equals("password");

        return isValidPassword && isValidUsername;
    }
}
