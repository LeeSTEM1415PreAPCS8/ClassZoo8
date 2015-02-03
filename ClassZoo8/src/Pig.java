import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.GradientPaint;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

class DrawPanel extends JPanel {
	 int x = 300;
	 int y =	500;
	 int a = 139 ;  int b = 69 ; int c = 19;
    private void doDrawing(Graphics g){ 
    Graphics2D g2 = (Graphics2D) g;
{
        
        Graphics2D g2d = (Graphics2D) g;
        //g.setColor(Color.blue);
        GradientPaint gp1 = new GradientPaint(0, 0, Color.red, 30, 50, Color.blue, true);
        g2d.setPaint(gp1);

        Rectangle2D.Double sky= new Rectangle2D.Double(0, 0, 9000, 9000); g2d.fill(sky);
		
		//g.setColor(Color.green);
        GradientPaint gp2 = new GradientPaint(0, 250, Color.yellow, 0, 0, Color.green, true);
        g2d.setPaint(gp2);
		Rectangle2D.Double land = new Rectangle2D.Double(0, 400, 9000, 9000); g2d.fill(land);
		
		g.setColor(new Color (a,b,c));
		Ellipse2D.Double mudpit = new Ellipse2D.Double(100, 450, 500, 200); g2d.fill(mudpit); 
		
        g.setColor(Color.pink);
        Rectangle2D.Double body= new Rectangle2D.Double(x, y, 100, 50); g2d.fill(body);
        Rectangle2D.Double legL= new Rectangle2D.Double(x, y + 10, 30, 80); g2d.fill(legL);
        Rectangle2D.Double legR= new Rectangle2D.Double(x +70, y+10, 30, 80); g2d.fill(legR);
        Rectangle2D.Double head= new Rectangle2D.Double(x+80, y-20, 50, 50); g2d.fill(head);  
        Rectangle2D.Double nose= new Rectangle2D.Double(x+120, y, 20, 15); g2d.fill(nose); 
		
		g.setColor(Color.white);
		Ellipse2D.Double eye = new Ellipse2D.Double(x+120, y-10, 10, 10); g2d.fill(eye); g.fillOval(x+120, y-10, 10, 10); // eye

		g.setColor(Color.black);
		Line2D.Double lineL= new Line2D.Double(x+20, y+50, x+20, y+88);g2d.draw(lineL); // left line
		Line2D.Double lineR= new Line2D.Double(x+90, y+50, x+90, y+88);g2d.draw(lineR);  // right line
		Ellipse2D.Double pupil = new Ellipse2D.Double(x+125, y-8, 5, 5); g2d.fill(pupil);  // pupil

	
}
	}
    

    @Override
    public void paintComponent(Graphics g) {
        
        super.paintComponent(g);
        doDrawing(g);
        
        
       
    }
}

public class Pig extends JFrame {

    public Pig() {
        initUI();
    }

    public final void initUI() {

        DrawPanel dpnl = new DrawPanel();
        add(dpnl);

        setSize(360, 300);
        setTitle("The Pig in it's Natural Habitat");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Pig ex = new Pig();
                ex.setVisible(true);
            }
        });
    }
}