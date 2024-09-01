class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

class Developer extends Employee {
    String projectName;

    public Developer(String name, double salary, String projectName) {
        super(name, salary);
        this.projectName = projectName;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Project Name: " + projectName);
    }
}

public class s15q2 {
    public static void main(String[] args) {
        Developer developer = new Developer("John Doe", 50000, "Project A");
        developer.displayDetails();
    }
}