package com.example.s29986Bank;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AccountStorage {
    private List<Account> accounts;

    public AccountStorage() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public Account getAccount(int id) {
        for (Account account : accounts) {
            return account;
        }
        return null;
    }
}
