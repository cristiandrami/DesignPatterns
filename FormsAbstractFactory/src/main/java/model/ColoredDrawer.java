package model;

import java.io.InputStream;

public class ColoredDrawer extends DrawerFactory{

	private static ColoredDrawer drawer=null;
	
	private ColoredDrawer(){}
	
	public static ColoredDrawer getInstance() {
		if(drawer==null)
			drawer=new ColoredDrawer();
		return drawer;
		
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
