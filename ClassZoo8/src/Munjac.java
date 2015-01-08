/*Computer Science Pre-AP
8th period
Collin Norwood
*/

import java.awt.*;
import java.applet.*;

public class Muntjac extends Applet{
	
	public void paint(Graphics g)
	{
		drawHabitat(g);
		drawAnimal(g);
	}

	private void drawAnimal(Graphics g)
	{	
		g.setColor (Color.blue);
		g.fillRect(10, 10, 10, 10);
	}
	
	private void drawHabitat(Graphics g)
	{
		
	}
}
