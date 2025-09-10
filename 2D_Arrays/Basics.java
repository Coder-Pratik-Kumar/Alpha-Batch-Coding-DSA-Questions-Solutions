import java.util.*;
public class Basics {
    public static void main(String[] args) {
        //Creation
        int[][] matrix = new int[3][3];
        Scanner sc = new Scanner(System.in);

        int row = matrix.length;
        int col = matrix[0].length;

        //insert the value in matrix
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        
        //Display the matrix
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
