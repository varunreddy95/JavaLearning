package Multithreading;

class MyData{

    public void display(String str){           /*Method can be Synchronised too as 
                                                synchronized public void display()*/
        synchronized(this){
            for(int i=0; i<str.length(); i++){
                System.out.println(str.charAt(i));
                try{
                    Thread.sleep(100);
                } catch(Exception e){ }
            }            
        }
    }
}

class MyThread1 extends Thread {

    MyData d;
    public MyThread1(MyData d) {
        this.d = d;
    }

    public void run(){
        d.display("Hello World");
    }
}

class MyThread2 extends Thread {

    MyData data;
    public MyThread2(MyData data) {
        this.data = data;
    }

    public void run() {
        data.display(" Welcome All");
    }
}



public class SyncDemo {
    public static void main(String[] args) {
        
        MyData mydata = new MyData();
        MyThread1 t1 = new MyThread1(mydata);
        MyThread2 t2 = new MyThread2(mydata);

        t1.start();
        t2.start();
    }
}
