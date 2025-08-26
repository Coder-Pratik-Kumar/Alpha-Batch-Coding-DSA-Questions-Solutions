package Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        int key = 60;
        int index = Search(arr, key);
        if (index == -1) {
            System.out.println("Not Found");
        }
        else {
            System.out.println("key value is found at position :- " + index);
        }
    }
    public static int Search(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
