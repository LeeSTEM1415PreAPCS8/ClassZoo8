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
		// Body
		g.setColor(Color.white);
		g.fillOval(600, 300, 300, 150);
		g.fillRect(625, 415, 25, 100);
		g.fillRect(675, 415, 25, 100);
		g.fillRect(780, 415, 25, 100);
		g.fillRect(850, 415, 25, 100);
		// Hooves
		g.setColor(Color.black);
		g.fillRect(625, 515, 25, 15);
		g.fillRect(675, 515, 25, 15);
		g.fillRect(780, 515, 25, 15);
		g.fillRect(850, 515, 25, 15);
		// Neck
		g.setColor(Color.white);
		Polygon p = new Polygon();
		p.addPoint(640, 350);
		p.addPoint(580, 275);
		p.addPoint(560, 300);
		p.addPoint(630, 425);
		g.fillPolygon(p);
		//Face
		g.setColor(Color.white);
		g.fillOval(495, 265, 100, 50);
		g.setColor(Color.black);
		g.fillOval(550, 270, 20, 20);
		g.setColor(new Color(100, 200, 255));
		g.fillOval(551, 278, 10, 10);
		g.setColor(Color.black);
		g.fillRect(495, 280, 20, 20);
		g.setColor(new Color(100, 200, 255));
		g.fillOval(440, 150, 130, 130);
		g.fillOval(645, 220, 260, 100);
		g.setColor(Color.black);
		g.drawLine(510, 308, 530, 295);
		//Tail
		g.setColor(Color.white);
		g.fillRect(890, 360, 125, 20);
		//ears
		g.setColor(Color.white);
		g.fillOval(554, 230, 25, 40);
		g.fillOval(540, 230, 25, 40);
		g.setColor(Color.pink);
		g.fillOval(554, 235, 15, 35);
		g.fillOval(540, 235, 15, 35);
		//mane
		
		
	}
	
	private void drawHabitat(Graphics g)
	{
		//sky
		g.setColor(new Color(100, 200, 255));
		g.fillRect(0, 0, 2000, 350);
		//grass
		g.setColor(Color.green);
		g.fillRect(0, 350, 2000, 850);
		//tree
		g.setColor(new Color(152, 137, 58));
		g.fillRect(1300, 250, 100, 300);
		//leaves
		g.setColor(new Color(6, 179, 109));
		g.fillOval(1300, 150, 100, 100);
		g.fillOval(1250, 250, 100, 100);
		g.fillOval(1235, 200, 100, 100);
		g.fillOval(1375, 175, 100, 100);
		g.fillOval(1368, 200, 100, 100);
		g.fillOval(1300, 240, 100, 100);
		g.fillOval(1370, 250, 100, 100);
		g.fillOval(1260, 160, 100, 100);
		//hole in tree
		g.setColor(Color.black);
		g.fillOval(1325, 375, 50, 75);
		//sun
		g.setColor(Color.yellow);
		g.fillOval(25, 50, 100, 100);
		
		
		
		
	}
}
