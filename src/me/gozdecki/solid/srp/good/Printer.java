package me.gozdecki.solid.srp.good;

/*
 * This class is specific to print.
 * 
 * */
public class Printer { 
	
	public void print(Printable printable) {
		System.out.println(printable.getContent());
	}

}
