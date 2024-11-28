/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author IL-WS30
 */
import java.util.HashMap;
public class AccountManager {
    private static HashMap<String, Account> accounts = new HashMap<>();
    
    // Method to add a new account
    public static void addAccount(String username, Account account) {
        accounts.put(username, account);
    }
    
    // Method to get an account by username
    public static Account getAccount(String username) {
        return accounts.get(username);
    }
}
