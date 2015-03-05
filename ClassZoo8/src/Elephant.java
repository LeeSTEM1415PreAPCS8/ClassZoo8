//Brenda Martinez
//8th Period

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.*;

public class Elephant {

	JFrame frame;
	Elephant drawPanel;
	
	private int oneX = 7;
	
	boolean left = false;
	boolean right = true;
	
	public static void main(String[] args) 
	{
		new Elephant().go();
	}
	
	private void go()
	{
		frame = new JFrame("Elephant in The Wild");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Elephant Elephant = new Elephant();
		frame.getContentPane().add(BorderLayout.CENTER, Elephant);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setSize(1600, 800);
		frame.setLocation(0, 10);
		moveIt();
	}
		private void moveIt()
		{
		while(true){
	if(oneX < 5)
		{
		right = true;
		left = false;
		}
	
	if(oneX >= 1350)
		{
		right = false;
		left = true;
		}
	
	if (right)
		{
		oneX++;
		}
	
	if (left)
		{
		oneX--;
		}
				
	try
		{
			Thread.sleep(10);
		}
				
	catch (Exception exc){}
	frame.repaint();
				
		}
	}
}

	class DrawAnimal extends JPanel
	{ /**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		
		public void paintComponent(Graphics g)
		{
			Graphics2D g2d = (Graphics2D) g;
			//sky - with gradient paint
			GradientPaint orangetoyellow = new GradientPaint(0,0, (new Color(255, 180, 0)), 1600, 0, (new Color(230, 220, 0)));
			g2d.setPaint(orangetoyellow);
			g2d.fill((new Rectangle2D.Double(0,0,1600,1600)));
			
			//sun
			g2d.setColor(new Color(230, 220, 0));
			g2d.fillOval(20, 20, 150, 150);
			
			//grass
			g2d.setColor(new Color(105, 156, 54));
			g2d.fillRect(0, 600, 1600, 350);
			
			//clouds
			g2d.setColor(new Color(255, 255, 255));
			// top right
			g2d.fillOval(300, 20, 150, 50);
			g2d.fillOval(400, 20, 150, 50);
			g2d.fillOval(500, 20, 150, 50);
			g2d.fillOval(600, 20, 150, 50);
			g2d.fillOval(700, 20, 150, 50);
			// top left
			g2d.fillOval(1000, 20, 150, 50);
			g2d.fillOval(1100, 20, 150, 50);
			g2d.fillOval(1200, 20, 150, 50);
			//bottom right
			g2d.fillOval(250, 40, 150, 50);
			g2d.fillOval(350, 40, 150, 50);
			g2d.fillOval(450, 40, 150, 50);
			g2d.fillOval(550, 40, 150, 50);
			g2d.fillOval(650, 40, 150, 50);
			g2d.fillOval(750, 40, 150, 50);
			//bottom left
			g2d.fillOval(950, 40, 150, 50);
			g2d.fillOval(1050, 40, 150, 50);
			g2d.fillOval(1150, 40, 150, 50);
			g2d.fillOval(1250, 40, 150, 50);
			
			//tree trunks
			// #1
			g2d.setColor(new Color(101, 70, 24));
			g2d.fillRect(100, 450, 50, 150);
			// #2
			g2d.fillRect(250, 450, 50, 150);
			// #3
			g2d.fillRect(400, 450, 50, 150);
			// #4
			g2d.fillRect(1000, 450, 50, 150);
			// #5
			g2d.fillRect(1150, 450, 50, 150);
			
			
			//tree tops
			// #1
			g2d.setColor(new Color(63, 100, 24));
			g2d.fillOval(80, 400, 60, 45);
			g2d.fillOval(110, 400, 60, 45);
			g2d.fillOval(70, 420, 60, 45);
			g2d.fillOval(100, 420, 60, 45);
			g2d.fillOval(130, 420, 60, 45);
			// #2
			g2d.fillOval(230, 400, 60, 45);
			g2d.fillOval(270, 400, 60, 45);
			g2d.fillOval(220, 420, 60, 45);
			g2d.fillOval(250, 420, 60, 45);
			g2d.fillOval(280, 420, 60, 45);
			//#3
			g2d.fillOval(370, 400, 60, 45);
			g2d.fillOval(415, 400, 60, 45);
			g2d.fillOval(360, 420, 60, 45);
			g2d.fillOval(390, 420, 60, 45);
			g2d.fillOval(430, 420, 60, 45);
			//#4
			g2d.fillOval(970, 400, 60, 45);
			g2d.fillOval(1000, 400, 60, 45);
			g2d.fillOval(960, 420, 60, 45);
			g2d.fillOval(990, 420, 60, 45);
			g2d.fillOval(1020, 420, 60, 45);
			//#5
			g2d.fillOval(1120, 400, 60, 45);
			g2d.fillOval(1150, 400, 60, 45);
			g2d.fillOval(1110, 420, 60, 45);
			g2d.fillOval(1140, 420, 60, 45);
			g2d.fillOval(1170, 420, 60, 45);
			
			//BODY												
			g2d.setColor(new Color(128, 128, 128));				
			g2d.fillRoundRect(600, 450, 300, 200, 120, 125);		
			//LEGS
			//-----left
			g2d.fillRoundRect(600, 600, 75, 100, 20, 20);			
			g2d.fillRoundRect(625, 575, 75, 100, 20, 20);			
			//-----right
			g2d.fillRoundRect(825, 600, 75, 100, 20, 20);			
			g2d.fillRoundRect(800, 575, 75, 100, 20, 20);			
			//HEAD
			g2d.fillOval(525, 390, 150, 150);						
			//EYES
			g2d.setColor(Color.black);							
			g2d.fillOval(555, 425, 10, 15);						
			//EARS
			g2d.setColor(new Color(128, 128, 128));				
			g2d.fillOval(590, 380, 170, 170);						
			g2d.setColor(Color.pink);								
			g2d.fillOval(590, 385, 160, 160);						
			//TRUNK
			g2d.setColor(new Color(128, 128, 128));				
			g2d.fillRoundRect(500, 450, 50, 125, 150, 125);		
			g2d.fillRoundRect(485, 550, 50, 40, 40, 40);			
			g2d.fillOval(510, 540, 31, 39);						
			//TAIL
			g2d.setColor(new Color(143, 143, 143));				
			g2d.fillOval(880, 470, 15, 100);						
			g2d.fillOval(880, 565, 15, 30);
			
	}
}


