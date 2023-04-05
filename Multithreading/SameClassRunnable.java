package Multithreading;

public class SameClassRunnable implements Runnable
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

    public static void main(String[] args)
    {
        SameClassRunnable s = new SameClassRunnable();
        Thread th = new Thread(s);
        th.start();

        int i=1;
        while(true)
        {
            System.out.println(i + " world");
            i++;
        }
    }
}
