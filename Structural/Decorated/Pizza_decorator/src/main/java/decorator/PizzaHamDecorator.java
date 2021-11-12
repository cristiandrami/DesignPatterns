package decorator;

public class PizzaHamDecorator extends PizzaDecorator{
	
	
	public PizzaHamDecorator(Pizza pizza) {
		super(pizza);
	
	}

	@Override
	public void printIngrediants() {
		super.pizza.printIngrediants();
		System.out.println("ham");

	}

}
