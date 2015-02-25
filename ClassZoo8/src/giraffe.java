package zoo;

import java.applet.*;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;
import java.awt.*;
public class giraffe {




       public void paint(Graphics g)

        {

  
                  //sky

                  g.setColor(new Color (105, 237, 248));
                  g.fillRect(0,0,1900,600);
                  //sand
                  g.setColor(new Color (250, 176, 103));
                  g.fillRect(0,400,1700,400);
                  //sun
                  g.setColor(new Color (230, 214, 14));
                  g.fillOval(25, 25, 300, 300);
                  //leg
                  g.setColor(new Color (236, 137, 47));
                  g.fillRect(600, 550, 40, 250);
                  //leg
                  g.setColor(new Color (236, 137, 47));
                  g.fillRect(400, 550, 40, 250);
                  //body
                  g.setColor(new Color (236, 137, 47));
                  g.fillRect(420, 350, 200, 250);
                  //neck
                  g.setColor(new Color (236, 137, 47));
                  g.fillRect(500, 200, 50, 200);
                  //head
                  g.setColor(new Color (236,137, 47));
                  g.fillRect(500, 100, 100, 100);
                  //eye
                  g.setColor(new Color (0, 0, 0));
                  g.fillOval(550, 100, 25, 25);
                  //leg
                  g.setColor(new Color(236,137, 47));
                  g.fillRect(450, 550, 40, 250);
                  //leg
                  g.setColor(new Color(236,137, 47));
                  g.fillRect(550, 550, 40, 250);
                  //trunk
                  g.setColor(new Color(105, 48, 5));
                  g.fillRect(1200, 250, 50, 300);
                  //tree
                  g.setColor(new Color(33, 86, 34));
                  g.fillOval(1175, 200, 100, 200);
                  
                  
                  
}
}