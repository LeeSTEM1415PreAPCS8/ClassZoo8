import java.awt.*;
import java.applet.*;

public class Tyrannosaurus_Rex extends Applet{
	
	public void paint(Graphics g)
	{
		drawHabitat(g);
		drawAnimal(g);
	}

	private void drawAnimal(Graphics g)
	{
		g.setColor(Color.green);
		int b = 20;
		Polygon p = new Polygon();
		p.addPoint(23*b,  31*b);
		p.addPoint(24*b,  32*b);
		p.addPoint(24*b,  33*b);
		p.addPoint(26*b,  35*b);
		p.addPoint(27*b,  35*b);
		p.addPoint(29*b,  33*b);
		p.addPoint(29*b,  24*b);
		p.addPoint(32*b,  21*b);
		p.addPoint(34*b,  21*b);
		p.addPoint(35*b,  22*b);
		p.addPoint(38*b,  22*b);
		p.addPoint(38*b,  23*b);
		p.addPoint(35*b,  23*b);
		p.addPoint(36*b,  24*b);
		p.addPoint(35*b,  24*b);
		p.addPoint(38*b,  25*b);
		p.addPoint(33*b,  25*b);
		p.addPoint(32*b,  25*b);
		p.addPoint(31*b,  24*b);
		p.addPoint(32*b,  25*b);
		p.addPoint(33*b,  25*b);
		p.addPoint(33*b,  25*b);
		p.addPoint(34*b,  29*b);
		p.addPoint(35*b,  29*b);
		p.addPoint(34*b,  30*b);
		p.addPoint(33*b,  29*b);
		p.addPoint(33*b,  30*b);
		p.addPoint(34*b,  31*b);
		p.addPoint(35*b,  31*b);
		p.addPoint(34*b,  32*b);
		p.addPoint(33*b,  31*b);
		p.addPoint(33*b,  33*b);
		p.addPoint(34*b,  33*b);
		p.addPoint(35*b,  34*b);
		p.addPoint(35*b,  36*b);
		p.addPoint(36*b,  36*b);
		p.addPoint(36*b,  37*b);
		p.addPoint(33*b,  37*b);
		p.addPoint(33*b,  36*b);
		p.addPoint(31*b,  34*b);
		p.addPoint(30*b,  34*b);
		p.addPoint(31*b,  34*b);
		p.addPoint(32*b,  35*b);
		p.addPoint(32*b,  37*b);
		p.addPoint(33*b,  37*b);
		p.addPoint(33*b,  38*b);
		p.addPoint(30*b,  38*b);
		p.addPoint(30*b,  37*b);
		p.addPoint(29*b,  36*b);
		p.addPoint(26*b,  36*b);
		p.addPoint(23*b,  33*b);
		g.fillPolygon(p);
	}
		
	
	
	private void drawHabitat(Graphics g)
	{
		
		
	}
}
