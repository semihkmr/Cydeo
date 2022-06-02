package day62_map;

import java.util.HashMap;
import java.util.Map;

public class DatabaseExample {

    public static void main(String[] args) {

        /*
            People

                FIRST_NAME: James
                LAST_NAME: Bond
                BATCH: 7
         */

        Map<String, String> map = new HashMap<>();
        map.put("FIRST_NAME", "James");
        map.put("LAST_NAME", "Bond");
        map.put("BATCH", "7");

        System.out.println(map);

    }

    public static Map<String, String> makeMap(String... values) {
        Map<String, String> map = new HashMap<>();
        map.put("FIRST_NAME", values[0]);
        map.put("LAST_NAME", values[1]);
        map.put("BATCH", values[2]);
        return map;
    }
}
