package pkg16arrays;

import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Введите кол-во эл-тов массива: ");
    int n=sc.nextInt();
    int[] arr = new int[n*3];
    for (int i = 0; i < arr.length; ++i)
    {
      arr[i] = (int) (Math.random()*n+1);
    }
    int[]rateArr=new int[n];
    for(int i=0;i<rateArr.length;++i)
    {
      for(int j=0;j<arr.length;++j)
      {
        if(arr[j]-1==i)
        {
          rateArr[i]++;
        }
      }
    }
    for(int i=0;i<arr.length;++i)
    {
      System.out.print(arr[i]+" ");
    }
    System.out.println();
    for(int i=0;i<rateArr.length;++i)
    {
      System.out.print((i+1)+":"+rateArr[i]+" раз,  ");
    }
  }
}

