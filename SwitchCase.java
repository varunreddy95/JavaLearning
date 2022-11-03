import java.util.Scanner;

public class SwitchCase {
    public static void main (String[] args) {
        /*
            ************* Display Name of a day based on a number ***************
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of the day: ");
        int day = sc.nextInt();

        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid input");
        }

        /*
         ************* Display Name of a month based on a number ***************
         */

        System.out.print("Enter the number of the month: ");
        int month = sc.nextInt();

        switch (month) {
            case 1 -> System.out.println("January");
            case 2 -> System.out.println("February");
            case 3 -> System.out.println("March");
            case 4 -> System.out.println("April");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("June");
            case 7 -> System.out.println("July");
            case 8 -> System.out.println("August");
            case 9 -> System.out.println("September");
            case 10 -> System.out.println("October");
            case 11 -> System.out.println("November");
            case 12 -> System.out.println("December");
            default -> System.out.println("Invalid Input");
        }

        /*
         ************* Display type of Website ***************
         */
        System.out.print("Enter the url: ");
        String url = sc.next();
        String ext = url.substring(url.lastIndexOf(".") + 1);

        switch (ext) {
            case "com" -> System.out.println("Commercial");
            case "gov" -> System.out.println("Government");
            case "net" -> System.out.println("Network");
            case "biz" -> System.out.println("Business");
            default -> System.out.println("Unknown Extension");
        }

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("******* Menu *********");
        System.out.println("Add");
        System.out.println("Sub");
        System.out.println("Mul");
        System.out.println("Div");

        System.out.print("Enter an option from above: ");
        String str = sc.next();

        switch (str) {
            case "Add" -> System.out.println(a+b);
            case "Sub" -> System.out.println(a-b);
            case "Mul" -> System.out.println(a*b);
            case "Div" -> System.out.println(a/b);
            default -> System.out.println("Invalid Option");
        }
    }
}
