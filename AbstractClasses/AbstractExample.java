package AbstractClasses;

abstract class Super {
    public Super() {
        System.out.println("Super class constructor");
    }
    abstract public void meth1();
}

class Sub extends Super {
    public void meth1()
    {
        System.out.println("Sub class meth1");
    }
}



public class AbstractExample {
    public static void main(String[] args) {

        Super s1; //Abstract classes can have references but not objects

        Super s = new Sub();
        s.meth1();
    }
}
