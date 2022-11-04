import java.util.Scanner;

public class FactorialisFun {
    public static void  main (String[] args){

        // 1. Display Multiplication Table
        Scanner sc = new Scanner(System.in);
        System.out.print("Which number table do you want and upto which factor: ");
        int i = sc.nextInt();
        int n = sc.nextInt();
        int k=1;

        while (k<=n){
            System.out.println(i + "*" + k + "=" + (i*k));
            k++;
        }


        // 2. Find the sum of n numbers
        System.out.print("How many numbers sum do you need: ");
        int num = sc.nextInt();
        int sum = 0;
        for (int j=1; j<=num; j++){
            sum = sum + j;
        }
        System.out.println("The sum of " + num + " numbers is " + sum);


        // 3. Factorial of a number
        System.out.print("Which number factorial would you like to know? ");
        int fact = sc.nextInt();
        int factorial = 1;
        do {
            factorial = factorial * fact;
            fact = fact - 1;
        }while (fact>0);
        System.out.println("The factorial of " + fact + " is " + factorial);
    }
}
