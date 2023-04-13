package Collections;

import java.util.List;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>(List.of(10,20,30,40,10,50));
        ts.add(25);
        System.out.println(ts.ceiling(45));
        System.out.println(ts.floor(20));




        System.out.println(ts);
    }
}
