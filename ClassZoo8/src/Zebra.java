/*Computer Science Pre-AP
8th period
Joe Dilly
*/

import java.awt.*;
import java.applet.*;

public class Zebra extends Applet{
	
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
		g.setColor(new Color(100, 200, 255));
		g.fillRect(0, 0, 800, 350);
	
		g.setColor(Color.green);
		g.fillRect(0, 350, 800, 250);
	}
}
