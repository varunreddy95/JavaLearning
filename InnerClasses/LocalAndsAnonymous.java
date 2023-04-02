package InnerClasses;

class OuterClass 
{
    public void outerDisplay()
    {
        class Inner 
        {
            void innerDisplay()
            {
                System.out.println("Hello from Inner class");
            }
        }

        new Inner().innerDisplay();   // Anonymous Object without a reference
    }
}

//Interface
interface Test
{
    void display();

}


class Anonymous
{
    public void meth()
    {
        Test t = new Test()  //Anonymous Class
        /*
         * An interface shouldn't have an object, but since the
         * abstract method is being overriden it becomes a concrete class
         * without a name
         */
        {
            public void display()
            {
                System.out.println("Hello");
            }    
        };
        t.display();
    }
}


class StaticInner 
{
    static int x = 10;
    int y = 20;

    static class My 
    {
        public void display()     //Can only access the static variables not others
        {
            System.out.println("I am the static inner class and here is the static variable: " + x);
        }
    }
}




public class LocalAndsAnonymous {
    public static void main(String[] args) {

        OuterClass o = new OuterClass();
        o.outerDisplay();

        Anonymous a = new Anonymous();
        a.meth();

        StaticInner.My m = new StaticInner.My();
        m.display();
    }
}
