package Arrays;

public class SubArrays {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };
        FindSubArray(arr);
    }

    public static void FindSubArray(int[] arr) {
       
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                int sum = 0;
                for (int k = start; k <= end; k++) {
                    sum += arr[k];
                    System.out.print(arr[k] + " ");
                }
                System.out.println(sum);
            }
            System.out.println();
        }
    }
}
