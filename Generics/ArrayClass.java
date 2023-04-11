package Generics;

@SuppressWarnings("unchecked")
class MyArray<T> {

    T A[] =(T[]) new Object[10];
    int length = 0;

    public void append(T v){
        A[length++] = v;
    }

    public void display(){
        for(int i=0; i<length; i++){
            System.out.println(A[i]);
        }
    }
}


public class ArrayClass {
    public static void main(String[] args) {
        MyArray<String> a = new MyArray<>();

        a.append("Varun");
        a.append("Reddy");
        //a.append(10);
        a.display();
    }
}
