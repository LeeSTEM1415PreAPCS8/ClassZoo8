//Jesse Contreras, Period 8

import java.awt.*;
import java.applet.*;

public class Penguin extends Applet{
	
	public void paint(Graphics g)
	{
		drawHabitat(g);
		drawAnimal(g);
	
	}

	
	private void drawHabitat(Graphics g)
	{

		g.setColor(Color. white);
		g.fillRect(0,500,5000,5000);
		g.setColor(new Color (80,180,210));
		g.fillRect(0,0,5000,500);
	}
	
	private void drawAnimal(Graphics g)
	{

		
	
		g.setColor(Color.black);
		g.fillOval(400, 400, 150, 220);
	
		g.setColor(new Color (197,197,197));
		g.fillOval(420, 420, 110, 200);
		
		
	}
	

}