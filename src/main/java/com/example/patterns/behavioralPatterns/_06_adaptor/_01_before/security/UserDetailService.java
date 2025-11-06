package com.example.patterns.behavioralPatterns._06_adaptor._01_before.security;

public interface UserDetailService {
    UserDetails loadUser(String username);
}
