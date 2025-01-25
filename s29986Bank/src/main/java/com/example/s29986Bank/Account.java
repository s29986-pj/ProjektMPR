package com.example.s29986Bank;

public class Account {
    private int userID;
    private double balance;

    public Account(int userID, double balance) {
        this.userID = userID;
        this.balance = balance;
    }

    public int getUserID() {
        return userID;
    }
    public void setUserID(int userID) {
        this.userID = userID;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account id: " + userID + " Balance: " + balance;
    }
}
