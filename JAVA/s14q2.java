class RollNoNotInRangeException extends Exception {
    public RollNoNotInRangeException(String message) {
        super(message);
    }
}

class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public Student(int rollNo, String name, int age, String course) throws RollNoNotInRangeException {
        if (rollNo < 13001 || rollNo > 13080) {
            throw new RollNoNotInRangeException("Roll number must be between 13001 and 13080");
        }
        this.rollNo = rollNo;
        this.name = name;
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

public class s14q2 {
    public static void main(String[] args) {
        try {
            Student student1 = new Student(13005, "John Doe", 18, "Computer Science");
            student1.displayStudentDetails();

            Student student2 = new Student(13085, "Jane Smith", 20, "Arts");
        } catch (RollNoNotInRangeException e) {
            System.out.println(e.getMessage());
        }
    }
}