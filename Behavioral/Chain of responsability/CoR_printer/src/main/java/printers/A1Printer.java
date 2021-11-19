package printers;

import message.Page;
import message.PageUtil;

public class A1Printer extends Printer{

	public A1Printer() {
		super();
		super.nextPrinter= new A4Printer();
		
	}
	@Override
	public void printMessage(Page page) {
		System.out.println("sono una stampante a1");
		if(page.getPageType().equals(PageUtil.A1) )
			System.out.println(" il messaggio è : " + page.getMessage()+"\n");
		else
		{
			System.out.println(" non posso stamparlo, lo invio ad un'altra stampante\n " );
			nextPrinter.printMessage(page);
		}
		
	}
	
	
	



}