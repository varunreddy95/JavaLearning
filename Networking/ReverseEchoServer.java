package Networking;

import java.net.*;
import java.io.*;

/*
 *  Single-User reverse echo server
 */



public class ReverseEchoServer {
    public static void main(String[] args) {
        
        try {
            ServerSocket ss = new ServerSocket(2000);
            Socket skt = ss.accept();
            
            //Reading Input fromt the client
            BufferedReader br = new BufferedReader(new InputStreamReader(skt.getInputStream()));
            //Senfing the message back to the client (Echo back to the client)
            PrintStream ps= new PrintStream(skt.getOutputStream());
             
            String msg;
            
            //Using string builder so that we can reverse the string
            StringBuilder sb;
            do {
                msg = br.readLine();
                sb = new StringBuilder(msg);
                sb.reverse();
                msg = sb.toString();
                ps.println(msg);
            } while(!msg.equals("dne"));

            ss.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}


