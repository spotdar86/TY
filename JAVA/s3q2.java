import java.util.Scanner;

class Account {
    int accno;
    String accname;
    double balance;

    Account(int accno, String accname, double balance) {
        this.accno = accno;
        this.accname = accname;
        this.balance = balance;
    }
}

public class s3q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of accounts: ");
        int n = scanner.nextInt();

        Account[] accounts = new Account[n];

        System.out.println("Enter details for " + n + " accounts:");
        try {
            for (int i = 0; i < n; i++) {
                System.out.print("Account number: ");
                int accno = scanner.nextInt();
                System.out.print("Account name: ");
                String accname = scanner.next();
                System.out.print("Balance: ");
                double balance = scanner.nextDouble();

                accounts[i] = new Account(accno, accname, balance);
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter valid numbers and strings.");
        }

        sortAccounts(accounts);

        System.out.println("\nSorted accounts:");
        for (Account account : accounts) {
            System.out.println("Account number: " + account.accno);
            System.out.println("Account name: " + account.accname);
            System.out.println("Balance: " + account.balance);
            System.out.println();
        }

        scanner.close();
    }

    public static void sortAccounts(Account[] accounts) {
        for (int i = 0; i < accounts.length - 1; i++) {
            for (int j = 0; j < accounts.length - i - 1; j++) {
                if (accounts[j].balance > accounts[j + 1].balance) {
                    Account temp = accounts[j];
                    accounts[j] = accounts[j + 1];
                    accounts[j + 1] = temp;
                }
            }
        }
    }
}