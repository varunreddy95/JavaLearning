package AbstractClasses;

abstract class Shape {
    abstract public double area();
    abstract public double perimeter();
}

class Circle extends Shape {
    double radius;
    
    public Circle(double radius){
        this.radius = radius;
    }

    public double area(){
        return Math.PI * radius * radius;
    }

    public double perimeter(){
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {
    double length;
    double breadth;

    public Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public double area() {
        return length * breadth;
    }

    public double perimeter() {
        return 2 * (length + breadth);
    }
}




public class StudentChallenge {
    public static void main(String[] args) {
        
        Shape c = new Circle(10);
        Shape r = new Rectangle(10, 20);
        
        System.out.printf("Area of circle: %.2f\n", c.area());
        System.out.printf("Perimeter of circle: %.2f", c.perimeter());

        System.out.println("");

        System.out.println("Area of Rectangle: " + r.area());
        System.out.println("Perimeter of Rectangle: " + r.perimeter());
    }
}
