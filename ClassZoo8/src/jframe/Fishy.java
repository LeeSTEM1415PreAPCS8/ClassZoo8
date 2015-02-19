//Brianna Valdez

package jframe;


import javax.swing.*;

import java.awt.*;

final public class Fishy {

	JFrame frame;
	
	DrawPanel drawPanel;
	
	private int oneX = 200;
	
	private int oneY = 550;
	
	boolean up = false;
	
	boolean down = true;
	
	boolean left = false;
	
	boolean right = true;
	
	public static void main(String[] args) {
		new Fishy().go();
		}
	
	void go() {
	
	frame = new JFrame("Test");
	
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	drawPanel = new DrawPanel();
	
	frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
	
	frame.setVisible(true);
	
	//frame.setResizable(false);
	
	frame.setSize(1000, 800);
	
	frame.setLocation(375, 55);
	
	moveIt();
	
	}
	
	class DrawPanel extends JPanel {
	
		public void paintComponent(Graphics g) {
			Graphics2D g2d = (Graphics2D) g;
		
			g.setColor(Color.BLUE);
			
			g.fillRect(0, 0, this.getWidth(), this.getHeight());
			
			g.setColor(Color.RED);
			
			g.fillRect(3, 3, this.getWidth()-6, this.getHeight()-6);
			
			g.setColor(Color.WHITE);
			
			g.fillRect(6, 6, this.getWidth()-12, this.getHeight()-12);
			
			//pond
			g.setColor(new Color (39,158,132));
			g.fillOval(200, 550,600, 200);

			
			g.setColor(new Color(249,107,2));
			
				
			GradientPaint gp1 = new GradientPaint(5, 5,
	               new Color(0,230,255), 20, 20, new Color(128,4,210), true);

	      
			 g2d.setPaint(gp1);
	         g2d.fillOval(oneX, oneY,100,60);

		g.fillOval(oneX, oneY, 100, 60);// fish
		
			int finx, eyex;
			
			if (right)
				{
				finx=oneX+15;
				eyex=oneX+75;
				}
			else
				{
				finx=oneX+40;
				eyex=oneX+15;
				}
		//fish
			g.setColor(new Color (128,0,128));
			g.fillRect(finx, oneY+20, 45, 20);//fin
			
			g.setColor(Color .black);
			g.fillOval(eyex, oneY+10, 15, 15);//eyes
			
			
			}
		
		}
	
	private void moveIt() {
	
		while(true){
		
			if(oneX >= 600){
			
				right = false;
				
				left = true;
				
			}
			
			if(oneX <= 200){
			
				right = true;
				
				
				left = false;
				
			}
			
			if(oneY >= 550){
			
				up = true;
				
				down = false;
			
			}
			
			if(oneY <= 600){
			
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
	
	}

}