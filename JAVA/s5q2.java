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

class ColorPoint extends Point {
    String color;

    ColorPoint(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Color: " + color);
    }
}

public class s5q2 {
    public static void main(String[] args) {
        Point p1 = new Point(2, 3);
        p1.display();

        ColorPoint cp1 = new ColorPoint(5, 7, "Red");
        cp1.display();
    }
}