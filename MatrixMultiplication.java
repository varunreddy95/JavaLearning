public class MatrixMultiplication {
    public static void main (String[] args) {
        //Matrix Multiplication
        int A[][] = {{3,5,9}, {7,6,2}, {4,3,5}};
        int B[][] = {{1,0,0}, {0,1,0}, {0,0,1}};
        int C[][] = new int[A.length][A[0].length];

        //condition to check if multiplication is possible
        if (A[0].length == B.length) {
            for(int i=0; i<A.length; i++) {
                for (int j=0; j<A[0].length; j++) {
                    C[i][j] = 0;
                    for (int k=0; k<A[0].length; k++)
                    C[i][j] = C[i][j] + A[i][k] * B[k][j];
                }
            }
        }
        else {
            System.out.println("Matrix Multiplication is invalid, Check the dimensions");
        }

        for (int i[]: C) {
            for (int j: i) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }

        //sorting an array of strings
        String arr[] = {"java", "python", "C", "basic", "ada"};

        java.util.Arrays.sort(arr);
        for (String x:arr) {
            System.out.print(x + " ");
        }
    }

}
