package pizza;

public abstract class PizzaTemplate {

	public PizzaTemplate() {
		// TODO Auto-generated constructor stub
	}
	
	protected String pizza="Pizza:";
	
	protected abstract void addIngredients();
	protected void addTomato() { pizza+= "\ntomato";}
	protected void addMozzarella() {pizza+= "\nmozzarella";}
	protected abstract void addDough();
	
	public String preparePizza() {
		addDough();
		addTomato();
		addMozzarella();
		addIngredients();
		
		
		return pizza; }
	
	
}
