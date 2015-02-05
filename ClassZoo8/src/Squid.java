/*Computer Science Pre-AP
8th period
Richard LaVelle
*/

import java.awt.*;
import java.applet.*;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;


class DrawPanel extends JPanel {

    private void doDrawing(Graphics g) {
        
        Graphics2D g2d = (Graphics2D) g;
        
        GradientPaint gp1 = new GradientPaint(5, 5,
                Color.red, 20, 20, Color.black, true);

        g2d.setPaint(gp1);
        g2d.fillRect(20, 20, 300, 40);

        GradientPaint gp2 = new GradientPaint(5, 25,
                Color.yellow, 20, 2, Color.black, true);

        g2d.setPaint(gp2);
        g2d.fillRect(20, 80, 300, 40);

        GradientPaint gp3 = new GradientPaint(5, 25,
                Color.green, 2, 2, Color.black, true);

        g2d.setPaint(gp3);
        g2d.fillRect(20, 140, 300, 40);

        GradientPaint gp4 = new GradientPaint(25, 25,
                Color.blue, 15, 25, Color.black, true);

        g2d.setPaint(gp4);
        g2d.fillRect(20, 200, 300, 40);

        GradientPaint gp5 = new GradientPaint(0, 0,
                Color.orange, 0, 20, Color.black, true);

        g2d.setPaint(gp5);
        g2d.fillRect(20, 260, 300, 40); 
        
        
        drawHabitat(g2d);
        drawAnimal(g2d);
        
    }
    private void drawAnimal(Graphics2D g)
	{
		//squid head
		g.setColor(Color.white);
		Polygon p = new Polygon();
		p.addPoint(700, 200);
		p.addPoint(550, 400);
		p.addPoint(850, 400);
		g.fillPolygon(p);
	
		//squid body
		g.fillRect(590, 350, 220, 300);
		
		//squid tenticles
		g.setColor(Color.white);
		g.fillRect(595, 600, 50, 150);
		g.fillRect(650, 600, 50, 150);
		g.fillRect(705, 600, 50, 150);
		g.fillRect(760, 600, 50, 150);
		g.fillRect(590, 550, -150, 50);
		g.fillRect(790, 550, 150, 50);
		
		//squid "mask"
		g.setColor(Color.black);
		g.fillOval(588, 393, 224, 90);
		//squid eyes
		g.setColor(Color.white);
		g.drawOval(610, 400, 75, 75);
		g.fillOval(610, 400, 75, 75);
		g.fillOval(710, 400, 75, 75);
		//squid pupils
		g.setColor(Color.black);
		g.fillOval(635, 420, 25, 25);
		g.fillOval(735, 420, 25, 25);
		
	
		
		
	}
	
	private void drawHabitat(Graphics2D g)
	{
		//water
		g.setColor(new Color(100,200,255));
		g.fillRect(0, 0, 80000, 80000);
		
		//bubbles
		// oval: X1:distance out on x axis, y1: how far down the sphere is x2: how wide the sphere is y2 how tall the sphere is
		g.setColor(new Color(255, 255, 255));
		g.fillOval(1200,200,50,50);
		g.fillOval(1100,500,50,50);
		g.fillOval(100,500,50,50);
		g.fillOval(200,700,50,50);
		g.fillOval(300,200,100,100);
		g.fillOval(1000,500,100,100);
		
	}
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        doDrawing(g);
    }



 
}


public class Squid extends JFrame{
	
	 public final void initUI() {

	        DrawPanel dpnl = new DrawPanel();
	        add(dpnl);

	        setSize(360, 300);
	        setTitle("Rectangles");
	        setLocationRelativeTo(null);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    }

	    public static void main(String[] args) {

	        SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                Squid ex = new Squid();
	                ex.setVisible(true);
	            }
	        });
	    }
	//public void paint(Graphics g)
	//{
	//	drawHabitat(g);
	//	drawAnimal(g);
	//}

	
}
