package Arrays;

public class SubArrays {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };
        FindSubArray(arr);
    }

    public static void FindSubArray(int[] arr) {

        for (int i = 0; i < arr.length-1; i++) {
            int start = i;
            for (int j = i; j < arr.length-1; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.println("("+arr[start]+","+arr[end]+")");
                }
            }
        }
    }
}
