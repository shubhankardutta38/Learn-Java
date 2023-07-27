package TestJavaCollection;
import java.util.*;
public class TestCollection2 {
    public static void main(String[] args) {
        Vector<String> v = new Vector<String>();
        //List<String> v = new Vector<String>();
        v.add("Ayush");
        v.add("Amit");
        v.add("Ashish");
        v.add("Garima");
        v.addElement("Rohith");
        System.out.println(v.capacity());

        String s1 = v.firstElement();
        System.out.println("First Element in the List "+s1);
        
        String s2 = v.lastElement();
        System.out.println("Last element in the list"+s2);
        Iterator<String> itr = v.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
