import java.lang.*;
import java.util.*;

public class ConditionalStatements {
    public static void main(String[] args){
        /*
         ************ Challenge ****************
         * Find a number is odd or even
         * Find a person is young or not young
         * Find grades for given marks
         */

        //Odd or even
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = sc.nextInt();

        if (x % 2 == 0)
        {
            System.out.println("The number is even");
        }
        else
        {
            System.out.println("The number is odd");
        }
    }
}
