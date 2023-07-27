package listInterface2;

import java.util.ArrayList;
import java.util.List;

public class list2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10); //10,20,10,30,40,10
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);
        numbers.add(40);
        numbers.add(10);

        int index = numbers.indexOf(10);
        System.out.println("the first occurrence of 10 is at index :"+index); //print 0
        int lastIndex = numbers.lastIndexOf(10);
        System.out.println("The last occurrence of 10 is at index :"+lastIndex); // print 5
        int index1 = numbers.indexOf(50);
        System.out.println("The first occurrence of 50 is at index " +index1); // print -1

        
    }
}
