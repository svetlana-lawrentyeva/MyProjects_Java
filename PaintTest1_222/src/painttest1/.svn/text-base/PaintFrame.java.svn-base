/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package painttest1;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import javax.swing.*;
import sun.awt.motif.X11CNS11643;

/**
 *
 * @author nau
 */
public class PaintFrame extends JFrame
{
    Container content=this.getContentPane();
    private JPanel panelLeft;
    private PaintPanel panelPaint;
    private LinePanel panelLine;
    private ColorPanel panelColor;
    private JMenuBar menuBar;
    
    public PaintFrame()
    {
        super("paint");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.menuBar=createMenu();
        this.setJMenuBar(menuBar);
	 /*        
        this.setPreferredSize(new Dimension(270, 225));
        this.pack();
        this.setLocationRelativeTo(null);
        */
        panelLeft=new JPanel(new GridLayout(2, 1));
        //panelLeft.setMinimumSize(new Dimension(300, 300));
        panelLine=new LinePanel();
        panelColor=new ColorPanel();
        panelLeft.add(panelColor);
        panelLeft.add(panelLine);
        content.add(panelLeft, BorderLayout.WEST);
        panelPaint=new PaintPanel(panelColor, panelLine);
        content.add(panelPaint, BorderLayout.CENTER);
        this.setVisible(true);
        
        
    }
  public JMenuBar createMenu()
  {
        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");

        JMenu saveMenu = new JMenu("Save");
        fileMenu.add(saveMenu);

        JMenuItem jpgFileItem = new JMenuItem("jpg");
        saveMenu.add(jpgFileItem);
        jpgFileItem.addActionListener(new ActionListener() {          
            public void actionPerformed(ActionEvent e) {
                save(e);            
            }
        });

        JMenuItem tiffFileItem = new JMenuItem("tiff");
        saveMenu.add(tiffFileItem);

        JMenuItem bmpItem = new JMenuItem("bmp");
        saveMenu.add(bmpItem);
        
        JMenuItem gifItem = new JMenuItem("gif");
        saveMenu.add(gifItem);

        JMenuItem openItem = new JMenuItem("Open");
        fileMenu.add(openItem);

        JMenuItem exitItem = new JMenuItem("Exit");
        fileMenu.add(exitItem);

        exitItem.addActionListener(new ActionListener() {          
            public void actionPerformed(ActionEvent e) {
                System.exit(0);            
            }          
        });

        menuBar.add(fileMenu);
        return menuBar;
    }
    private void save(ActionEvent e)
    {
        String str=((JMenuItem)e.getSource()).getText();
        IImageSaver is=FormatFactory.getInstance(str);
        is.Save(panelPaint.getImng());
    }
}
class FormatFactory
{
    public static IImageSaver getInstance(String str)
    {
        IImageSaver is;
        switch (str)
        {
            case "jpg":
                is=new JPGSaver();
                break;
            default:
                is=new JPGSaver();
        }
        return is;
    }
}

class LinePanel extends JPanel
{
    private JPanel grid;
    Integer line;
    int quantity=8;
    JButton[]lines=new JButton[quantity];
    public LinePanel()
    {
        line=new Integer(1);
        grid=new JPanel(new GridLayout(quantity, 1));
        for(int i=0; i<quantity;++i)
        {
            lines[i]=new JButton(i+1+"");
            grid.add(lines[i]);
            this.add(grid);
            lines[i].addActionListener(new LineChangeListener(line));
            lines[i].addActionListener(new MyLineListener());
        }
        this.setBackground(Color.GREEN);
    }
    public Integer getLine()
    {
        return line;
    }
    class MyLineListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            line=new Integer(((JButton)e.getSource()).getText());
        }
        
    }
}

class ColorPanel extends JPanel
{
    private JPanel grid;
    private JColorChooser chooser;
    private JTextField [] colorFields=new JTextField[6];
    private JTextField myColor;
    private Color c= Color.BLACK;
    Color [] colors= {
        Color.BLACK, Color.BLUE, Color.RED,
        Color.GREEN,Color.YELLOW, Color.MAGENTA};
    
    public Color getColor()
    {
        return c;
    }
    public ColorPanel()
    {
        grid=new JPanel(new GridLayout(2, 3));
        this.add(grid, BorderLayout.NORTH);
        myColor=new JTextField("   ");
        myColor.setBackground(c);
        myColor.setEditable(false);
        for(int i=0;i<6;++i)
        {
            colorFields[i]=new JTextField("   ");
            colorFields[i].setEditable(false);
            colorFields[i].setBackground(colors[i]);
            colorFields[i].setMinimumSize(new Dimension(50, 50));
            grid.add(colorFields[i]);
            colorFields[i].addMouseListener(new OtherColorListener());
        }
        this.add(myColor);
        this.setMinimumSize(new Dimension(300, 150));
        chooser=new JColorChooser(c);
        myColor.addMouseListener(new MyColorListener());
        myColor.addActionListener(new ColorChangeListener(c));
        this.setBackground(Color.YELLOW);
        
    }   
    class MyColorListener implements MouseListener
    {
         @Override
    public void mouseClicked(MouseEvent e)
    {
        Color newColor = JColorChooser.showDialog(null, "", c);
        if (newColor != null)
        {
            myColor.setBackground(newColor);
            c=newColor;
        }
    }

