// Eduardo Hernandez
import java.awt.*;
import java.applet.*;
public class Lion extends Applet {
	
	public void paint(Graphics g){
	{
		drawHabitat(g);
		drawAnimal(g);}
	}
	
		private void drawHabitat(Graphics g){
		//Sky
		g.setColor(Color.CYAN);
		g.fillRect(0, 0, 800, 300);
		
		//Sun
		g.setColor(Color.YELLOW);
		g.fillOval(10, 10, 100, 100);
		
		//Grass
		g.setColor(Color .GREEN);
		g.fillRect(0, 300, 800, 300);
		
		}
		
		private void drawAnimal(Graphics g){
		//body
		g.setColor(Color .ORANGE);
		g.fillRect(300, 250, 200, 100);
		g.fillRect(300, 350, 25, 75);
		g.fillRect(340, 350, 25, 75);
		g.fillRect(435, 350, 25, 75);
		g.fillRect(475, 350, 25, 75);
		g.fillRect(450, 200, 100, 100);	
		
		//Eyes
		g.setColor(Color.);
		g.fillOval(475, 225, 10, 10);
		
	}
	

	
}
