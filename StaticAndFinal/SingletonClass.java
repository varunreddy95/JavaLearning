package StaticAndFinal;

class CoffeeMachine
{
    private float coffeeQTY;
    private float waterQTY;
    private float milkQTY;
    private float sugarQTY;

    static private CoffeeMachine my = null;
    static int counter = 0;
    private CoffeeMachine()
    {
        coffeeQTY = 1f;
        waterQTY = 1f;
        milkQTY = 1f;
        sugarQTY = 1f;
    }

    static public CoffeeMachine getInstance()
    {
        if (my==null && counter<5)
        {
            my = new CoffeeMachine();
            counter++;
        }
        return my;
    }
}



public class SingletonClass {
    public static void main(String[] args) {
        CoffeeMachine m1 = CoffeeMachine.getInstance();
        CoffeeMachine m2 = CoffeeMachine.getInstance();
        CoffeeMachine m3 = CoffeeMachine.getInstance();
        CoffeeMachine m4 = CoffeeMachine.getInstance();
        CoffeeMachine m5 = CoffeeMachine.getInstance();
        //CoffeeMachine m6 = CoffeeMachine.getInstance();

        if(m1==m2 && m1==m3)
        {
            System.out.println("Same");
        }
        else
        {
            System.out.println("Not Same");
        }

    }
}
