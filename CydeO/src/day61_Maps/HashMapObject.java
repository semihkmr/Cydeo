package day61_Maps;

import java.util.HashMap;
import java.util.Map;

public class HashMapObject {
    public static void main(String[] args) {

        // keys are Integer, and values are String
        Map< Integer, String > map = new HashMap<>();

        map.put(1,"one");
        map.put(3,"three");
        map.put(10,"ten");
        map.put(5,"five");
        System.out.println(map);

        // read key/value
        System.out.println(map.get(1));
        System.out.println(" ");
        System.out.println(map.keySet());
        System.out.println(" ");
        System.out.println(map.values());
        System.out.println(" ");
        System.out.println(map.entrySet());

    }
}
