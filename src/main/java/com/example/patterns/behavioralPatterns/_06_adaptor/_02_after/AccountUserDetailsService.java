package com.example.patterns.behavioralPatterns._06_adaptor._02_after;

import com.example.patterns.behavioralPatterns._06_adaptor._02_after.security.UserDetailService;
import com.example.patterns.behavioralPatterns._06_adaptor._02_after.security.UserDetails;

public class AccountUserDetailsService implements UserDetailService {
    AccountService accountService;

    AccountUserDetailsService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public UserDetails loadUser(String username) {
        Account account = accountService.findAccountByUsername(username);

        return new AccountUserDetails(account);
    }
}
