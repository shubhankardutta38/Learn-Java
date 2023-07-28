package HashMap.std;

import java.util.Hashtable;

public class std {
    public static void main(String[] args) {
        Hashtable<String, Integer> ht = new Hashtable<>();
        ht.put("Vishnu", 10);
        ht.put("Vishal", 20); 
        ht.put("Sachin", 30); 

        System.out.println("Size of map is : " + ht.size());
        System.out.println(ht);

        if (ht.containsKey("Vishal")) {
            Integer a = ht.get("Vishal");
            System.out.println("Value for the key \"Vishal\" is: " + a);
        }
    }
}
