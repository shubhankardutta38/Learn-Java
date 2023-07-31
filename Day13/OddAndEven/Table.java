package OddAndEven;

class Table {
    void printTable(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % 2 == 0) // Even
                System.out.println(i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

        }
    }
}
