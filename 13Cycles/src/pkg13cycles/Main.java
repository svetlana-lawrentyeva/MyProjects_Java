package pkg13cycles;

import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Введите число: ");
    int n=sc.nextInt();
    int sum=0;
    int quantity=0;
    for(int i=2;i<=n;++i)
    {
      int complex=0;
      for(int j=2;j<=i/2;++j)
      {
        if(i%j==0)
        {
          complex++;
        }
      }
      if(complex>0)
      {
        //System.out.println(i);
        sum+=i;
        quantity++;
      }
    }
    System.out.println("Среднее значение сложных чисел: "+((double)sum/(double)quantity));
  }
}
