import java.util.Scanner;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}

public class s6q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        Employee[] employees = new Employee[n];

        System.out.println("Enter details for " + n + " employees:");
        for (int i = 0; i < n; i++) {
            System.out.print("Employee ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            System.out.print("Employee name: ");
            String name = scanner.nextLine();

            System.out.print("Employee salary: ");
            double salary = scanner.nextDouble();

            employees[i] = new Employee(id, name, salary);
        }

        Employee employeeWithMaxSalary = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].salary > employeeWithMaxSalary.salary) {
                employeeWithMaxSalary = employees[i];
            }
        }

        System.out.println("\nEmployee with maximum salary:");
        System.out.println("Employee ID: " + employeeWithMaxSalary.id);
        System.out.println("Employee name: " + employeeWithMaxSalary.name);
        System.out.println("Employee salary: " + employeeWithMaxSalary.salary);
        scanner.close();
    }
}