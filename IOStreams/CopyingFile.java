package IOStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyingFile {
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("C:\\Users\\varun\\Desktop\\JavaLearning\\Source1.txt");
            // StringBuilder sb = new StringBuilder();
            // int x;

            // while((x=fis.read()) != -1){
            //     sb.append((char)x);
            // }

            byte b[] = new byte[fis.available()];
            b = fis.readAllBytes();
            StringBuilder sb = new StringBuilder();
            
            //Converting into string builder in order to convert uppercase to lowercase
            for(byte x:b){
                sb.append((char)x);
            }

            String str = sb.toString();
            String str_lower = str.toLowerCase();
            byte b_lower[] = new byte[fis.available()];
            b_lower = str_lower.getBytes();

            FileOutputStream fos = new FileOutputStream("C:\\Users\\varun\\Desktop\\JavaLearning\\Source2.txt");
            fos.write(b_lower);


            fis.close();
            fos.close();
        } catch(IOException e){System.out.println(e);}
    }
}
