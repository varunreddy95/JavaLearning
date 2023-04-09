package LambdaExpressions;

interface Lambda
{
    public int display(String str1, String str2);
}

public class MethodReference {

    // public void reverse(String str){
    //     StringBuilder sb = new StringBuilder(str);
    //     sb.reverse();
    //     System.out.println(sb);
    // }

    //Constructor
    public MethodReference(String s){
        System.out.println(s.toUpperCase());
    }

    public static void main(String[] args) {

        //Only if the method is static
        //Lambda m = MethodReference::reverse;  
       
       //For non-static methods
       //MethodReference mf = new MethodReference();   
       //Lambda m = mf::reverse;


       Lambda m = String::compareTo;


        System.out.println(m.display("hello", "hello"));
    }
}
