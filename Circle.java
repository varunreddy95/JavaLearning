class Circle1 {
    public double radius;

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public double circumference() {
        return perimeter();
    }
}


public class Circle {
    public static void main(String[] args) {
        Circle1 c1 = new Circle1();
        Circle1 c2 = new Circle1();

        c1.radius = 10;
        c2.radius = 7;

        System.out.printf("Area: %.2f\n", c1.area());
        System.out.printf("Perimeter: %.2f\n", c1.perimeter());
        System.out.printf("Circumference: %.2f\n", c1.circumference());

        System.out.println("");

        System.out.printf("Area: %.2f\n", c2.area());
        System.out.printf("Perimeter: %.2f\n", c2.perimeter());
        System.out.printf("Circumference: %.2f\n", c2.circumference());
    }
}
