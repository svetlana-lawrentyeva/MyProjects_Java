
package testball;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.Timer;


public class PaintPanel extends JPanel
{
    private Timer timer;
    private ActionListener timeListener;
    
    public PaintPanel()
    {
        
        addMouseListener( 
                new MouseAdapter()
                { 
                    public void mouseClicked(MouseEvent me)
                    {
                        Ball b=new Ball(me.getX(), me.getY());
                        PaintPanel.this.add(b);
                    } 
                }
                        );
        
         timeListener=new ActionListener() 
         {

            @Override
            public void actionPerformed(ActionEvent e)
            {
                for(Component cc: PaintPanel.this.getComponents())
                {
                    ((Ball)cc).step();
                }
                //repaint();
            }
         };
        timer=new Timer(20, timeListener);
        timer.start();
    }
}
