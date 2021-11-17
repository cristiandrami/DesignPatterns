package square;

import java.awt.Color;

public class SmallRedSquare extends Square{
	private int h=40;
	private int w=40;
	public SmallRedSquare() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Color generateColor() {
		return Color.red;
	}

	@Override
	protected int generateHeight() {
		return h;
	}

	@Override
	protected int generateWeight() {
		
		return w;
	}

}
