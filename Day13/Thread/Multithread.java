// *Java Thread Example by extending Thread class * //
package Thread;

public class Multithread {
    public static void main(String[] args) {
        Multi t0 = new Multi();
        t0.start(); // Multi // Start -> Run
        Multi1 t1 = new Multi1();
        t1.start(); // Multi1 //Start- > Run
        Multi2 t2 = new Multi2();
        t2.start(); // Multi 2 // Start-> Run

        // Second Way ....//
        Multi3 m3 = new Multi3();
        Thread t3 = new Thread(m3);
        t3.start();

    }
}
