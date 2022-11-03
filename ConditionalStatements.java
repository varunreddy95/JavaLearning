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
        System.out.print("Enter a number: ");
        int x = sc.nextInt();

        if (x % 2 == 0)
        {
            System.out.println("The number is even");
        }
        else
        {
            System.out.println("The number is odd");
        }

        //Young or not young
        System.out.print("Enter the age of a person: ");
        int age = sc.nextInt();

        if (age < 18)
        {
            System.out.println("The person is young");
        }
        else
        {
            System.out.println("The person is not young");
        }

        //Grades for given marks
        System.out.print("Enter the marks: ");
        float marks = sc.nextFloat();

        if (marks < 40)
        {
            System.out.println("Grade: F");
        }
        else if ((marks > 40 ) && (marks <= 60))
        {
            System.out.println("Grade: D");
        }
        else if ((marks > 60) && (marks <= 80))
        {
            System.out.println("Grade: A");
        }
        else
        {
            System.out.println("Grade: S");
        }
    }
}
