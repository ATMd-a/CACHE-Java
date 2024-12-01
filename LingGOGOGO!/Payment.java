/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author althea
 */
public abstract class Payment {
    protected String transactionType;  //Type of transaction for eaxmple "in and out of money"
    protected String method;           //Type of payment ex."SendMoney", "PayBills" and "Deposit"
    protected String recipient;        //Other acount users
    protected double amount;           //Amount of money 

    // Constructor
    public Payment(String transactionType, String method, String recipient, double amount) {
        this.transactionType = transactionType;
        this.method = method;
        this.recipient = recipient;
        this.amount = amount;
    }

    // Abstract method to process the payment
    public abstract void pay(Account account);

    // Getters for transaction details
    public String getTransactionType() {
        return transactionType;
    }
    
    
    public String getMethod() {
        return method;
    }
    

    public String getRecipient() {
        return recipient;
    }

    public double getAmount() {
        return amount;
    }
}