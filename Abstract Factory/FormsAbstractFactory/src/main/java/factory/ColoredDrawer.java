package factory;

import java.io.InputStream;

import product.Circle;
import product.ColoredCircle;
import product.ColoredSquare;
import product.ColoredTriangle;
import product.Square;
import product.Triangle;

public class ColoredDrawer implements DrawerFactory{

	private static ColoredDrawer drawer=null;
	
	private ColoredDrawer(){}
	
	public static ColoredDrawer getInstance() {
		if(drawer==null)
			drawer=new ColoredDrawer();
		return drawer;
		
	}

	public Triangle getTriangle() {
		return new ColoredTriangle();
	}

	public Square getSquare() {
		return new ColoredSquare();
	}

	public Circle getCircle() {
		return new ColoredCircle();
	}


}
