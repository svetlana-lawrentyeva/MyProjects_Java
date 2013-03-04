package painter;

import com.sun.media.jai.codec.TIFFEncodeParam;
import java.awt.image.BufferedImage;
import java.awt.image.DataBuffer;
import java.awt.image.RenderedImage;
import java.awt.image.renderable.ParameterBlock;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.media.jai.JAI;
import javax.media.jai.RenderedOp;
import javax.swing.JFileChooser;

public class DS_JPG implements IDS
{

    @Override
    public BufferedImage load(String dir)
    {
        BufferedImage bImg = null;
        JFileChooser fileopen = new JFileChooser();
        int ret = fileopen.showDialog(null, "Открыть файл");
        if (ret == JFileChooser.APPROVE_OPTION)
        {
            try
            {
                File f = fileopen.getSelectedFile();
                bImg = ImageIO.read(f);
            } catch (IOException ex)
            {
                Logger.getLogger(DS_JPG.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return bImg;
    }

    @Override
    public int save(BufferedImage bImg)
    {
        int result = 1;
        try
        {
            JFileChooser filesaver = new JFileChooser();
            int ret = filesaver.showDialog(null, "Сохранить файл");
            String path = "";
            if (ret == JFileChooser.APPROVE_OPTION)
            {
                path = filesaver.getSelectedFile().getAbsolutePath();
            }
            ImageIO.write(bImg, "jpg", new File(path + ".jpg"));
            result = 1;
        } catch (IOException ex)
        {
            Logger.getLogger(DS_JPG.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
}
