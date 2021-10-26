package model;

import java.io.InputStream;

public class ColoredDrawer extends DrawerFactory{

	public ColoredDrawer() {
	
	}
	@Override
	public InputStream trianglePath() {
		return getClass().getResourceAsStream("/coloredForms/coloredTriangle.png");
	}

	@Override
	public InputStream squarePath() {
		return getClass().getResourceAsStream("/coloredForms/coloredSquare.png");
	}

	@Override
	public InputStream circlePath() {
		return getClass().getResourceAsStream("/coloredForms/coloredCircle.png");
	}



}
