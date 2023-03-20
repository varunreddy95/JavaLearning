class Cylinder1 {
    double radius;
    double height;

    public double lidArea() {
        return Math.PI * radius * radius;
    }
    
    public double circumference() {
        return 2 * Math.PI * radius;
    }
    public double totalSurfaceArea() {
        return circumference() * (height + radius);
    }
    public double volume() {
        return Math.PI * radius * radius * height;
    }
}

public class Cylinder {
    public static void main(String[] args) {
        Cylinder1 c1 = new Cylinder1();

        c1.radius = 7;
        c1.height = 5;

        System.out.printf("Total Surface Area: %.2f\n", c1.totalSurfaceArea());
        System.out.printf("Volume: %.2f", c1.volume());
    }
}
