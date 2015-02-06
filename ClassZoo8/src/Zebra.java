//Christian Hernandez


import java.awt.Color;

import java.awt.GradientPaint;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.GradientPaint;
import java.awt.GradientPaint;

class DrawPanel extends JPanel {

    private void doDrawing(Graphics g) {
        
    	   Graphics2D g2d = (Graphics2D) g;


        GradientPaint gp6 = new GradientPaint(10, 5,
                Color.yellow, 20, 10, Color.green, true);
        	g2d.setPaint(gp6);
      //  g2d.setColor(new Color(32, 142, 35));
        g2d.fillRect(0, 500, 2000, 400);

        g2d.setColor(new Color(42, 179, 231));
        g2d.fillRect(0, 0, 2000, 500);

        //tree
        g.setColor(new Color(152, 137, 58));
		g.fillRect(1300, 250, 100, 300);
		//leaves
		g.setColor(new Color(6, 179, 109));
		g.fillOval(1300, 150, 100, 100);
		g.fillOval(1250, 250, 100, 100);
		g.fillOval(1235, 200, 100, 100);
		g.fillOval(1375, 175, 100, 100);
		g.fillOval(1368, 200, 100, 100);
		g.fillOval(1300, 240, 100, 100);
		g.fillOval(1370, 250, 100, 100);
		g.fillOval(1260, 160, 100, 100);
		//hole in tree
		g.setColor(Color.black);
		g.fillOval(1325, 375, 50, 75);
		//sun
		g.setColor(Color.yellow);
		g.fillOval(25, 50, 100, 100);
		// Body

        
        GradientPaint gp1 = new GradientPaint(5, 20,
                Color.white, 20, 20, Color.black, true);
        	g2d.setPaint(gp1);
        	g2d.fillOval(600, 300, 300, 150);
        	g2d.fillRect(625, 415, 25, 100);
			g2d.fillRect(675, 415, 25, 100);
			g2d.fillRect(780, 415, 25, 100);
			g2d.fillRect(850, 415, 25, 100);
			// Hooves
			g.setColor(Color.black);
			g.fillRect(625, 515, 25, 15);
			g.fillRect(675, 515, 25, 15);
			g.fillRect(780, 515, 25, 15);
			g.fillRect(850, 515, 25, 15);
			// Neck
			  GradientPaint gp2 = new GradientPaint(5, 20,
		                Color.white, 20, 20, Color.black, true);
		        	g2d.setPaint(gp2);
		    Polygon p = new Polygon();
			p.addPoint(640, 350);
			p.addPoint(580, 275);
			p.addPoint(560, 300);
			p.addPoint(630, 425);
			g.fillPolygon(p);
				//Face
			 GradientPaint gp4 = new GradientPaint(5, 20,
		                Color.white, 20, 20, Color.black, true);
		        	g2d.setPaint(gp4);
				g2d.fillOval(495, 265, 100, 50);
				g.setColor(Color.black);
				g.fillOval(550, 270, 20, 20);
				g.setColor(Color.white);
				g.fillOval(551, 278, 10, 10);
				g.setColor(Color.blue);
				g.fillOval(551, 282, 5, 5);
				g.setColor(Color.black);
				g.fillRect(495, 280, 20, 20);
				g.setColor(new Color(42, 179, 231));
				g.fillOval(440, 150, 130, 130);
				g.fillOval(645, 220, 260, 100);
				g.setColor(Color.red);
				g.drawLine(510, 308, 530, 295);
				//Tail
				  GradientPaint gp3 = new GradientPaint(5, 20,
			                Color.white, 20, 20, Color.black, true);
			        	g2d.setPaint(gp3);
				g.fillRect(890, 360, 125, 20);
				g.setColor(Color.black);
				g.fillOval(998, 357, 75, 25);
				//ears
				 GradientPaint gp5 = new GradientPaint(5, 20,
			                Color.white, 20, 20, Color.black, true);
			        	g2d.setPaint(gp5);
				g2d.fillOval(554, 230, 25, 40);
				g2d.fillOval(540, 230, 25, 40);
				g.setColor(Color.pink);
				g.fillOval(554, 235, 15, 35);
				g.fillOval(540, 235, 15, 35);
				//stripes
				g.setColor(Color.black);
				//g.fillRect(670, 308, 20, 75 );
				//g.fillRect(740, 320, 20, 105 );
				//g.fillRect(810, 318, 20, 75 );
				//g.fillRect(700, 373, 20, 75 );
				//g.fillRect(770, 373, 20, 75 );
				//g.fillRect(600, 315, 15, 75 );
				//g.fillRect(625, 450, 15, 10);
				//g.fillRect(635, 490, 15, 10);
				//g.fillRect(675, 470, 23, 10);
				//g.fillRect(780, 470, 15, 10);
				//g.fillRect(850, 450, 15, 10);
				//g.fillRect(860, 490, 15, 10);
				
				
				    }

    @Override
    public void paintComponent(Graphics g) {
        
        super.paintComponent(g);
        doDrawing(g);
    }
}

public class Zebra extends JFrame {

    public Zebra() {
        initUI();
    }

    public final void initUI() {

        DrawPanel dpnl = new DrawPanel();
        add(dpnl);

        setSize(1700, 900);
        setTitle("Zebra");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Zebra ex = new Zebra();
                ex.setVisible(true);
            }
        });
    }
}
