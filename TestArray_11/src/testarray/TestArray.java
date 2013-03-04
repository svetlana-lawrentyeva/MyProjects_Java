package testarray;

public class TestArray
{
  public static void main(String[] args)
  {
    int[] arr ={10,2,5,70,1};
    int[] arr1 ={10,2,5,70,1};
    int[] arr2 ={10,2,5,70,1};
    int[] arr3 ={10,2,5,70,1};
    int[] arr4 ={34,23,8,78,12,45,98,56,115,42,4,8,66,0,15,16};
    System.out.println("min " + minEl(arr));
    System.out.println("max " + maxEl(arr));
    System.out.println("minInd " + minInd(arr));
    System.out.println("maxInd " + maxInd(arr));
    sort1(arr1);
    printArr(arr1);
    sort2(arr2);
    printArr(arr2);
    sort3(arr3);
    printArr(arr3);
    System.out.println("/////////////////////////////////////////////////////////");
    sort4(arr4, 0, arr4.length - 1);
    System.out.println("/////////////////////////////////////////////////////////");
    //printArr(arr4);
    revers(arr);
    printArr(arr);
  }

  public static void printArr(int[] arr)
  {
    for (int i = 0; i < arr.length; ++i)
    {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static int minEl(int[] arr) throws ArithmeticException
  {
    if (arr == null || arr.length == 0)
    {
      throw new ArithmeticException();
    }
    int min = arr[0];
    for (int i = 1; i < arr.length; ++i)
    {
      if (arr[i] < min)
      {
        min = arr[i];
      }
    }
    return min;
  }

  public static int maxEl(int[] arr)
  {
    if (arr == null || arr.length == 0)
    {
      throw new ArithmeticException();
    }
    int max = arr[0];
    for (int i = 1; i < arr.length; ++i)
    {
      if (arr[i] > max)
      {
        max = arr[i];
      }
    }
    return max;
  }

  public static int minInd(int[] arr)
  {
    if (arr == null || arr.length == 0)
    {
      throw new ArithmeticException();
    }
    int minInd = 0;
    int min = arr[0];
    for (int i = 1; i < arr.length; ++i)
    {
      if (arr[i] < min)
      {
        minInd = i;
        min = arr[i];
      }
    }
    return minInd;
  }

  public static int maxInd(int[] arr)
  {
    if (arr == null || arr.length == 0)
    {
      throw new ArithmeticException();
    }
    int maxInd = 0;
    int max = arr[0];
    for (int i = 1; i < arr.length; ++i)
    {
      if (arr[i] > max)
      {
        maxInd = i;
        max = arr[i];
      }
    }
    return maxInd;
  }

  public static void sort1(int[] arr)
  {
    if (arr == null || arr.length == 0)
    {
      throw new ArithmeticException();
    }
    for (int j = arr.length - 1; j >= 0; --j)
    {
      for (int i = 0; i < arr.length - 1; ++i)
      {
        if (arr[i] > arr[i + 1])
        {
          int temp = arr[i];
          arr[i] = arr[i + 1];
          arr[i + 1] = temp;
        }
      }
    }
  }

  public static void sort2(int[] arr)
  {
    if (arr == null || arr.length == 0)
    {
      throw new ArithmeticException();
    }
    for (int i = 0; i < arr.length - 1; ++i)
    {
      int min = arr[i];
      int minInd = i;
      for (int j = i + 1; j < arr.length; ++j)
      {
        if (arr[j] < min)
        {
          min = arr[j];
          minInd = j;
        }
      }
      arr[minInd] = arr[i];
      arr[i] = min;
    }
  }

  public static void sort3(int[] arr)
  {
    if (arr == null || arr.length == 0)
    {
      throw new ArithmeticException();
    }
    for (int i = 1; i < arr.length; ++i)
    {
      for (int j = i; j > 0; --j)
      {
        if (arr[j] < arr[j - 1])
        {
          int temp = arr[j];
          arr[j] = arr[j - 1];
          arr[j - 1] = temp;
        }
      }
    }
  }

  public static void sort4(int[] arr, int start, int end)
  {
      System.out.println();
      printArr(arr);
    int i=start;
    int j=end;
    int pivot=arr[(int)((start+end)/2)];    
        System.out.println("pivot: "+pivot);
    while(i<j)
    {
      while(arr[i]<pivot){System.out.print("i: "+arr[i]+" ");++i;}
      while(arr[j]>pivot){System.out.print("j: "+arr[j]+" ");--j;}          
      if(i<=j)
      {
          System.out.print("i: "+arr[i]+" ");
          System.out.print("j: "+arr[j]+" ");
      int temp=arr[i];
      arr[i]=arr[j];
      arr[j]=temp;
      ++i;
      --j;
          System.out.println();
      printArr(arr);
      }
    }
      System.out.println();
    if(start<j)sort4(arr,start,j);
    if(end>i)sort4(arr,i,end);
  }

  public static void revers(int[] arr)
  {
    if (arr == null || arr.length == 0)
    {
      throw new ArithmeticException();
    }
    for (int i = 0; i <= arr.length / 2; ++i)
    {
      int temp = arr[i];
      arr[i] = arr[arr.length - 1 - i];
      arr[arr.length - 1 - i] = temp;
    }
  }
}
