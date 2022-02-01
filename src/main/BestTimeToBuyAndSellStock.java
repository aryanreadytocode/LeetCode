package main;

public class BestTimeToBuyAndSellStock {

    /*7,6,4,3,1*/
    /*public int maxProfit(int[] prices) {
        int i = 0, j =0, max = 0;
        for (i = 0; i<prices.length; i++){
            for (j = i+1; j<prices.length; j++) {
                int maxEx = prices[j]-prices[i];
                if (maxEx > max)
                    max = maxEx;
            }
        }
        return max;
    }*/

    public int maxProfit(int[] prices) {
        int listPriceSoFar = Integer.MAX_VALUE;
        int profit = 0;
        int profitToday = 0;
        int price;
        for(int i = 0; i<prices.length; i++) {
            price = prices[i];
            if (price<listPriceSoFar){
                listPriceSoFar = price;
            }
            profitToday = price-listPriceSoFar;
            if (profitToday>profit)
                profit = profitToday;
        }
        return profit;
    }

}
