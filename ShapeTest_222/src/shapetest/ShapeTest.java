package shapetest;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.*;
import javax.swing.*;
public class ShapeTest
{  
   public static void main(String[] args)
   {  
      JFrame frame = new ShapeTestFrame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.show();
   }
}
class ShapeTestFrame extends JFrame
{  
   public ShapeTestFrame()
   {  
      setTitle("ShapeTest");
      setSize(WIDTH, HEIGHT);

      Container contentPane = getContentPane();

      final ShapePanel panel = new ShapePanel();
      contentPane.add(panel, BorderLayout.CENTER);
      ShapeMaker shapeMaker = new LineMaker();
      panel.setShapeMaker(shapeMaker);
   }

   private static final int WIDTH = 300;
   private static final int HEIGHT = 300;
}
class ShapePanel extends JPanel
{  
   public ShapePanel()
   {  
      addMouseListener(new
         MouseAdapter()
         {
            public void mousePressed(MouseEvent event)
            {  
               Point p = event.getPoint();
               for (int i = 0; i < points.length; i++)
               {  
                  double x = points[i].getX() - SIZE / 2;
                  double y = points[i].getY() - SIZE / 2;
                  Rectangle2D r 
                     = new Rectangle2D.Double(x, y, SIZE, SIZE);
                  if (r.contains(p))
                  {  
                     current = i;
                     return;
                  }
               }
            }

            public void mouseReleased(MouseEvent event)
            {  
               current = -1;
            }
         });
      addMouseMotionListener(new 
         MouseMotionAdapter()
         {
            public void mouseDragged(MouseEvent event)
            {  
               if (current == -1) return;
               points[current] = event.getPoint();
               repaint();
            }
         });
      current = -1;
   }   
   public void setShapeMaker(ShapeMaker aShapeMaker)
   {  
      shapeMaker = aShapeMaker;
      int n = shapeMaker.getPointCount();
      points = new Point2D[n];
      for (int i = 0; i < n; i++)
      {  
         double x = generator.nextDouble() * getWidth();
         double y = generator.nextDouble() * getHeight();
         points[i] = new Point2D.Double(x, y);
      }
      repaint();
   }

   public void paintComponent(Graphics g)
   {  
      super.paintComponent(g);
      if (points == null) return;
      Graphics2D g2 = (Graphics2D)g;
      for (int i = 0; i < points.length; i++)
      {  double x = points[i].getX() - SIZE / 2;
         double y = points[i].getY() - SIZE / 2;
         g2.fill(new Rectangle2D.Double(x, y, SIZE, SIZE));
      }

      g2.draw(shapeMaker.makeShape(points));
   }

   private Point2D[] points;
   private static Random generator = new Random();
   private static int SIZE = 10;
   private int current;
   private ShapeMaker shapeMaker;
}

/**
   A shape maker can make a shape from a point set.
   Concrete subclasses must return a shape in the makeShape
   method.
*/
abstract class ShapeMaker
{  
   /**
      Constructs a shape maker.
      @param aPointCount the number of points needed to define
      this shape.
   */
   public ShapeMaker(int aPointCount)
   {  
      pointCount = aPointCount;
   }

   /**
      Gets the number of points needed to define this shape.
      @return the point count
   */
   public int getPointCount()
   {  
      return pointCount;
   }

   /**
      Makes a shape out of the given point set.
      @param p the points that define the shape
      @return the shape defined by the points
   */
   public abstract Shape makeShape(Point2D[] p);

   public String toString()
   {  
      return getClass().getName();
   }

   private int pointCount;
}

/**
   Makes a line that joins two given points.
*/
class LineMaker extends ShapeMaker
{  
   public LineMaker() { super(2); }

   public Shape makeShape(Point2D[] p)
   {  
      return new Line2D.Double(p[0], p[1]);
   }
}
