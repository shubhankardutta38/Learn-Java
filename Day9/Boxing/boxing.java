package Boxing;

public class boxing {
    static void m(int i){
        System.out.println("int");
    }

    static void m(Integer i){
        System.out.println("Integer");
    }

    public static void main(String[] args) {
        short s=20;
        m(s);
    }
}
