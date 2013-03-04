package myarraylistfromandroid;

public class AList implements IList
{
    private int[] arr=new int[100];
    private int index;
    
    public void init(int[]initArray)
    {
        for(int i=0;i<initArray.length;++i)
        {
            arr[i]=initArray[i];
        }
        index=initArray.length;
    }
    @Override
    public int size()
    {
        return index;
    }

    @Override
    public void addStart(int value)
    {
        for(int i=index;i>0;--i)
        {
            arr[i]=arr[i-1];
        }
        arr[0]=value;
        ++index;
    }

    @Override
    public void addEnd(int value)
    {
        arr[index++]=value;
    }

    @Override
    public void addPos(int position, int value)
    {
        for(int i=index;i>position;--i)
        {
            arr[i]=arr[i-1];
        }
        arr[position]=value;
        ++index;
    }

    @Override
    public void delStart()
    {
        for(int i=0;i<index;++i)
        {
            arr[i]=arr[i+1];
        }
        --index;
    }

    @Override
    public void delEnd()
    {
        --index;
    }

    @Override
    public void delPos(int position)
    {
        for(int i=position;i<index;++i)
        {
            arr[i]=arr[i+1];
        }
        --index;
    }

    @Override
    public void sort()
    {
        if(index<2)return;
        for(int i=index-1;i>0;--i)
        {
            for(int j=0;j<i;++j)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    @Override
    public void set(int position, int value)
    {
        arr[position]=value;
    }

    @Override
    public int get(int position)
    {
        return arr[position];
    }

    @Override
    public void clear()
    {
        index=0;
    }

    @Override
    public IList copy()
    {
        IList result=new AList();
        for(int i=0; i<index;++i)
        {
            result.addEnd(arr[i]);
        }
        return result;
    }    
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
