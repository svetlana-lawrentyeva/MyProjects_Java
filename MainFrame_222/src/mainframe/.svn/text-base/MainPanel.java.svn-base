/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mainframe;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author nau
 */
public class MainPanel extends JPanel
{
    //private Ball ball;
    ArrayList<Ball> balls;
    private Timer timer;
    ActionListener timeListener;
    MouseListener mouseListener;
    
    public void paint(Graphics g)
    {
        for(Ball ball:balls)
        {
            super.paint(g);
            ball.paint(g);
        }
    }
    
    public MainPanel()
    {
        super();
        setBackground(Color.black);
        balls=new ArrayList<Ball>();
        //ball=new Ball(50, 150, 1, 2, 10, this, Color.yellow);
        timeListener=new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e)
            {
                for(Ball ball:balls)
                {
                    ball.step();
                }
                repaint();
            }
        };
        addMouseListener(new MouseAdapter()
        { 
          public void mouseClicked(MouseEvent me)
          {
            Ball b=new Ball(me.getX(), me.getY(), MainPanel.this);
            balls.add(b);
            MainPanel.this.add(b);
           // balls.add(b);
          } 
        });
        timer=new Timer(20, timeListener);
        timer.start();
    }
}
