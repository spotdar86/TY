public class s8q1 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java ReverseNumber <number>");
            return;
        }

        int number = Integer.parseInt(args[0]);
        int reversedNumber = reverse(number);
        System.out.println("Reversed number: " + reversedNumber);
    }

    public static int reverse(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }
}