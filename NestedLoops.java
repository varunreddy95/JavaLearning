public class NestedLoops {
    public static void main (String[] args) {

        for (int i=1;i<=5;i++)
        {
            for (int j=1;j<=5;j++)
            {
                System.out.print(j + " ");
            }
            System.out.println("");
        }

        System.out.println("\n");

        for (int k=1;k<=5;k++)
        {
            for (int l=1;l<=5;l++)
            {
                System.out.print(k + " ");
            }
            System.out.println("");
        }
    }
}
