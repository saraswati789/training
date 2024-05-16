package com.strategy;

public class StrategyMain {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		
		cart.addItem(new Item(11,"Laptop",45000));
		cart.addItem(new Item(22,"Pendrive", 500));
		cart.addItem(new Item(44,"Headphones",2500));
		
		System.out.println("Total cost to pay: "+cart.calculateCost());
		
	//	CODPaymentStrategy strategy = new CODPaymentStrategy();
		
		CreditCardPaymentStrategy strategy = new CreditCardPaymentStrategy("Ramana Reddy", "123456789", "999");
		
		cart.pay(strategy);

	}

}
