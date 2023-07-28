package HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapexm4 {
    public static void main(String args[]) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Mango");
        map.put(2, "Apple");
        map.put(3, "Banana");
        map.put(4, "Grapes");
        map.putAll(map);
        System.out.println("Iterating HashMap....");
        for (Map.Entry<Integer, String> m : map.entrySet()) {
            System.out.println(m.getKey() + "" + m.getValue());
        }
        System.out.println("Value for the key 1" + map.get(1));
        System.out.println("Value for the key 103 " + map.get(103));

        map.remove(2);
        System.out.println("Iterting HashMap(Remove 2)...");
        for (Map.Entry<Integer, String> m : map.entrySet()) {
            System.out.println(m.getKey() + "" + m.getValue());
        }
        map.remove(3, "Banana");
        System.out.println("Iterating hashMap(Remove 3)...");
        for (Map.Entry<Integer, String> m : map.entrySet()) {
            System.out.println(m.getKey() + "" + m.getValue());
        }
        map.replace(1, "Mango", "Ayush");
        System.out.println("Iterating HashMap(After Replace)...");
        for (Map.Entry<Integer, String> m : map.entrySet()) {
            System.out.println(m.getKey() + "" + m.getValue());
        }
        map.replaceAll((k, v) -> "Ajay");
        System.out.println("Iterating Hashmap......");
        for (Map.Entry<Integer, String> m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}