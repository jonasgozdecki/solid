package me.gozdecki.solid.ocp.good;

import java.util.List;

/*
 * No more needed to be changed. Overriding methods care about specific prices and specific products that extend Product are product types.
 * 
 * */

public class ShoppingCartService {
	
	public double calculateTotalOrder(List<Product> products){		
		double orderTotal = 0;		
		
		for (Product product : products) {				
			orderTotal+=product.calculateTaxIncludedPrice();
		}		
		return orderTotal;
	}

}
