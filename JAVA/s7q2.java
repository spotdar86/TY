import java.util.Scanner;

class Student {
    int rollno;
    String name;
    double percentage;

    Student() {
        this(0, "", 0.0); // Call the parameterized constructor
    }

    Student(int rollno, String name, double percentage) {
        this.rollno = rollno;
        this.name = name;
        this.percentage = percentage;
    }

    void display() {
        System.out.println("Roll No: " + rollno);
        System.out.println("Name: " + name);
        System.out.println("Percentage: " + percentage);
    }
}

public class s7q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        Student[] students = new Student[n];

        System.out.println("Enter details for " + n + " students:");
        for (int i = 0; i < n; i++) {
            System.out.print("Roll No: ");
            int rollno = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Percentage: ");
            double percentage = scanner.nextDouble();

            students[i] = new Student(rollno, name, percentage);
        }

        System.out.println("\nStudent Details:");
        for (Student student : students) {
            student.display();
            System.out.println();
        }
        scanner.close();
    }
}