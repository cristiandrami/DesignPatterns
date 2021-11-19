package message;

public class A6Page extends Page {
	public A6Page(String message) {
		super(message);
		super.type=PageUtil.A6;
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