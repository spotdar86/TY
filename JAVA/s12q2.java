abstract class Shape {
    abstract double area();
    abstract double volume();
}

class Cylinder extends Shape {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    double area() {
        double baseArea = Math.PI * radius * radius;
        double lateralArea = 2 * Math.PI * radius * height;
        return 2 * baseArea + lateralArea;
    }

    @Override
    double volume() {
        return Math.PI * radius * radius * height;
    }
}

public class s12q2 {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(5.0, 10.0);
        System.out.println("Cylinder's area: " + cylinder.area());
        System.out.println("Cylinder's volume: " + cylinder.volume());
    }
}