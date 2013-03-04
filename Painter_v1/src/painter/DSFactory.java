package painter;

public class DSFactory
{
  public static IDS getInstance(String str)
  {
    IDS ds=null;
    if(str.equals("JPG"))
    {
      ds=new DS_JPG();
    }
    else if(str.equals("TIF"))
    {
      ds=new DS_TIFF();
    }
    else if(str.equals("PNG"))
    {
      ds=new DS_PNG();
    }
    return ds;
  }
}
