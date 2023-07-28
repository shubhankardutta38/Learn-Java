package HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapexm3 {
    public static void main(String args[]) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Mango");
        map.put(2, "Apple");
        map.put(3, "Banana");
        map.put(4, "Grapes");
        map.remove(2);
        System.out.println("Iterating Hashmap......");
        for (Map.Entry<Integer, String> m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        map.replace(1, "orange");
        System.out.println("Iterating Hashmap......");
        for (Map.Entry<Integer, String> m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        map.replaceAll((k, v) -> "Ajay");
        System.out.println("Iterating Hashmap......");
        for (Map.Entry<Integer, String> m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
