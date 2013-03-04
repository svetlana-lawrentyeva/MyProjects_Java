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
    if(initArray.length>arr.length)
    {
      arr=new int[initArray.length];
    }
    for(int i=0;i<initArray.length;++i)
    {
      arr[i]=initArray[i];
    }
    index=initArray.length;
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
    if(index==arr.length)
        {
            int newSize=(int)(arr.length+arr.length*.3);
            int[]tempArr=new int[newSize];
            for(int i=0;i<arr.length;++i)
            {
              tempArr[i]=arr[i];
            }
            arr=tempArr;
        }
  }
  
  @Override
  public void addStart(int value)
  {
    increaseArray();
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
    increaseArray();
    arr[index++]=value;
  }

  @Override
  public void addPosition(int position, int value)
  {
    if(position<0||position>index) throw new ArrayIndexOutOfBoundsException();
    increaseArray();
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
      if(index<=0) throw new ArrayIndexOutOfBoundsException();
      for(int i=0;i<index-1;++i)
      {
        arr[i]=arr[i+1];
      }
      --index;
  }

  @Override
  public void delEnd()
  {
    if(index<=0) throw new ArrayIndexOutOfBoundsException();
    --index;
  }

  @Override
  public void delPosition(int position)
  {
    if(position<0||position>index||index==0) throw new ArrayIndexOutOfBoundsException();
    for(int i=position;i<index-1;++i)
    {
      arr[i]=arr[i+1];
    }
    --index;
  }

  @Override
  public void set(int position, int value)
  {
    if(position>=index||position<0) throw new ArrayIndexOutOfBoundsException();
    arr[position]=value;
  }

  @Override
  public int get(int position)
  {
    if(position>=index||position<0) throw new ArrayIndexOutOfBoundsException();
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
    if(index==1||index==0) return;
    for(int i=0;i<index-1;++i)
    {
        for(int j=i;j>=0;--j)
        {
            if(arr[j+1]<arr[j])
            {
                int temp=arr[j+1];
                arr[j+1]=arr[j];
                arr[j]=temp;
            }
        }
    }
  }

  @Override
  public void revers()
  {
    if(index==1||index==0) return;
    for(int i=0;i<index/2;++i)
    {
        int temp=arr[i];
        arr[i]=arr[index-i-1];
        arr[index-i-1]=temp;
    }
  }

  @Override
  public IList copy()
  {
    IList result=new MyAList(toArray());
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
