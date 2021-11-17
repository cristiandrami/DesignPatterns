package pizza;

public class WholemealMargherita extends PizzaTemplate{
	
	public WholemealMargherita() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void addIngredients() {
		super.pizza+="\nbasil";
		
	}

	@Override
	protected void addDough() {
		super.pizza+="\nwholemeal dough";
		
	}
	

}
