class Employee {
    private int id;
    private String name;
    private String deptName;
    private double salary;
    private static int count = 0;

    public Employee() {
        this(0, "", "", 0.0);
    }

    public Employee(int id, String name, String deptName, double salary) {
        this.id = id;
        this.name = name;
        this.deptName = deptName;
        this.salary = salary;
        count++;
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department Name: " + deptName);
        System.out.println("Salary: " + salary);
    }

    public static int getObjectCount() {
        return count;
    }
}

public class s20q2 {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Alice", "HR", 50000.0);
        System.out.println("Object count: " + Employee.getObjectCount());
        employee1.display();

        Employee employee2 = new Employee(2, "Bob", "IT", 60000.0);
        System.out.println("Object count: " + Employee.getObjectCount());
        employee2.display();
    }
}