/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mainframe;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author nau
 */
public class MainFrame extends JFrame
{
    MainFrame(String s)
    {
        super(s);
        setSize(300, 200);
        JPanel panel=new MainPanel();
        this.add(panel);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run()
            {
                new MainFrame("Заставка с шариком");
            }
        });
    }
}
