package StaticAndFinal;

class Test
{
    static
    {
        System.out.println("Block 1");
    }
}

public class StaticBlock {
    static
    {
        System.out.println("Block 2");
    }
    
    public static void main(String[] args)
    {
        Test t = new Test();
        System.out.println("Main");
    }
}
