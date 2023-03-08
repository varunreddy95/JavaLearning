public class VariableArgs {
    static void show(String ...x) {
        for (String y: x) {
            System.out.println(y);
        }
    }
    // Method overloading
    static void show(int ...x) {
        for (int i: x) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        //Variable arguments function call
        show("varun", "reddy", "kamatham");
        show(10, 20, 30);
        show(new int[] {1,2,3,4});
    }
}
