//Brenda Martinez
//computer science 8th

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

final public class Elephant 
{
JFrame frame;
DrawPanel drawPanel;
private int oneX = 56;
boolean left = false;
boolean right = true;
public static void main(String[] args) {
	new Elephant().go();
}

private void go() 
{
frame = new JFrame("Elephant");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
drawPanel = new DrawPanel();
frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
frame.setVisible(true);
frame.setResizable(false);
frame.setSize(1270, 984);
frame.setLocation(3, 4);
moveIt();
}

private void moveIt()
{
	while(true){

		if(oneX >= 1290)
			{
				right = false;
				left = true;
			}

		if(oneX <= 7)
			{
				right = true;
				left = false;
			}
			if(left)
			{
				oneX--;
			}

		if(right)
			{
				oneX++;
			}
		try
			{
				Thread.sleep(15);
			}
	catch (Exception exc){}
	frame.repaint();
}
}

class DrawPanel extends JPanel 
{
/**
	 * 
	 */
private static final long serialVersionUID = 1L;

public void paintComponent(Graphics g) 
{
	Graphics2D g2d = (Graphics2D) g;
			//sky
			GradientPaint cyantoblue = new GradientPaint(0,0, Color.CYAN, 1600, 0, Color.BLUE);
			g2d.setPaint(cyantoblue);
			g2d.fill((new Rectangle2D.Double(0,0,1600,1600)));
			
			//sun
			g2d.setColor(new Color(255, 255, 0));
			g.fillOval(20, 20, 150, 150);
			
			//grass
			g2d.setColor(new Color(105, 151, 60)); g2d.fillRect(0, 600, 1600, 375);
			
			//clouds
			g2d.setColor(new Color(255, 255, 255)); g2d.fillOval(oneX, 70, 200, 100);
			
			//tree trunks
			g2d.setColor(new Color(101, 70, 24));
			g2d.fillRect(100, 450, 50, 150);	
			g2d.fillRect(250, 450, 50, 150);
			g2d.fillRect(400, 450, 50, 150);	
			g2d.fillRect(1000, 450, 50, 150);
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
			g.setColor(new Color(128, 128, 128));				
			g.fillRoundRect(600, 450, 300, 200, 120, 125);		
			//LEGS
			//-----left
			g.fillRoundRect(600, 600, 75, 100, 20, 20);			
			g.fillRoundRect(625, 575, 75, 100, 20, 20);			
			//-----right
			g.fillRoundRect(825, 600, 75, 100, 20, 20);			
			g.fillRoundRect(800, 575, 75, 100, 20, 20);			
			//HEAD
			g.fillOval(525, 390, 150, 150);						
			//EYES
			g.setColor(Color.black);							
			g.fillOval(555, 425, 10, 15);						
			//EARS
			g.setColor(new Color(128, 128, 128));				
			g.fillOval(590, 380, 170, 170);						
			g.setColor(Color.pink);								
			g.fillOval(590, 385, 160, 160);						
			//TRUNK
			g.setColor(new Color(128, 128, 128));				
			g.fillRoundRect(500, 450, 50, 125, 150, 125);		
			g.fillRoundRect(485, 550, 50, 40, 40, 40);			
			g.fillOval(510, 540, 31, 39);						
			//TAIL
			g.setColor(new Color(143, 143, 143));				
			g.fillOval(880, 470, 15, 100);						
			g.fillOval(880, 565, 15, 30);
		}
	}
}
