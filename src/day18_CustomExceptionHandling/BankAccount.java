package day18_CustomExceptionHandling;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds. You tried to withdraw: $" + amount);
        }
        balance -= amount;
        System.out.println("Withdrawal successful! New balance: $" + balance);
    }
}