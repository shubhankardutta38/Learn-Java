package OddAndEven;

public class Table1 {
    void printTable1(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % 2 == 1) // ODD
                System.out.println(i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

        }
    }
}
