package printers;

import message.Page;

public abstract class Printer {

	protected Printer nextPrinter= null;
	public abstract void printMessage(Page page);
	
	public Printer() {
		// TODO Auto-generated constructor stub
	}
	
}
