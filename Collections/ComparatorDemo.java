package Collections;

import java.util.Arrays;
import java.util.Comparator;
import java.lang.Integer;

class My implements Comparator<Integer>{

    public int compare(Integer x, Integer y){

        if(x<y){
            return 1;
        }
        else if(x>y){
            return -1;
        }
        else{
            return 0;
        }
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {
        
        Integer a[] = {2,3,4,5,6,7,8,9};
        //Integer b[] = {1,2,3,4,5,6,7,8,9};

        Arrays.sort(a, new My());

        for(Integer x:a){
            System.out.println(x);
        }


    }
}
