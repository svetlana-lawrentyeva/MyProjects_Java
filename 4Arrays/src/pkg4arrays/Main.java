package pkg4arrays;

import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    int[]arr=new int[5];
    int[]temp=new int[arr.length];
    Scanner sc=new Scanner(System.in);
    System.out.println("Введите эл-ты массива");
    for(int i=0;i<arr.length;++i)
    {
      arr[i]=sc.nextInt();
    }
    for(int i=0;i<arr.length;++i)
    {
      for(int j=0;j<arr.length;++j)
      {
        if(arr[i]==arr[j])
        {
          temp[j]++;
        }
      }
    }
    int maxInd=0;
    int max=temp[0];
    for(int i=1;i<temp.length;++i)
    {
      if(temp[i]>max)
      {
        max=temp[i];
        maxInd=i;
      }
    }
    int count=0;
    for(int i=0;i<arr.length;++i)
    {
      if(temp[i]==temp[maxInd]&arr[i]!=arr[maxInd])
      {
        count++;
      }
    }
    if(count==0|count==arr.length)
    {
      System.out.println("Самый частый элемент: "+arr[maxInd]);
    }
    else
    {
      System.out.println("Нет самого встречающегося эл-та");
    }
  }
}
