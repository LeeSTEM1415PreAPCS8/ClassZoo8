
import java.awt.GradientPaint;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

class DrawPanel extends JPanel {

    private void doDrawing(Graphics g) {
        
        Graphics2D g2d = (Graphics2D) g;
        drawHabitat(g2d);
    	
        
    /*    GradientPaint gp1 = new GradientPaint(5, 5,
                Color.red, 20, 20, Color.black, true);

        g2d.setPaint(gp1);
        g2d.fillRect(20, 20, 300, 40); 

        GradientPaint gp2 = new GradientPaint(5, 25,
                Color.yellow, 20, 2, Color.black, true);

        g2d.setPaint(gp2);
        g2d.fillRect(20, 80, 300, 40);

        GradientPaint gp3 = new GradientPaint(5, 25,
                Color.green, 2, 2, Color.black, true);

        g2d.setPaint(gp3);
        g2d.fillRect(20, 140, 300, 40);

        GradientPaint gp4 = new GradientPaint(25, 25,
                Color.blue, 15, 25, Color.black, true);

        g2d.setPaint(gp4);
        g2d.fillRect(20, 200, 300, 40);

        GradientPaint gp5 = new GradientPaint(0, 0,
                Color.orange, 0, 20, Color.black, true);

        g2d.setPaint(gp5);
        g2d.fillRect(20, 260, 300, 40);      
        
        
    	*/
        //Girafee Body        
        
       	g2d.setColor(Color.YELLOW);
    	//g2d.fillRect(600,400,400,200);//body
    	
    	Rectangle2D.Double body = new Rectangle2D.Double(600, 400, 400, 200);
    	g2d.fill(body);
    	
    	

 
    	g2d.fillRect(625, 600, 25, 100);
    	
    	g2d.fillRect(925, 600, 25, 100);
    	g2d.fillRect(925,200,75,250);
    	g2d.fillRect(925,105,150,100);
    	g2d.fillRect(925, 80,10,25);

    	
        
    	g2d.setColor(Color.WHITE); 
    	g2d.fillRect(940,120, 50,50); 
    	
    	g2d.setColor(Color.BLACK);
    	g2d.fillRect(925, 690, 25, 25);
    	g2d.fillRect(625, 690, 25, 25);
    	g2d.fillRect(960,130,25,25);
    	
    	g2d.setColor(new Color(112,73,48));
    	g2d.fillRect(1025, 105, 50, 100);
    	g2d.fillRect(925, 75,10,10);
    	g2d.fillRect(1500, 50, 75, 500); 
    	
    	
    	// A TREEEE
    	
    	GradientPaint gp3 = new GradientPaint(5, 25,
                Color.green, 2, 2, Color.black, true);

        g2d.setPaint(gp3);

//    	g2d.setColor(Color.GREEN);
    	g2d.fillRect(1350, 50, 450, 100);


    	
    	g2d.setColor(Color.RED);
    	g2d.fillRect(1370,62,34,35);
    	
    	g2d.setColor(Color.MAGENTA);
    	g2d.fillOval(625, 400, 40, 20);
    	g2d.fillOval(625,425,45,25);
    	g2d.fillOval(635,500,60,30);
    	g2d.fillOval(675,535,25,35);
    	g2d.fillOval(700,535,27,30);
    	g2d.fillOval(750,510,45,36);
    	g2d.fillOval(745,500,57,45);
    	g2d.fillOval(745,400,65,75);
    	g2d.fillOval(760,425,75,75);
    	g2d.fillOval(844,425,67,67);
    	g2d.fillOval(875,415,24,37);
    	g2d.fillOval(900,500,65,75);
    	g2d.fillOval(925,400,45,62); 
    	g2d.fillOval(940,300,45,60);
    	g2d.fillOval(940,245,36,45);

    }




    private void drawHabitat(Graphics2D g){
    	g.setColor(Color.CYAN);
    	g.fillRect(0,0,2000,400);
    	g.setColor(Color.green);
    	g.fillOval(0,400,2000,600);

}

   
    {
    	
    }




    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        doDrawing(g);
    }
}

public class Giraffee extends JFrame {

    public Giraffee() {
        initUI();
    }

    public final void initUI() {

        DrawPanel dpnl = new DrawPanel();
        add(dpnl);

        setSize(350, 350);
        setTitle("Gradients");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
              Giraffee ex = new Giraffee();
                ex.setVisible(true);
            }
        });
    }


	}


