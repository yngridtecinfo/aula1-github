package util;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	
	public static double payToDollar(double priceDollar, int quantDollar) {
		double priceDollarWithIOF = priceDollar + (priceDollar * IOF);
		return priceDollarWithIOF * quantDollar;
	}

}
