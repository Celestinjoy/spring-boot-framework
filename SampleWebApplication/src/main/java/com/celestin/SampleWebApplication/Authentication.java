package com.celestin.SampleWebApplication;

import org.springframework.stereotype.Service;

@Service
public class Authentication {

    public boolean authenticate(String username,String password) {
        boolean isValidUserName = username.equalsIgnoreCase("mark");
        boolean isValidPassword = password.equalsIgnoreCase("password");

        return isValidUserName && isValidPassword;
    }
}
