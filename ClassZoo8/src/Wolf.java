import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;


public class AnimalTemp extends Applet{
	
	public void paint(Graphics g)
	{
		drawAnimal(g);
		drawHabitat(g);
	}

	private void drawAnimal(Graphics g)
	{
		g.setColor(new Color(7, 182, 248));
		g.fillRect(0, 0, 2000, 2000);
		g.setColor(Color.green);
		g.fillRect(0, 650, 2000, 300);
		g.setColor(Color.white);
		g.setColor(Color.gray);
		g.fillRect(500, 650, 45, 70);
		g.fillRect(700, 650, 45, 70);
		g.fillRect(500, 600, 245, 75);
		g.fillRect(450, 575, 90, 90);
		g.fillRect(425, 615, 50, 50);
		g.setColor(Color.yellow);
		g.fillOval(1350, 20, 150, 150);
		g.setColor(Color.white);
		g.fillOval(75, 25, 250, 150);
		g.fillOval(175, 50, 250, 150);
		g.fillOval(275, 25, 250, 150);
		g.fillOval(675, 50, 250, 150);
		g.fillOval(775, 25, 250, 150);
		g.fillOval(875, 50, 250, 150);
	}
	
	private void drawHabitat(Graphics g)
	{
		
	}
}
