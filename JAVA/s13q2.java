class AgeNotWithinTheRangeException extends Exception {
    public AgeNotWithinTheRangeException(String message) {
        super(message);
    }
}

class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinTheRangeException {
        this.rollNo = rollNo;
        this.name = name;
        if (age < 15 || age > 21) {
            throw new AgeNotWithinTheRangeException("Age must be between 15 and 21");
        }
        this.age = age;
        this.course = course;
    }

    public void displayStudentDetails() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}

public class s13q2 {
    public static void main(String[] args) {
        try {
            Student student1 = new Student(1, "John Doe", 18, "Computer Science");
            student1.displayStudentDetails();

            Student student2 = new Student(2, "Jane Smith", 12, "Arts");
            student2.displayStudentDetails();
        } catch (AgeNotWithinTheRangeException e) {
            System.out.println(e.getMessage());
        }
    }
}