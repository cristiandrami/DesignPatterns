package main;

import pizza.Capricciosa;
import pizza.WholemealMargherita;

public class Main {
	public static void main(String[] args) {
		Capricciosa capricciosa= new Capricciosa();
		String pizza1=capricciosa.preparePizza();
		System.out.println(pizza1);
		
		WholemealMargherita margherita= new WholemealMargherita();
		String pizza2=margherita.preparePizza();
		System.out.println(pizza2);
	}

}
