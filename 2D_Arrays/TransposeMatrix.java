import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
        
        int matrix[][] = {
                { 4, 7, 8 },
                { 8, 8, 7 }
        };
        int matrixR[][] = Transpose(matrix);
        int row = matrixR.length;
        int col = matrixR[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrixR[i][j] + " ");
            }
            System.out.println();
        }
        
    }

    public static int[][] Transpose(int matrix[][]) {
        int row = matrix.length;
        int col=matrix[0].length;
        int matrixR[][] = new int[col][row];
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrixR[j][i] = matrix[i][j];
            }
        }
        return matrixR;
    }
}
