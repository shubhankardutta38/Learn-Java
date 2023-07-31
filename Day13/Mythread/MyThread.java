package Mythread;

class MyThread {
    public static void main(String args[]) {
        Runnable r1 = new MyThread2();
        Thread th1 = new Thread(r1, "THREAD1");
        th1.start();
        String str = th1.getName();
        System.out.println(str);
        Thread th2 = new Thread(r1, "THREAD2");
        th2.start();
        String str2 = th2.getName();
        System.out.println(str2);

    }

}