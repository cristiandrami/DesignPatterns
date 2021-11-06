package products;

public class DashedCircle implements Circle, Cloneable {

		private String form="circle";
	public void printForm() {
		System.out.println(form);

	}

	public Circle cloneForm() {
		try {
			DashedCircle c= (DashedCircle) clone();
			c.form=c.form+"cl";
			return c;
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		return null;
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}

}
