package OddAndEven;

public class Test {
    public static void main(String args[]) {
        Table1 obj = new Table1();
        MyThread t1 = new MyThread(obj);
        t1.start();
        
        Table obj1 = new Table();
        MyThread1 t2 = new MyThread1(obj1);
        t2.start();
    }

}
