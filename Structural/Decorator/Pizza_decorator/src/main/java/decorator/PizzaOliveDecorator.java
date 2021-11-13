package decorator;

public class PizzaOliveDecorator extends PizzaDecorator{
	public PizzaOliveDecorator(Pizza pizza) {
		super(pizza);
	}

	@Override
	public void printIngrediants() {
		super.pizza.printIngrediants();
		System.out.println("olives");

	}
	

}
