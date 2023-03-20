class Rectangle1 {
    public double length;
    public double breadth;

    public double area() {
        return length * breadth;
    }

    public double perimeter() {
        return 2 * (length + breadth);
    }

    public boolean isSquare() {
        if(length == breadth) {
            return true;
        }
        else {
            return false;
        }
    }
}


public class Rectangle {
    public static void main(String[] args) {
        Rectangle1 r1 = new Rectangle1();
        Rectangle1 r2 = new Rectangle1();

        r1.length = 10;
        r1.breadth = 20;

        r2.length = 5;
        r2.breadth = 5;

        System.out.println("Area: " + r1.area());
        System.out.println("Perimeter: " + r1.perimeter());
        System.out.println("Is it a Sqaure? " + r1.isSquare());

        System.out.println("");
        
        System.out.println("Area: " + r2.area());
        System.out.println("Perimeter: " + r2.perimeter());
        System.out.println("Is it a Sqaure? " + r2.isSquare());

    }
}
