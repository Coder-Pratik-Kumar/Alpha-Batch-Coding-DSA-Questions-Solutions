package Arrays;

public class DistinctElementBruitForce {
    public static void main(String[] args) {
        int[] arr = { 1,1,1,3,3,4,3,2,4,2 };
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    flag = true;
                    break;
                }
            }
        }
        if (flag == true) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
