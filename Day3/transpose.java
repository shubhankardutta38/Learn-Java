public class transpose {
    public static void main(String[] args) {

        int[][] matrix = { { 2, 3, 4 }, { 5, 6, 4 } };
        for (int[] row : matrix) {
            System.out.println(row + " ");
        }
        System.out.println("The matrix is :");
        for(int [] row : matrix) //{2,3,4}
        {
            for (int column : row)
            {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}
