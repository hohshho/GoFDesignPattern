package com.example.patterns.behavioralPatterns._06_adaptor._02_after.security;

public interface UserDetailService {
    UserDetails loadUser(String username);
}
