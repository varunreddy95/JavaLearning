package Collections;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        
        HashSet<Integer> hs = new HashSet<>(20, 0.5f);

        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(40);

        System.out.println(hs);
    }
}
