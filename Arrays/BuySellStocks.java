package Arrays;

public class BuySellStocks {
    public static void main(String[] args) {
        int arr[] = { 7, 1, 5, 3, 6, 4 };
        int maxProfit = MaxProfit(arr);
        System.out.println(maxProfit);
    }

    public static int MaxProfit(int[] arr) {
        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            int sellingPrice=arr[i];
            if(buyPrice<sellingPrice){
                int profit = sellingPrice - buyPrice;
                maxProfit = Math.max(profit, maxProfit);
            } else {
                buyPrice = sellingPrice;
            }
        }
        return maxProfit;
    }
}
