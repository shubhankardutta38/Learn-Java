package Table;

public class Thread1 extends Thread {
    table t;

    Thread1(table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(5);
    }

}
