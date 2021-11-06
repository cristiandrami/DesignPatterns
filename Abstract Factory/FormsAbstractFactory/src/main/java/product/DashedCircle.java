package product;

import java.io.InputStream;

public class DashedCircle implements Circle {

	public InputStream getCircle() {
		return getClass().getResourceAsStream("/dashedForms/dashedCircle.png");
	}

}
