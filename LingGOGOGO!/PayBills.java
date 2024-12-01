/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Main.Account;

/**
 *
 * @author althea
 */
public class PayBills extends Payment {

    public PayBills(String biller, double amount) {
        super("Out", "PayBills", biller, amount);
    }

//Overrides and does the same thing but it deducts the money and handles of paying the bills
    @Override
    public void pay(Account account) {
        if (account.getBalance() >= amount) {
            account.deductBalance(amount);
            System.out.println("Successfully paid biller " + recipient + " an amount of " + amount);
        } else {
            System.out.println("Insufficient balance to pay bills.");
        }
    }
}

