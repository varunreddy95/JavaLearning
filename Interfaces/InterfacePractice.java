package Interfaces;

interface Test {
    void meth1();
    void meth2();
}

class My implements Test {

    @Override
    public void meth1() {
        System.out.println("Meth1 from My class");
    }

    @Override
    public void meth2(){
        System.out.println("Meth2 from My class");
    }

    public void meth3(){
        System.out.println("Meth3 from My class");
    }
}

public class InterfacePractice {
    public static void main(String[] args) {
        Test t = new My();
        t.meth1();
        t.meth2();
      //t.meth3();

        System.out.println("");
        My m =  new My();
        m.meth1();
        m.meth2();
        m.meth3();
    }
}
