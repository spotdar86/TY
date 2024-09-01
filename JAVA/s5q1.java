import java.util.Scanner;

class NumberIsZeroException extends Exception {
    public NumberIsZeroException(String message) {
        super(message);
    }
}

public class s5q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        try {
            if (number == 0) {
                throw new NumberIsZeroException("Number is zero");
            }

            int factorial = calculateFactorial(number);
            System.out.println("Factorial of " + number + " is: " + factorial);
        } catch (NumberIsZeroException e) {
            System.out.println(e.getMessage());
            scanner.close();
        }
    }

    public static int calculateFactorial(int number) {
        if (number == 0) {
            return 1;
        } else {
            return number * calculateFactorial(number - 1);
        }
    }
}