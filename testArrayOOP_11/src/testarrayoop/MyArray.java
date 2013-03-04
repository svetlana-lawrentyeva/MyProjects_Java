package testarrayoop;

public class MyArray
{
  private int[]arr;
  public void init(int[]arr)
  {
    this.arr=arr;
  }
  public void printArray()
  {
    for(int i = 0; i<arr.length;++i)
    {
      System.out.print(arr[i]+" ");
    }
  }
  public int[] getArray()
  {
    return arr;
  }
  public int max() throws ArithmeticException
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
  public int min() throws ArithmeticException
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
  public int maxInd() throws ArithmeticException
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
  public int minInd() throws ArithmeticException
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
  public void bubbleSort() throws ArithmeticException
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
  public void selectionSort() throws ArithmeticException
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
  public void insertionSort() throws ArithmeticException
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
  public void quickSort() throws ArithmeticException
  {
    if (arr == null || arr.length == 0)
    {
      throw new ArithmeticException();
    }
    quickSort(arr, 0, arr.length-1);
  }
  private void quickSort(int[] arr, int start, int end)
  {
    int i = start;
    int j = end;
    int pivot = arr[(int) ((start + end) / 2)];
    while (i < j)
    {
      while (arr[i] < pivot)
      {
        ++i;
      }
      while (arr[j] > pivot)
      {
        --j;
      }
      if (i <= j)
      {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        ++i;
        --j;
      }
    }
    if (start < j)
    {
      quickSort(arr, start, j);
    }
    if (end > i)
    {
      quickSort(arr, i, end);
    }
  }
  public void mergeSort()
  {
    if (arr == null || arr.length == 0)
    {
      throw new ArithmeticException();
    }
//    mergeSort(arr);
    mergeSort1(0, arr.length-1);
  }
  private void mergeSort1(int left, int right)
  {
    if(left>=right)return;
        int middle=(left+right)/2;
        mergeSort1(left,middle);
        mergeSort1(middle+1, right);        
        merge(left, middle, right);
  }
  private void merge(int left,int middle,int right)
    {
        int j=middle+1;
        while(j<=right)
        {
            int i=j-1;
            boolean isProcessing=true;
            while(i>=left&isProcessing)
            {
                if(arr[i+1]<arr[i])
                {
                    int temp=arr[i+1];
                    arr[i+1]=arr[i];
                    arr[i]=temp;
                    --i;                    
                }
                else isProcessing=false;
            }
            ++j;
        }
    }
  private void mergeSort(int[] arr)
  {
    if (arr.length == 1)
    {
      return;
    }
    int[] arr1 = new int[arr.length / 2];
    int[] arr2 = new int[arr.length - arr1.length];
    System.arraycopy(arr, 0, arr1, 0, arr.length / 2);
    System.arraycopy(arr, arr.length / 2, arr2, 0, arr2.length);

    mergeSort(arr1);
    mergeSort(arr2);

    int arrI = 0;
    int arr1I = 0;
    int arr2I = 0;

    while (arrI < arr.length&arr1I < arr1.length & arr2I < arr2.length)
    {
        if (arr1[arr1I] < arr2[arr2I])
        {
          arr[arrI] = arr1[arr1I];
          arr1I++;
        }
        else
        {
          arr[arrI] = arr2[arr2I];
          arr2I++;
        }
        arrI++;
    }
    if (arr1I < arr1.length)
    {
      System.arraycopy(arr1, arr1I, arr, arrI, arr1.length - arr1I);
    }
    if (arr2I < arr2.length)
    {
      System.arraycopy(arr2, arr2I, arr, arrI, arr2.length - arr2I);
    }
  }
  public void shellSort()
    {
    if (arr == null || arr.length == 0)
    {
      throw new ArithmeticException();
    }
    if (arr.length == 1)
    {
      return;
    }
        int[] sequenceStep={1,4,10,23,57,132,301,701,1750};
        int step=0;
        int i=0;
        while(sequenceStep[i]<=arr.length/2&i<sequenceStep.length)
        {
            step=sequenceStep[i];
            ++i;
        }
        for(int j=i;j>=0;--j)
        {
            shellSort(sequenceStep[j]);
        }
    }
    private void shellSort(int step)
    {
        int i=0;
        while(i+step<arr.length)
        {
            for(int j=i+step;j>0;j-=step)
            {
                if(arr[j]<arr[j-step])
                {
                    int temp=arr[j];
                    arr[j]=arr[j-step];
                    arr[j-step]=temp;
                }
            }
            i+=step;
        }
    }
}
