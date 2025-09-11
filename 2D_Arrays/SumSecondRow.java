public class SumSecondRow {
    public static void main(String[] args) {
        int matrix[][] = {
                { 4, 7, 8 },
                { 8, 8, 7 },
                { 5, 7, 6 }
        };
        int sum = Sum(matrix);
        System.out.println(sum);
    }

    public static int Sum(int matrix[][]) {
        int sum = 0;
        int row = 1;
        for (int j = 0; j < matrix[0].length; j++) {
            sum += matrix[row][j];
        }
        return sum;
    }
}
