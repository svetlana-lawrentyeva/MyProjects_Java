package painter;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;

public class DS_PNG implements IDS
{

    @Override
    public BufferedImage load(String dir)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int save(BufferedImage bImg)
    {
        int result=1;
        try
        {
            JFileChooser filesaver = new JFileChooser();
            int ret = filesaver.showDialog(null, "Сохранить файл");
            String path = "";
            if (ret == JFileChooser.APPROVE_OPTION)
            {
                path = filesaver.getSelectedFile().getAbsolutePath();
            }
            ImageIO.write(bImg, "png", new File(path + ".png"));
            result = 1;
        } catch (IOException ex)
        {
            Logger.getLogger(DS_JPG.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
}
