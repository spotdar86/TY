abstract class Shape {
    abstract double area();
    abstract double volume();
}

class Sphere extends Shape {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    double volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}

public class s11q2 {
    public static void main(String[] args) {
        Sphere sphere = new Sphere(5.0);
        System.out.println("Sphere's area: " + sphere.area());
        System.out.println("Sphere's volume: " + sphere.volume());
    }
}