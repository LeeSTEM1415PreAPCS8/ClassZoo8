
 import java.applet.*;
import java.awt.Color;
import java.awt.Graphics;
 public class Fish extends Applet
{
	
	
	
	public void paint(Graphics g)
	{
	

		//sky
		g.setColor(new Color (94,175,242));
		g.fillRect(0, 0, 1700, 400);
		//sun
		g.setColor(new Color (254,209,29));
		g.fillOval(100,100,200,200);
		//clouds
		g.setColor(new Color (177,177,177));
		g.fillOval(500,60,200,100);
		g.fillOval(1000,120,200,100);
		//ocean
		g.setColor(new Color (0,56,249));
		g.fillRect(0,400,1700,400);
		//fish
		g.setColor(new Color (249,107,2));
		g.fillOval(500,600,100,60);
		//fin
		g.setColor(new Color (253,139,55));
		g.fillRect(515,620,45,20);
		//eyeball 
		g.setColor(new Color (0,0,0));
		g.fillOval(575,610,15,15);
		//plants
		g.setColor(new Color (56,163,41));
		g.fillRect(50,700,30,200);
		g.fillRect(250,650,30,250);
		g.fillRect(450,700,10,165);
		g.fillRect(520,620,20,400);
		g.fillRect(580,670,15,350);
		g.fillRect(700,500,25,350);
		g.fillRect(850,600,15,350);
		g.fillRect(920,700,30,200);
		g.fillRect(1000,600,20,350);
		g.fillRect(1200,460,23,700);
		g.fillRect(1400,600,20,250);
	}
	
	
}