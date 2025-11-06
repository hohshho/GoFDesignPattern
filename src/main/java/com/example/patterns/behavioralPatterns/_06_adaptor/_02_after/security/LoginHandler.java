package com.example.patterns.behavioralPatterns._06_adaptor._02_after.security;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
public class LoginHandler {

    UserDetailService userDetailService;

    public String login(String username, String password) {
        UserDetails userDetails = userDetailService.loadUser(username);

        if (userDetails.getPassword().equals(password)) {
            return userDetails.getUserName();
        }

        throw new IllegalArgumentException();
    }
}
