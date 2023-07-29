// *Functional Interface
package Interface.eg2;

interface sayable {
    void say(String msg);

    default void show() {
        System.out.println("Show Method");
    }

    static void hello() {
        System.out.println("Hello");
    }
}

public class FunctionalInterfaceExample2 implements sayable {
    public void say(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        FunctionalInterfaceExample2 fie = new FunctionalInterfaceExample2();
        fie.say("Hello there");
        
        fie.show(); 
        sayable.hello(); 
    }
}
