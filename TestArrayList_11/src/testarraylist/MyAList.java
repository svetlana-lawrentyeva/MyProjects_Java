package testarraylist;

public class MyAList implements IList
{
  private int[]arr=new int[10];
  private int index=0;
  
  public MyAList(){}
  public MyAList(int[]initArray)
  {
    init(initArray);
  }
  @Override
  public void init(int[]initArray)
  {
    for(int i=0;i<initArray.length;++i)
    {
      addEnd(initArray[i]);
    }
  }
  @Override
  public int[] toArray()
  {
    int[]resultArray=new int[index];
    for(int i=0;i<index;++i)
    {
      resultArray[i]=arr[i];
    }
    return resultArray;
  }
  private void increaseArray()
  {
    int[]tempArr=new int[arr.length+10];
    for(int i=0;i<arr.length;++i)
    {
      tempArr[i]=arr[i];
    }
    arr=tempArr;
  }
  
  @Override
  public void addStart(int value)
  {
    if(index==arr.length)
    {
      increaseArray();
    }
    for(int i=index-1;i>=0;--i)
    {
      arr[i+1]=arr[i];
    }
    arr[0]=value;
    ++index;
  }

  @Override
  public void addEnd(int value)
  {
    if(index==arr.length)
    {
      increaseArray();
    }
    arr[index++]=value;
  }

  @Override
  public void addPosition(int position, int value)
  {
    if(index==arr.length)
    {
      increaseArray();
    }
    for(int i=index-1;i>=position;--i)
    {
      arr[i+1]=arr[i];
    }
    arr[position]=value;
    ++index;
  }

  @Override
  public void delStart()
  {
    if(index>0)
    {
      for(int i=0;i<index-1;++i)
      {
        arr[i]=arr[i+1];
      }
      --index;
    }
    else
    {
      throw new ArrayIndexOutOfBoundsException();
    }
  }

  @Override
  public void delEnd()
  {
    if(index>0)
    --index;
    else
      throw new ArrayIndexOutOfBoundsException();
  }

  @Override
  public void delPosition(int position)
  {
    if(position>=0&position<index)
    {
      for(int i=position;i<index-1;++i)
      {
        arr[i]=arr[i+1];
      }
      --index;
    }
    else
    {
      throw new ArrayIndexOutOfBoundsException();
    }
  }

  @Override
  public void set(int position, int value)
  {
    if(!(position<index&position>=0))
    {
      throw new ArrayIndexOutOfBoundsException();
    }
    arr[position]=value;
    ++index;
  }

  @Override
  public int get(int position)
  {
    if(!(position<index&position>=0))
    {
      throw new ArrayIndexOutOfBoundsException();
    }
    return arr[position];
  }

  @Override
  public void clear()
  {
    index=0;
  }

  @Override
  public int size()
  {
    return index;
  }

  @Override
  public void sort()
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

  @Override
  public void revers()
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

  @Override
  public IList copy()
  {
    IList result=new MyAList(arr);
    return result;
  }
  @Override
  public String toString()
  {
    String result="";
    for(int i=0;i<index;++i)
    {
      if(i==0)
      {
        result=""+arr[i];
      }
      else
      {
        result=result+" "+arr[i];
      }
    }
    return result;
  }
}
