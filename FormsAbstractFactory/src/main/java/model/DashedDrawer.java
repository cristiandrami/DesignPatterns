package model;

import java.io.InputStream;

public class DashedDrawer extends DrawerFactory {
	
	private static DashedDrawer drawer=null;
	
	private DashedDrawer(){}
	
	public static DashedDrawer getInstance() {
		if(drawer==null)
			drawer=new DashedDrawer();
		return drawer;
		
	}
	
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
