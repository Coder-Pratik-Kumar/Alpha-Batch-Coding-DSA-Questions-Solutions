package Arrays;

public class KadanesAlgo {
    public static void main(String[] args) {
        int[] arr = { -2, -3, -4, -1, -2, -1, -5, -3 };
        int MaxSum = KadensMaxFunction(arr);
        System.out.println(MaxSum);
    }

    public static int KadensMaxFunction(int[] arr) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for (int i = 0; i < arr.length; i++) {
            //if all numbers are not negative some are negative then this logic will be work
            
            // cs = cs + arr[i];
            // if (cs < 0) {
            //     cs = 0;
            // }
            // ms = Math.max(cs, ms);
            
            // if all numbers are negative then 
            
            cs = Math.max(arr[i], cs + arr[i]);
            ms = Math.max(cs, ms);
        }
        return ms;
    }
}