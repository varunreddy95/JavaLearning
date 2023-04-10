package IOStreams;


import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {
    public static void main(String[] args) {
        try{
            RandomAccessFile r = new RandomAccessFile("C:\\Users\\varun\\Desktop\\JavaLearning\\Data.txt", "rw");
            System.out.println((char) r.read());
            System.out.println((char) r.read());
            System.out.println((char) r.read());
            System.out.println((char) r.read());
            System.out.println((char) r.read());
            System.out.println(r.getFilePointer());
            r.seek(3);
            System.out.println(r.getFilePointer());
            r.write('e');
            System.out.println((char) r.read());
            System.out.println((char) r.read());
        } catch(IOException e) {System.out.println(e);}
    }
}
