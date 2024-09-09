public class BuyAndSellStocks {
    public static void main(String[] args){
        int[] prices = {1,3,4,5,6,7};
       int result= maxProfit(prices);
       System.out.println(result);
    }
    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; 
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice; 
            }
        }

        return maxProfit; 
    }

}
