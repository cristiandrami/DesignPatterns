package product;

import java.io.InputStream;

public class DashedSquare implements Square {

	public InputStream getSquare() {
		return getClass().getResourceAsStream("/dashedForms/dashedSquare.png");
	}

}
