/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package balls;

import javax.swing.JFrame;

/**
 *
 * @author nau
 */
public class Balls
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        PaintFrame pFrame=new PaintFrame();        
        pFrame.setSize(500, 500);
        pFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        pFrame.setVisible(true);
        pFrame.paint();
    }
}
