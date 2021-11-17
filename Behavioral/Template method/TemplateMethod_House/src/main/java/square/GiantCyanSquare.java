package square;

import java.awt.Color;

public class GiantCyanSquare extends Square{
	private int h=200;
	private int w=200;
	public GiantCyanSquare() {
		super();
	}
	@Override
	protected Color generateColor() {
		// TODO Auto-generated method stub
		return Color.cyan;
	}

	@Override
	protected int generateHeight() {
		// TODO Auto-generated method stub
		return h;
	}

	@Override
	protected int generateWeight() {
		// TODO Auto-generated method stub
		return w;
	}

}
