package pkg2arrays;

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
    System.out.println("Индекс максимума: "+indMax(arr));
  }
  public static int indMax(int[]arr)
  {
    int max=0;
    for(int i=1;i<arr.length;++i)
    {
      if(arr[i]>arr[max])
      {
        max=i;
      }
    }
    return max;
  }
}

