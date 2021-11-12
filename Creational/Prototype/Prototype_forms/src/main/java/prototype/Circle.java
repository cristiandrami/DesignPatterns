package prototype;

public class Circle implements Form, Cloneable{

	String form="circle";
	public void drawForm() {
		System.out.println(form);
		
	}

	public Form cloneForm() {

		Circle prototype;
		try {
			prototype = (Circle) clone();
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
