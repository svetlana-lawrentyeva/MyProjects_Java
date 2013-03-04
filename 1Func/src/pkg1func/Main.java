package pkg1func;

import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Введите x: ");
    int x=sc.nextInt();
    System.out.print("Введите y: ");
    int y=sc.nextInt();
    System.out.println("\nДанные координаты находятся в "+findQuarter(x, y) +" четверти");
  }
  public static int findQuarter(int x,int y)
  {
    int rez=0;
    if(x>0&y>0)
    {
      rez=1;
    }
    else if(x<0&y>0)
    {
      rez=2;
    }
    else if(x<0&y<0)
    {
      rez=3;
    }
    else if(x>0&y<0)
    {
      rez=4;
    }
    return rez;
  }
}
