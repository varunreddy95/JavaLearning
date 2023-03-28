package SuperContructor;


class Rectangle{

    int length;
    int breadth;

    public Rectangle(){
        this.length = 1;
        this.breadth = 1;
    }

    public Rectangle(int l, int b) {
        this.length = l;
        this.breadth = b; 
    }
}

class Cuboid extends Rectangle{
    
    int height;
    
    public Cuboid(){
        this.height=1;
    }

    public Cuboid(int height) {
        this.height = height;
    }

    public Cuboid(int l, int b, int height) {
        super(l, b);
        this.height = height;
    }

    public int Volumne(){
        return length * breadth * this.height;
    }
}



public class SuperConstructor {
    public static void main(String[] args) {
        Cuboid c =new Cuboid();
        System.out.println("With values 1: " + c.Volumne());
        Cuboid c1 = new Cuboid(10);
        System.out.println("Intitalizing only child constructor: " + c1.Volumne());
        Cuboid c2 = new Cuboid(10,20,30);
        System.out.println("Initialzing all the values of parent and child: " + c2.Volumne());
    }
}
