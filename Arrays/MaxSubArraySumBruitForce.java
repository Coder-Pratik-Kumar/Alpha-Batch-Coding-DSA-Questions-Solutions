package Arrays;
                    
public class MaxSubArraySumBruitForce {
    public static void main(String[] args) {
        int[] arr = { 10,20,30,40,50 };
        MaxSum(arr);
    }

    public static void MaxSum(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int start = i;                      
            for (int j = i + 1; j < arr.length; j++) {
                int end = j;
                int sum = 0;
                for (int k = start; k <= end; k++) {
                    sum += arr[k];
                }
                System.out.println(sum);
                maxSum = Math.max(maxSum, sum);
            }
        }
        System.out.println("Maximum= "+maxSum);
    }
}