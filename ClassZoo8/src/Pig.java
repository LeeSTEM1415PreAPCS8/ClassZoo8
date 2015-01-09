

import java.awt.*;
import java.applet.*;



public class Pig extends Applet
{
	public void paint(Graphics g)
	{
		
		drawHabitat(g);
		drawAnimal(g);
	}

	private void drawAnimal(Graphics g)
	{
		
		//g.fillOval(x, y, width, height);
		g.setColor(Color.pink);
		g.fillRect(300, 500, 100, 50);
		g.fillRect(300, 510, 30, 80);
		g.fillRect(370, 510, 30, 80);
		g.fillRect(380, 480, 50, 50);
		g.fillRect(420, 500, 20, 15);
		
		g.setColor(Color.white);
		g.fillOval(420, 490, 10, 10);

		g.setColor(Color.black);
		g.drawLine(320, 550, 320, 588);
		g.drawLine(390, 550, 390, 588);
		g.fillOval(425, 492, 5, 5);

	

	}
	
	private void drawHabitat(Graphics g)
	{
		int a = 139 ;  int b = 69 ; int c = 19;
		g.setColor(Color.blue);
		g.fillRect(0, 0, 1000, 1000);
		
		g.setColor(Color.green);
		g.fillRect(0, 400, 1000, 1000);
		
		g.setColor(new Color (a,b,c));
		g.fillOval(100, 450, 500, 200);


	}
	}




