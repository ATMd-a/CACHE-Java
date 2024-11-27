/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author IL-WS11
 */
import javax.swing.JOptionPane;
public abstract class Transaction {
    protected double amount;
    
    public Transaction(double amount)
    {
        if (amount > 0) {
            this.amount = amount;
        } else {
            this.amount = 0;
        }
    }
    public abstract void performTransaction(Account account);
    
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        if (amount > 0) {
            this.amount = amount;
        } 
    }  
}
