package pkg10arrays;

import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    int[] arr = new int[6];
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите эл-ты массива");
    for (int i = 0; i < arr.length; ++i)
    {
      arr[i] = sc.nextInt();
    }
    for(int i=0;i<arr.length;++i)
    {
      for(int j=0;j<arr.length;++j)
      {
        if(i!=j)
        {
          if(arr[i]%arr[j]==0)
          {
            System.out.println(arr[j]+" делитель для "+arr[i]);
          }
        }
      }
    }
  }
}