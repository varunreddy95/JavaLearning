import java.util.Scanner;

public class Arrays {
    public static void main (String[] args) {
        //Array creation - object way
        int A[] = new int[5];

        //Array creation - assignment way
        int B[] = {1,2,3,4,5};

        //For each loop
        for (int i:B)
        {
            System.out.print(i + " ");
        }

        System.out.println("\n");

        //Challenge: sum of all elements in an array
        int sum = 0;
        int Array[] = {3,9,7,8,12,6,15,5,4,10};

        for (int x: Array)
        {
            sum = sum + x;
        }
        System.out.println("The sum of elements in the array: " + sum);

        //Search for an element in the array
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the element to be searched for: ");
        int element = sc.nextInt();

        for (int i=0; i<Array.length; i++)
        {
            if (Array[i] == element)
            {
                System.out.println("The element exists in the array at position: " + i);
            }
            else
            {
                continue;
            }
        }

        //Find the maximum element in an array
        int max_element = 0;
        for (int i=0; i<Array.length; i++)
        {
            if (Array[i] >= max_element)
            {
                max_element = Array[i];
            }
            else
            {
                continue;
            }
        }

        System.out.println("The maximum number in the array is: " + max_element);

        //Find the second largest element in the array
        int second_largest = 0;
        for (int x: Array)
        {
            if ((x < max_element) && (x >= second_largest))
            {
                second_largest = x;
            }
            else {
                continue;
            }
        }
        System.out.println("The Second largest number in the array is: " + second_largest);
    }
}
