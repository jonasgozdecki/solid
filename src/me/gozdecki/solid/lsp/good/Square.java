package me.gozdecki.solid.lsp.good;
/*
 * Extending and using parent's constructor to set the square in order to be substitutable for it's base/parent class.
 * 
 * */
public class Square extends Rectangle{
		
    public Square(double side) {
		super(side, side);
	}	
	
}
