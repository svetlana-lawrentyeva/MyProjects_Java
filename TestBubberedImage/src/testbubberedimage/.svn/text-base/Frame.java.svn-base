package testbubberedimage;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Frame extends JFrame
{
    private Panel panel;
    
    public Frame() throws IOException
    {
        panel= new Panel();
        this.setLayout(new BorderLayout());
        this.add(panel, BorderLayout.CENTER);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(700, 700);
    }
}
 class Panel extends JPanel
 {
     //BufferedImage bImg;
     JButton button=new JButton("qqqqqqqqqqqqqq");
     BufferedImage img;
     
     
     public Panel() throws IOException
     {
         this.add(button);
         //bImg=new BufferedImage(this.getWidth(), this.getHeight(), BufferedImage.TYPE_4BYTE_ABGR);
         this.setBackground(Color.yellow);
         img = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB);
         Graphics2D gr=(Graphics2D)img.getGraphics();
         gr.setColor(Color.yellow);
         gr.fillRect(0, 0, 100, 100);
         gr.setStroke(new BasicStroke(10));
         gr.setColor(Color.red);
         gr.drawLine(0, 0, 99, 99);         
         ImageIO.write(img, "gif", new File("image.gif"));
         button.addActionListener(new ButtonListener());
         
         
         
     }
     class ButtonListener implements ActionListener
     {
        @Override
        public void actionPerformed(ActionEvent ae)
        {
            Graphics g=Panel.this.getGraphics();
            Image img1=img;
            g.drawImage(img1, 100, 100, null);
            JOptionPane.showMessageDialog(Panel.this, "qqqqqqqqqqqqqqqqq");
        }         
     }
 }