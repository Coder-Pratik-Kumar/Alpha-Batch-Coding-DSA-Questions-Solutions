
import java.util.*;
public class ArrayBasics{
    public static void main(String[] args) {
        //Creation
        int[] arr = new int[5];
        //OR
        int[] arr2 = { 1, 2, 3 };

        //input the values
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        //output
        System.out.println(arr[0]);
        System.out.println(arr[1]);

        arr[2] = arr[2] + 1;
        System.out.println(arr[2]);
        //User Input
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int values : arr) {    //foreach loop
            System.out.println(values);
        }
    }
}