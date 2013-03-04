package pkg8cycles;

import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Введите число: ");
    int n=sc.nextInt();
    boolean notEnd=true;
    int counter=1;
    do
    {
      if(counter*counter<n)
      {
        System.out.print(counter+++" ");
      }
      else
      {
        notEnd=false;
      }
    }
    while(notEnd);
  }
}
