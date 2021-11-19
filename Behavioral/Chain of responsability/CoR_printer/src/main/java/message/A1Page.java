package message;

public class A1Page extends Page {
	public A1Page(String message) {
		super(message);
		super.type=PageUtil.A1;
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