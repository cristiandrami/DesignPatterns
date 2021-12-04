package invoker;

import command.Order;

public class Waiter {
	
	private Order order;
	
	public Waiter(Order order) {
		this.order=order;
	}
	
	public void sendRequest() {
		order.placeOrder();
	}
	

}
