public class MatrixTranspose {

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Call the method to find the transpose of the matrix
        int[][] transposeMatrix = findTranspose(matrix);

        // Print the original matrix
        System.out.println("Original Matrix:");
        printMatrix(matrix);

        // Print the transpose matrix
        System.out.println("Transpose Matrix:");
        printMatrix(transposeMatrix);
    }

    public static int[][] findTranspose(int[][] mat) {
        int rows = mat.length;
        int columns = mat[0].length;

        int[][] transpose = new int[columns][rows];

        // Compute the transpose matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transpose[j][i] = mat[i][j];
            }
        }

        return transpose;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
