package ThisAndSuper;

class Rectangle {
    int length;
    int breadth;
    int x=10;

    Rectangle(){
        this.length=1;
        this.breadth=1;
    }
    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
}

class Cuboid extends Rectangle{
    int height;
    int x = 20;

    Cuboid() {
        this.height=1;
    }
    Cuboid(int length, int breadth, int height) {
        super(length, breadth);
        this.height=height;
    }

    void diplay() {
        System.out.println("X from parent class: " + super.x);
        System.out.println("X from child class: " + this.x);   //Can also just write x
    }
}
public class ThisAndSuper {
    public static void main(String[] args) {
        Cuboid c =new Cuboid();
        c.diplay();
    }
}
