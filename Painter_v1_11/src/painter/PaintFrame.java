package painter;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.media.jai.*;

public class PaintFrame extends JFrame
{

    private JPanel toolPanel = new JPanel();
    private ColorPanel colorPanel = new ColorPanel();
    private LinePanel linePanel = new LinePanel();
    private FigurePanel figurePanel = new FigurePanel();
    private PaintPanel paintPanel;
    private JMenuBar menuBar;

    //---------------------------------------------------  
    public PaintFrame()
    {
        //I.create("fileload", path.getPath());
        super("paint");
        this.menuBar = createMenu();
        this.setJMenuBar(menuBar);
        this.setLayout(new BorderLayout());
        this.add(toolPanel, BorderLayout.WEST);
        toolPanel.setLayout(new BoxLayout(toolPanel, BoxLayout.Y_AXIS));
        toolPanel.add(colorPanel);
        toolPanel.add(linePanel);
        toolPanel.add(figurePanel);
        this.setBounds(20, 20, 500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        colorPanel.setBackground(Color.CYAN);
        linePanel.setBackground(Color.PINK);
        figurePanel.setBackground(Color.GREEN);

        paintPanel = new PaintPanel(colorPanel, linePanel, figurePanel);
        this.add(paintPanel, BorderLayout.CENTER);
        paintPanel.setBackground(Color.YELLOW);
    }

    public JMenuBar createMenu()
    {
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenu saveFile = new JMenu("Save");
        JMenuItem saveJPGItem = new JMenuItem("JPG");
        JMenuItem saveTIFItem = new JMenuItem("TIF");
        JMenuItem savePNGItem = new JMenuItem("PNG");
        JMenuItem openFileItem = new JMenuItem("Open");
        JMenuItem exitItem = new JMenuItem("Exit");

        menuBar.add(fileMenu);
        fileMenu.add(saveFile);
        fileMenu.add(openFileItem);
        fileMenu.add(exitItem);
        saveFile.add(saveJPGItem);
        saveFile.add(saveTIFItem);
        saveFile.add(savePNGItem);

        SaveListener sl = new SaveListener();
        LoadListener ll = new LoadListener();
        ExitListener el = new ExitListener();

        saveJPGItem.addActionListener(sl);
        saveTIFItem.addActionListener(sl);
        savePNGItem.addActionListener(sl);
        openFileItem.addActionListener(ll);
        exitItem.addActionListener(el);

        return menuBar;
    }

    private class LoadListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e)
        {
            BufferedImage loadImage=null;
            try
            {
                JFileChooser fileopen = new JFileChooser();
                int ret = fileopen.showDialog(null, "Открыть файл");
                if (ret == JFileChooser.APPROVE_OPTION)
                {
                    File f = fileopen.getSelectedFile();
                    String fName=f.getName();
                    if(fName.endsWith(".tiff")||fName.endsWith(".tif"))
                    {
                        DS_TIFF ds=new DS_TIFF();
                        loadImage=ds.load(f.getAbsolutePath());
                    }
                    else
                    {
                        loadImage=ImageIO.read(f);
                    }
                    paintPanel.setImage(loadImage);
                }
            } catch (IOException ex)
            {
                Logger.getLogger(PaintFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private class SaveListener implements ActionListener
    {

        public void actionPerformed(ActionEvent e)
        {
            String str = ((JMenuItem) e.getSource()).getText();
            IDS ds = DSFactory.getInstance(str);

            BufferedImage bImg = paintPanel.getImage();
            ds.save(bImg);
        }
    }

    private class ExitListener implements ActionListener
    {

        public void actionPerformed(ActionEvent e)
        {
            System.exit(0);
        }
    }
}