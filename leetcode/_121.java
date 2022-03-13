
public class _121 {
    public static int maxProfit(int[] prices) {
        // int laiN = 0;
        int laiN = Integer.MAX_VALUE;
        int laiM = 0;
        // for (int i = 0; i < prices.length; i++) {
        //     int count = 0;
        //     while (i + 1 + count < prices.length) {
        //         laiN = prices[i + 1 + count] - prices[i];
        //         if (laiN > laiM) {
        //             laiM = laiN;
        //         }
        //         count++;
        //     }
        // }
        for (int i = 0; i < prices.length; i++) {
            if(prices[i]< laiN){
                laiN = prices[i];
            }else if (prices[i] - laiN > laiM ){
                laiM =prices[i] - laiN;
            }
        }
        return laiM;
    }

    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        System.out.println(maxProfit(prices));
    }
}
