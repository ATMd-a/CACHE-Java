package com;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author IL-WS35
 */
public class SendMoney extends Payment {
    public SendMoney(String recipient, double amount) {
        super("SendMoney", recipient, amount);
    }

    @Override
    public void pay(Account account) {
        if (account.getBalance() >= amount) {
            account.deductBalance(amount);
            System.out.println("Successfully sent " + amount + " to " + recipient);
        } else {
            System.out.println("Insufficient balance to send money.");
        }
    }
}
