import java.awt.*;
import java.applet.*;

public class hippo extends Applet{
	
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
		//sky
		g.setColor(new Color(181, 233, 253));
		g.fillRect(0, 0, 2000, 2000);
		//rock wall
		g.setColor(new Color(154, 154, 154));
		g.fillRect(0, 300, 2000, 450);
		
		//sun
		g.setColor(new Color (242, 244, 151));
		g.fillOval(1430, 50, 125, 125);
		
		//rocks on wall
		g.setColor(Color.black);
		g.setColor(Color.black);
		Polygon hexagon1 = new Polygon();
		Polygon hexagon2 = new Polygon();
		Polygon hexagon3 = new Polygon();
		Polygon hexagon4 = new Polygon();
		Polygon hexagon5 = new Polygon();
		Polygon hexagon6 = new Polygon();
		Polygon hexagon7 = new Polygon();
		Polygon hexagon8 = new Polygon();
		Polygon hexagon9 = new Polygon();
		Polygon hexagon10 = new Polygon();
		Polygon hexagon11= new Polygon();
		Polygon hexagon12 = new Polygon();
		Polygon hexagon13 = new Polygon();
		
		//third hexagon
		hexagon1.addPoint(0, 300);
		hexagon1.addPoint(75, 375);
		hexagon1.addPoint(150, 375);
		hexagon1.addPoint(225, 300);
		//eighth hexagon
		hexagon2.addPoint(350, 300);
		hexagon2.addPoint(425, 375);
		hexagon2.addPoint(500, 375);
		hexagon2.addPoint(575, 300);
		//sixth hexagon
		hexagon3.addPoint(250, 312);
		hexagon3.addPoint(175, 387);
		hexagon3.addPoint(250, 462);
		hexagon3.addPoint(325, 462);
		hexagon3.addPoint(400, 387);
		hexagon3.addPoint(325, 312);
		//first hexagon
		hexagon4.addPoint(-25, 312);
		hexagon4.addPoint(50, 387);
		hexagon4.addPoint(-25, 462);
		//ninth hexagon
		hexagon5.addPoint(425, 400);
		hexagon5.addPoint(350, 475);
		hexagon5.addPoint(425, 550);
		hexagon5.addPoint(500, 550);
		hexagon5.addPoint(575, 475);
		hexagon5.addPoint(500, 400);
		//sixth hexagon
		hexagon6.addPoint(600, 312);
		hexagon6.addPoint(525, 387);
		hexagon6.addPoint(600, 462);
		hexagon6.addPoint(675, 462);
		hexagon6.addPoint(750, 387);
		hexagon6.addPoint(675, 312);
		//fourth polygon
		hexagon7.addPoint(75, 400);
		hexagon7.addPoint(0, 475);
		hexagon7.addPoint(75, 550);
		hexagon7.addPoint(150, 550);
		hexagon7.addPoint(225, 475);
		hexagon7.addPoint(150, 400);
		//seventh polygon
		hexagon8.addPoint(250, 487);
		hexagon8.addPoint(175, 562);
		hexagon8.addPoint(250, 637);
		hexagon8.addPoint(325, 637);
		hexagon8.addPoint(400, 562);
		hexagon8.addPoint(325, 487);
		//second polygon
		hexagon9.addPoint(-25, 487);
		hexagon9.addPoint(50, 562);
		hexagon9.addPoint(-25, 637);
		//fifth polygon
		hexagon10.addPoint(75, 575);
		hexagon10.addPoint(0, 650);
		hexagon10.addPoint(75, 725);
		hexagon10.addPoint(150, 725);
		hexagon10.addPoint(225, 650);
		hexagon10.addPoint(150, 575);
		//tenth polygon
		hexagon11.addPoint(425, 575);
		hexagon11.addPoint(350, 650);
		hexagon11.addPoint(425, 725);
		hexagon11.addPoint(500, 725);
		hexagon11.addPoint(575, 650);
		hexagon11.addPoint(500, 575);
		//twelveth polygon
		//hexagon12.addPoint
		
		
	
		
		
		
		g.fillPolygon(hexagon1);
		g.fillPolygon(hexagon2);
		g.fillPolygon(hexagon3);
		g.fillPolygon(hexagon4);
		g.fillPolygon(hexagon5);
		g.fillPolygon(hexagon6);
		g.fillPolygon(hexagon7);
		g.fillPolygon(hexagon8);
		g.fillPolygon(hexagon9);	
		g.fillPolygon(hexagon10);
		g.fillPolygon(hexagon11);
		
		//water
		g.setColor(Color.blue);
		g.fillRect(0, 600, 2000, 400);
		
		
		
		
		
		
		
	}
}
