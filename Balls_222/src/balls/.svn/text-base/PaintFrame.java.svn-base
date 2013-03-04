/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package balls;

import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author nau
 */
public class PaintFrame extends JFrame
{
    PaintPanel paintPanel=new PaintPanel();
    public PaintFrame()
    {
        add(paintPanel);
    }
    public void paint()
    {
        while(true)
        {
            paintPanel.repaint();
        }
    }
}

class PaintPanel extends JPanel
{
    private ArrayList<Ball> listBall=new ArrayList<Ball>();
    static int count;
  
    public PaintPanel()
    {
        addMouseListener(new MouseAdapter()
        { 
          public void mouseClicked(MouseEvent me)
          {
            Ball b=new Ball(me.getX(), me.getY());
            PaintPanel.this.add(b);
            listBall.add(b);
          } 
        });
    }
    public void paint(Graphics g)
    {
        for(Ball b:listBall)
        {
            b.move();
            b.paint(g);
        }
    }
}
