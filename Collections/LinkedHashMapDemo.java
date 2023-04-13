package Collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>(5, 0.75f, false){

            @SuppressWarnings("rawtypes")
            protected boolean removeEldestEntry(Map.Entry e){
                return size()>12;
            }
        };

        lhm.put(1, "A");
        lhm.put(2, "B");
        lhm.put(3, "C");
        lhm.put(4, "D");
        lhm.put(5, "E");
        lhm.put(6, "F");
        lhm.put(7, "G");
        lhm.put(8, "H");
        lhm.put(9, "I");
        lhm.put(10, "J");
        lhm.put(11, "K");

        lhm.get(5);
        lhm.get(1);
        lhm.put(12, "L");
        lhm.put(13, "M");

        

        lhm.forEach((k,v)->System.out.println(k+ "  " + v));

    }
}
