package pkg11cycles;

public class Main
{
  public static void main(String[] args)
  {
    int count = 0;
    for (int i = 1; i < 1000; ++i)
    {
      for (int j = 1; j < 1000; ++j)
      {
        int gyp2 = (i * i + j * j);
        for (int gyp = 1; gyp < 1000; ++gyp)
        {
          if (gyp * gyp == gyp2)
          {
            System.out.println(++count + " - " + i + " " + j + " " + gyp);

          }
        }
      }
    }
    System.out.println("Всего: " + count);
  }
}
