import java.lang.*;
import java.util.*;

public class MoreArrayChallenges{
    public static void main(String[] args)
    {
        //Copying an Array
        int A[] = {8, 6, 10, 9, 2, 15, 7, 13, 14, 11};
        int B[] = new int[A.length];

        for(int i=0; i<A.length; i++)
        {
            B[i] = A[i];
            System.out.print(B[i] + " ");
        }

        System.out.println("\n");

        //Reverse Copying Array
        int C[] = new int[A.length];

        for(int i=A.length-1; i>=0; i--)
        {
            C[i] = A[i];
            System.out.print(C[i] + " ");
        }

        System.out.println("\n");

        //Increasing size of the Array without using ArrayList
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = new int[2*arr1.length];
        System.out.println("Size of arr1 intitally: " + arr1.length);

        for(int i=0; i<arr1.length; i++)
        {
            arr2[i] = arr1[i];
        }

        arr1 = arr2;
        arr2 = null;

        System.out.println("Size of arr1 now: " + arr1.length);
    }
}

