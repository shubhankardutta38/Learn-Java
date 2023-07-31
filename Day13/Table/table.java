package Table;

public class table {
    void printTable(int n) {
        for (int i = 1; i <= 10; i++) { // 10 times
            System.out.println(n * i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
