package Generics;

public class GenericDemo<T> {
    T data[] = (T[]) new Object[3];
    //Checks at compile time only rather than runtime

    public static void main(String[] args) {
        GenericDemo<String> gd = new GenericDemo<String>();
        gd.data[0] = "Hi";
        gd.data[1] = "bye";
        //gd.data[2] = new Integer(10) Doesn't allow since the Generic array is of String type
        gd.data[2] = "Varun";

        String str = gd.data[0];
    }
}
