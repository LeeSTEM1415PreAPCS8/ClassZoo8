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
		g.setColor(new Color(63, 66, 73));
		g.fillRect(0, 300, 2000, 450);
		//sun
		g.setColor(new Color (242, 244, 151));
		g.fillOval(1430, 50, 125, 125);
		//rocks on wall
		g.setColor(new Color(154, 154, 154));
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
		Polygon hexagon11 = new Polygon();
		Polygon hexagon12 = new Polygon();
		Polygon hexagon13 = new Polygon();
		Polygon hexagon14 = new Polygon();
		Polygon hexagon15 = new Polygon();
		Polygon hexagon16 = new Polygon();
		Polygon hexagon17 = new Polygon();
		Polygon hexagon18 = new Polygon();
		Polygon hexagon19 = new Polygon();
		Polygon hexagon20 = new Polygon();
		Polygon hexagon21 = new Polygon();
		Polygon hexagon22 = new Polygon();
		Polygon hexagon23 = new Polygon();
		Polygon hexagon24 = new Polygon();
		Polygon hexagon25 = new Polygon();
		Polygon hexagon26 = new Polygon();
		Polygon hexagon27 = new Polygon();
		Polygon triangle = new Polygon();
		//first hexagon
		hexagon1.addPoint(-25, 312);
		hexagon1.addPoint(50, 387);
		hexagon1.addPoint(-25, 462);
		//second polygon
		hexagon2.addPoint(-25, 487);
		hexagon2.addPoint(50, 562);
		hexagon2.addPoint(-25, 637);
		//third hexagon
		hexagon3.addPoint(0, 300);
		hexagon3.addPoint(75, 375);
		hexagon3.addPoint(150, 375);
		hexagon3.addPoint(225, 300);
		//fourth polygon
		hexagon4.addPoint(75, 400);
		hexagon4.addPoint(0, 475);
		hexagon4.addPoint(75, 550);
		hexagon4.addPoint(150, 550);
		hexagon4.addPoint(225, 475);
		hexagon4.addPoint(150, 400);
		//fifth polygon
		hexagon5.addPoint(75, 575);
		hexagon5.addPoint(0, 650);
		hexagon5.addPoint(75, 725);
		hexagon5.addPoint(150, 725);
		hexagon5.addPoint(225, 650);
		hexagon5.addPoint(150, 575);
		//sixth hexagon
		hexagon6.addPoint(250, 312);
		hexagon6.addPoint(175, 387);
		hexagon6.addPoint(250, 462);
		hexagon6.addPoint(325, 462);
		hexagon6.addPoint(400, 387);
		hexagon6.addPoint(325, 312);
		//seventh polygon
		hexagon7.addPoint(250, 487);
		hexagon7.addPoint(175, 562);
		hexagon7.addPoint(250, 637);
		hexagon7.addPoint(325, 637);
		hexagon7.addPoint(400, 562);
		hexagon7.addPoint(325, 487);
		//eighth hexagon
		hexagon8.addPoint(350, 300);
		hexagon8.addPoint(425, 375);
		hexagon8.addPoint(500, 375);
		hexagon8.addPoint(575, 300);
		//ninth hexagon
		hexagon9.addPoint(425, 400);
		hexagon9.addPoint(350, 475);
		hexagon9.addPoint(425, 550);
		hexagon9.addPoint(500, 550);
		hexagon9.addPoint(575, 475);
		hexagon9.addPoint(500, 400);
		//tenth polygon
		hexagon10.addPoint(425, 575);
		hexagon10.addPoint(350, 650);
		hexagon10.addPoint(425, 725);
		hexagon10.addPoint(500, 725);
		hexagon10.addPoint(575, 650);
		hexagon10.addPoint(500, 575);
		//eleventh hexagon
		hexagon11.addPoint(600, 312);
		hexagon11.addPoint(525, 387);
		hexagon11.addPoint(600, 462);
		hexagon11.addPoint(675, 462);
		hexagon11.addPoint(750, 387);
		hexagon11.addPoint(675, 312);
		//twelveth polygon
		hexagon12.addPoint(600, 487);
		hexagon12.addPoint(525, 562);
		hexagon12.addPoint(600, 637);
		hexagon12.addPoint(675, 637);
		hexagon12.addPoint(750, 562);
		hexagon12.addPoint(675, 487);
		//thirteenth polygon
		hexagon13.addPoint(700, 300);
		hexagon13.addPoint(775, 375);
		hexagon13.addPoint(850, 375);
		hexagon13.addPoint(925, 300);
		//fourteenth polygon
		hexagon14.addPoint(775, 400);
		hexagon14.addPoint(700, 475);
		hexagon14.addPoint(775, 550);
		hexagon14.addPoint(850, 550);
		hexagon14.addPoint(925, 475);
		hexagon14.addPoint(850, 400);
		//fifthteenth polygon
		hexagon15.addPoint(775, 575);
		hexagon15.addPoint(700, 650);
		hexagon15.addPoint(775, 725);
		hexagon15.addPoint(850, 725);
		hexagon15.addPoint(925, 650);
		hexagon15.addPoint(850, 575);
		//sixteenth polygon
		hexagon16.addPoint(950, 312);
		hexagon16.addPoint(875, 387);
		hexagon16.addPoint(950, 462);
		hexagon16.addPoint(1025, 462);
		hexagon16.addPoint(1100, 387);
		hexagon16.addPoint(1025, 312);
		//seventeenth polygon
		hexagon17.addPoint(950, 487);
		hexagon17.addPoint(875, 562);
		hexagon17.addPoint(950, 637);
		hexagon17.addPoint(1025, 637);
		hexagon17.addPoint(1100, 562);
		hexagon17.addPoint(1025, 487);
		//eighteenth polygon
		hexagon18.addPoint(1050, 300);
		hexagon18.addPoint(1125, 375);
		hexagon18.addPoint(1200, 375);
		hexagon18.addPoint(1275, 300);
		//nineteenth polygon
		hexagon19.addPoint(1125, 400);
		hexagon19.addPoint(1050, 475);
		hexagon19.addPoint(1125, 550);
		hexagon19.addPoint(1200, 550);
		hexagon19.addPoint(1275, 475);
		hexagon19.addPoint(1200, 400);
		//twentieth polygon
		hexagon20.addPoint(1125, 575);
		hexagon20.addPoint(1050, 650);
		hexagon20.addPoint(1125, 725);
		hexagon20.addPoint(1200, 725);
		hexagon20.addPoint(1275, 650);
		hexagon20.addPoint(1200, 575);
		//twenty first polygon
		hexagon21.addPoint(1300, 312);
		hexagon21.addPoint(1225, 387);
		hexagon21.addPoint(1300, 462);
		hexagon21.addPoint(1375, 462);
		hexagon21.addPoint(1450, 387);
		hexagon21.addPoint(1375, 312);
		//twenty second polygon
		hexagon22.addPoint(1300, 487);
		hexagon22.addPoint(1225, 562);
		hexagon22.addPoint(1300, 637);
		hexagon22.addPoint(1375, 637);
		hexagon22.addPoint(1450, 562);
		hexagon22.addPoint(1375, 487);
		//twenty third polygon
		hexagon23.addPoint(1400, 300);
		hexagon23.addPoint(1475, 375);
		hexagon23.addPoint(1550, 375);
		hexagon23.addPoint(1625, 300);
		//twenty fourth polygon
		hexagon24.addPoint(1475, 400);
		hexagon24.addPoint(1400, 475);
		hexagon24.addPoint(1475, 550);
		hexagon24.addPoint(1550, 550);
		hexagon24.addPoint(1625, 475);
		hexagon24.addPoint(1550, 400);
		//twenty fifth polygon
		hexagon25.addPoint(1475, 575);
		hexagon25.addPoint(1400, 650);
		hexagon25.addPoint(1475, 725);
		hexagon25.addPoint(1550, 725);
		hexagon25.addPoint(1625, 650);
		hexagon25.addPoint(1550, 575);
		//twenty sixth polygon
		hexagon26.addPoint(1650, 312);
		hexagon26.addPoint(1575, 387);
		hexagon26.addPoint(1650, 462);
		//twenty seventh polygon
		hexagon27.addPoint(1650, 487);
		hexagon27.addPoint(1575, 562);
		hexagon27.addPoint(1650, 637);
		//fill
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
		g.fillPolygon(hexagon12);
		g.fillPolygon(hexagon13);
		g.fillPolygon(hexagon14);
		g.fillPolygon(hexagon15);
		g.fillPolygon(hexagon16);
		g.fillPolygon(hexagon17);
		g.fillPolygon(hexagon18);
		g.fillPolygon(hexagon19);
		g.fillPolygon(hexagon20);
		g.fillPolygon(hexagon21);
		g.fillPolygon(hexagon22);
		g.fillPolygon(hexagon22);
		g.fillPolygon(hexagon23);
		g.fillPolygon(hexagon24);
		g.fillPolygon(hexagon25);
		g.fillPolygon(hexagon26);
		g.fillPolygon(hexagon27);
		//water
		g.setColor(Color.blue);
		g.fillRect(0, 600, 2000, 400);
		//habitat land
		g.setColor(new Color(142, 87, 26));
		Polygon slope = new Polygon();
		slope.addPoint(325, 1000);
		slope.addPoint(1100, 585);
		slope.addPoint(2000, 585);
		slope.addPoint(2000, 1000);
		g.fillPolygon(slope);
		//rail crossbars
		g.setColor(Color.black);
		g.fillRect(0, 200, 2000, 5);
		g.fillRect(0, 250, 2000, 5);
		//rail bars
		int x = 0;
		for (x = 0; x<2000; x = x + 15)
		g.fillRect(x, 195, 7, 105);
		//hippo body
		g.setColor(Color.black);
		g.fillOval(1250, 450, 350, 200);
		
		//hippo face
		g.setColor(Color.black);
		g.fillOval(50, 50, 50, 25);
		g.fillOval(60, 40, 25, 15);
		g.drawLine(10, 90, 90, 90);
		
		
		
		
		
		
		
		
		
		
	}
}
