package command;

import receiver.Chef;
import receiver.Worker;

public class FoodOrder extends Order{

	public FoodOrder(Chef worker) {
		super(worker);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void placeOrder() {
			super.worker.executeOrder();
	}

}
