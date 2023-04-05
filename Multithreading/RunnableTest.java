package Multithreading;


class My implements Runnable
{
    public void run()
    {
        int i=1;
        while(true)
        {
            System.out.println(i + " Hello");
            i++;
        }
    }
}



public class RunnableTest {
    public static void main(String[] args) {
        My m = new My();
        Thread th = new Thread(m);
        th.start();

        int i=1;
        while(true)
        {
            System.out.println(i + " world");
            i++;
        }
    }
}
