package main;

import command.DrinkOrder;
import command.FoodOrder;
import invoker.Waiter;
import receiver.Barman;
import receiver.Chef;

public class Main {

	public static void main(String[] args) {
		Barman cristian = new Barman();
		DrinkOrder drinkOrder= new DrinkOrder(cristian);
		Waiter waiter1 = new Waiter(drinkOrder);
		
		Chef francesco = new Chef();
		FoodOrder foodOrder= new FoodOrder(francesco);
		Waiter waiter2 = new Waiter(foodOrder);
		
		
		waiter1.sendRequest();
		waiter2.sendRequest();
		

	}

}
