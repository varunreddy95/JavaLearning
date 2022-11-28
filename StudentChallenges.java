public class StudentChallenges {

    //Method to find a prime number
    static boolean isPrime(int n) 
    {
        for(int i=2; i<=n/2; i++) {
            if (n%i==0) {
                return false;
            }
        }
        return true;
    }

    //Method to find the GCD of 2 numbers
    static int gcd(int x, int y)
    {
        while (x!=y) {
            if (x<y) {
                y = y-x;
            }
            else {
                x = x-y;
            }
        }
        return x;
    }

    //Method to find the max element in an Array
    static int maxElement(int x[])
    {
        int max = x[0];

        for (int i:x) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Let's see if the number is prime or not ? " + isPrime(91));
        System.out.println("GCD of the numbers is " + gcd(12, 15));

        int A[] = {1,2,3,4,5};
        System.out.println("The maximum element of the array: " + maxElement(A));
    }
}
