//Dezaray Mora

import java.applet.*;
import java.awt.*;

public class bunny extends Applet {

//	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	}
	public void paint(Graphics g)
	{
		drawHabitat(g);
		drawAnimal(g);
	}
	private void drawHabitat(Graphics g)
	{
		g.setColor(new Color(100,200,255));
		g.fillRect(0,0,2000,400);
		g.setColor(Color.green);
		g.fillRect(0,400,2000,600);
	}
	private void drawAnimal(Graphics g)
	{
		
		g.setColor(Color.black);
		g.fillOval(400, 470, 125,150);
		//paws
		g.setColor(Color.black);
		g.fillOval(345, 580, 110,54);
//		g.setColor(Color.black);
//		g.drawOval(345, 580, 110,54);
		g.setColor(Color.black);
		g.fillOval(465, 580, 110,54);
	//	g.setColor(Color.black);
	//	g.drawOval(465, 580, 110,54);
		
		//neck and cheeks
		g.setColor(Color.black);
		g.fillOval(412, 380, 110,110);
		
		g.setColor(Color.black);
		g.fillOval(410, 339, 110,110);
		
//		ears
		g.setColor(Color.black);
		g.fillOval(400, 280, 50,100);
		
		g.setColor(Color.black);
		g.fillOval(470, 280, 50,100);
//		
//		features
		g.setColor(Color.pink);
		g.fillOval(437, 400, 50, 30);
		g.setColor(Color.black);
//		g.drawOval(414, 370, 40, 30);
	//	g.drawOval(474, 370, 40, 30);
		//eyes
		g.setColor(Color.white);
		g.fillOval(434, 370, 20, 30);
		g.fillOval(474, 370, 20, 30);
//		eye circles
		g.setColor(Color.green);
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
		g.setColor(Color.red);
		g.fillOval(430, 440, 70, 10);
		//hands
		g.setColor(Color.black);
		g.fillOval(350, 490, 80,40);
		g.fillOval(500, 490, 80,40);
		g.setColor(Color.black);
		//sun
		g.setColor(Color.yellow);
		g.fillOval(700,97,400,300
				);

	}
}

