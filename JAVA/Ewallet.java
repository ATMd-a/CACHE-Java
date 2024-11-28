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
    
    public Ewallet(String accountNameHolder, Double balance)
    {
        super(accountNameHolder, balance);
    }
    
    public void performTransaction(double amount)
    {
        if(amount > 0 ){
           setBalance(getBalance()+ amount); 
           JOptionPane.showMessageDialog(null, "Deposit successful!", "Transaction", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        } else{
            JOptionPane.showMessageDialog(null, "Insufficient funds!", "ERROR", javax.swing.JOptionPane.WARNING_MESSAGE);
        }
        
    }
}
