
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.*;

import javax.swing.JPanel;



class DrawPanel extends JPanel {

    private void doDrawing(Graphics g) {
        
        Graphics2D g2d = (Graphics2D) g;
        
        
     

      //Sky
		g2d.draw((new Rectangle2D.Double(0,0,1600,800)));	
		GradientPaint whitetoblue = new GradientPaint(0,0, Color.WHITE, 1600,0, Color.BLUE);
		g2d.setPaint(whitetoblue);
		g2d.fill(new Rectangle2D.Double(0,0,1600,800));
		
		
		//Grass						
		g2d.draw((new Rectangle2D.Double(0,550,1600,800)));
		
		GradientPaint orangetogreen = new GradientPaint(0,550, Color.ORANGE, 1600,550, Color.GREEN);
		g2d.setPaint(orangetogreen);
		g2d.fill(new Rectangle2D.Double(0,550,1600,800));
		
		//Small Pond
		g2d.setColor(new Color(100,250,255));
		g2d.fillOval(800,615,770,175);
		
		//Fence
		g2d.setColor(Color.black);
	
		int x = 0;
		for (x=0; x<2000; x=x+50)
		g2d.fillRect(x,200,20,350);
		
		g2d.draw((new Rectangle2D.Double(0,200,2000,40)));
		
		GradientPaint fencebar = new GradientPaint(0,200, Color.RED, 1600,200, Color.BLACK);
		g2d.setPaint(fencebar);
		g2d.fill(new Rectangle2D.Double(0,200,2000,40));
		
		//Trees
		g2d.setColor(new Color (128,64,0));
		g2d.fillRect(90, 250, 70, 450);
		g2d.fillRect(400, 250, 70, 450);
		
		g2d.setColor(new Color (0,128,0));
		g2d.fillOval(5, 150, 250,200);
		g2d.fillOval(310, 150, 250, 200);
		
		//Sun
		g2d.setColor(Color.yellow);
		g2d.fillOval(1400,30,150,150);			
		
		//Flamingo			
		g2d.setColor(Color.pink);
		
		g2d.fillOval(900,560,120,90);
		
		g2d.setColor(Color.pink);
		
		g2d.fillRect(1000, 500, 20,100);
		//head (x, y, width, length  x and width, y and length)
		g2d.fillOval(993, 460, 60, 50);
		
		g2d.setColor(Color.black);
		g2d.fillOval(1035,475,5,5);
		
		//beak		
		g2d.setColor(Color.orange);
		g2d.fillRect(1045, 480, 30, 20);
		
		g2d.setColor(new Color (128,64,64));
		g2d.fillRect(940, 647, 5, 100);
		g2d.fillRect(980,647,5,100);
		
		//bushes		
		g.setColor(new Color(0,128,0));
		g2d.fillOval(1300,550,150,110);
		
    }
}
