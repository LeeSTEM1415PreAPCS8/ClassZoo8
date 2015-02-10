//Jesse Contreras [Period 8]
package jframe;
import java.awt.GradientPaint;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

class DrawPanel extends JPanel {
	public void paint(Graphics g)
	{
		
		doDrawing(g);
		drawAnimal(g);
	}

	  private void doDrawing(Graphics g) {
		  
	  

		
	    	//Habitat
			g.setColor(Color. white);
			g.fillRect(0,500,5000,5000);
			//g.setColor(new Color (80,180,210));
		     Graphics2D gd2 = (Graphics2D) g;
			   GradientPaint gp1 = new GradientPaint(25, 1500,
	           new Color(230,220,104), 100, 100,  new Color(80,180,210), true);
		       gd2.setPaint(gp1);
			g.fillRect(0,0,5000,500);
			//sun
			//g.setColor(new Color(225,221,62));
			//g.fillOval(700, 100, 150, 150);
			g.setColor(new Color(172,218,232));
			g.fillOval(100, 550, 225, 75);
	           Graphics2D gd1 = (Graphics2D) g;
			   GradientPaint gp3 = new GradientPaint(25, 200,
	           new Color(70,116,172), 100, 100, Color.white, true);
		       gd1.setPaint(gp3);
		    g.fillOval(100, 560, 225, 65);
			
	  }
			private void drawAnimal(Graphics g){
		    	{
		    		//Body
					g.setColor(Color.black);
					g.fillOval(400, 400, 150, 220);

					//Wings
					g.setColor(Color.black);
					g.fillOval(310, 460, 150, 35);
					g.fillOval(520, 450, 35, 130);
					

					
					//Feet
					g.setColor(new Color(233,153,65));
					g.fillOval(425, 610, 35,20);
					g.fillOval(490, 610, 35,20);
					
					
					
					//Stomach
				    Graphics2D gd3 = (Graphics2D) g;
					   GradientPaint gp5 = new GradientPaint(25, 10,
			          Color.white, 100, 100,  new Color(150,150,150), true);
				       gd3.setPaint(gp5);
					g.fillOval(420, 400, 110, 190);
					
					//Head
					g.setColor(Color.black);
					g.fillOval(415, 370, 120, 120);
					
					//Beak
					g.setColor(new Color(233,166,27));
				
					Polygon T=new Polygon();
					T.addPoint(460, 450-5);
					T.addPoint(490, 450-5);
					T.addPoint(475, 466-5);
					g.fillPolygon(T);

					
					//Eyes
					g.setColor(Color. white);
					g.fillOval(435, 400, 25, 25);
					g.fillRect(491, 415, 24, 11);
					g.fillOval(490, 400, 25, 25);
					g.fillRect(436, 415, 24, 11);
					g.setColor(new Color(92,92,92));
					g.fillOval(440, 410, 15, 15);
					g.fillOval(495, 410, 15, 15);
					
					//Fish
			           Graphics2D gd8 = (Graphics2D) g;
					   GradientPaint gp8 = new GradientPaint(15, 100,
							   new Color(172,188,213), 100, 100,new Color(75,75,75) , true);
				       gd8.setPaint(gp8);
					//g.setColor(new Color(172,188,213));
					g.fillOval(320, 450, 35, 120);
					g.fillOval(310, 450, 55, 12);
					g.setColor(Color. white);
					g.fillOval(325, 550, 10, 10);
					g.setColor(Color. black);
					g.fillOval(325, 555, 6, 6);
			
	    }
			}

		    @Override
		    public void paintComponent(Graphics g) {
		        
		        super.paintComponent(g);
		        doDrawing(g);
		    }
		}

		public class jPenguin extends JFrame {

		    public jPenguin() {
		        initUI();
		    }

		    public final void initUI() {

		        DrawPanel dpnl = new DrawPanel();
		        add(dpnl);

		        setSize(960, 900);
		        setTitle("jframe Penguin");
		        setLocationRelativeTo(null);
		        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    }

		    public static void main(String[] args) {

		        SwingUtilities.invokeLater(new Runnable() {
		            public void run() {
		                habitat ex = new habitat();
		                ex.setVisible(true);
		            }
		        });
		    }
		}