package me.gozdecki.solid.lsp.bad;

/*
 * Methods breaking parents class definitions
 * 
 * */
public class Square extends Rectangle{
	
	@Override
	public void setHeight(double height) {
		super.setHeight(height);
		super.setWidth(height);
	}
	
	@Override
	public void setWidth(double width) {
		super.setHeight(width);
		super.setWidth(width);
	}

}
