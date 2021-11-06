package factory;

import java.io.InputStream;

import product.Circle;
import product.Square;
import product.Triangle;
import product.UncoloredCircle;
import product.UncoloredSquare;
import product.UncoloredTriangle;

public class UncoloredDrawer implements DrawerFactory{
	private static UncoloredDrawer drawer=null;
	
	private UncoloredDrawer(){}
	
	public static UncoloredDrawer getInstance() {
		if(drawer==null)
			drawer=new UncoloredDrawer();
		return drawer;
		
	}

	public Triangle getTriangle() {
		return new UncoloredTriangle();
	}

	public Square getSquare() {
		return new UncoloredSquare();
	}

	public Circle getCircle() {
		return new UncoloredCircle();
	}
	
	


}
