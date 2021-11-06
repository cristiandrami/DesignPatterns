package factory;

import java.io.InputStream;

import product.Circle;
import product.Square;
import product.Triangle;

public interface DrawerFactory 
{
	public Triangle getTriangle();
	public Square getSquare();
	public Circle getCircle();

}
