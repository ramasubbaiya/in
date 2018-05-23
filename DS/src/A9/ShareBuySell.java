package A9;

/**
 *
 * Say you have an array for which the ith element 
 * is the price of a given stock on day i.
 * If you were only permitted to complete at most one transaction 
 * (ie, buy one and sell one share of the stock), 
 * design an algorithm to find the maximum profit.
 * @author Rama
 *
 */
public class ShareBuySell {

	public static int maxProfit(int[] prices) {
		int maxProfit = 0;
		int minPrice = Integer.MAX_VALUE;
		for(int i = 0; i < prices.length; i++) {
			minPrice = Math.min(minPrice, prices[i]);
			maxProfit = Math.max(maxProfit, prices[i] - minPrice);
		}
		return maxProfit;
	}
	
	public static void main(String[] args) {
		/**
		 * max. difference = 6-1 = 5 (not 7-1 = 6, as selling price needs to be larger than buying price)
		 * Result : 5
		 */
		System.out.println("" + maxProfit(new int[]{7,1,5,3,6,4}));
		
		/**
		 * In this case, no transaction is done, i.e. max profit = 0.
		 * Result : 0
		 */
		System.out.println("" + maxProfit(new int[]{7,6,4,3,1}));
	}
}
