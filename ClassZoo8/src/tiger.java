import java.awt.*;
import java.applet.*;
//Stefanie Tijerina
public class tiger extends Applet{
	
	public void paint(Graphics g)
	{
		drawHabitat(g);
		drawAnimal(g);
	}

	private void drawAnimal(Graphics g)
	{
		Graphics2D g2d = (Graphics2D)g;
		//tiger
		//g.setColor(new Color(250, 37, 213));
        GradientPaint gp = new GradientPaint(
	            0, 0, Color.black, 5, 5, Color.white);
	    g2d.setPaint(gp);
		g2d.fillRect(200,400,300,200);
		g2d.fillRect(100,350,100,100);
		
				
				
				
				
				
				
				
				
	}
	
	private void drawHabitat(Graphics g)
	{
		//sky
		g.setColor(new Color(100,200,255));
		g.fillRect(0, 0, 1000, 800);
		
		//Grass
		g.setColor(Color.GREEN);
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
				
	
	}


