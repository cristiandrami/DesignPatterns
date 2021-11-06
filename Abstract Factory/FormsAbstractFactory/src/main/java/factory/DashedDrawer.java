package factory;

import java.io.InputStream;

import product.Circle;
import product.DashedCircle;
import product.DashedSquare;
import product.DashedTriangle;
import product.Square;
import product.Triangle;

public class DashedDrawer implements DrawerFactory {
	
	private static DashedDrawer drawer=null;
	
	private DashedDrawer(){}
	
	public static DashedDrawer getInstance() {
		if(drawer==null)
			drawer=new DashedDrawer();
		return drawer;
		
	}

	public Triangle getTriangle() {
		return new DashedTriangle();
	}

	public Square getSquare() {
		return new DashedSquare();
	}

	public Circle getCircle() {
		return new DashedCircle();
	}
	

}
