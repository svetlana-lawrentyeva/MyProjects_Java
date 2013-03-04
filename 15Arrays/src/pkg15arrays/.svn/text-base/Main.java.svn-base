package pkg15arrays;

import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    int[] arr = new int[8];
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите эл-ты массива");
    for (int i = 0; i < arr.length; ++i)
    {
      arr[i] = sc.nextInt();
    }
    int[]bubbleArr=new int[arr.length];
    int[]selectionArr=new int[arr.length];
    int[]insertionArr=new int[arr.length];
    for (int i = 0; i < arr.length; ++i)
    {
      bubbleArr[i] = arr[i];
      selectionArr[i]=arr[i];
      insertionArr[i]=arr[i];
    }
    bubbleArr=bubbleSort(bubbleArr);
    selectionArr=selectionSort(selectionArr);
    insertionArr=insertionSort(insertionArr);
    
    System.out.print("\nПузырьком:");
    for(int i=0;i<bubbleArr.length;++i)
    {
      System.out.print(bubbleArr[i]+" ");
    }
    System.out.print("\nВыбором:");
    for(int i=0;i<selectionArr.length;++i)
    {
      System.out.print(selectionArr[i]+" ");
    }
    System.out.print("\nВставкой:");
    for(int i=0;i<insertionArr.length;++i)
    {
      System.out.print(insertionArr[i]+" ");
    }
  }
  public static int[] bubbleSort(int[]arr)
  {
    for(int i=0;i<arr.length-1;++i)
    {
      for(int j=0;j<arr.length-i-1;++j)
      {
        if(arr[j]>arr[j+1])
        {
          int temp=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
        }
      }
    }
    return arr;
  }
  public static int[] selectionSort(int[]arr)
  {
    for(int i=0;i<arr.length-1;++i)
    {
      for(int j=i+1;j<arr.length;++j)
      {
        if(arr[j]<arr[i])
        {
          int temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
        }
      }
    }
    return arr;
  }
  public static int[] insertionSort(int[]arr)
  {
    for(int i=0;i<arr.length-1;++i)
    {
      for(int j=i+1;j>0;--j)
      {
        if(arr[j]<arr[j-1])
        {
          int temp=arr[j-1];
          arr[j-1]=arr[j];
          arr[j]=temp;
        }
      }
    }
    return arr;
  }
}
