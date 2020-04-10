package arrays;

public class StockBuyAndSell {

	public static void main(String[] args) {
		int stockprice[]= {4,8,1,10,19};
		int maxProfit= 0;
		for(int i=1;i<stockprice.length;i++) {
			if(stockprice[i]>stockprice[i-1])
				maxProfit = maxProfit+ stockprice[i]-stockprice[i-1];
		}
		System.out.println(maxProfit);
	}

}
