package pkg5func;

import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Введите x1: ");
    int x1=sc.nextInt();
    System.out.print("Введите y1: ");
    int y1=sc.nextInt();
    System.out.print("Введите x2: ");
    int x2=sc.nextInt();
    System.out.print("Введите y2: ");
    int y2=sc.nextInt();
    System.out.println("Расстояние = "+findLength(x1,y1,x2,y2));
  }
  public static double findLength(int x1,int y1, int x2, int y2)
  {
    double res=1;
    int x=Math.abs(x1-x2);
    int y=Math.abs(y1-y2);
    res=Math.sqrt(x*x+y*y);
    return res;
  }
}