

import java.awt.*;
import java.applet.*;



public class Pig extends Applet
{
	 int x = 300;
	 int y =	500;
	public void paint1(Graphics g)
	{
		
		
		
	}
	
	 Thread runner;
		 
	 public void start() {
		     if (runner == null) {
       
     }
   }
	// public void stop() {
	  //   if (runner != null) {
	    //	 runner.stop();
	    	// runner= null;
	   //  }
	 //}
	 
	 
	 public void run() {
		      while (true) {
		       repaint(x+5);
		       //try { Thread.sleep(1); }
		        //catch (InterruptedException e) { }
		      }
		    }
	 public void paint(Graphics g) {
		     
		 drawAnimal(g);		    }
		 
	 
	
	private void drawAnimal(Graphics g)
	{
		
		//g.fillOval(x, y, width, height);
		g.setColor(Color.pink);
		g.fillRect(x, y, 100, 50); //body
		g.fillRect(x, y + 10, 30, 80); //left leg
		g.fillRect(x +70, y+10, 30, 80); // right leg
		g.fillRect(x+80, y-20, 50, 50); // head
		g.fillRect(x+120, y, 20, 15); //nose
		
		g.setColor(Color.white);
		g.fillOval(420, 490, 10, 10); // eye

		g.setColor(Color.black);
		g.drawLine(320, 550, 320, 588); // left line
		g.drawLine(390, 550, 390, 588); // right line
		g.fillOval(425, 492, 5, 5); // pupil

	

	}
	
	private void drawHabitat(Graphics g)
	{
		int a = 139 ;  int b = 69 ; int c = 19;
		g.setColor(Color.blue);
		g.fillRect(0, 0, 1000, 1000);
		
		g.setColor(Color.green);
		g.fillRect(0, 400, 1000, 1000);
		
		g.setColor(new Color (a,b,c));
		g.fillOval(100, 450, 500, 200);
//by Connor Simnitt

	}
	}




