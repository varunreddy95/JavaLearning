package Multithreading;

class Mythread extends Thread
{
    public void run(){
        int count=1;

        while(true){
            // try{
            //     Thread.sleep(100);
            // } catch(Exception e){
            //     System.out.println(e.getMessage());
            // }
            System.out.println(count++ + " My thread");
        }
    }
}



public class DaemonJoinYield {
    public static void main(String[] args) {
        Mythread t = new Mythread();
        t.start();

        int count=1;

        while(true){
            System.out.println(count++ + " Main Thread");
            Thread.yield();
        }

        // Thread mainThread = Thread.currentThread();
        // try{
        //     mainThread.join();
        // } catch(Exception e) {
        //     System.out.println(e.getMessage());
        // }

        // try{
        //     Thread.sleep(1000);
        // } catch(Exception e) {}
    }
}
