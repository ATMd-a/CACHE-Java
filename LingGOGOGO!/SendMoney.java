/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author althea
 */
public class SendMoney extends Payment {

    public SendMoney(String recipient, double amount) {
        super("Out", "SendMoney", recipient, amount);
    }
//this part overrides the pay method in the Payment class and handles the sending money to the recipient

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