package product;

import java.io.InputStream;

public class UncoloredTriangle implements Triangle{

	public InputStream getTriangle() {
		return getClass().getResourceAsStream("/uncoloredForms/triangleNotColored.png");
	}

}
