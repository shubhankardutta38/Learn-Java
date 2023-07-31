package Table;

public class TestSynchronization {
    public static void main(String[] args) {
        table obj = new table();
        Thread1 t1 = new Thread1(obj);
        t1.start();
        
        Thread2 t2 = new Thread2(obj);
        t2.start();
    }
}

