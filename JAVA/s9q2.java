class Point {
    int x, y;

    Point() {
        x = 0;
        y = 0;
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void display() {
        System.out.println("Point: (" + x + ", " + y + ")");
    }
}

class Point3D extends Point {
    int z;

    Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    @Override
    void display() {
        System.out.println("Point3D: (" + x + ", " + y + ", " + z + ")");
    }
}

public class s9q2 {
    public static void main(String[] args) {
        Point p1 = new Point(2, 3);
        p1.display();

        Point3D p2 = new Point3D(5, 7, 10);
        p2.display();
    }
}