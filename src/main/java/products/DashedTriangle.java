package products;

public class DashedTriangle implements Triangle, Cloneable{

	private String form="triangle";
	public void printForm() {
		System.out.println(form);

	}

	public Triangle cloneForm() {
		try {
				DashedTriangle t= (DashedTriangle) clone();
				t.form=t.form+"cl";
				return t;
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
