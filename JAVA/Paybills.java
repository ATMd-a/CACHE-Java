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
    
    public Paybills(double amount)
    {
        super(amount);
    }
    
    public void processTransaction(Account account)
    {
         if (account.getBalance() >= getAmount()) {
            account.setBalance(account.getBalance() - getAmount());
            JOptionPane.showMessageDialog(null, "Bill payment successful!", "Transaction", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Insufficient balance to pay the bill!", "Error", javax.swing.JOptionPane.WARNING_MESSAGE);
        }
    }
}
