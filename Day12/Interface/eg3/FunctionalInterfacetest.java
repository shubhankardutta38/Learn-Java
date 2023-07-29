package Interface.eg3;

interface Doable {
    default void dolt() {
        System.out.println("Do it Now...");
    }
}

interface Sayable extends Doable {
    void say(String msg); // abstract method
}

class FunctionalInterfaceExample3 implements Sayable {
    public void say(String msg) {
        System.out.println(msg);
    }
}

class FunctionalInterfacetest {
    public static void main(String[] args) {
        FunctionalInterfaceExample3 fie = new FunctionalInterfaceExample3();
        fie.say("Hello there");
        fie.dolt();
    }
}
