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
		g.fillRect(590, 350, 220, 300);
		
		//squid tenticles
		g.setColor(Color.white);
		g.fillRect(595, 600, 50, 150);
		g.fillRect(650, 600, 50, 150);
		g.fillRect(705, 600, 50, 150);
		g.fillRect(760, 600, 50, 150);
		g.fillRect(590, 550, -150, 50);
		g.fillRect(790, 550, 150, 50);
		
		//squid eyes
		g.setColor(Color.black);
		g.fillOval(588, 393, 224, 90);
		g.setColor(Color.white);
		g.drawOval(610, 400, 75, 75);
		g.fillOval(610, 400, 75, 75);
		g.fillOval(710, 400, 75, 75);
		g.setColor(Color.black);
		g.fillOval(635, 420, 25, 25);
		g.fillOval(735, 420, 25, 25);
		
	}
	
	private void drawHabitat(Graphics g)
	{
		//water
		g.setColor(new Color(100,200,255));
		g.fillRect(0, 0, 80000, 80000);
		
		//bubbles
		// oval: X1:distance out on x axis, y1: how far down the sphere is x2: how wide the sphere is y2 how tall the sphere is
		g.setColor(new Color(255, 255, 255));
		g.fillOval(1200,200,50,50);
		g.fillOval(1100,500,50,50);
		
		
	}
}
