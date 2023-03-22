class Rectangle {
    private double lenght;
    private double breadth;

    //Non parameterized constructor
    public Rectangle() {
        lenght = 1;
        breadth = 1;
    }
    //Parameterized constructor
    public Rectangle(double l, double b) {
        lenght = setLenght(l);
        breadth = setBreadth(b);
    }

    //Property Methods
    public double getLenght() {
        return lenght;
    }
    public double getBreadth() {
        return breadth;
    }
    public double setLenght(double l) {
        if(l>=0) {
            return lenght=l;
        }
        else {
            return lenght=0;
        }
    }
    public double setBreadth(double b) {
        if(b>=0) {
            return breadth = b;
        }
        else {
            return breadth = 0;
        }
    }

    //Instance methods
    public double area() {
        return lenght * breadth;
    }
    public double perimeter() {
        return 2 * (lenght + breadth);
    }
}


public class Constructors {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 20);
        Rectangle r2 = new Rectangle(5, 10);

        System.out.println("Area of rectangle 1: " + r.area());
        System.out.println("Area of rectangle 2: " + r2.area());

    }
}
