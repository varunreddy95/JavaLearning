package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        
        ArrayList<Integer> al1 = new ArrayList<>(20); //Just inititalizing with 20 spaces but its dynamic
        ArrayList<Integer> al2 = new ArrayList<>(List.of(50,60,70,80,90));


        al1.add(10);
        al1.add(0, 5);
        al1.addAll(al2);
        al1.addAll(1, al2);

        System.out.println(al1);

        System.out.println(al1.contains(50));
        System.out.println(al1.contains(25));
        System.out.println(al1.containsAll(al2));
        System.out.println(al1.get(4));
        System.out.println(al1.indexOf(50));
        System.out.println(al1.lastIndexOf(50));
        
        Iterator<Integer> it = al1.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
