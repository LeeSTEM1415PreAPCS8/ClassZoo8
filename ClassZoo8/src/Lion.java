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
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, 800, 300);
		
		//Grass
		g.setColor(Color .GREEN);
		g.fillRect(0, 300, 800, 300);
		}
		
		private void drawAnimal(Graphics g){
		
		g.setColor(Color .ORANGE);
		g.fillRect(300, 250, 200, 100);
		g.fillRect(300, 350, 25, 75);
		g.fillRect(340, 350, 25, 75);
		g.fillRect(435, 350, 25, 75);
		g.fillRect(475, 350, 25, 75);
		g.fillRect(450, 200, 100, 100);	
		
	}
	

	
}
