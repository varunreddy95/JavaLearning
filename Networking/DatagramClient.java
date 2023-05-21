package Networking;

import java.net.*;

public class DatagramClient {
    public static void main(String[] args) {

        try (DatagramSocket ds = new DatagramSocket(2001)) {

        // Sending data to receiver
        String msg = "Hello World";
        DatagramPacket dp = new DatagramPacket(msg.getBytes(), msg.length(), InetAddress.getByName("localhost"), 2000);
        ds.send(dp);
        
        // Receiving data from the sender
        byte b[] = new byte[1024];
        dp = new DatagramPacket(b, 1024);
        ds.receive(dp);
        
        msg = new String(dp.getData()).trim();
        System.out.println("Message from Server: " + msg);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
