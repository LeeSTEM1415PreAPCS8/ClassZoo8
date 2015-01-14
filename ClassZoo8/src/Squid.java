/*Computer Science Pre-AP
8th period
Joe Dilly
*/

import java.awt.*;
import java.applet.*;

public class Squid extends Applet{
	
	public void paint(Graphics g)
	{
		drawHabitat(g);
		drawAnimal(g);
	}

	private void drawAnimal(Graphics g)
	{
		
	}
	
	private void drawHabitat(Graphics g)
	{
		//water
		g.setColor(new Color(100,200,255));
		g.fillRect(0, 0, 80000, 80000);
		
		//bubbles
		// oval: X1:distance out on x axis, y1: how far down the sphere is x2: how wide the sphere is y2 how tall the sphere is
		g.setColor(new Color(255,255,255));
		g.fillOval(1200,200,50,50);
	}
}
