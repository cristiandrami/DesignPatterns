package factories;

import products.Circle;
import products.Square;
import products.Triangle;

public interface Drawer {
	public Triangle getTriangle();
	public Square getSquare();
	public Circle getCircle();
	
}