    @Override
    public void mousePressed(MouseEvent e){}

    @Override
    public void mouseReleased(MouseEvent e){}

    @Override
    public void mouseEntered(MouseEvent e){}

    @Override
    public void mouseExited(MouseEvent e){}
    }
    
     
    class OtherColorListener implements MouseListener
    {
         @Override
    public void mouseClicked(MouseEvent e)
    {
        Color newColor = ((JTextField)e.getSource()).getBackground();
        if (newColor != null)
        {
            myColor.setBackground(newColor);
            c=newColor;
        }
    }

    @Override
    public void mousePressed(MouseEvent e){}

    @Override
    public void mouseReleased(MouseEvent e){}

    @Override
    public void mouseEntered(MouseEvent e){}

    @Override
    public void mouseExited(MouseEvent e){}
    }
}

class PaintPanel extends JPanel implements MouseMotionListener, MouseListener
{    	 
    private int MX1=0;
    private int MY1=0;
    private int MX2=0;
    private int MY2=0;
    private boolean  OnnOff=false;
    private ColorPanel cp;
    private LinePanel lp;
    private BufferedImage img;
    private Graphics2D g;
    private Graphics gr;
    
    public PaintPanel(ColorPanel cp, LinePanel lp)
    {
        this.cp=cp;
        this.lp=lp;
        addMouseMotionListener(this);
        addMouseListener(this);
        addComponentListener(new ComponentAdapter()
        {
            public void componentResized(java.awt.event.ComponentEvent evt)
            {
                formComponentResized(evt);
            }
        });
    }
    public BufferedImage getImng()
    {
        return img;
    }
    private void formComponentResized(java.awt.event.ComponentEvent evt)
        {                                      
            int w=getSize().width;
            int h=getSize().height;
            if ((w > 1) && (h > 1))
            {
                Image tempImg=new BufferedImage(w,h,BufferedImage.TYPE_3BYTE_BGR);
                if(img!=null)
                {
                    tempImg=img;
                }
                img = new BufferedImage(w,h,BufferedImage.TYPE_3BYTE_BGR);
                gr=this.getGraphics();             
                g = (Graphics2D)img.getGraphics();
                img = new BufferedImage(w,h,BufferedImage.TYPE_3BYTE_BGR);
                g=(Graphics2D)img.getGraphics();
                g.drawImage(tempImg, 0, 0, null);
                gr.drawImage(img, 0, 0, this);
                //repaint();
            }
        }   
    @Override
    public void mouseDragged(MouseEvent e) {
        // TODO Auto-generated method stub
        mouseMoved(e);
    }

    @Override
    public void mouseMoved(MouseEvent e)
    {
        // TODO Auto-generated method stub
        if(OnnOff)
        {
            MX2=MX1;
            MY2=MY1;
            MX1 = e.getX();
            MY1 = e.getY();
            update(gr);
        }
    }
    
    public void update(Graphics gr)
    {
        g.setColor(cp.getColor());        
        BasicStroke pen1 = new BasicStroke(lp.getLine().intValue());
        g.setStroke(pen1);
        g.drawLine(MX1, MY1, MX2, MY2);
        gr.drawImage(img, 0, 0, this);
    }
   /* @Override
    public void paintComponent(Graphics gr)
    {
        super.paintComponent(gr);        
        gr.setColor(cp.getColor());
        gr.drawLine(MX1, MY1, MX2, MY2);
    }*/
    @Override
    public void mousePressed(MouseEvent e) {
        OnnOff=true;
        MX2=MX1;
        MY2=MY1;
        MX1 = e.getX();
        MY1 = e.getY();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        OnnOff=false;
    }

    @Override
    public void mouseClicked(MouseEvent me) {}

    @Override
    public void mouseEntered(MouseEvent me) {}

    @Override
    public void mouseExited(MouseEvent me) {} 
}

class ColorChangeListener implements ActionListener
{
    Color color;
    public ColorChangeListener(Color color)
    {
        this.color=color;
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        TextField tf=(TextField)e.getSource();
        color=tf.getBackground();
    }

}

class LineChangeListener implements ActionListener
{
    private Integer line;
    public LineChangeListener(Integer line)
    {
        this.line=line;
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        String value=((JButton)e.getSource()).getText();
        line=new Integer(value);
    }
}