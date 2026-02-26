package Exception_Handling;

// Custom Exception class
class InsufficientException extends Exception {

    // Constructor to pass custom message
    InsufficientException(String message) {
        super(message);   // calling parent Exception constructor
    }
}
// Withdraw class
class Withdraw {
    static int balance = 1000;  // Initial account balance
    // Method to check withdrawal amount
    static void checkbalance(int amount) throws InsufficientException {
        // If withdrawal amount is greater than balance
        if (amount > balance) {
            // Throw custom exception for insufficient balance
            throw new InsufficientException("Not enough balance!....");
        }
        // If amount is valid
        balance = balance - amount;  // Deduct amount
        System.out.println("Withdrawal Successful");
    }
}

// Main class
public class Custom_Bank {
  public static void main(String[] args) {
       try {
            Withdraw.checkbalance(500);  // Try to withdraw 500
        } 
        catch (InsufficientException e) {
            System.out.println(e.getMessage());  // Print exception message
        }
    }
}