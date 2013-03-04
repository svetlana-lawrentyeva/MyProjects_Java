package testarraylist;

public class MyDList implements IList
{
    int[]arr=new int[10];
    int front=arr.length/2;
    int rear=front;
    
    private void increase()
    {
        if(front<0 & rear==arr.length)
        {
            int newSize=(int)(arr.length+arr.length*.3);
            int[]temp=new int[newSize];
            for(int i=front+1;i<rear;++i)
            {
                temp[i]=arr[i];
            }
            arr=temp;
        }
    }
    private void center()
    {
        increase();
        if(front==0)
        {
            int step=arr.length/2-size()/2;
            for(int i=rear-1;i>front;--i)
            {
                arr[i+step]=arr[i];
            }
        }
        if(rear==arr.length-1)
        {
            int step=arr.length/2-size()/2;
            for(int i=front+1;i<rear;++i)
            {
                arr[i-step]=arr[i];
            }
        }
    }
    @Override
    public void addStart(int value)
    {
        center();
        arr[front--]=value;
    }

    @Override
    public void addEnd(int value)
    {
        center();
        arr[rear++]=value;
    }

    @Override
    public void addPosition(int position, int value)
    {
        center();
        if(position<0||position>=size())throw new ArrayIndexOutOfBoundsException();
        
        arr[front+position+1]=value;
    }

    @Override
    public void delStart()
    {
        center();
        if(front<rear) ++front;
    }

    @Override
    public void delEnd()
    {        
        center();
        if(front<rear) --rear;
    }

    @Override
    public void delPosition(int position)
    {        
        center();
        if(position<0||position>=size())throw new ArrayIndexOutOfBoundsException();
        arr[front+position+1]=value;
    }

    @Override
    public void set(int position, int value)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int get(int position)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void clear()
    {
        front=arr.length/2;
        int rear=front;
    }

    @Override
    public int size()
    {
        return rear-front-1;
    }

    @Override
    public void sort()
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void revers()
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public IList copy()
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int[] toArray()
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void init(int[] initArray)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }    
}
