package prototype;

public class Triangle implements Form, Cloneable{
	String form="triangle";
	public void drawForm() {
		System.out.println(form);
		
	}

	public Form cloneForm() {

		Triangle prototype;
		try {
			prototype = (Triangle) clone();
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
