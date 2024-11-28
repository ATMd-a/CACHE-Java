/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author IL-WS11
 */
import javax.swing.JOptionPane;
public class TransferMoney extends Transaction{
    
    private String receiver;
    
    public TransferMoney(String receiver, double amount) {
       super(amount);
       this.receiver = receiver;
    }
    
    @Override
    
    public void performTransaction(Account account) {
        if (account.getBalance() >= amount) {
            account.setBalance(account.getBalance() - amount);
            JOptionPane.showMessageDialog(null,
                    "Receiver: " + receiver + "\n" +
                    "Balance Before: " + account.getBalance() + "\n" +
                    "You are about to send: " + amount + "\n" +
                    "Total Balance After: " + (account.getBalance()) + "\n",
                    "Transaction Successful",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,
                    "Insufficient funds!",
                    "Transaction Failed",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
     
}
