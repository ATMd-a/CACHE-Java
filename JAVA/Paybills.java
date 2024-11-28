/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author IL-WS11
 */
import javax.swing.JOptionPane;
public class Paybills extends Transaction{
    private  String billName;
    private String billerName;
    private String accountNumber;
    private boolean protectFee;
    
    
    public Paybills(double amount, String billName, String billerName, String accountNumber, boolean protectFee)
    {
       super(amount);
        this.billName = billName;
        this.billerName = billerName;
        this.accountNumber = accountNumber;
        this.protectFee = protectFee;  
    }
    @Override
    public void performTransaction(Account account) {
        double totalAmount = getAmount();

        
        if (protectFee) {
            totalAmount += totalAmount * 0.02; 
        }
        if (account.getBalance() >= totalAmount) {
            account.setBalance(account.getBalance() - totalAmount);
            JOptionPane.showMessageDialog(null, "Payment Successful!\n" + 
                                                "Bill: " + billName + "\n" +
                                                "Biller: " + billerName + "\n" +
                                                "Amount: " + totalAmount + "\n" +
                                                "Account Number: " + accountNumber, 
                                                "Transaction Successful", 
                                                JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Insufficient funds!", "ERROR", JOptionPane.WARNING_MESSAGE);
        }
    }
    
}