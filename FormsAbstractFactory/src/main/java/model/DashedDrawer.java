package model;

import java.io.InputStream;

public class DashedDrawer extends DrawerFactory {
	
	@Override
	public InputStream trianglePath() {
		return getClass().getResourceAsStream("/dashedForms/dashedTriangle.png");
	}

	@Override
	public InputStream squarePath() {
		return getClass().getResourceAsStream("/dashedForms/dashedSquare.png");
	}

	@Override
	public InputStream circlePath() {
		return getClass().getResourceAsStream("/dashedForms/dashedCircle.png");
	}


}
