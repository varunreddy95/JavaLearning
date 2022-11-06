import java.awt.geom.Area;
import java.util.Scanner;

public class PlayWithArrays {
    public static void main (String[] args) {
        //1. Rotating the array
        int[] Array = {5,9,6,10,12,7,3,5,4,2};
        //rotating left
        int temp_left = Array[0];
        for (int i=0; i<Array.length; i++)
        {
            if (i!= Array.length-1)
            {
                Array[i] = Array[i+1];
            }
            else
            {
                Array[i] = temp_left;
            }
            System.out.print(Array[i] + " ");
        }

        System.out.println("\n");
        //Rotating right
        int temp_right = Array[Array.length-1];

        for (int k=Array.length-1; k>0; k--)
        {
            Array[k] = Array[k-1];
        }
        Array[0] = temp_right;

        for (int x: Array)
        {
            System.out.print(x + " ");
        }
        System.out.println("\n");


        //Inserting an element into an array at a particular index
        int[] A = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the array: ");
        for (int i=0; i<=5; i++)
        {
            A[i] = sc.nextInt();
        }
        for (int x:A)
        {
            System.out.print(x + " ");
        }
        System.out.println("");
        System.out.print("Enter the number you want to add to the array: ");
        int add_element = sc.nextInt();
        System.out.print("Enter the index at which you want to add the element: ");
        int index = sc.nextInt();

        for (int i=6; i>=2; i--)
        {
            A[i] = A[i-1];
        }
        A[index] = add_element;

        for(int x: A)
        {
            System.out.print(x+" ");
        }

        for (int i=index; i<=6; i++)
        {
            A[i] = A[i+1];
        }
        System.out.println("");
        for (int x:A)
        {
            System.out.print(x + " ");
        }
    }
}
