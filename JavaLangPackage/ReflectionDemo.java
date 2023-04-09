package JavaLangPackage;

import java.lang.reflect.*;
/*
 * Reflection package gives information about a Class.
 */

class My {
    private int a;
    protected int b;
    public int c;

    //Constructors
    public My() {}
    public My(int x, int y){}

    //Methods
    public void display(String s1, String s2){}
    public int show(int x, int y) {return 0;}
}

public class ReflectionDemo {
    public static void main(String[] args) {
        Class c=My.class; //Getting the definition of a class from class file
        
        //Getting def through object
        My m = new My();
        Class c1 = m.getClass();

        //Name of class
        System.out.println(c.getName());

        //Getting all the fields of a class, Field is class in lang.refelct
        Field field[] = c.getDeclaredFields();
        for(Field f: field){
            System.out.println(f);
        }

        //Getting constructors
        Constructor con[] = c.getConstructors();
        for (Constructor ct: con){
            System.out.println(ct);
        }

        //Getting methods
        Method meth[] = c.getMethods();
        for(Method method:meth){
            System.out.println(method);
        }

        Parameter param[] = meth[0].getParameters();
        for(Parameter p: param){
            System.out.println(p);
        }
    }
}