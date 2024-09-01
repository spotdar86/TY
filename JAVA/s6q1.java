import java.util.Scanner;
import java.util.TreeSet;

public class s6q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        TreeSet<Integer> numbers = new TreeSet<>();

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }

        System.out.println("Sorted elements:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.print("\nEnter an element to search: ");
        int searchElement = scanner.nextInt();

        if (numbers.contains(searchElement)) {
            System.out.println("Element found.");
        } else {
            System.out.println("Element not found.");
        }
        scanner.close();
    }
}