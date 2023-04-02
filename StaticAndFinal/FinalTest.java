package StaticAndFinal;

class Test1 
{
    static int x = 10;
    static final int Y;
    final int Z;
    final int K;

    //Different ways of initializing different global final variables
    static
    {
        Y=25;
    }

    {
        Z = 30;
    }

    public Test1()
    {
        K = 100;
    }


    public void meth1()
    {
        System.out.println("Meth1 from Test class");
    }

    static final void meth2()
    {
        System.out.println("Meth2 from Test class acccessing static varible x: " + x);
    }

    final public void meth3()
    {
        System.out.println("Final Meth3 from Test class");
    }
}

final class Test2 extends Test1
{
    //public void meth3(){}  simply not possible because the method is final in super class
    public void show()
    {
        System.out.println("Hello!");
    }
}

// class Test3 extends Test2 {} Not possible because the super class is final 

public class FinalTest {
    public static void main(String[] args) {
        Test1 t = new Test1();
        t.meth1();
        t.meth2();
        t.meth3();
    }
}
