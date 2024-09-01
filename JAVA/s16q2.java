class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

class Programmer extends Employee {
    String programmingLanguage;

    public Programmer(String name, double salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

public class s16q2 {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("John Doe", 60000, "Java");
        programmer.displayDetails();
    }
}
