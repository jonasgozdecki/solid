package me.gozdecki.solid.ocp.good;

public class ElectronicDevice extends Product{

	@Override
	public double calculateTaxIncludedPrice() {
		
		return getBasePrice()*1.18;
	}

}
