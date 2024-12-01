/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author althea
 */
public class Deposit extends Payment {

    public Deposit(double amount) {
        super("In", "Deposit", "My Account", amount); // Recipient is "Self" for deposits
    }

//This add balance to the user's account balance 
    @Override
    public void pay(Account account) {
        account.addBalance(amount);
        System.out.println("Successfully deposited " + amount);
    }
}