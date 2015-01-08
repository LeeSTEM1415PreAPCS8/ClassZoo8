import java.awt.*;
import java.applet.*;
//Levi Ross
public class Bunbun extends Applet{
	
	public void paint(Graphics g)
	{
		drawHabitat(g);
		drawAnimal(g);
	}
	private void drawHabitat(Graphics g)
	{
		//Sky
		g.setColor(new Color(100,200,255));
		g.fillRect(0, 0, 1000, 800);
		//Grass
		g.setColor(new Color(9,164,0));
		g.fillRect(0,350,1000,1000);
		g.fillOval(-100, 300, 500, 200);
		g.fillOval(300, 300, 300, 200);
		g.fillOval(380, 300, 500, 200);
		g.fillOval(800, 300, 300, 200);
		//Sun Sun
		g.setColor(Color.yellow);
		g.fillOval(697,97,80,80);
		g.setColor(Color.orange);
		g.fillOval(700, 100, 75, 75);
	}
	private void drawAnimal(Graphics g)
	{
		//White Bun Bun
		g.setColor(Color.white);
		g.fillOval(248,500,50,60);
		g.setColor(Color.gray);
		g.drawOval(248,500,50,60);
		g.drawOval(253, 450, 15, 55);
		g.drawOval(278, 450, 15, 55);
		g.setColor(Color.white);
		g.fillOval(253,480,40,40);
		g.setColor(Color.gray);
		g.drawOval(253,480,40,40);
		
		g.setColor(Color.white);
		g.fillOval(253, 450, 15, 55);
		g.fillOval(278, 450, 15, 55);
		g.setColor(Color.gray);
		
	}
	

}
