//Jesse Contreras, Period 8

import java.awt.*;
import java.applet.*;
import java.util.Date;

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

		
		//Body
		g.setColor(Color.black);
		g.fillOval(400, 400, 150, 220);

		//Wings
		g.setColor(Color.black);
		g.fillOval(310, 460, 150, 35);
		g.fillOval(520, 450, 35, 130);
		
		//Fish
		g.setColor(new Color(172,188,213));
		g.fillOval(320, 450, 35, 130);
		g.setColor(Color. white);
		g.fillOval(325, 560, 10, 10);
		
		//Feet
		g.setColor(new Color(233,153,65));
		g.fillOval(425, 610, 35,20);
		g.fillOval(490, 610, 35,20);
		
		
		
		//Stomach
		g.setColor(Color. white);
		g.fillOval(420, 400, 110, 190);
		
		//Head
		g.setColor(Color.black);
		g.fillOval(415, 370, 120, 120);
		
		//Beak
		g.setColor(new Color(233,166,27));
		g.fillRect(460, 450, 30, 8);
	//	g.fillRect(460, 440, 30, 8);
	//	g.fillRect(470, 448, 10, 10);
		
		//Eyes
		g.setColor(Color. white);
		g.fillOval(435, 400, 25, 25);
		g.fillRect(490, 415, 25, 11);
		g.fillOval(490, 400, 25, 25);
		g.fillRect(435, 415, 25, 11);
		g.setColor(new Color(92,92,92));
		g.fillOval(440, 410, 15, 15);
		g.fillOval(495, 410, 15, 15);
		


	      }
	    

		
	
	

}