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
		g.fillRect(0, 0, 10000, 80000);
		//Grass
			g.setColor(new Color(9,164,0));
			g.fillRect(0,350,10000,10000);
			g.fillOval(-100, 300, 500, 200);
			g.fillOval(300, 300, 300, 200);
			g.fillOval(380, 300, 500, 200);
			g.fillOval(800, 300, 300, 200);
		//Sun Sun
		g.setColor(Color.yellow);
			g.fillOval(697,97,80,80);
		g.setColor(Color.orange);
			g.fillOval(700, 100, 75, 75);
		//Tree
		g.setColor(new Color(77,50,30));
		Polygon tree = new Polygon();
		tree.addPoint(608,548);
		tree.addPoint(715,420);
		g.fillPolygon(tree);
		
	}
	private void drawAnimal(Graphics g)
	{
		// Brown Bun Bun
		// 	Light Brown RGB (new Color(112,67,39))
		// 	Dark Brown RGB(new Color(77,50,30))
		// 	Darker Brown RGB(new Color(40,19,6));
		
		g.setColor(new Color(112,67,39));
			g.fillOval(248,500,50,60);
		g.setColor(new Color(77,50,30));
			g.drawOval(248,500,50,60);
			g.drawOval(253, 450, 15, 55);
			g.drawOval(278, 450, 15, 55);
		g.setColor(new Color(112,67,39));
			g.fillOval(253,480,40,40);
		g.setColor(new Color(77,50,30));
			g.drawOval(253,480,40,40);
		g.setColor(new Color(112,67,39));
			g.fillOval(253, 450, 15, 55);
			g.fillOval(278, 450, 15, 55);
			g.fillOval(242,515,20,25);
			g.fillOval(285,515,20,25);
			g.fillOval(240,545,30,25);
			g.fillOval(272,545,30,25);
		g.setColor(new Color(77,50,30));
			g.drawOval(242,515,20,25);
			g.drawOval(285,515,20,25);
			g.drawOval(240,545,30,25);
			g.drawOval(272,545,30,25);
		g.setColor(Color.white);
			g.fillOval(259,489,10,9);
			g.fillOval(277,489,10,9);
		g.setColor(Color.black);
			g.fillOval(265,491,5,5);
			g.fillOval(283,491,5,5);
		g.setColor(new Color(40,19,6));
			g.drawOval(273,498,15,15);
			g.drawOval(257,498,15,15);
		g.setColor(new Color(112,67,39));
			g.fillRect(257, 498, 33,5 );
		g.setColor(new Color(40,19,6));
			g.fillRect(270, 500, 6,6);
			
			//White Bun bun
		g.setColor(Color.white);
			g.fillOval(248+300,500,50,60);
		g.setColor(Color.gray);
			g.drawOval(248+300,500,50,60);
			g.drawOval(253+300, 450, 15, 55);
			g.drawOval(278+300, 450, 15, 55);
		g.setColor(Color.white);
			g.fillOval(253+300,480,40,40);
		g.setColor(Color.gray);
			g.drawOval(253+300,480,40,40);
		g.setColor(Color.white);
			g.fillOval(253+300, 450, 15, 55);
			g.fillOval(278+300, 450, 15, 55);
			g.fillOval(242+300,515,20,25);
			g.fillOval(285+300,515,20,25);
			g.fillOval(240+300,545,30,25);
			g.fillOval(272+300,545,30,25);
		g.setColor(Color.gray);
			g.drawOval(242+300,515,20,25);
			g.drawOval(285+300,515,20,25);
			g.drawOval(240+300,545,30,25);
			g.drawOval(272+300,545,30,25);
		g.setColor(Color.gray);
			g.drawOval(259+300,489+4,10,1);
			g.drawOval(277+300,489,10,9);
		g.setColor(Color.black);
			g.fillOval(279+300,491,4,5);
			g.fillOval(277+300,491,4,5);
		g.setColor(Color.black);
			g.drawOval(273+300,498+1,15,15);
			g.drawOval(260+300-1,498+1,15,15);
		g.setColor(Color.white);
			g.fillRect(257+300, 498+1, 33,5 );
		g.setColor(Color.black);
			g.fillRect(270+301, 500, 6,6);
	}
	

}
