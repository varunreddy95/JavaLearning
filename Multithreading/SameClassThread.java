package Multithreading;

public class SameClassThread extends Thread 
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

    public static void main(String[] args) {
        SameClassThread t = new SameClassThread();
        t.start();

        int i=1;
        while(true)
        {
            System.out.println(i + " world");
            i++;
        }
    }
}
