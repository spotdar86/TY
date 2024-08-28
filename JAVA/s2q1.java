import java.util.ArrayList;
import java.util.Scanner;

public class s2q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of integers: ");
        int n = scanner.nextInt();

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            numbers.add(number);
        }

        System.out.println("Elements of the ArrayList:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        scanner.close();
    }
}