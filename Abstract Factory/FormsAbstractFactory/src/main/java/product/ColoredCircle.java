package product;

import java.io.InputStream;

public class ColoredCircle implements Circle {

	public InputStream getCircle() {
		return getClass().getResourceAsStream("/coloredForms/coloredCircle.png");
	}

}
