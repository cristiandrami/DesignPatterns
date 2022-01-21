package mian;

import creators.AutoCreator;
import creators.Creator;
import creators.MotorBikeCreator;
import products.Product;

public class Main {

	public static void main(String[] args) {
		Creator creator = new AutoCreator();
		Product product;

		// NON SO A PRIORI QUALI OGGETTI DEVO CREARE, E IL CLIENT NON SA COME QUESTI
		// OGGETTI SONO FATTI E COME VENGONO CREATI
		
		product= creator.create();
		System.out.println(product.showInfo());
		
		creator= new MotorBikeCreator();
		product= creator.create();
		
		System.out.println(product.showInfo());

	}

}
