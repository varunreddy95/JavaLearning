package ExceptionHandling;

public class NestedCatch {
    public static void main(String[] args) {
        int A[] = {1,2,3,4,5,0};

        try
        {
            int c = A[3]/A[1];
            System.out.println("Division is " + c);

            try
            {
                System.out.println(A[A.length]);
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Invalid index");
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println("Denominator should not be 0");
        }


        System.out.println("Bye!");
    }
}
