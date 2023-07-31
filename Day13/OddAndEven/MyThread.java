package OddAndEven;

class MyThread extends Thread {
    Table1 t;

    MyThread(Table1 obj) {
        this.t = obj;
    }

    public void run() {
        t.printTable1(50);
    }
}