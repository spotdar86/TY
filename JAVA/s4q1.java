import java.util.Scanner;

public class s4q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Convert the name to uppercase
        name = name.toUpperCase();

        // Greet the user
        System.out.println("Hello, " + name + ", nice to meet you!");
        scanner.close();
    }
}