package prototypes;

import factories.DashedDrawer;
import factories.Drawer;
import products.Circle;
import products.Square;
import products.Triangle;

public class PrototypeDashedManager implements PrototypeManager {

	private Drawer d= new DashedDrawer();
	private Triangle t;
	private Circle c;
	private Square s;
	
	public PrototypeDashedManager()
	{
		t=d.getTriangle();
		c=d.getCircle();
		s=d.getSquare();
	}
	
	public Triangle getTriangle() {
		return t;
	}

	public Square getSquare() {
		return s;
	}

	public Circle getCircle() {
		return c;
	}

}
