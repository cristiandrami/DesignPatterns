package product;

import java.io.InputStream;

public class UncoloredCircle implements Circle {

	public InputStream getCircle() {
		return getClass().getResourceAsStream("/uncoloredForms/circleNotColored.png");
	}

}
