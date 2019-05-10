package me.gozdecki.solid.dip.good;
/*
 * Using Printer interface on constructor instead of Low-level class. 
 * 
 * */
public class PrinterDesk {
	private Printer printer;

	public PrinterDesk(Printer printer) {
		super();
		this.printer = printer;
	}
	
	
	public void printFile(){
		printer.print("File Content");
	}
	
}
