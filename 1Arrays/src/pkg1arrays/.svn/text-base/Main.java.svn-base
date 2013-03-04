package pkg1arrays;

import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    int[]arr=new int[5];
    Scanner sc=new Scanner(System.in);
    System.out.println("Введите эл-ты массива");
    for(int i=0;i<arr.length;++i)
    {
      arr[i]=sc.nextInt();
    }
    System.out.println("Минимум: "+min(arr));
  }
  public static int min(int[]arr)
  {
    int min=arr[0];
    for(int i=1;i<arr.length;++i)
    {
      if(arr[i]<min)
      {
        min=arr[i];
      }
    }
    return min;
  }
}
