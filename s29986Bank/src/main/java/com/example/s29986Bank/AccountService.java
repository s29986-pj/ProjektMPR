package com.example.s29986Bank;

import org.springframework.stereotype.Component;

@Component
public class AccountService {
    private AccountStorage accountStorage;

    public AccountService(AccountStorage accountStorage) {
        this.accountStorage = accountStorage;
    }

    public void registerAccount(int id, double balance) {
        if (accountStorage.getAccount(id) != null) {
            System.out.println("Account with id " + id + " already exists.");
        } else {
            Account account = new Account(id, balance);
            accountStorage.addAccount(account);
            System.out.println("Account with id " + id + " successfully added. Balance: " + account.getBalance());
        }
    }

    public Status transfer(int id, double amount) {
        if (accountStorage.getAccount(id) == null) {
            System.out.println("Account in not registered in this bank.");
            return Status.DECLINED;
        }

        double balance = accountStorage.getAccount(id).getBalance();
        if (!Double.isNaN(amount) && balance >= amount) {
            accountStorage.getAccount(id).setBalance(balance - amount);
            System.out.println("Transfer successful, balance: " + balance);
            return Status.ACCEPTED;
        } else {
            System.out.println("Transfer failed, balance: " + balance);
            return Status.DECLINED;
        }
    }

    public Status deposit(int id, double amount) {
        if (accountStorage.getAccount(id) == null) {
            System.out.println("Account is not registered in this bank.");
            return Status.DECLINED;
        }

        double balance = accountStorage.getAccount(id).getBalance();
        if (!Double.isNaN(amount)) {
            accountStorage.getAccount(id).setBalance(balance + amount);
            System.out.println("Deposit successful, balance: " + balance);
            return Status.ACCEPTED;
        } else {
            System.out.println("Deposit failed, balance: " + balance);
            return Status.DECLINED;
        }
    }

    public void listAccountInfo(int id) {
        accountStorage.getAccount(id);
    }
}
