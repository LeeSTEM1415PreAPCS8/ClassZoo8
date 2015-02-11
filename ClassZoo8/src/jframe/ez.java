package jframe;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.GradientPaint;
import javax.swing.*;
import java.awt.*;

final public class ez {
	    JFrame frame;
	    DrawPanel drawPanel;
	    int a = 139 ;  int b = 69 ; int c = 19; //color for mudpit
	    private int oneX = 300; //variables that control where the pig starts
	    private int oneY = 500;

	    boolean up = false;
	    boolean down = true;
	    boolean left = false;
	    boolean right = true;

	    public static void main (String[] args) {
	        new ez().go();
	    }

	    private void go() {
	        frame = new JFrame("      A Pig - Connor Simnitt");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        drawPanel = new DrawPanel();

	        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);

	        frame.setVisible(true);
	        frame.setResizable(false);
	        frame.setSize(800, 800);
	        frame.setLocation(375, 55);  //opens up the jframe
	        moveIt();
	    }

	    class DrawPanel extends JPanel {
	    	
	        public void paintComponent(Graphics g) {
	            
	            Graphics2D g2d = (Graphics2D) g; //where the pig and the landscape is created
	           
	            GradientPaint gp1 = new GradientPaint(0, 0, Color.red, 30, 50, Color.blue, true); g2d.setPaint(gp1);

	            Rectangle2D.Double sky= new Rectangle2D.Double(0, 0, 9000, 9000); g2d.fill(sky);
	    		
	    		GradientPaint gp2 = new GradientPaint(0, 250, Color.yellow, 0, 0, Color.green, true); g2d.setPaint(gp2);
	    		Rectangle2D.Double land = new Rectangle2D.Double(0, 400, 9000, 9000); g2d.fill(land);
	    		
	    		g.setColor(new Color (a,b,c));
	    		Ellipse2D.Double mudpit = new Ellipse2D.Double(100, 450, 500, 200); g2d.fill(mudpit); 
	    		
	            g.setColor(Color.pink);
	            Rectangle2D.Double body= new Rectangle2D.Double(oneX, oneY, 100, 50); g2d.fill(body);
	            Rectangle2D.Double legL= new Rectangle2D.Double(oneX, oneY + 10, 30, 80); g2d.fill(legL);
	            Rectangle2D.Double legR= new Rectangle2D.Double(oneX +70, oneY+10, 30, 80); g2d.fill(legR);
	            Rectangle2D.Double head= new Rectangle2D.Double(oneX+80, oneY-20, 50, 50); g2d.fill(head);  
	            Rectangle2D.Double nose= new Rectangle2D.Double(oneX+120, oneY, 20, 15); g2d.fill(nose); 
	    		
	    		g.setColor(Color.white);
	    		Ellipse2D.Double eye = new Ellipse2D.Double(oneX+120, oneY-10, 10, 10); g2d.fill(eye);  // eye

	    		g.setColor(Color.black);
	    		Line2D.Double lineL= new Line2D.Double(oneX+20, oneY+50, oneX+20, oneY+88);g2d.draw(lineL); // left line
	    		Line2D.Double lineR= new Line2D.Double(oneX+90, oneY+50, oneX+90, oneY+88);g2d.draw(lineR);  // right line
	    		Ellipse2D.Double pupil = new Ellipse2D.Double(oneX+125, oneY-8, 5, 5); g2d.fill(pupil);  // pupil
	        }
	        }
	    	    private void moveIt() {	    //when the X and Y get past these points, they switch direction
	    	        while(true){
	    	            if(oneX >= 690){
	    	                right = false;
	    	                left = true;
	    	            }
	    	            if(oneX <= 0){
	    	                right = true;
	    	                left = false;
	    	            }
	    	            if(oneY >= 690){
	    	                up = true;
	    	                down = false;
	    	            }
	    	            if(oneY <= 0){
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
	       
	



	
	


    

   // @Override
    //public void paintComponent(Graphics g) {
        
      //  super.paintComponent(g);
        //doDrawing(g);
        
        
       
    //}
//}

//public class ez extends JFrame {

//    public ez() {
  //      initUI();
    //}

   // public final void initUI() {

     //   DrawPanel dpnl = new DrawPanel();
       // add(dpnl);

        //setSize(360, 300);
        //setTitle("The Pig in it's Natural Habitat");
        //setLocationRelativeTo(null);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //}

    //public static void main(String[] args) {

      //  SwingUtilities.invokeLater(new Runnable() {
        //    public void run() {
          //      ez ex = new ez();
            //    ex.setVisible(true);
            //}
       // });
   // }

//}
