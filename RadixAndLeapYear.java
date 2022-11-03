import java.util.Scanner;

public class RadixAndLeapYear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        /*
            ********** Finding the number system of the given input sting **********
         */

        String num;

        System.out.print("Enter a number: ");
        num = sc.nextLine();

        if (num.matches("[01]+"))
        {
            System.out.println("Binary system, Radix=2");
        }
        else if (num.matches("[0-7]+"))
        {
            System.out.println("Ocatal system, Radix=8");
        }
        else if (num.matches("[0-9]+"))
        {
            System.out.println("Decimal System, Radix=9");
        }
        else if (num.matches("[0-9A-F]+"))
        {
            System.out.println("Hexadecimal System, Radix=16");
        }
        else
        {
            System.out.println("Invalid Input");
        }


        /*
            ********** Finding the number system of the given input sting **********
         */
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if (year % 4 == 0)
        {
            if (year % 100 == 0)
            {
                if (year % 400 == 0)
                {
                    System.out.println("Yes, it's a leap year");
                }
                else
                {
                    System.out.println("No, Not a leap year");
                }
            }
            else
            {
                System.out.println("No, Not a leap year");
            }
        }
        else
        {
            System.out.println("No, Not a leap year");
        }
    }
}
