package command;

import receiver.Worker;

public abstract class Order {
	protected Worker worker;
	
	public Order(Worker worker) {
		super();
		this.worker = worker;
	}

	public abstract void placeOrder();

}
