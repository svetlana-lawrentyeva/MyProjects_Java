
package testball;

import javax.swing.JFrame;

public class BFrame extends JFrame
{
    public BFrame()
    {
        setSize(500, 300);
        this.add(new PaintPanel());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
