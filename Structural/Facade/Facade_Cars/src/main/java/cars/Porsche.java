package cars;

public class Porsche extends Car{

	
	
	public Porsche() {
		super();
		super.model= "911";
		super.displacement="3000";
		super.weight=1250;
		
		
	}
	@Override
	public void printInfo() {
		System.out.println("name "+ name+ "\nmodel "+ model + "\ndisplacement "+ displacement+ "\nweight "+weight);
		
	}

	
}
