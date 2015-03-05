// Eduardo Hernandez
import java.awt.*;
import java.applet.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;

public class Lion extends Applet {
	
	JFrame frame;
    DrawPanel drawPanel;
	
	public void paint(Graphics g){
	{
		drawHabitat(g);
		drawAnimal(g);}
	}
	private int oneX = -45;
	
		boolean up = false;
	    boolean down = true;
	    boolean left = false;
	    boolean right = true;
	    
	    private void go() {
	        frame = new JFrame("Bun Bun");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        drawPanel = new DrawPanel();

	        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);

	        frame.setVisible(true);
	        frame.setResizable(false);
	        frame.setSize(900, 835);
	        frame.setLocation(5, 5);
	        moveIt();}
	
		private void drawHabitat(Graphics g){
		//Sky
		g.setColor(Color.CYAN);
		g.fillRect(0, 0, 800, 300);
		 
		//Clouds
		g.setColor(Color.white);
	   		g.fillOval(oneX-2,59,400,50);
	   		g.fillOval(oneX+295,109,400,50);
	   		g.fillOval(oneX-380,9,400,50);
	   		g.fillOval(oneX+390,12,400,50);
	   		g.fillOval(oneX-430,100,400,50);
	   		g.fillOval(oneX-744,48,400,50);
		
		//Sun
		g.setColor(Color.YELLOW);
		g.fillOval(10, 10, 100, 100);
		
		//Grass
		g.setColor(Color .GREEN);
		g.fillRect(0, 300, 800, 300);
		
		}
		
		private void drawAnimal(Graphics g){
		//body
		g.setColor(Color.ORANGE);
		g.fillRect(300, 250, 200, 100);
		g.fillRect(300, 350, 25, 75);
		g.fillRect(340, 350, 25, 75);
		g.fillRect(435, 350, 25, 75);
		g.fillRect(475, 350, 25, 75);
		
		//Fur
		g.setColor(new Color(250,150,9));
		g.fillRect(425, 175, 150, 150);
		
		//Head
		g.setColor(new Color(250,150,9));
		g.fillRect(425, 175, 150, 150);
		
		g.setColor(Color.ORANGE);
		g.fillRect(450, 200, 100, 100);	
		
		//Eyes and Mouth
		g.setColor(Color.BLACK);
		g.fillOval(475, 225, 10, 10);
		g.fillOval(525, 225, 10, 10);
		g.fillOval(500, 250, 25, 30);

		//Tail
		g.setColor(Color.ORANGE);
		g.fillRect(200, 250, 100, 25);
		
		g.setColor(new Color(250,150,9));
		g.fillOval(175, 240, 50, 40);}
		
		
		
		 private void moveIt() {
		        while(true){
		            if(oneX >= 800){
		            	oneX =-45;
		              right = false;
		              left = true;
		            }
		           if(oneX <= 7){
		                right = true;
		                left = false;
		            }
		            if(left){
		                oneX--;
		            }
		            if(right){
		                oneX++;
		            } 
		            try{
		                Thread.sleep(70);
		            } catch (Exception exc){}
		            frame.repaint();
                }
}
		 }
