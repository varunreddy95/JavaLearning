import java.util.*;

public class MatrixOperations {
    public static void main (String[] args) {
        /*
         * Adding 2 Matrices
         */
        Scanner sc = new Scanner(System.in);

         // Adding 2 Matrices
         int A[][] = new int[3][3];
         int B[][] = new int[3][3];
         int C[][] = new int[A.length][A[0].length];

        System.out.print("Enter the values of Matrix A: ");
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                A[i][j] = sc.nextInt();
                System.out.print(A[i][j] + " ");
            } 
            System.out.println("");
        }         

        System.out.println("");

        System.out.print("Enter the values of Matrix B: ");
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                B[i][j] = sc.nextInt();
                System.out.print(B[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("");

        System.out.println("Addition of A and B is: ");
        for (int i=0; i<A.length; i++) {
            for (int j=0; j<A[0].length; j++) {
                C[i][j] = A[i][j] + B[i][j];
                System.out.print(C[i][j] + " ");
            }
            System.out.println("");
        }

    }
}
