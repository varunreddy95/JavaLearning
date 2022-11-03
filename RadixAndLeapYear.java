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


        /*
         ********** Finding the day based on a number **********
         */
        System.out.print("Enter the number of the day: ");
        int day = sc.nextInt();

        if (day==1)
        {
            System.out.println("Monday");
        } else if (day==2) {
            System.out.println("Tuesday");
        } else if (day==3) {
            System.out.println("Wednesday");
        } else if (day==4) {
           System.out.println("Thursday");
        } else if (day==5) {
            System.out.println("Friday");
        } else if (day==6) {
            System.out.println("Saturday");
        } else if (day==7) {
            System.out.println("Sunday");
        }
        else
        {
            System.out.println("Invalid, enter a number between 0 and 7");
        }
    }
}
