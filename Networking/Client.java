package Networking;

import java.net.*;
import java.io.*;

/*
 *  Single-User Reverse Echo Server
 */



public class Client {
    public static void main(String[] args) {
        
        try {
            Socket skt = new Socket("localhost", 2000);

            //Reading the input from the user
            BufferedReader user_input = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader br = new BufferedReader(new InputStreamReader(skt.getInputStream()));
            PrintStream ps = new PrintStream(skt.getOutputStream());

            String msg;
            do{
                msg = user_input.readLine();
                ps.println(msg);
                msg = br.readLine();
                System.out.println("From the Server: " + msg);
            } while(!msg.equals("dne"));

            skt.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
