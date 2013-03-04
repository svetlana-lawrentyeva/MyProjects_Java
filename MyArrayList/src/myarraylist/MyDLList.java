package myarraylist;

public class MyDLList implements IList
{
    DNode front;
    DNode rear;
    
    public MyDLList()    
    {
        front=new DNode();
        rear=new DNode();
    }
    @Override
    public void init(int[] initArray)
    {
        for(int i=0;i<initArray.length;++i)
        {
            addEnd(initArray[i]);
        }
    }

    @Override
    public void addStart(int value)
    {
        DNode temp=new DNode(value);
        if(front.getNext()==null)
        {
            front.setNext(temp);
            temp.setPrev(front);
            rear.setPrev(temp);
            temp.setNext(rear);
        }
        else
        {
            temp.setNext(front.getNext());
            front.getNext().setPrev(temp);
            temp.setPrev(front);
            front.setNext(temp);
            
        }
    }

    @Override
    public void addEnd(int value)
    {        
        DNode temp=new DNode(value);
        if(rear.getPrev()==null)
        {
            front.setNext(temp);
            temp.setPrev(front);
            rear.setPrev(temp);
            temp.setNext(rear);
        }
        else
        {
            temp.setPrev(rear.getPrev());
            rear.getPrev().setNext(temp);
            temp.setNext(rear);
            rear.setPrev(temp);            
        }
    }

    @Override
    public void addPos(int position, int value)
    {
        if(position<0||position>size())throw new ArrayIndexOutOfBoundsException();
        DNode pluck=front;
        int counter=0;
        while(pluck.getNext()!=null&&counter++<=position)
        {
            pluck=pluck.getNext();
        }
        DNode temp=new DNode(value);
        temp.setPrev(pluck.getPrev());
        pluck.setPrev(temp);
        temp.getPrev().setNext(temp);
        temp.setNext(pluck);
    }

    @Override
    public void delStart()
    {
        if(size()==0)throw new ArrayIndexOutOfBoundsException();
        front.setNext(front.getNext().getNext());
        front.getNext().setPrev(front);
        if(front.getNext()==rear)
        {
            front=null;
            rear=null;
        }
    }

    @Override
    public void delEnd()
    {
        if(size()==0)throw new ArrayIndexOutOfBoundsException();
        rear.setPrev(rear.getPrev().getPrev());
        rear.getPrev().setNext(rear);
        if(front.getNext()==rear)
        {
            front=null;
            rear=null;
        }
    }

    @Override
    public void delPos(int position)
    {
        if(position<0||position>=size())throw new ArrayIndexOutOfBoundsException();
        DNode pluck=front;
        int counter=0;
        while(pluck.getNext()!=null&&counter++<=position)
        {
            pluck=pluck.getNext();
        }
        pluck.getPrev().setNext(pluck.getNext());
        pluck.getNext().setPrev(pluck.getPrev());     
        if(front.getNext()==rear)
        {
            front=null;
            rear=null;
        }  
    }

    @Override
    public void set(int position, int value)
    {
        if(position<0||position>=size())throw new ArrayIndexOutOfBoundsException();
        DNode pluck=front;
        int counter=0;
        while(pluck.getNext()!=null&&counter++<=position)
        {
            pluck=pluck.getNext();
        }
        pluck.setData(value);
    }

    @Override
    public int get(int position)
    { 
        if(position<0||position>=size())throw new ArrayIndexOutOfBoundsException();       
        DNode pluck=front;
        int counter=0;
        while(pluck.getNext()!=null&&counter++<=position)
        {
            pluck=pluck.getNext();
        }
        return pluck.getData();
    }

    @Override
    public void clear()
    {        
        front=new DNode();
        rear=new DNode();
    }

    @Override
    public int size()
    {             
        DNode pluck=front;
        int counter=0;
        while(pluck.getNext()!=rear&&pluck.getNext()!=null)
        {
            pluck=pluck.getNext();
            ++counter;
        }
        return counter;
    }

    @Override
    public void sort()
    {
        if(size()<2) return;
        DNode lastSorted=null;
        while(front.getNext()!=lastSorted)
        {
            DNode tmp=front.getNext();
            while(tmp.getNext()!=lastSorted)
            {
                if(tmp.getData()>tmp.getNext().getData())
                {
                    int temp=tmp.getData();
                    tmp.setData(tmp.getNext().getData());
                    tmp.getNext().setData(temp);
                }
                tmp=tmp.getNext();
            }
            lastSorted=tmp;
        }        
    }

    @Override
    public void revers()
    {
        if(size()<2) return;
        DNode first=front.getNext();
        while(first.getNext()!=null)
        {
            DNode tmp=first.getNext();
            first.setNext(tmp.getNext());
            tmp.setNext(front.getNext());
            front.setNext(tmp);
        }
    }

    @Override
    public IList copy()
    {
        MyDLList temp=new MyDLList();
        DNode tempParent=temp.front;
        DNode pluck=front;
        
        while(pluck.getNext()!=null)
        {
            pluck=pluck.getNext();
            DNode n=new DNode(pluck.getData());
            tempParent.setNext(n);
            tempParent.getNext().setPrev(tempParent);
            tempParent=tempParent.getNext();
        }        
        return temp;
    }

    @Override
    public String toString()
    {
        String result="";
        DNode pluck=front;
        
        while(pluck.getNext()!=null)
        {
            boolean b=(pluck==front)?true:false;
            
            pluck=pluck.getNext();
            if(b) result=""+pluck.getData();
            else result=result + " "+pluck.getData();
        }      
        
        return result;
    }
    @Override
    public int[] toArray()
    {
        int[]arr=new int[size()];
        int i=0;
        DNode pluck=front;
        
        while(pluck.getNext()!=null)
        {
            pluck=pluck.getNext();
            arr[i++]=pluck.getData();
        }      
        return arr;
    }    
}
