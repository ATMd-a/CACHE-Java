package com;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author IL-WS35
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TransactionService {

    public void saveTransaction(int walletId, Payment payment) {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ewallet", "root", "admin")) {
            String query = "INSERT INTO tblTransaction (W_ID, T_Balance, T_Type, T_Recipient) VALUES (?, ?, ?, ?)";
            
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setInt(1, walletId);
            stmt.setDouble(2, payment.getAmount());
            stmt.setString(3, payment.getTransactionType());
            stmt.setString(4, payment.getRecipient());
            
            int rowsInserted = stmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Transaction saved successfully!");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to save the transaction.");
        }
    }
}