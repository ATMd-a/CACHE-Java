package com;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author IL-WS35
 */
public class Deposit extends Payment{
    public Deposit(double amount) {
        super("Deposit", "Self", amount); // Recipient is "Self" for deposits
    }

    @Override
    public void pay(Account account) {
        account.addBalance(amount);
        System.out.println("Successfully deposited " + amount);
    }
}


