package main;

import application.Apple;
import application.Book;
import application.Box;
import application.Candy;
import application.Component;
import application.Toy;

public class Main {
	public static void main(String[] args) {
		Component mainComp= new Box();
		mainComp.addComponent(new Toy());
		Component box= new Box();
		box.addComponent(new Book());
		box.addComponent(new Candy());
		
		mainComp.addComponent(box);
		
		mainComp.showComponent();
		
		Candy c= new Candy();
		c.addComponent(box);
		
	}

}
