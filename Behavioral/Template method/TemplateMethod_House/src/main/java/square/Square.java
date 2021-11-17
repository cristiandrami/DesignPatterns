package square;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public abstract class Square extends JPanel{

	private int x=20;
	private int y=30;
	
	protected void paintComponent(Graphics g) 
	{
        super.paintComponent(g); // do your superclass's painting routine first, and then paint on top of it.
        Color color= generateColor();
        int h=generateHeight();
        int w= generateWeight();
        
        
        g.setColor(color);
        g.fillRect(x,y,h,w);
    }
	
	protected abstract Color generateColor();
	protected abstract int generateHeight();
	protected abstract int generateWeight();
}
