package pizza;

public class Capricciosa extends PizzaTemplate{

	public Capricciosa() {
		// TODO Auto-generated constructor stub
	}
	@Override
	protected void addIngredients() {
		
		super.pizza+="\nham";
		super.pizza+="\nmushrooms";
		super.pizza+="\nartichokes";
		super.pizza+="\nolives";
		
	}

	@Override
	protected void addDough() {
		super.pizza+="\nnormal dough";
		
	}

}
