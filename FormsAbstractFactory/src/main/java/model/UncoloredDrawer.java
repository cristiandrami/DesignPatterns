package model;

import java.io.InputStream;

public class UncoloredDrawer extends DrawerFactory{
	private static UncoloredDrawer drawer=null;
	
	private UncoloredDrawer(){}
	
	public static UncoloredDrawer getInstance() {
		if(drawer==null)
			drawer=new UncoloredDrawer();
		return drawer;
		
	}
	@Override
	public InputStream trianglePath() {
		return getClass().getResourceAsStream("/uncoloredForms/triangleNotColored.png");
	}

	@Override
	public InputStream squarePath() {
		return getClass().getResourceAsStream("/uncoloredForms/squareNotColored.png");
	}

	@Override
	public InputStream circlePath() {
		return getClass().getResourceAsStream("/uncoloredForms/circleNotColored.png");
	}


}
