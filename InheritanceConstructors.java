class Parent {
    public Parent() {
        System.out.println("Parent class constructor");
    }
}

class Child extends Parent {
    public Child(){
        System.out.println("Child class constructor");
    }
}

class GrandChild extends Child {
    public GrandChild(){
        System.out.println("Grand child class constructor");
    }
}

public class InheritanceConstructors {
    public static void main(String[] args) {
        GrandChild gc = new GrandChild();
        System.out.println("");
        Child c = new Child();
        System.out.println("");
        Parent p = new Parent();
    }
}
