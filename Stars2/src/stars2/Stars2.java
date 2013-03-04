package stars2;

public class Stars2
{
  public static void main(String[] args)
  {
    int size=7;
    for(int i = 0;i<size;++i)
    {
      for(int j=0; j<size;++j)
      {
        System.out.print((i==j||(j+i==size-1))?"*":" ");
      }
      System.out.println();
    }
    System.out.println();
    for(int i=0;i<size;++i)
    {
      for(int j=0;j<=size/2;++j)
      {
        System.out.print((j==0||(i==j&i<=size/2)||(i+j==size-1&i>size/2))?"*":" ");
      }
      System.out.println();
    }
    System.out.println();
    for(int i=0;i<size;++i)
    {
      for(int j=0;j<size;++j)
      {
        System.out.print((j==size-1||(i==j&i>size/2)||(i+j==size-1&i<=size/2))?"*":" ");
      }
      System.out.println();
    }
    System.out.println();
    for(int i=0;i<=size/2;++i)
    {
      for(int j=0;j<size;++j)
      {
        System.out.print((i==0||i==j||i+j==size-1)?"*":" ");
      }
      System.out.println();
    }
    System.out.println();
    for(int i=size/2;i<size;++i)
    {
      for(int j=0;j<size;++j)
      {
        System.out.print((i==size-1||i==j||i+j==size-1)?"*":" ");
      }
      System.out.println();
    }
    String s1=new String("asd");
    String s2=new String("asd");
    System.out.println(s1==s2);
    System.out.println(s1.equals(s2));
  }
}
