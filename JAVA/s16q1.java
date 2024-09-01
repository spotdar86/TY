class MyNumber {
    private int number;

    public MyNumber(int number) {
        this.number = number;
    }

    public boolean isEven() {
        return number % 2 == 0;
    }
}

public class s16q1 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide exactly one integer argument.");
            return;
        }

        try {
            int number = Integer.parseInt(args[0]);
            MyNumber myNumber = new MyNumber(number);

            if (myNumber.isEven()) {
                System.out.println(number + " is even.");
            } else {
                System.out.println(number + " is odd.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
    }
}