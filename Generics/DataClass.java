package Generics;


class Data<T> {

    private T obj;

    public void setData(T v){
        obj = v;
    }

    public T getData(){
        return obj;
    }
}




public class DataClass {
    public static void main(String[] args) {
        Data<String> d = new Data<>();
        d.setData("Varun");
        System.out.println(d.getData());
    }
}
