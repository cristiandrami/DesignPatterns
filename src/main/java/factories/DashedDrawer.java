package factories;

import products.Circle;
import products.DashedCircle;
import products.DashedSquare;
import products.DashedTriangle;
import products.Square;
import products.Triangle;

public class DashedDrawer implements Drawer {

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
