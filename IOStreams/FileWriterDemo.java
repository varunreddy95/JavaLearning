package IOStreams;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("C:\\Users\\varun\\Desktop\\JavaLearning\\Test2.txt")){
            String str = "Learn java IO Streams!";
            fw.write(str);
        } catch(IOException e){System.out.println(e);}
    }
}
