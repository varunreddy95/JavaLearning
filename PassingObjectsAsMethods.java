public class PassingObjectsAsMethods {

    static void update(int X[], int index, int value) 
    {
        X[index] = value;
    }

    static void welcome(String n) {
        System.out.println("Welcome Mr. " + n);
    }

    public static void main(String[] args) {
        int A[] = {2,4,6,8,10};
        update(A, 0, 25);
        for(int x: A) {
            System.out.print(x + " ");
        }

        System.out.println("");

        String name = "Varun Reddy";
        welcome(name);
        System.out.println(name);
    }
}
