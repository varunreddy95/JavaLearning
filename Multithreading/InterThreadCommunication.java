package Multithreading;

class Mydata {
    
    int value;
    boolean flag = true;

    synchronized public void set(int v){
        while(flag != true){
            try{
            wait();
            }catch(Exception e){}
        }
        value = v;
        flag = false;
        notify();
    }

    synchronized public int get(){
        int x = 0;
        while(flag != false){
            try{
                wait();
            } catch(Exception e){}
        }
        x = value;
        flag = true;
        notify();
        return x;
    }
}

class Producer extends Thread {

    Mydata data;

    public Producer(Mydata data){
        this.data = data;
    }

    public void run(){
        int count=1;
        while(count < 101){
            data.set(count);
            System.out.println("Producer: " + count);
            count++;
        }
    }
}

class Consumer extends Thread {

    Mydata d;

    public Consumer(Mydata data) {
        d = data;
    }

    public void run() {
        int value;
        while(true){
            value=d.get();
            System.out.println("Consumer: " + value);
        }
    }
}




public class InterThreadCommunication {
    public static void main(String[] args) {
        
        Mydata d = new Mydata();
        Producer p = new Producer(d);
        Consumer c = new Consumer(d);

        p.start();
        c.start();
    }
}
