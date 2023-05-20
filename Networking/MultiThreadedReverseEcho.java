package Networking;

import java.net.*;
import java.io.*;

public class MultiThreadedReverseEcho extends Thread{

    Socket skt;

    public MultiThreadedReverseEcho(Socket st){
        this.skt = st;
    }

    @Override
    public void run(){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(skt.getInputStream()));
            PrintStream ps = new PrintStream(skt.getOutputStream());

            String msg;
            StringBuilder sb;
            do {
                msg = br.readLine();
                sb = new StringBuilder(msg);
                sb.reverse();
                msg = sb.toString();
                ps.println(msg);
            } while(!msg.equals("dne"));
            skt.close(); // close the socket
        } catch (IOException e) {System.out.println(e);}
    }




    public static void main(String[] args) {
        try (ServerSocket ss = new ServerSocket(2000)) {
            
            int count = 0;
            Socket skt;
            MultiThreadedReverseEcho re;

            do{
                skt = ss.accept();
                ++count;
                System.out.println("Client connected: " + count);
                re = new MultiThreadedReverseEcho(skt);
                re.start();
            } while(true);
            
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
