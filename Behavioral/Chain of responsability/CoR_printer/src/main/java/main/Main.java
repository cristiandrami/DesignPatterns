package main;

import message.A1Page;
import message.A4Page;
import message.A6Page;
import message.Page;
import printers.A1Printer;
import printers.Printer;

public class Main {
	public static void main(String[] args) {
		Page a4= new A4Page("sono un folgio a4");
		Page a1= new A1Page("sono un folgio a1");
		Page a6= new A6Page("sono un folgio a6");
		
		Printer printer= new A1Printer();
		
		printer.printMessage(a1);
		printer.printMessage(a4);
		printer.printMessage(a6);
		
	}

}
