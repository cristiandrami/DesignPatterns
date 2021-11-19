package printers;

import message.Page;
import message.PageUtil;

public class A6Printer extends Printer {
	public A6Printer() {
		super();
		
		
	}
	@Override
	public void printMessage(Page page) {
		System.out.println("sono una stampante a6");
		if(page.getPageType().equals(PageUtil.A6) )
			System.out.println(" il messaggio è : " + page.getMessage()+"\n");
		else
		{
			System.out.println(" non posso stamparlo, messaggio mal formato\n " );
			
		}
		
	}
	
	

}
