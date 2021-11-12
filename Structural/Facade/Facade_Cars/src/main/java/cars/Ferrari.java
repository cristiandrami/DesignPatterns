package cars;

public class Ferrari extends Car{
	public Ferrari() {
		super();
		super.name="Ferrari";
		super.model= "portofino";
		super.displacement="5000";
		super.weight=1150;
		
		
	}
	@Override
	public void printInfo() {
		System.out.println("name "+ name+ "\nmodel "+ model + "\ndisplacement "+ displacement+ "\nweight "+weight);
		
	}


}
