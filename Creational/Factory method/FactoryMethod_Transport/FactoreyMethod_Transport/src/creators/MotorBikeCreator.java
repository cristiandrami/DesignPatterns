package creators;

import products.MotorBike;
import products.Product;

public class MotorBikeCreator implements Creator{

	@Override
	public Product create() {
		return new MotorBike();
	}
	
}
