/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package balls;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author nau
 */
public class Ball extends JPanel
{
    private int x=0;
    private int y=0;
    private int radius=0;
    private int deltaX=0;
    private int deltaY=0;
    private Color c;
    public Ball(int _x, int _y)
    {
        x=_x;
        y=_y;
        int r=(int)Math.random()*255;
        int g=(int)Math.random()*255;
        int b=(int)Math.random()*255;
        c=new Color(r,g,b);
        radius=(int)Math.random()*50+10;
        deltaX=(int)Math.random()*5+1;
        deltaY=(int)Math.random()*5+1;
        this.setSize(radius, radius);
        this.setLocation(x, y);
    }
    
    @Override
    public void paint(Graphics g)
    {
        super.paintComponent(g);
        g.setColor(c);
        g.fillOval(0, 0, this.getWidth(), this.getHeight());
    }
    public void move()
    {
        x+=deltaX;
        y+=deltaY;
        if(x==0 | x==this.getParent().getWidth()-radius)
        {
            deltaX=-deltaX;
        }
        if(y==0 | y==this.getParent().getHeight()-radius)
        {
            deltaY=-deltaY;
        }
        this.setLocation(x, y);
        //this.paintComponent(this.getGraphics());
    }
}
