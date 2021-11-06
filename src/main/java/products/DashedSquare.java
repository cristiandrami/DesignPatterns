package products;

public class DashedSquare implements Square, Cloneable{

	private String form="Square";
	
	public void printForm() {
		System.out.println(form);
		
	}

	public Square cloneForm() {
		try {
				DashedSquare s= (DashedSquare) clone();
				s.form=s.form+"cl";
			return s;
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
