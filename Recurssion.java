public class Recurssion {
    // 2 - recursiion methods
    static void fun(int n) {
        if (n>0) {
            System.out.println(n);
            fun(n-1);
        }
    }

    static void fun1(int n) {
        if (n>0) {
            fun1(n-1);
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        fun(3);
        System.out.println("");
        fun1(3);
    }
}
