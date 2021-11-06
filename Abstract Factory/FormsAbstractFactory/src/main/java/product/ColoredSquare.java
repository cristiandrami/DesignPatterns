package product;

import java.io.InputStream;

public class ColoredSquare implements Square {

	public InputStream getSquare() {
		return getClass().getResourceAsStream("/coloredForms/coloredSquare.png");
	}

}
