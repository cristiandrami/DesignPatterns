package message;

public abstract class Page {
	protected String message="";
	protected String type="";

	
	public Page(String message) {
		this.message=message;
		
	}
	public abstract String getPageType();
	public abstract String getMessage();
	

}
