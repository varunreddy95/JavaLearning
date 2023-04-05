package Multithreading;

/* */
class MyRun extends Thread
{
    public MyRun(String name)
    {
        super(name);
        setPriority(Thread.MAX_PRIORITY);
    }

    public void run()
    {
        int count = 1;
        while(true)
        {
            System.out.println(count++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

public class ThreadMethods {
    
    public static void main(String[] name)
    {
        MyRun m = new MyRun("My Thread 1");
        
        System.out.println("Id: " + m.getId());
        System.out.println("Name: " + m.getName());
        System.out.println("Priority: "+ m.getPriority());
        System.out.println("State: " + m.getState());
        System.out.println("Alive: " + m.isAlive());

        m.start();
        m.interrupt();
    }
}
