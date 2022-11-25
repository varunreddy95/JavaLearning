public class Methods {

    static int max(int x, int y)
    {
        y++;
        if (x > y) {
            return x;
        }
        else {
            return y;
        }
    }

    String what_are_you()
    {
        return "I am Varun reddy";
    }

    public static void main(String[] args) {
        /*
         *  return type methodname (parameter list)  // This first Line is called signature of a method
         * {   
         *      -------------------------------------
         *      -------------------------------------
         * }
         */

            int a=10, b=15, c;
            c = max(a, b);
            System.out.println(b);
            System.out.println(c);

            Methods m = new Methods();          // Creating an object of the class to use a non static method
            System.out.println(m.what_are_you());
    }
}
