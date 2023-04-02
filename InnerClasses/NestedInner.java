package InnerClasses;

class Outer {
    
    int x=10;

    class Inner {
        
        int y=20;
        
        public void innerDisplay()
        {
            System.out.println(x + " " + y);
        }
    }

    public void outerDisplay(){
        Inner i = new Inner();
        i.innerDisplay();
    }
}



public class NestedInner {
    public static void main(String[] args) {
        Outer o =  new Outer();
        Outer.Inner i = new Outer().new Inner();

        i.innerDisplay();
        o.outerDisplay();
    }    
}
