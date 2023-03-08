public class MethodOverloading {
    
    static double area(double length, double breadth) {
        return (length*breadth);
    }

    static double area(double radius) {
        return (Math.PI * radius * radius);
    }

    static double area(double length, double breadth, double height) {
        return (0.5 * (length + breadth) * height);
    }

    static int reverse(int number) {
        int rev=0;
        while(number!=0) {
            int remainder = number%10;
            rev = rev * 10 + remainder;
            number = number/10;
        }
        return rev;
    }

    static int[] reverse(int x[]) {
        int reverse_array[] = new int[x.length];
        for (int i=x.length-1; i>=0; i--) {
            for (int j=0; j<=reverse_array.length-1; j++) {
                reverse_array[j] = x[i];
            }
        }
        return reverse_array;
    }

    static boolean validate(String name) {
        return name.matches("[a-zA-z\\s]+");
    }

    static boolean validate(int age) {
        return age>=3 && age<=15;
    }

    public static void main(String[] args) {
        System.out.println("Area of circle: " + area(6));
        System.out.println("Area of rectangle: " + area(10,5));
        System.out.println("Area of trapezium: " + area(10,5,6));
        System.out.println("Reverse of a number: " + reverse(1234));
        int A[] = {1,2,3,4,5,6};
        for (int x:A) {
            System.out.print(x + " ");
        }
        int B[] = new int[A.length];
        B = reverse(A);

        System.out.println("");
        System.out.println(validate("Varun Reddy"));
        System.out.println(validate(18));
        
        for(int x:B) {
            System.out.print(x + " ");
        }
    }
}
