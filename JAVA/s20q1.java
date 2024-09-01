public class s20q1 {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Please provide exactly three numbers as arguments.");
            return;
        }

        int[] numbers = new int[3];
        try {
            for (int i = 0; i < 3; i++) {
                numbers[i] = Integer.parseInt(args[i]);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter three integers.");
            return;
        }

        // Sort the numbers using bubble sort
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);

        // Display the sorted numbers
        System.out.println("Sorted numbers:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}