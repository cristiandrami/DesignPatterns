package decorator;

public class PizzaDecorator implements Pizza {

	public PizzaDecorator(Pizza pizza)
	{
		this.pizza=pizza;
	}
	
	protected Pizza pizza;
	
	public void printIngrediants() {
		pizza.printIngrediants();

	}

}
