package Main;

public class Account {
    private double balance;
    
    
    // Getter and Setter
    public double getBalance() {
        return balance; 
    }
    public void setBalance(double balance) {
        this.balance = balance; 
    }
    
    //Method to add balance
    public void addBalance(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Amount to add must be positive.");
        }
    }

    // Method to deduct balance
    public void deductBalance(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
}
