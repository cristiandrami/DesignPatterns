package prototype;

public class Square implements Form, Cloneable {
	
	String form="square";
	public void drawForm() {
		System.out.println(form);
		
	}

	public Form cloneForm() {

		Square prototype;
		try {
			prototype = (Square) clone();
			prototype.form=form+"prot";
			return prototype;
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	 public Object clone() throws CloneNotSupportedException
	 {
	        return super.clone();
	 }

}
	
