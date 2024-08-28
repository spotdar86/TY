public class s2q2 {
    private int number;

    // Default constructor
    public s2q2() {
        number = 0;
    }

    // Constructor with a value
    public s2q2(int number) {
        this.number = number;
    }

    // Check if the number is negative
    public boolean isNegative() {
        return number < 0;
    }

    // Check if the number is positive
    public boolean isPositive() {
        return number > 0;
    }

    // Check if the number is odd
    public boolean isOdd() {
        return number % 2 != 0;
    }

    // Check if the number is even
    public boolean isEven() {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java s2q2 <number>");
            return;
        }

        int value = Integer.parseInt(args[0]);
        s2q2 myNumber = new s2q2(value);

        System.out.println("Number: " + value);
        System.out.println("Is negative: " + myNumber.isNegative());
        System.out.println("Is positive: " + myNumber.isPositive());
        System.out.println("Is odd: " + myNumber.isOdd());
        System.out.println("Is even: " + myNumber.isEven());
    }
}