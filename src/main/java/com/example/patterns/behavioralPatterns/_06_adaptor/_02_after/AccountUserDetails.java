package com.example.patterns.behavioralPatterns._06_adaptor._02_after;

import com.example.patterns.behavioralPatterns._06_adaptor._02_after.security.UserDetails;

public class AccountUserDetails implements UserDetails {

    private Account account;

    public AccountUserDetails(Account account) {
        this.account = account;
    }

    @Override
    public String getUserName() {
        return this.account.getName();
    }

    @Override
    public String getPassword() {
        return this.account.getPassword();
    }
}
