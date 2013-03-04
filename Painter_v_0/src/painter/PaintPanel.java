package painter;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ComponentAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

public class PaintPanel extends JPanel
{
  private ColorPanel colorPanel;
  private LinePanel linePanel;
  private FigurePanel figurePanel;
  //-------------------------------------
  private Graphics g;
  private BufferedImage bufImg;
  private Graphics2D gr;
  private BufferedImage tempImage;
  private Graphics2D grTemp;
  //-------------------------------------
  private int x = 0;
  private int y = 0;
  private int xStart = 0;
  private int yStart = 0;
  private Color color = Color.red;
  private int line = 1;
  private String figure = "Line";
  //-------------------------------------

  public PaintPanel(ColorPanel cp, LinePanel lp, FigurePanel fp)
  {
    this.colorPanel = cp;
    this.linePanel = lp;
    this.figurePanel = fp;

    MML mml = new MML();
    ML ml = new ML();

    this.addMouseMotionListener(mml);
    this.addMouseListener(ml);
    
    addComponentListener(new ComponentAdapter()
        {
          @Override
            public void componentResized(java.awt.event.ComponentEvent evt)
            {
                formComponentResized(evt);
            }
        });
  }
   private void formComponentResized(java.awt.event.ComponentEvent evt)
        {                                      
            int w=getSize().width;
            int h=getSize().height;
            if ((w > 1) && (h > 1))
            {
                Image temp=new BufferedImage(w,h,BufferedImage.TYPE_4BYTE_ABGR_PRE);
                if(bufImg!=null)
                {
                    temp=bufImg;
                }
                bufImg = new BufferedImage(w,h,BufferedImage.TYPE_4BYTE_ABGR_PRE);
                tempImage = new BufferedImage(w, h, BufferedImage.TYPE_4BYTE_ABGR_PRE);
                grTemp = (Graphics2D) tempImage.getGraphics();
                g=this.getGraphics();             
                gr = (Graphics2D)bufImg.getGraphics();
                gr=(Graphics2D)bufImg.getGraphics();
                gr.setColor(PaintPanel.this.getBackground());
                gr.fillRect(0, 0, w, h);
                gr.drawImage(temp, 0, 0, null);
                g.drawImage(bufImg, 0, 0, this);
            }
        }  

   public void setImage(BufferedImage im)
   {
     bufImg=im;
     gr=(Graphics2D) bufImg.getGraphics();
     g.drawImage(bufImg, 0, 0, null);
     tempImage = new BufferedImage(bufImg.getWidth(), bufImg.getHeight(), BufferedImage.TYPE_4BYTE_ABGR_PRE);
     grTemp = (Graphics2D) tempImage.getGraphics();
     
   }
   public BufferedImage getImage()
   {
     return bufImg;
   }
  class MML implements MouseMotionListener
  {
    @Override
    public void mouseDragged(MouseEvent e)
    {
      if (bufImg == null)
      {
        bufImg = new BufferedImage(PaintPanel.this.getWidth(), PaintPanel.this.getHeight(), BufferedImage.TYPE_4BYTE_ABGR_PRE);
      }
      if (tempImage == null)
      {
        tempImage = new BufferedImage(bufImg.getWidth(), bufImg.getHeight(), BufferedImage.TYPE_4BYTE_ABGR_PRE);
      }
      if (gr == null)
      {
        gr = (Graphics2D) bufImg.getGraphics();
        gr.setColor(PaintPanel.this.getBackground());
        gr.fillRect(0, 0, bufImg.getWidth(), bufImg.getHeight());
      }
      if (grTemp == null)
      {
        grTemp = (Graphics2D) tempImage.getGraphics();
      }
      //-------------------------------------
      color = colorPanel.getColor();
      line = linePanel.getLine();
      figure = figurePanel.getFigure();
      //-------------------------------------
      if (figure.equals("Draw"))
      {
        gr.setColor(color);
        gr.setStroke(new BasicStroke(line, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        gr.drawLine(x, y, e.getX(), e.getY());
        x = e.getX();
        y = e.getY();
        if (g == null)
        {
          g = PaintPanel.this.getGraphics();
        }
        g.drawImage(bufImg, 0, 0, null);
      }
      else
      {
        int width = Math.abs(e.getX() - xStart);
        int heigth = Math.abs(e.getY() - yStart);
        int x1 = 0;
        int y1 = 0;
        if (xStart > e.getX())
        {
          x1 = e.getX();
        }
        else
        {
          x1 = xStart;
        }
        if (yStart > e.getY())
        {
          y1 = e.getY();
        }
        else
        {
          y1 = yStart;
        }
        grTemp.drawImage(bufImg, 0, 0, null);
        grTemp.setColor(color);
        grTemp.setStroke(new BasicStroke(line, BasicStroke.CAP_SQUARE, BasicStroke.JOIN_MITER));
        if (figure.equals("Line"))
        {
        grTemp.drawLine(xStart, yStart, e.getX(), e.getY());
        }
        else if (figure.equals("Square"))
        {
        grTemp.drawRect(x1, y1, width, heigth);
        }
        else if (figure.equals("Circle"))
        {
          grTemp.drawOval(x1, y1, width, heigth);
        }
        if (g == null)
        {
          g = PaintPanel.this.getGraphics();
        }
        g.drawImage(tempImage, 0, 0, null);
      }
    }

    @Override
    public void mouseMoved(MouseEvent e)
    {
    }
  }

  class ML implements MouseListener
  {
    @Override
    public void mouseClicked(MouseEvent e)
    {
    }

    @Override
    public void mousePressed(MouseEvent e)
    {
      x = e.getX();
      y = e.getY();
      xStart = e.getX();
      yStart = e.getY();
    }

    @Override
    public void mouseReleased(MouseEvent e)
    {
      if(figure.equals("Line")|figure.equals("Square")|figure.equals("Circle"))
      {
        gr.drawImage(tempImage, 0, 0,null);
      }
    }

    @Override
    public void mouseEntered(MouseEvent e)
    {
    }

    @Override
    public void mouseExited(MouseEvent e)
    {
    }
  }
}
