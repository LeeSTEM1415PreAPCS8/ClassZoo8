package jframe;
import javax.swing.*;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
//Julia Singer
final public class ballbouncing {

JFrame frame;

DrawPanel drawPanel;

private int oneX = 1000; //change these to make it move
private int oneY = 500;//change these to make it move

//directions
boolean up = false; //it wont go down

boolean down = true;//it will go down while going to the right

boolean left = false;//it won't move left

boolean right = true;//it will go right while going down

public static void main(String[] args) {

new ballbouncing().go();

}

private void go() {

	//sets up the white plane and how big it is
frame = new JFrame("Test");

frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

drawPanel = new DrawPanel();

frame.getContentPane().add(BorderLayout.CENTER, drawPanel);

frame.setVisible(true);

//frame.setResizable(false);

frame.setSize(1200, 800);

frame.setLocation(375, 55);

moveIt();

}

class DrawPanel extends JPanel {
   // int x=1000;
 //   int y=500;

	
public void paintComponent(Graphics g) {

    Graphics2D g2 = (Graphics2D) g;      	   
   drawHabitat(g2);  
	//g.setColor(new Color(109,66,22));
    
   //new gradient
   GradientPaint gp1 = new GradientPaint(5, 5,
            Color.red, 20, 20, Color.YELLOW, true);
    g2.setPaint(gp1);

//snakes body
	g2.fill(new Ellipse2D.Double(oneX,oneY,50,50));
	g2.fill(new Ellipse2D.Double(oneX-25,oneY-25,50,50));
	g2.fill(new Ellipse2D.Double(oneX-50,oneY-50,50,50));
	g2.fill(new Ellipse2D.Double(oneX-75,oneY-50,50,50));
	g2.fill(new Ellipse2D.Double(oneX-100,oneY-35,50,50));
	g2.fill(new Ellipse2D.Double(oneX-125,oneY-25,50,50));
	g2.fill(new Ellipse2D.Double(oneX-150,oneY-25,50,50));
	g2.fill(new Ellipse2D.Double(oneX-175,oneY-35,50,50));
	
//snakes face
	g.setColor(Color.BLACK);
	g2.fill(new Ellipse2D.Double(oneX-165, oneY-25, 5, 5));
	g2.fill(new Ellipse2D.Double(oneX-155, oneY-25, 5, 5));
	g2.fill(new Rectangle2D.Double(oneX-180, oneY-0, 20, 5));
	
	
}
private void drawHabitat(Graphics2D g2)
{   //sky
	//g2.setColor(Color.BLUE);
    GradientPaint gp3 = new GradientPaint(5, 25,
            Color.blue, 2, 2, (new Color(0,225,225)), true);
    g2.setPaint(gp3);
	g2.fill(new Rectangle2D.Double(0,0,2000,400));
	
	//ground
	g2.setColor(Color.green);
	g2.fill(new Rectangle2D.Double(0,400,2000,600));
	
	//tree
	g2.setColor(new Color(74,64,28));
	g2.fill(new Rectangle2D.Double(245, 480, 100, 200));
	g2.setColor(new Color(32,94,39));
	g2.fill(new Ellipse2D.Double(200, 300, 200, 200)); 
	
	//trees unsatisfied face
	g2.setColor(Color.BLACK);
	g2.fillOval(250, 375, 20, 20);
	g2.fillOval(310, 375, 20, 20);
	g2.drawArc(200, 400, 100, 20, 50, 50);
}
}

private void moveIt() {

while(true){

if(oneX >= 1000){ //determines how far it will move left to right
	

right = false;//it won't go right

left = true;//it will go left

}
//if less than 200 go right if not go left
if(oneX <=200 ){

right = true;

left = false;

}
//if greater than405 then go up if not go down
if(oneY >= 405){

up = true;

down = false;

}
//if less than 600 go down if not go up
if(oneY <=600){
up = false;

down = true;

}
//if you go up then subtract oneY
if(up){

oneY--;

}
//if you go down then add oneY
if(down){

oneY++;

}
//if you go left then subtract oneX
if(left){

oneX--;

}
//if you right then add oneX
if(right){

oneX++;

}

try{
//how long till it repaints the picture
Thread.sleep(10);

} catch (Exception exc){}

frame.repaint();

}

}

}
