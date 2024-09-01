class InsufficientFundException extends Exception {
    public InsufficientFundException(String message) {
        super(message);
    }
}

class SavingAccount {
    int accno;
    String name;
    double balance;
    final int MIN_BALANCE = 500;

    SavingAccount(int accno, String name, double balance) {
        this.accno = accno;
        this.name = name;
        this.balance = balance;
    }

    void withdraw(double amount) throws InsufficientFundException {
        if (balance - amount < MIN_BALANCE) {
            throw new InsufficientFundException("Insufficient funds!");
        }
        balance -= amount;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void viewBalance() {
        System.out.println("Account Balance: " + balance);
    }
}

public class s10q2 {
    public static void main(String[] args) {
        SavingAccount account = new SavingAccount(12345, "John Doe", 1000);

        try {
            account.withdraw(200);
            account.viewBalance();

            account.withdraw(800);
            account.viewBalance();
        } catch (InsufficientFundException e) {
            System.out.println(e.getMessage());
        }
    }
}
