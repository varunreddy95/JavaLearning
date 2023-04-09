package IOStreams;

import java.io.FileInputStream;
import java.io.IOException;


public class FileInputDemo {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("C:\\Users\\varun\\Desktop\\JavaLearning\\Test1.txt")){
            StringBuilder sb = new StringBuilder();
            int x;

            while((x=fis.read()) != -1){
                sb.append((char)x);
            }
            System.out.println(sb);
        } catch(IOException e){System.out.println(e);}
    }
}
