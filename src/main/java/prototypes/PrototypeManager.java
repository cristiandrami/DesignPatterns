package prototypes;

import products.Circle;
import products.Square;
import products.Triangle;

public interface PrototypeManager {
	public Triangle getTriangle();
	public Square getSquare();
	public Circle getCircle();

}
