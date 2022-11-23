public class TwoDimensionalArrays {
    public static void main(String[] args) {
        //Several ways of creating or intialising a 2D array
        int A[][] = new int[3][4];
        int C[][] = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
        int B[][];
        B = new int[3][4];

        //Accessing the elements of a 2D array in different ways
        //Using For loop
        for (int i=0; i<C.length; i++) {
            for (int j=0; j<C[0].length; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.print("\n");
        }

        System.out.println("");

        //Using for each loop
        for (int i[]: C) {
            for (int j: i) {
                System.out.print(j + " ");
            }
            System.out.print("\n");
        }

        System.out.println("");

        //Array with irregular dimensions
        int D[][] = new int[3][];
        D[0] = new int[2];
        D[1] = new int[3];
        D[2] = new int[4];

        for (int i[]: D) {
            System.out.println("The Sizes of 2nd dimension are: " + i.length + " ");
        }
    }
}
