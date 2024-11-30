package com;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author IL-WS35
 */
public abstract class Payment {
    protected String transactionType; // E.g., "SendMoney", "PayBills"
    protected String recipient;
    protected double amount;

    // Constructor
    public Payment(String transactionType, String recipient, double amount) {
        this.transactionType = transactionType;
        this.recipient = recipient;
        this.amount = amount;
    }

    // Abstract method to process the payment
    public abstract void pay(Account account);

    // Getters for transaction details
    public String getTransactionType() {
        return transactionType;
    }

    public String getRecipient() {
        return recipient;
    }

    public double getAmount() {
        return amount;
    }
}