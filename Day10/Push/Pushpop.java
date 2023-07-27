package Push;

import java.util.*;

public class Pushpop {
    public static void main(String[] args) {
        Stack<String> stack1 = new Stack<String>();
        System.out.println("Is the stack " + stack1.empty());
        stack1.push("Ayush");
        stack1.push("yash");
        stack1.push("Anush");
        stack1.push("Anish");
        stack1.push("jaysh");
        System.out.println("Data in stack 1" + stack1);
        System.out.println("Is the stack empty" + stack1.peek());
        stack1.pop();
        System.out.println("Elements on the stack1" + stack1);
        System.out.println("element on the top of the stack " + stack1.peek());
        System.out.println("is ur stack empty " + stack1.empty());
        //System.out.println("does this have Anush" + stack1.search("Anush"));
        Iterator<String> itr = stack1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
