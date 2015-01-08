//Keamber McCracken
import java.awt.*;
import java.applet.*;

public class Snowleopard extends Applet{
	
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
		//Sky
		g.setColor(new Color(4, 186, 255));
		g.fillRect(0, 0, 1600, 1600);
		
		//Sun
		g.setColor(new Color(243, 253, 55));
		g.fillOval(15, 5, 125, 125);
		
		//Gate
		g.setColor(new Color(0, 0, 0));
		g.fillRect(0, 260, 1600, 350);
		
		//Bars in the Gate
		g.setColor(new Color(4, 186, 255));
		g.fillRect(15,100 , 1600, 350);
		
		
}
}
