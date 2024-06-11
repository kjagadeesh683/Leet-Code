public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int left = 0;
        int right = 1;
        int maxProfit = 0;
        while (right < prices.length) {
            if (prices[left] < prices[right]) {
                maxProfit = Math.max(maxProfit, prices[right] - prices[left]);
            } else {
                left = right;
            }
            right++;
        }
        return maxProfit;
    }
}

// another approach

// if(prices.length == 0) return 0;
// int maxProfit = 0, minPrice = Integer.MAX_VALUE;
// for(int i = 0; i < prices.length; i++) {
//     minPrice = Math.min(minPrice, prices[i]);
//     maxProfit = Math.max(maxProfit, prices[i] - minPrice);
// }
// return maxProfit;

//brute force approcah

// int maxProfit = 0;
// for(int i = 0; i < prices.length; i++) {
//     for(int j = i + 1; j < prices.length; j++) {
//         if(prices[j] > prices[i]) {
//             maxProfit = Math.max(maxProfit, prices[j] - prices[i]);
//         }
//     }
// }
// return maxProfit;

