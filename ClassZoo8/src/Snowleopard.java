//Computer Science Pre-Ap
//8th Period
//Keamber McCracken
import java.awt.*;
import java.applet.*;

public class Snowleopard extends Applet{
	
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
		//Sky
		g.setColor(new Color(4, 186, 255));
		g.fillRect(0, 0, 1600, 1600);
		
		//Sun
		g.setColor(new Color(243, 253, 55));
		g.fillOval(15, 5, 125, 125);
		
		//Gate
		g.setColor(new Color(0, 0, 0));
		g.fillRect(0, 200, 1600, 300);
		
		//Bars in the Gate
		g.setColor(new Color(4, 186, 255));
		g.fillRect(15, 230, 10, 250);
		g.fillRect(41, 230, 10, 250);
		g.fillRect(67, 230, 10, 250);
		g.fillRect(93, 230, 10, 250);
		g.fillRect(119, 230, 10, 250);
		g.fillRect(145, 230, 10, 250);
		g.fillRect(171, 230, 10, 250);
		g.fillRect(197, 230, 10, 250);
		g.fillRect(223, 230, 10, 250);
		g.fillRect(249, 230, 10, 250);
		g.fillRect(275, 230, 10, 250);
		g.fillRect(301, 230, 10, 250);
		g.fillRect(327, 230, 10, 250);
		g.fillRect(353, 230, 10, 250);
		g.fillRect(379, 230, 10, 250);
		g.fillRect(405, 230, 10, 250);
		g.fillRect(431, 230, 10, 250);
		g.fillRect(457, 230, 10, 250);
		g.fillRect(483, 230, 10, 250);
		g.fillRect(509, 230, 10, 250);
		g.fillRect(535, 230, 10, 250);
		g.fillRect(561, 230, 10, 250);
		g.fillRect(587, 230, 10, 250);
		g.fillRect(613, 230, 10, 250);
		g.fillRect(639, 230, 10, 250);
		g.fillRect(665, 230, 10, 250);
		g.fillRect(691, 230, 10, 250);
		g.fillRect(717, 230, 10, 250);
		g.fillRect(743, 230, 10, 250);
		g.fillRect(769, 230, 10, 250);
		g.fillRect(795, 230, 10, 250);
		g.fillRect(821, 230, 10, 250);
		g.fillRect(847, 230, 10, 250);
		g.fillRect(873, 230, 10, 250);
		g.fillRect(899, 230, 10, 250);
		g.fillRect(925, 230, 10, 250);
		g.fillRect(951, 230, 10, 250);
		g.fillRect(977, 230, 10, 250);
		g.fillRect(1003, 230, 10, 250);
		g.fillRect(1029, 230, 10, 250);
		g.fillRect(1055, 230, 10, 250);
		g.fillRect(1081, 230, 10, 250);
		g.fillRect(1107, 230, 10, 250);
		g.fillRect(1133, 230, 10, 250);
		g.fillRect(1159, 230, 10, 250);
		g.fillRect(1185, 230, 10, 250);
		g.fillRect(1211, 230, 10, 250);
		g.fillRect(1237, 230, 10, 250);
		g.fillRect(1263, 230, 10, 250);
		g.fillRect(1289, 230, 10, 250);
		g.fillRect(1315, 230, 10, 250);
		g.fillRect(1341, 230, 10, 250);
		g.fillRect(1367, 230, 10, 250);
		g.fillRect(1393, 230, 10, 250);
		g.fillRect(1419, 230, 10, 250);
		g.fillRect(1445, 230, 10, 250);
		g.fillRect(1471, 230, 10, 250);
		g.fillRect(1497, 230, 10, 250);
		g.fillRect(1523, 230, 10, 250);
		g.fillRect(1549, 230, 10, 250);
		g.fillRect(1575, 230, 10, 250);
		 
		//Floor of Habitat
		g.setColor(new Color (220, 192, 135));
		g.fillRect(0, 500, 1600, 295);
		
		//Log
		g.setColor(new Color (95, 74, 37));
		Polygon log = new Polygon ();
		log.addPoint(145, 650);
		log.addPoint(327, 650);
		log.addPoint(327, 675);
		log.addPoint(145, 675);
		log.addPoint(145, 650);
		g.fillPolygon(log);
		g.setColor(new Color (239, 194, 146));
		g.fillOval(127, 645, 39, 30);
		g.setColor(new Color (95, 74, 37));
		g.drawOval(127, 645, 39, 30);
		g.setColor(new Color (239, 194, 146));
		g.fillOval(309, 645, 39, 30);
		g.setColor(new Color (95, 74, 37));
		g.drawOval(309, 645, 39, 30);
		g.setColor(new Color (95, 74, 37));
		Polygon log1 = new Polygon ();
		log1.addPoint(197, 650);
		log1.addPoint(215, 650);
		
		
		
	}
}
