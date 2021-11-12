package product;

import java.io.InputStream;

public class DashedTriangle implements Triangle {

	public InputStream getTriangle() {
		
		return getClass().getResourceAsStream("/dashedForms/dashedTriangle.png");
	}

}
