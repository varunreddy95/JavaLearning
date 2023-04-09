package IOStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceStreamDemo {
    public static void main(String[] args) {
        try{
            FileInputStream fis1 = new FileInputStream("C:\\Users\\varun\\Desktop\\JavaLearning\\Source1.txt");
            FileInputStream fis2 = new FileInputStream("C:\\Users\\varun\\Desktop\\JavaLearning\\Source2.txt");
            SequenceInputStream sis = new SequenceInputStream(fis1, fis2);
            FileOutputStream fos = new FileOutputStream("C:\\Users\\varun\\Desktop\\JavaLearning\\Destination.txt");

            int b;
            while((b=sis.read()) != -1 ){
                fos.write(b);
            }

            fis1.close();
            fis2.close();
            sis.close();
            fos.close();
        } catch(IOException e){System.out.println(e);}
    }
}
