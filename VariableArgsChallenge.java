public class VariableArgsChallenge {
    int maximum(int ...x) {
        if (x.length == 0) {
            return Integer.MIN_VALUE;
        }
        else if (x.length == 1) {
            return x[0];
        }
        else {
            int max_value = 0;
            for (int i=0; i < x.length; i++) {
                if (x[i] > max_value) {
                    max_value = x[i];
                }
                else continue;
            }
            return max_value;
        }
    }

    static double sum(double ...A) {
        double s = 0;
        for (int i=0; i < A.length; i++) {
            s = s + A[i];
        }
        return s;
    }

    double discout(double ...A) {
        double value = sum(A);
        double disc = 0;
        if (value >= 0 && value < 500) {
            disc = 0.10d;
        }
        else if (value>=500 && value < 1000) {
            disc = 0.15;
        }
        else {
            disc = 0.20;
        }
        return disc;
    }

    public static void main(String[] args) {
        VariableArgsChallenge v = new VariableArgsChallenge();
        System.out.println("The maximum value is: " + v.maximum(1,2,3,4,5));
        System.out.println("The maximum value is: " + v.maximum(10));
        System.out.println("The maximum value is: " + v.maximum());

        System.out.println("");
        
        System.out.println(sum(19,20,30,70));
        System.out.println(sum(10, 20));
        System.out.println(sum(10));
        System.out.println(sum());

        System.out.println("");

        System.out.println(v.discout(100,500,300));
        System.out.println(v.discout(100, 200));
        System.out.println(v.discout());
    }
}
