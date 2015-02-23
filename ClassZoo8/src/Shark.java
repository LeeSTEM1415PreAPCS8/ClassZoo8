import javax.swing.*;

import java.awt.*;

final public class Shark {
	
	public static final JFrame jframe = null;
	JFrame frame;
	DrawPanel drawPanel;
	
	private int oneX = 1;
	private int oneY = 1;
	
	
	boolean up = false;
	boolean down = true;
	boolean left = false;
	boolean right = true;
	
	public static void main(String[] args) {
		new Shark().go();
		
	}
	
	private void go() { 
		//creates jframe panel
		frame = new JFrame("shARK");
		
		//closes jframe panel
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		drawPanel = new DrawPanel();
		
		frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
		
		
		// sets size + open location for jframe panel
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setSize(800, 800);
		frame.setLocation(375, 55);
		moveIt();
		
		
	}

	
	class DrawPanel extends JPanel {
		// creates new bubbles

		public void paintComponent(Graphics g) {
			
			
			   super.paintComponent(g);  // dis is tha bg + gradient
		        Graphics2D g2d = (Graphics2D) g;
		        Color color1 = getBackground();
		        Color color2 = color1.darker();
		        int w = getWidth();
		        int h = getHeight();
		        GradientPaint gp = new GradientPaint(
		            0, 0, color1, 0, h, color2);
		        g2d.setPaint(gp);
		        g2d.fillRect(0, 0, w, h);
			drawHabitat(g2d);
	        
				//tiger
		        GradientPaint gp1 = new GradientPaint(
			            0, 0, Color.black, 20, 5, Color.WHITE, true);
			        g2d.setPaint(gp1);
			        g2d.fillRect(oneX +200,oneY +400,300,200);//body
			        g2d.fillRect(oneX +100,oneY +350,100,100);//head
			       
		
			        
			        
 	

			        
	        
	        

			
	      
	        
		}
		// This method needs a graphics object and draws the habitat
		private void drawHabitat(Graphics g)
		{
			//sky
			g.setColor(new Color(100,200,255));//set color to a light blue
			g.fillRect(0, 0, 1000, 800);
			
			//Grass
			g.setColor(Color.GREEN);
			g.fillRect(0,350,1000,1000);
			g.fillOval(-100, 300, 500, 200);
			g.fillOval(300, 300, 300, 200);
			g.fillOval(380, 300, 500, 200);
			g.fillOval(800, 300, 300, 200);
				
			//Sun Sun
			g.setColor(Color.yellow);
			g.fillOval(697,97,80,80);
			g.setColor(Color.orange);
			g.fillOval(700, 100, 75, 75);
			
			//tree
			g.setColor(new Color(77,50,30));
			Polygon tree = new Polygon();
			tree.addPoint(650,540);
			tree.addPoint(658,248+50);
			tree.addPoint(695,250+50);
			tree.addPoint(703,538);
			g.fillPolygon(tree);
			g.setColor(new Color(0,132,0));
			g.fillOval(550,470-300,250,200);

		}
	}
	private void moveIt() {
		while(true){
			if(oneX >= 283){
				right = false;
				left = true;
			}
			if (oneX <= 7){
				right = true;
				left = false;
			}
			if (oneY >= 259){
				up = true;
				down = false;
			}
			if (oneY <= 7){
				up = false;
				down = true;
			}
			if(up){
				oneY--;
			}
			if(down){
				oneY++;
			}
			if(left){
				oneX--;
			}
			if(right){
				oneX++;
			}
			try{
				Thread.sleep(10);
			} catch (Exception exc){}
			frame.repaint();
				
			
		}
		
	


}}

	
	
	
	
	