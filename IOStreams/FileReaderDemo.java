package IOStreams;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) {
        try(FileReader fr = new FileReader("C:\\Users\\varun\\Desktop\\JavaLearning\\Test2.txt")){
            int x;
            while((x=fr.read()) != -1){
                System.out.print((char) x);
            }
        } catch(IOException e){System.out.println(e);}
    }
}
