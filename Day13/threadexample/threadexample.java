package threadexample;

import java.util.*;

public class threadexample {
    public static void main(String[] args) throws InterruptedException {
        final PC pc = new PC();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        // create nother thread object that calls
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        t2.start();
        // t1 finishes before t2
        t1.join();
        t2.join();
    }

    public static class PC {
        public void produce() throws InterruptedException {
            synchronized (this) {
                System.out.println("Produce thread running");
                // releases the lock on share resource
                wait();
                System.out.println("Resumed...");
            }
        }

        public void consume() throws InterruptedException {
            Thread.sleep(1000);
            Scanner s = new Scanner(System.in);
            synchronized (this) {
                System.out.println("Waiting for return key. \nEnter any key : ");
                s.nextLine();
                System.out.println("Return key pressed");
                notify();
                // *Sleep
                Thread.sleep(2000);
            }
            s.close();
        }
    }
}

//*Shubhankar Dutta */
//*20201CAI0115 */
