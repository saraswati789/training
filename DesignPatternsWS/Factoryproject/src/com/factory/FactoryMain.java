package com.factory;

public class FactoryMain {

	public static void main(String[] args) {

		CurrencyFactory factory = new CurrencyFactory();
		Currency c1 = factory.getCurrency("India");
		System.out.println("\nDetails for India");
		System.out.println(c1.getSymbol());
		System.out.println(c1.getDollarValue());
		
		System.out.println("\nDetails for Singapore");
		Currency c2 = CurrencyFactory.getCurrency("singapore");
		System.out.println(c2.getSymbol());
		System.out.println(c2.getDollarValue());
		
		System.out.println("\nDetails for Japan");
		Currency c3 = CurrencyFactory.getCurrency("japan");
		System.out.println(c3.getSymbol());
		System.out.println(c3.getDollarValue());
		
		
		System.out.println("\nDetails for China");
		Currency c4 = CurrencyFactory.getCurrency("china");
		System.out.println(c4.getSymbol());
		System.out.println(c4.getDollarValue());

	}

}
