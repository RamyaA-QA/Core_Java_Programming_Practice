package day18_CustomExceptionHandling;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(100.0);

        try {
            account.withdraw(150.0);
        } catch (InsufficientFundsException e) {
            System.err.println("Exception caught: " + e.getMessage());
        }
    }
}

// Output: Exception caught: Insufficient funds. You tried to withdraw: $150.0

/*

Key Points: 

Define a custom exception by extending Exception or RuntimeException.
Throw the custom exception when a specific error condition occurs.
Handle the custom exception using try-catch blocks.
Custom exceptions improve the clarity and specificity of error handling in your code.

*/