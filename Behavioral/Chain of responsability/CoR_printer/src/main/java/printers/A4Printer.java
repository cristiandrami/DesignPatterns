package printers;

import message.Page;
import message.PageUtil;

public class A4Printer extends Printer{

	public A4Printer() {
		super();
		nextPrinter= new A6Printer();
		
	}
	@Override
	public void printMessage(Page page) {
		System.out.println("sono una stampante a4");
		if(page.getPageType().equals(PageUtil.A4) )
			System.out.println(" il messaggio è : " + page.getMessage()+"\n");
		else
		{
			System.out.println(" non posso stamparlo, lo invio ad un'altra stampante\n " );
			nextPrinter.printMessage(page);
		}
		
	}
	
	
	



}
