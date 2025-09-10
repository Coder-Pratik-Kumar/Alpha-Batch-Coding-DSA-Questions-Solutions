import java.util.*;

public class Search_In_2D_Array {
    public static void main(String[] args) {

        int[][] matrix = new int[3][3];
        Scanner sc = new Scanner(System.in);

        int row = matrix.length;
        int col = matrix[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int key = sc.nextInt();
        System.out.println(search(matrix, key));
    }

    public static boolean search(int matrix[][], int key) {
        int row = matrix.length;
        int col = matrix[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (key == matrix[i][j]) {
                    System.out.println("Element found at index "+"("+i+" , "+j+")");
                    return true;
                }
            }
        }
        return false;
    }
}
