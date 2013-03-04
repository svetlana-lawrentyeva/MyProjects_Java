/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package painttest1;

import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;
import java.awt.FileDialog;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author nau
 */
public class JPGSaver implements IImageSaver
{

    @Override
    public boolean Save(BufferedImage img)
    {
        
        FileDialog fdlg = new FileDialog(new JFrame(), "Open file", FileDialog.SAVE);
        fdlg.setVisible(true);
        
        ObjectOutputStream oos;
        
        boolean result=false;
        /*try
        {
          */ 
            try
            {
            FileOutputStream fos = new FileOutputStream(fdlg.getDirectory()+fdlg.getFile());
            JPEGImageEncoder jc= JPEGCodec.createJPEGEncoder(fos);
            
            jc.encode(img);
            fos.close();
            result=true;
            }
            catch(IOException ioe)
            {
                JOptionPane.showMessageDialog(null, ioe.getMessage());
            }
            /*result=ImageIO.write(img, "JPG", new File(fdlg.getFile()));
        } catch (IOException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }*/
        return result;
    }    
}
