package message;

public class A4Page extends Page {
	public A4Page(String message) {
		super(message);
		super.type=PageUtil.A4;
	}
	
	public String getType()
	{
		return super.type;
	}
	public String getMessage()
	{
		return super.message;
	}
	@Override
	public String getPageType() {
		return super.type;
	}


	
}
