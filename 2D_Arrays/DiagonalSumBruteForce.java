public class DiagonalSumBruteForce {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        int sum = CalculateDiagonalSum(matrix);
        System.out.println(sum);
    }

    public static int CalculateDiagonalSum(int matrix[][]) {
        int sum = 0;

        int row = matrix.length;
        int col = matrix[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                //for Primary Diagonal
                if (i == j) {
                    sum += matrix[i][j];
                }
                //for secondary diagonal
                if (i + j == matrix.length - 1) {
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }
}
