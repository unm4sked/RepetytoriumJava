package com.company.Models;

public class Account {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account(String name, double balance) {
        this.balance= balance;
        this.name = name;
    }

    public void deposit(double balance) {
        if (balance >= 0.0) {
            this.balance = balance;
        }
    }
    public double getBalance() {
        return this.balance;
    }

    private double balance;
    private String name;

}
