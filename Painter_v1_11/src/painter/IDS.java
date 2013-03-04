package painter;

import java.awt.image.BufferedImage;

public interface IDS
{
  public BufferedImage load(String dir);
  public int save(BufferedImage bImg);
}
