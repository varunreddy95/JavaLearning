package IOStreams;

import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayReaderDemo {
    public static void main(String[] args) {
        char c[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        CharArrayReader cr = new CharArrayReader(c);

        int x;
        try{
            while((x=cr.read()) != -1){
                System.out.print((char) x);
            }
        }catch(IOException e){System.out.println(e);}

        cr.close();
    }
}
