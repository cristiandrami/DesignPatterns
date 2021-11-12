package product;

import java.io.InputStream;

public class ColoredTriangle implements Triangle {

	public InputStream getTriangle() {
		return getClass().getResourceAsStream("/coloredForms/coloredTriangle.png");
	}

}
