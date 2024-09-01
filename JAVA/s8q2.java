import java.util.Scanner;

class InvalidDateException extends Exception {
    public InvalidDateException(String message) {
        super(message);
    }
}

class MyDate {
    private int day, month, year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
        validateDate();
        
    }

    public void acceptDate() throws InvalidDateException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the date in dd mm yyyy format: ");
        this.day = scanner.nextInt();
        this.month = scanner.nextInt();
        this.year = scanner.nextInt();

        validateDate();
        scanner.close(); 
    }

    public void displayDate() {
        System.out.printf("%d/%d/%d", day, month, year);
    }

    private void validateDate() throws InvalidDateException {
        if (month < 1 || month > 12) {
            throw new InvalidDateException("Invalid month");
        }

        if (day < 1 || day > 31) {
            throw new InvalidDateException("Invalid day");
        }

        if (month == 2) {
            if (day > 29 || (day == 29 && !isLeapYear())) {
                throw new InvalidDateException("Invalid day for February");
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (day > 30) {
                throw new InvalidDateException("Invalid day for this month");
            }
        }
    }

    private boolean isLeapYear() {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}

public class s8q2 {
    public static void main(String[] args) {
        try {
            MyDate myDate = new MyDate(31, 2, 2024); // Replace with your desired date
            myDate.acceptDate(); // Call acceptDate with a try-catch block
            myDate.displayDate();
        } catch (InvalidDateException e) {
            System.out.println(e.getMessage());
        }
    }
}