/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author IL-WS11
 */
import javax.swing.JOptionPane;
public class Ewallet extends Account {
    
    public Ewallet(String accountNameHolder, String mobileNo, String password, double balance) {
        super(accountNameHolder, mobileNo, password, balance);
    }
    
    public Ewallet() {
        super("Default Account", "0000000000", "defaultPassword", 0.0);
    }

    public void performTransaction(double amount) {
        if (amount > 0) {
            setBalance(getBalance() + amount); 
            JOptionPane.showMessageDialog(null, "Deposit successful!", "Transaction", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Insufficient funds!", "ERROR", JOptionPane.WARNING_MESSAGE);
        }
    }
}

