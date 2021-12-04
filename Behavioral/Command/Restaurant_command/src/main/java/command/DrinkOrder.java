package command;

import receiver.Barman;
import receiver.Worker;

public class DrinkOrder extends Order{

	public DrinkOrder(Barman worker) {
		super(worker);
	}

	public void placeOrder() {
		worker.executeOrder();
		
	}

}
