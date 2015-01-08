//Keamber McCracken
import java.awt.*;
import java.applet.*;

public class Snowleopard extends Applet{
	
	public void paint(Graphics g)
	{
		drawAnimal(g);
		drawHabitat(g);
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
		g.fillRect(15, 250, 10, 300);
		g.fillRect(41, 200, 10, 300);
		g.fillRect(67, 200, 10, 300);
		g.fillRect(93, 200, 10, 300);
		g.fillRect(119, 200, 10, 300);
		g.fillRect(145, 200, 10, 300);
		g.fillRect(171, 200, 10, 300);
		g.fillRect(197, 200, 10, 300);
		g.fillRect(223, 200, 10, 300);
		g.fillRect(249, 200, 10, 300);
		g.fillRect(275, 200, 10, 300);
		g.fillRect(301, 200, 10, 300);
		g.fillRect(327, 200, 10, 300);
		g.fillRect(353, 200, 10, 300);
		g.fillRect(379, 200, 10, 300);
		g.fillRect(405, 200, 10, 300);
		g.fillRect(431, 200, 10, 300);
		g.fillRect(457, 200, 10, 300);
		g.fillRect(483, 200, 10, 300);
	}
}
