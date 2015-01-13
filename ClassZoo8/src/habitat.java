
//Carlos Salinas

import java.awt.*;
import java.applet.*;

public class habitat extends Applet{
	
	public void paint(Graphics g)
	{
		
		drawHabitat(g);
		drawAnimal(g);
	}

	private void drawAnimal(Graphics g)
	{
		
		g.setColor(Color.white);
		g.fillOval(400, 470, 125,150);
		//paws
		g.setColor(Color.white);
		g.fillOval(345, 580, 110,54);
//		g.setColor(Color.black);
//		g.drawOval(345, 580, 110,54);
		g.setColor(Color.white);
		g.fillOval(465, 580, 110,54);
	//	g.setColor(Color.black);
	//	g.drawOval(465, 580, 110,54);
		
		//neck and cheeks
	
		g.setColor(Color.white);
		g.fillOval(412, 380, 110,110);
		
		g.setColor(Color.white);
		g.fillOval(485, 415, 60,60);
		
		
		g.setColor(Color.white);
		g.fillOval(385, 415, 60,60);
		
		g.setColor(Color.white);
		g.fillOval(410, 339, 110,110);
		
//		ears
		g.setColor(Color.white);
		g.fillOval(400, 280, 50,100);
		
		g.setColor(Color.white);
		g.fillOval(470, 280, 50,100);
//		
//		features
		g.setColor(Color.pink);
		g.fillOval(437, 400, 50, 30);
		g.setColor(Color.black);
//		g.drawOval(414, 370, 40, 30);
	//	g.drawOval(474, 370, 40, 30);
		//eyes
		g.setColor(Color.black);
		g.fillOval(434, 370, 20, 30);
		g.fillOval(474, 370, 20, 30);
//		eye circles
		g.setColor(Color.white);
		g.fillOval(434+10,378,10,10);
		g.fillOval(434+50,378,10,10);

		//
		g.setColor(Color.gray);
		g.fillOval(430, 480, 70, 90);
//		ears
		g.setColor(Color.gray);
		g.fillOval(480, 285, 30, 70);
		g.fillOval(410, 285, 30, 70);
		//mouth
		g.setColor(Color.black);
		g.fillOval(430, 440, 70, 10);
		g.fillRect(452, 440, 32, 32);
		g.setColor(Color.white);
		g.fillRect(453, 443, 30, 28);
		//hands
		g.fillOval(350, 490, 80,40);
		g.fillOval(500, 490, 80,40);
		
		//2nd bunny
		//body
	g.setColor(Color.white);
		g.fillOval(400+200, 470, 125,150);
		//paws
		g.setColor(Color.white);
		g.fillOval(345+200, 580, 110,54);
	//	g.setColor(Color.black);
	//	g.drawOval(345+200, 580, 110,54);
		g.setColor(Color.white);
		g.fillOval(465+200, 580, 110,54);
	//	g.setColor(Color.black);
	//	g.drawOval(465+200, 580, 110,54);
		
		//neck and cheeks
	
		g.setColor(Color.white);
		g.fillOval(412+200, 380, 110,110);
		
		g.setColor(Color.white);
		g.fillOval(485+200, 415, 60,60);
		
		
		g.setColor(Color.white);
		g.fillOval(385+200, 415, 60,60);
		
		g.setColor(Color.white);
		g.fillOval(410+200, 339, 110,110);
		
//		ears
		g.setColor(Color.white);
		g.fillOval(400+200, 280, 50,100);
		
		g.setColor(Color.white);
		g.fillOval(470+200, 280, 50,100);
//		
//		features
		g.setColor(Color.pink);
		g.fillOval(437+200, 400, 50, 30);
		g.setColor(Color.black);

		//eyes
		g.setColor(Color.black);
		g.fillOval(434+200, 370, 20, 30);
		g.fillOval(474+200, 370, 20, 30);
		//eye circle
		g.setColor(Color.white);
		g.fillOval(434+200,378,10,10);
		g.fillOval(434+240,378,10,10);
		//
		g.setColor(Color.gray);
		g.fillOval(430+200, 480, 70, 90);
//		ears
		g.setColor(Color.gray);
		g.fillOval(480+200, 285, 30, 70);
		g.fillOval(410+200, 285, 30, 70);
		//mouth
		g.setColor(Color.black);
		g.fillOval(430+200, 440, 70, 10);
		g.fillRect(452+200, 440, 32, 32);
		g.setColor(Color.white);
		g.fillRect(453+200, 443, 30, 28);
		//hands
		g.fillOval(350+200, 490, 80,40);
		g.fillOval(500+200, 490, 80,40);
		

	}
	
	private void drawHabitat(Graphics g)
	{
	g.setColor(Color.green);
	 g.fillRect(0, 500, 5000, 5000);
	 g.setColor(new Color(0,162,232));
	g.fillRect(0, 0, 5000, 500);
	//land
	g.setColor(Color.green);
	g.fillOval(200, 400, 300, 300);
	g.fillOval(400, 400, 300, 300);
	g.fillOval(700, 400, 300, 300);
	g.fillOval(900, 400, 300, 300);
	g.fillOval(1000, 400, 300, 300);
	g.fillOval(1300, 400, 300, 300);
	g.setColor(Color.yellow);
	g.fillOval(900, 100, 100, 100);
	}
	
}
