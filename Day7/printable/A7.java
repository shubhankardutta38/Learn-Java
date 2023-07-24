package printable;

interface printable {
    void print();
}

interface showable {
    void print();
}

class A6 implements printable, showable {
    public void print() {
        System.out.println("Hello(printable)");
    }

    public void show() {
        System.out.println("Welcome(showable)");
    }
}

class A7 {
    public static void main(String args[]) {
        A6 obj = new A6();
        obj.print(); // printing printable
        obj.show(); //printing showable
    }
}
