package TestGenerics;
import java.util.*;

public class TestGenerics1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Rahul");
        list.add("Jay");
        list.add("Shubhankar");
        list.add("Pramad");
        list.add("Ayush");
        list.add("LOL");
        list.add("OP");
        list.add("GG");
        list.add("XD");
        list.add("C");

        System.out.println("How many elements on the Array List : "+list.size());
        String s = list.get(6);
        System.out.println("Element is:"+s);

        System.out.println("Iterate across the data");
        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
