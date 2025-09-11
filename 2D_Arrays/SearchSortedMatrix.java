public class SearchSortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        int key = 15;
        Search(matrix, key);
    }

    public static boolean Search(int matrix[][], int key) {
        int n = matrix.length;
        // int row = 0;
        // int col = n - 1;

        // while (row < n && col >= 0) {
        //     if (key == matrix[row][col]) {
        //         System.out.print(row + "," + col);
        //         return true;
        //     } else if (key > matrix[row][col]) {
        //         row++;
        //     } else {
        //         col--;
        //     }
        // }
        int row = n - 1;
        int col = 0;
        while (row >= 0 && col < matrix[0].length) {
            if (key == matrix[row][col]) {
                System.out.print(row + "," + col);
                return true;
            }
            else if (key > matrix[row][col]) {
                col++;
            }
            else {
                row--;
            }
        }
        System.out.println("not found");
        return false;
    }
}
