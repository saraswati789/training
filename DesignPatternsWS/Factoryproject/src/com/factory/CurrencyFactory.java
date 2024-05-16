package com.factory;

public class CurrencyFactory {

	// returns object of a class which implements Currency interface
	
	public  static Currency getCurrency(String country) {
		
		switch (country.toLowerCase()) {
		case "india":
			return new CurrencyObj("Rs",83.4);
		case "singapore":
			return new  CurrencyObj("SGD",3.2);
		case "japan":
			return new  CurrencyObj("Yen", 4.5);

		default:
			throw new IllegalArgumentException("No such Country in database ");
		}

	}

	 private static class CurrencyObj implements Currency {
		
		String symbol;
		double rate;

		
		public CurrencyObj(String symbol, double rate) {
			super();
			this.symbol = symbol;
			this.rate = rate;
		}

		public String getSymbol() {
			return symbol;
			
		}

		public double getDollarValue() {
			return rate;
		}
	}

}
