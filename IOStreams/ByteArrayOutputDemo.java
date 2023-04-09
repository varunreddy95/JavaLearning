package IOStreams;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutputDemo {
    public static void main(String[] args) {
        ByteArrayOutputStream bos = new ByteArrayOutputStream(20);
        
        bos.write('a');
        bos.write('b');
        bos.write('c');
        bos.write('d');

        //byte b[] = bos.toByteArray();

        try{
            bos.writeTo(new FileOutputStream("C:\\Users\\varun\\Desktop\\JavaLearning\\ByteArray.txt"));
        } catch(IOException e){System.out.println(e);}

        // for(byte x: b){
        //     System.out.println((char)x);
        // }

        try{
            bos.close();
        } catch(IOException e){System.out.println(e);}
    }
}
