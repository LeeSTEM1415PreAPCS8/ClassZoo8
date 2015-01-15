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
		//squid head
		g.setColor(Color.white);
		Polygon p = new Polygon();
		p.addPoint(700, 200);
		p.addPoint(550, 400);
		p.addPoint(850, 400);
		g.fillPolygon(p);
	
		//squid body
		g.fillRect(600, 350, 200, 300);
		
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
		g.fillOval(1100,500,50,50);
		
		
	}
}
