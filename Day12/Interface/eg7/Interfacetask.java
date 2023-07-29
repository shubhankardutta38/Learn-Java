package Interface.eg7;

interface adder {
    public int add(int a, int b);
}

interface multiply {
    public int mul(int a, int b);
}

public class Interfacetask {
    public static void main(String[] args) {
        adder s1 = (a, b) -> {
            return (a + b);
        };

        multiply s2 = (a, b) -> {
            return (a * b);
        };

        int x = s1.add(2, 6);
        int y = s2.mul(6, 6);
        System.out.println("Add :" + x);
        System.out.println("Multiply :" + y);
    }
}
