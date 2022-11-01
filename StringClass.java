import java.lang.*;
import java.util.*;

import static java.lang.String.valueOf;

public class StringClass {
    public static void main(String[] args){
        /*
        String is a built-in class in Java. But it is also a data type
        String is a collection of characters.
         */

        String str1 = "Java Program";
        /*
        str1 is called reference, Variables of type class ("Java program" is a string literal or object of string class)
        are called references
         */

        //Different methods for creating strings
        //1. Constructor method
        char c[] = {'A', 'B', 'C', 'D'};
        String str2 = new String(c);      // new is used to create a new object of a class in heap memory

        byte b[] = {65, 66, 67, 68};
        String str3 = new String(b);

        String str4 = new String("Java"); // The literal "Java" is created as an object also in the string pool. But no reference

        //2. Assignment method
        String str5 = "Java Programming"; // Only created in pool and is referenced. No heap presence


        //************** String Methods ***********************

        int l = str1.length();
        String str_lower = str1.toLowerCase();

        // way to call method - reference.method()
        /*
        trim()
        substring()
        substring(int begin, int end)
        replace(char old, char new)
        startswith(String )
        endswith(String )
        charAt(int index)
        indexOf(String s)
        lastIndexOf(String s)
        equals(String s)
        equalsIgnoreCase(String s)
        compareTo(String s)
        valueOf(Int i)
         */
        String str6 = valueOf(str5);
        System.out.println(str5.compareTo(str6.toLowerCase()));

        /*
          ************** CHALLENGE **************
          1. Find if the given email id is on gmail
          2. Find the username and domain name from email
         */

        String email = "programmer@gmail.com";
        System.out.println(email.contains("gmail")); // true

        String username = email.substring(0, email.indexOf('@'));
        String domain = email.substring(email.indexOf('@') + 1);
        System.out.println(username);
        System.out.println(domain);



    }
}
