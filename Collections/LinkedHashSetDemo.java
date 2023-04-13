package Collections;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        
        LinkedHashSet<String> lhs = new LinkedHashSet<>(10);

        lhs.add("A");
        lhs.add("B");
        lhs.add("C");
        lhs.add("D");
        lhs.add("E");

        lhs.forEach((x)->System.out.println(x));
    }
}
