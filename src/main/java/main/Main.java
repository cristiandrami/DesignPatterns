package main;

import products.Circle;
import products.Square;
import products.Triangle;
import prototypes.PrototypeDashedManager;
import prototypes.PrototypeManager;

public class Main {
	public static void main(String[] args) {
		Triangle t;
		Square s;
		Circle c;
		
		PrototypeManager p= new PrototypeDashedManager();
		
		c=p.getCircle().cloneForm();
		s=p.getSquare().cloneForm();
		t= p.getTriangle().cloneForm();
		
		c.printForm();
		s.printForm();
		t.printForm();
		
		
	}
}
