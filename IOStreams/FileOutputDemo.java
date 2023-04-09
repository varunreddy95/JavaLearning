package IOStreams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;




public class FileOutputDemo {
    public static void main(String[] args) throws IOException {

        try (FileOutputStream fos = new FileOutputStream("C:\\Users\\varun\\Desktop\\JavaLearning\\Test1.txt")){
            String str = "Learn java programming.";
        
            try{
                fos.write(str.getBytes());
            } catch(FileNotFoundException e){
            System.out.println(e);
            }

        } catch(IOException e){
            System.out.println(e);
        }
    }
}
