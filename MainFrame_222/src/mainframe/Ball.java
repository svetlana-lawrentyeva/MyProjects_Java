/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mainframe;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;

/**
 *
 * @author nau
 */
public class Ball extends JPanel
{
    private int x,y;
    private int dx,dy;
    private int radius;
    private Component container;
    private Color color;
    
    public void paint(Graphics g)
    {
        g.setColor(color);
        g.fillOval(0, 0, this.getWidth(), this.getHeight());
    }
    public Ball(int x, int y, Component conttainer)
    {
        this.setSize(radius, radius);
        this.setLocation(x, y);
        Random rnd = new Random();
        this.x=x;
        this.y=y;
        this.dx=1+rnd.nextInt(5);
        this.dy=1+rnd.nextInt(5);
        this.radius=2+rnd.nextInt(20);
        this.container=conttainer;
        int r=rnd.nextInt(255);
        int g=rnd.nextInt(255);
        int b=rnd.nextInt(255);
        this.color=new Color(r,g,b);
    }
    public void step()
    {
        x+=dx;
        y+=dy;
        if(x>=container.getWidth()-radius)
        {
            x=container.getWidth()-radius-1;
            dx=-dx;
        }
        if(y>=container.getHeight()-radius)
        {
            y=container.getHeight()-radius-1;
            dy=-dy;
        }
        if(x<radius)
        {
            x=radius;
            dx=-dx;
        }
        if(y<radius)
        {
            dy=-dy;
        }
        this.setLocation(x, y);
    }
}
