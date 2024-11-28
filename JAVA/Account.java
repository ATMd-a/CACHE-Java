/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author IL-WS11
 */
import javax.swing.JOptionPane;

public abstract class Account {
    private String accountNameHolder, mobileNo, password;
    private double balance;
    
    
    public Account(String accountNameHolder, String mobileNo,String password, double balance)
    {
        this.accountNameHolder = accountNameHolder;
        this.mobileNo = mobileNo;
        this.password = password;
        this.balance = balance;
    }
    
    //Setters and Getters
    
    public String getAccountNameHolder()
    {
        return accountNameHolder;
    }
    
    public String getmobileNo()
    {
        return mobileNo;
    }
    
    public Double getBalance()
    {
        return balance;
    }
    
    public void setAccountNameHolder(String accountNameHolder)
    {
        this.accountNameHolder = accountNameHolder;
    }
    
    public void setMobileNo(String mobileNo)
    {
        this.mobileNo = mobileNo;
    }
    
    public void setBalance(Double balance)
    {
      this.balance = balance;
    }
    
    public boolean authenticate(String inputpassword)
    {
        return this.password.equals(inputpassword);
    }
}
