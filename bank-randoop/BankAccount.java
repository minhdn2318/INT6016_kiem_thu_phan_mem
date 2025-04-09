public class BankAccount {
    private int balance;

    public BankAccount() {
        this.balance = 0;
    }

    public void deposit(int amount) {
        if (amount < 0) throw new IllegalArgumentException("Amount must be positive");
        balance += amount;
    }

    public void withdraw(int amount) {
        if (amount < 0) throw new IllegalArgumentException("Amount must be positive");
        if (amount > balance) throw new IllegalArgumentException("Insufficient funds");
        balance -= amount;
    }

    public int getBalance() {
        return balance;
    }
}
