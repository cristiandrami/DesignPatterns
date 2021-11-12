package cars;

public class Bmw extends Car{
	public Bmw() {
		super();
		super.name="Bmw";
		super.model= "m1";
		super.displacement="2000";
		super.weight=950;
		
		
	}
	@Override
	public void printInfo() {
		System.out.println("name "+ name+ "\nmodel "+ model + "\ndisplacement "+ displacement+ "\nweight "+weight);
		
	}

}
