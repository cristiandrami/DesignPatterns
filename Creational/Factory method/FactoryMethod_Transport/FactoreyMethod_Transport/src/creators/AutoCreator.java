package creators;

import products.Auto;
import products.Product;

public class AutoCreator implements Creator {
	@Override
	public Product create() {
		return new Auto();
	}
}
