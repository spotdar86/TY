class Student {
    private int rollno;
    private String name;
    private static int count = 0; // Static variable to keep track of object count

    public Student() {
        this.rollno = 0;
        this.name = "";
        count++;
    }

    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
        count++;
    }

    public void display() {
        System.out.println("Roll No: " + rollno);
        System.out.println("Name: " + name);
    }

    public static int getObjectCount() {
        return count;
    }
}

public class s17q2 {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Alice");
        System.out.println("Object count: " + Student.getObjectCount());

        Student student2 = new Student(2, "Bob");
        System.out.println("Object count: " + Student.getObjectCount());
    }
}