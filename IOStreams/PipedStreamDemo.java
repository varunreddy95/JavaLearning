package IOStreams;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

class Producer extends Thread {
    OutputStream os;

    public Producer(OutputStream o) {
        os = o;
    }

    public void run() {
        int count=1;
        while(true) {
            try{
                os.write(count);
                os.flush();
                System.out.println("Producer: " + count);
                System.out.flush();
                Thread.sleep(100);
                count++;
            } catch(Exception e){System.out.println(e);}
        }
    }
}

class Consumer extends Thread {
    InputStream is;

    public Consumer(InputStream i) {
        is = i;
    }

    public void run() {
        int x;
        try{
            while((x=is.read()) != -1){
                System.out.println("Consumer: " + x);
                System.out.flush();
                Thread.sleep(100);;
            }
        } catch(Exception e) {System.out.println(e);}
    }
}





public class PipedStreamDemo {
    public static void main(String[] args) {
        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream();

        try{
            pis.connect(pos);
        } catch(IOException e) {System.out.println(e);}

        Producer p = new Producer(pos);
        Consumer c = new Consumer(pis);

        p.start();
        c.start();

    }
}
