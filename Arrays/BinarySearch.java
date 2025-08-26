package Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        int key = 60;
        BSearch(arr, key);
    }

    public static void BSearch(int arr[], int key) {
        int left = 0;
        int right = arr.length - 1;
        boolean flag=false;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (key == arr[mid]) {
                System.out.println(mid);
                flag = true;
                break;
            }

            if (key < arr[mid]) {
                right = mid - 1;
            } else if (key > arr[mid]) {
                left = mid + 1;
            }

        }
        if (flag == false) {
            System.out.println("not found");
        }
        
    }
}
