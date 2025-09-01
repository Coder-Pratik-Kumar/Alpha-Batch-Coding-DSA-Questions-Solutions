package Arrays;

import java.util.*;
public class MaxSubarrayPrefixSolution {
    public static void main(String[] args) {
        int[] arr = { 2, -1, 6, 5, -2, -3 };
        int prefixCalculate[] = calculatePrefixArray(arr);
        System.out.println(Arrays.toString(prefixCalculate));
        int MaxSumSubArray = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                int curSum = start==0 ?prefixCalculate[end]: prefixCalculate[end] - prefixCalculate[start - 1];
                MaxSumSubArray = Math.max(curSum, MaxSumSubArray);
            }
        }
        System.out.println(MaxSumSubArray);
    }

    public static int[] calculatePrefixArray(int[] arr) {
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        return prefix;
    }
}
