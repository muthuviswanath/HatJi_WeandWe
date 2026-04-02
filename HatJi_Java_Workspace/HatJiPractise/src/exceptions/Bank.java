package exceptions;

public class Bank {
    private long accountNumber;
    private String name;
    private double balance;

    public Bank(long accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }
    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException();
        }
        balance += amount;
        System.out.println("Deposit successful!");
    }

    public void withdraw(double amount, int otp) 
            throws InvalidAmountException, InvalidOTPException {

        if (amount <= 0 || amount > balance) {
            throw new InvalidAmountException();
        }

        if (otp != 1234) {
            throw new InvalidOTPException();
        }

        balance -= amount;
        System.out.println("Withdrawal successful!");
    }
}
