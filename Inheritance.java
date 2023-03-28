class Circle {
    public double radius;

    public double area(){
        return Math.PI * radius * radius;
    }
    public double circumference(){
        return 2 * Math.PI * radius;
    }
}

class Cylinder extends Circle {
    public double height;

    public double volumne(){
        return circumference() * height;
    }
}


public class Inheritance {
    public static void main(String[] args) {
        Cylinder c = new Cylinder();
        c.radius = 5;
        c.height = 10;
        
        System.out.printf("Area: %.2f", c.area());
        System.out.printf("Volume: %.2f", c.volumne());
    }
}
