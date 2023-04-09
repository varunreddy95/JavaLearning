package IOStreams;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteStreamDemo {
    public static void main(String[] args) {
        byte b[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        ByteArrayInputStream bis = new ByteArrayInputStream(b);

        // int x;
        // while((x=bis.read()) != -1){
        //     System.out.println((char) x);
        // }
        
        // System.out.println("");

        String str = new String(bis.readAllBytes());
        System.out.println(bis.markSupported());
        System.out.println(str);


        try{
            bis.close();
        } catch(IOException e){System.out.println(e);}
    }
}
