package MethodOverriding;

class Super {
    public void display()
    {
        System.out.println("Super class Display");
    }
}

class Sub extends Super {

    @Override
    public void display()
    {
        System.out.println("Sub class Display");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Super su = new Sub(); //Dynamic Method Dispatch
        su.display();
        Sub sub = new Sub();
        sub.display();
    }
}
