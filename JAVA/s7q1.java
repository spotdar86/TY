import java.util.HashMap;
import java.util.Scanner;

public class s7q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, Double> employeeDetails = new HashMap<>();

        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();

        System.out.println("Enter details for " + n + " employees:");
        for (int i = 0; i < n; i++) {
            System.out.print("Employee name: ");
            String name = scanner.next();
            System.out.print("Employee salary: ");
            double salary = scanner.nextDouble();

            employeeDetails.put(name, salary);
        }

        System.out.println("\nEmployee Details:");
        for (String name : employeeDetails.keySet()) {
            double salary = employeeDetails.get(name);
            System.out.println(name + ": " + salary);
        }
        scanner.close();
    }
}