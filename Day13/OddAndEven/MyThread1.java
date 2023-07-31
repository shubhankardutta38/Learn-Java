package OddAndEven;

public class MyThread1 extends Thread {
    Table t;

    MyThread1(Table obj1) {
        this.t = obj1;
    }

    public void run() {
        t.printTable(50);
    }
}