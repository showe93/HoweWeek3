package comp152;

public class BankAccount {
    private double balance;
    private float interestRate;

    public void deposit(double amount) {
        balance += amount;
    }
    public boolean withdraw(double amount) {

        balance -= amount;
        return false;
    }

}

