public class DiagonalSumOptimize {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        int sum = Calculate(matrix);
        System.out.println(sum);
    }

    public static int Calculate(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            //pd
            sum += matrix[i][i];

            //sd
            //i+j=n-1     j=n-i-1
            if (i != matrix.length - i - 1) {
                sum += matrix[i][matrix.length - i - 1];
            }
        }
        return sum;
    }
}
