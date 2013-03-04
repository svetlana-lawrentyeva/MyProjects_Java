package pkg3arrays;

import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    int[]arr=new int[5];
    Scanner sc=new Scanner(System.in);
    System.out.println("Введите эл-ты массива");
    int sum=0;
    for(int i=0;i<arr.length;++i)
    {
      arr[i]=sc.nextInt();
      if(i%2==0)
      {
        sum+=arr[i];
      }
    }
    System.out.println("Сумма нечётных элементов: "+sum);
  }
}
