package product;

import java.io.InputStream;

public class UncoloredSquare implements Square {

	public InputStream getSquare() {
		return getClass().getResourceAsStream("/uncoloredForms/squareNotColored.png");
	}

}
