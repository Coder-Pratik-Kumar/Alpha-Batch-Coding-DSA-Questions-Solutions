package Arrays;

import java.util.*;
public class DistinctElementUsingHashSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        int arr[] = { 1, 2, 3, 1 };

        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                System.out.println(true);
            } else {
                set.add(arr[i]);
            }
        }
        
    }
}
