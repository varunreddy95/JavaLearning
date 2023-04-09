package LambdaExpressions;

@FunctionalInterface
interface MyLambda{
    public void display();
}

/*class My implements MyLambda{

    @Override
    public void display(){
        System.out.println("Hello World!");
    }
}*/

class Demo
{
    public void callLambda(MyLambda al)
    {
        al.display();
    }
}

public class LambdaDemo {

    public static void main(String[] args) {
        
        Demo d = new Demo();
        d.callLambda(()->{System.out.println("Hello World!");});

    }
}
