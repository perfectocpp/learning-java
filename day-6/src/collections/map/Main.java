package collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        //hashMap();
        //linkedHashMap();
        treeMap();
    }

    public static void hashMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("bir", 1);
        map.put("ikki", 1+1);
        map.put("uch", 3);
        map.put("to'rt", 1+1+2);
        System.out.println(map.get("ikki") + 1);

        for (String key: map.keySet()){
            System.out.printf("%s --> %d\n", key, map.get(key));
        }
    }

    public static void linkedHashMap() {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("bir", 1);
        map.put("ikki", 2);
        map.put("to'rt", 4);
        map.put("uch", 3);
        System.out.println(map.get("ikki") + 1);

        for (String key: map.keySet()){
            System.out.printf("%s --> %d\n", key, map.get(key));
        }
    }

    public static void treeMap() {
        Map<String, Integer> map = new TreeMap<>();
        map.put("bir", 1);
        map.put("to'rt", 4);
        map.put("uch", 3);
        map.put("ikki", 2);
        System.out.println(map.get("ikki") + 1);

        for (String key: map.keySet()){
            System.out.printf("%s --> %d\n", key, map.get(key));
        }
        System.out.println();

        for (Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.printf("%s --> %d\n", entry.getKey(), entry.getValue());
        }
    }
}
