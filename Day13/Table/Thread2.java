package Table;

public class Thread2 extends Thread {
    table t;

    Thread2(table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(100);
    }

}
