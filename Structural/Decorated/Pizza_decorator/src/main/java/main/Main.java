package main;

import decorator.PizzaDecorator;
import decorator.PizzaHamDecorator;
import decorator.PizzaMargherita;
import decorator.PizzaOliveDecorator;

public class Main {
	public static void main(String[] args) {
		PizzaMargherita margherita= new PizzaMargherita();
		margherita.printIngrediants();
		System.out.println("****************************************************");
		PizzaDecorator decorator = new PizzaOliveDecorator(margherita);
		decorator.printIngrediants();
		System.out.println("****************************************************");
		decorator = new PizzaHamDecorator(margherita);
		decorator.printIngrediants();
		System.out.println("****************************************************");
		System.out.println("****************************************************");
		
		System.out.println("now mix them");
		
		
		decorator= new PizzaHamDecorator(new PizzaOliveDecorator(margherita));
		decorator.printIngrediants();
		
	}

}
