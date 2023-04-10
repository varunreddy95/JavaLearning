package IOStreams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamDemo {
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("C:\\Users\\varun\\Desktop\\JavaLearning\\Test1.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);     // When Filereader is used use BufferReader as both read character data

            // int x;
            // while((x=bis.read()) != -1){
            //     System.out.print((char)x);
            // }

            System.out.println("File Mark Supported? " + fis.markSupported());
            System.out.println("Buffer Mark Supported? " + bis.markSupported());
        
            System.out.println((char) bis.read());
            System.out.println((char) bis.read());
            System.out.println((char) bis.read());
            bis.mark(10);
            System.out.println((char) bis.read());   //MARK AT LETTER r
            System.out.println((char) bis.read());
            bis.reset();                             //Reset from letter r
            System.out.println((char) bis.read());
            System.out.println((char) bis.read());

            fis.close();
            bis.close();
        } catch(IOException e){System.out.println(e);}
    }
}
