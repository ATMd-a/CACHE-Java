package com;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author IL-WS35
 */
public class PayBills extends Payment {
    public PayBills(String biller, double amount) {
        super("PayBills", biller, amount);
    }

    @Override
    public void pay(Account account) {
        if (account.getBalance() >= amount) {
            account.deductBalance(amount);
            System.out.println("Successfully paid biller " + recipient + " an amount of " + amount);
        } else {
            System.out.println("Insufficient balance to pay bills.");
        }
    }
}