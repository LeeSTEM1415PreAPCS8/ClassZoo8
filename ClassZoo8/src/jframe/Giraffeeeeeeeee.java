package jframe;
// Anna Lagmark // 


import javax.swing.*;

import java.awt.*;
import java.awt.geom.Rectangle2D;

final public class Giraffeeeeeeeee {
	
	public static final JFrame jframe = null;
	JFrame frame;
	DrawPanel drawPanel;
	
	private int oneX = 7;
	private int oneY = 7;
	
	
	boolean up = false;
	boolean down = true;
	boolean left = false;
	boolean right = true;
	
	public static void main(String[] args) {
		new Giraffeeeeeeeee().go();
		
	}
	
	private void go() {
		frame = new JFrame("shARK");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		drawPanel = new DrawPanel();
		
		frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
		
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setSize(1600, 800);
		frame.setLocation(375, 55);
		moveIt();
		
		
	}

	
	class DrawPanel extends JPanel {
		
		 Bubble b1 = new Bubble();
		 Bubble b2 = new Bubble();
		 Bubble b3 = new Bubble();
		 Bubble b4 = new Bubble();
		 Bubble b5 = new Bubble();
		 Bubble b6 = new Bubble();
		 Bubble b7 = new Bubble();
		 Bubble b8 = new Bubble();
		 Bubble b9 = new Bubble();
		 Bubble b10 = new Bubble();
		 Bubble b11 = new Bubble();
		 Bubble b12 = new Bubble();
		 Bubble b13 = new Bubble();
		 Bubble b14 = new Bubble();

		public void paintComponent(Graphics g) {
			
			Graphics2D g2d = (Graphics2D) g;
			drawHabitat(g2d);
	        
			
			//giraffeeeeeeeee body
	       	g2d.setColor(Color.YELLOW);
	        Rectangle2D.Double body = new Rectangle2D.Double(600+oneX, 400+oneY, 400, 200);
	    	g2d.fill(body);
	    	g2d.fillRect(625+oneX, 600+oneY, 25, 100);
	    	g2d.fillRect(925+oneX, 600+oneY, 25, 100);
	    	g2d.fillRect(925+oneX,200+oneY,75,250);
	    	g2d.fillRect(925+oneX,105+oneY,150,100);
	    	g2d.fillRect(925+oneX, 80+oneY,10,25);
	
	    	
	        //eyes
	    	g2d.setColor(Color.WHITE); 
	    	g2d.fillRect(940+oneX,120+oneY, 50,50); 
	    	
	    	//pupils
	    	g2d.setColor(Color.BLACK);
	    	g2d.fillRect(925+oneX, 690+oneY, 25, 25);
	    	g2d.fillRect(625+oneX, 690+oneY, 25, 25);
	    	g2d.fillRect(960+oneX,130+oneY,25,25);
	    	
	    	//ear and nose
	    	g2d.setColor(new Color(112,73,48));
	    	g2d.fillRect(1025+oneX, 105+oneY, 50, 100);
	    	g2d.fillRect(925+oneX, 75+oneY,10,10);
	    	
	    	//spots
	    	g2d.setColor(Color.MAGENTA);
	    	g2d.fillOval(625+oneX, 400+oneY, 40, 20);
	    	g2d.fillOval(625+oneX,425+oneY,45,25);
	    	g2d.fillOval(635+oneX,500+oneY,60,30);
	    	g2d.fillOval(675+oneX,535+oneY,25,35);
	    	g2d.fillOval(700+oneX,535+oneY,27,30);
	    	g2d.fillOval(750+oneX,510+oneY,45,36);
	    	g2d.fillOval(745+oneX,500+oneY,57,45);
	    	g2d.fillOval(745+oneX,400+oneY,65,75);
	    	g2d.fillOval(760+oneX,425+oneY,75,75);
	    	g2d.fillOval(844+oneX,425+oneY,67,67);
	    	g2d.fillOval(875+oneX,415+oneY,24,37);
	    	g2d.fillOval(900+oneX,500+oneY,65,75);
	    	g2d.fillOval(925+oneX,400+oneY,45,62); 
	    	g2d.fillOval(940+oneX,300+oneY,45,60);
	    	g2d.fillOval(940+oneX,245+oneY,36,45);
	    	
	    	
		}
	}
	    	
	    	
	    	
	    	   
	    	
	    // A TREEEE AND BACKGROUNDDDD
	    	
         private void drawHabitat(Graphics2D g){
		 Graphics2D g2d = (Graphics2D) g;
		//background	
		 	g.setColor(Color.CYAN);
	    	g.fillRect(0,0,2000,400);
	    	g.setColor(Color.green);
	    	g.fillOval(0,400,2000,600);
	    	
	    //tree trunk
	    	g2d.setColor(new Color(112,73,48));
	    	g2d.fillRect(1500, 150, 75, 500); 
	    
	    //leaves
	    	GradientPaint gp3 = new GradientPaint(5, 25,
	    	Color.green, 2, 2, Color.black, true);
	    	g2d.setPaint(gp3);
	    	g2d.fillRect(1350, 50, 450, 100);
	    
	    //apple
	    	g2d.setColor(Color.RED);
	    	g2d.fillRect(1370,62,34,35);
	    	
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
		}

	}



class Bubble
{
	int x;
	int y;
	
	public Bubble()
	{
		x = (int) (Math.random() * 800);
		y = (int) (Math.random() * 800);
		
	}
	
	public void drawIt(Graphics g)
	{
    g.drawArc(x, y, 40, 40, 100, 360);
    g.fillOval(x, y, 20, 20);
    g.fillOval(x+20, y+20, 5, 5);
	}
	
	public void moveIt(Graphics g)
	{
		if (y <= 1)
		{
			y+=800;
			x = (int)(Math.random() * 800);
		}
		y--;
		drawIt(g);
	}
	
}

	
	
	
	
	