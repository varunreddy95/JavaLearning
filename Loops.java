public class Loops {
    public static void main(String[] args) {

        int i = 1, n = 100;

        System.out.println("********************** WHILE LOOP *****************************************");
        while (i < n){
            System.out.println(i);
            i = i * 2;
        }

        System.out.println("************** DO-WHILE LOOP **********************************************");
        do {
            System.out.println(i);
            i = i * 2;
        }while (i < n);
    }
}
