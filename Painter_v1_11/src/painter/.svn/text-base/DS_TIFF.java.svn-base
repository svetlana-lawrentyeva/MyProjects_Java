package painter;

import com.sun.media.jai.codec.TIFFEncodeParam;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.media.jai.*;
import javax.swing.JFileChooser;

public class DS_TIFF implements IDS
{
  @Override
  public BufferedImage load(String dir)
  {
      BufferedImage bImg=null;
      final PlanarImage planar = JAI.create("FileLoad", dir);
      bImg=planar.getAsBufferedImage();
      return bImg;
  }

  @Override
  public int save(BufferedImage bImg)
  {
      JFileChooser filesaver = new JFileChooser();
      int ret = filesaver.showDialog(null, "Сохранить файл");
      String path = "";
      if (ret == JFileChooser.APPROVE_OPTION)
      {
        path = filesaver.getSelectedFile().getAbsolutePath();
      }
    int result=0;
    FileOutputStream fos=null;
    try
    {
      TIFFEncodeParam param=new TIFFEncodeParam();
      fos = new FileOutputStream(path+".tif");
      JAI.create("encode", bImg, fos,"TIFF", param);
    }
    catch (FileNotFoundException ex)
    {
      Logger.getLogger(DS_TIFF.class.getName()).log(Level.SEVERE, null, ex);
    }
    finally
    {
      try
      {
        fos.close();
      }
      catch (IOException ex)
      {
        Logger.getLogger(DS_TIFF.class.getName()).log(Level.SEVERE, null, ex);
      }
      return result;
    }
  }  
}
