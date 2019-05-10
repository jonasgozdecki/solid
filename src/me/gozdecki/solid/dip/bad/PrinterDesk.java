package me.gozdecki.solid.dip.bad;
/*
 * High-level class depending on Low-level class.
 * 
 * */
public class PrinterDesk {
	private DotMatrixPrinterPrinter printer;

	public PrinterDesk(DotMatrixPrinterPrinter printer) {
		super();
		this.printer = printer;
	}
	
	
	public void printFile(){
		printer.print("File Content");
	}
	
}
