package myarraylist;

public class MyLEList implements IList
{
    private Node root;
    private Node tail;
    
    public MyLEList()
    {
        root=new Node();
        tail=new Node();
    }
    
    @Override
    public void init(int[] initArray)
    {
        Node parent=root;
        for(int i=0;i<initArray.length;++i)
        {
            Node temp=new Node(initArray[i]);
            parent.setNext(temp);
            parent=temp;
        }
        tail=parent;
    }

    @Override
    public void addStart(int value)
    {
        Node temp=new Node(value, root.getNext());
        root.setNext(temp);
    }

    @Override
    public void addEnd(int value)
    {   
        Node temp=new Node(value);     
        if(root.getNext()==null)
        {
            root.setNext(temp);
        }
        tail.setNext(temp);
        tail=temp;
    }

    @Override
    public void addPos(int position, int value)
    {        
        if(position<0||position>size())throw new ArrayIndexOutOfBoundsException();
        Node temp=new Node(value);
        Node pluck=root;
        int counter=0;
        while(pluck.getNext()!=null&counter<position)
        {
            pluck=pluck.getNext();
            ++counter;
        }
        temp.setNext(pluck.getNext());
        pluck.setNext(temp);
    }

    @Override
    public void delStart()
    {
        if(size()==0)throw new ArrayIndexOutOfBoundsException();
        if(size()==1)root=new Node();
        else root=root.getNext();
    }

    @Override
    public void delEnd()
    {
        if(size()==0)throw new ArrayIndexOutOfBoundsException();
        Node pluck=root;
        Node prePluck=null;
        while(pluck.getNext()!=null)
        {
            prePluck=pluck;
            pluck=pluck.getNext();
        }
        prePluck.setNext(null);
    }

    @Override
    public void delPos(int position)
    {       
        if(size()==0||position<0||position>=size())throw new ArrayIndexOutOfBoundsException();        
        Node pluck=root;
        Node prePluck=null;
        int counter=0;
        while(pluck.getNext()!=null&counter<=position)
        {
            prePluck=pluck;
            pluck=pluck.getNext();
            ++counter;
        }
        prePluck.setNext(pluck.getNext());
    }

    @Override
    public void set(int position, int value)
    {       
        if(position<0||position>=size())throw new ArrayIndexOutOfBoundsException();      
        Node pluck=root;
        int counter=0;
        while(pluck.getNext()!=null&counter<=position)
        {
            pluck=pluck.getNext();
            ++counter;
        }
        pluck.setData(value);
    }

    @Override
    public int get(int position)
    {
        if(position<0||position>=size())throw new ArrayIndexOutOfBoundsException();
        Node pluck=root;
        int counter=0;
        while(pluck.getNext()!=null&counter<=position)
        {
            pluck=pluck.getNext();
            ++counter;
        }
        return pluck.getData();
    }

    @Override
    public void clear()
    {
        root=new Node();
    }

    @Override
    public int size()
    {
        Node pluck=root;
        int counter=0;
        while(pluck.getNext()!=null)
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
        Node lastSorted=null;
        while(root.getNext()!=lastSorted)
        {
            Node tmp=root.getNext();
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
        Node first=root.getNext();
        while(first.getNext()!=null)
        {
            Node tmp=first.getNext();
            first.setNext(tmp.getNext());
            tmp.setNext(root.getNext());
            root.setNext(tmp);
        }
    }

    @Override
    public IList copy()
    {
        MyLEList temp=new MyLEList();
        Node tempParent=temp.root;
        Node pluck=root;
        
        while(pluck.getNext()!=null)
        {
            pluck=pluck.getNext();
            Node n=new Node(pluck.getData());
            tempParent.setNext(n);
            tempParent=tempParent.getNext();
        }        
        return temp;
    }
  
    @Override
    public String toString()
    {
        String result="";
        Node pluck=root;
        
        while(pluck.getNext()!=null)
        {
            boolean b=(pluck==root)?true:false;
            
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
        Node pluck=root;
        
        while(pluck.getNext()!=null)
        {
            pluck=pluck.getNext();
            arr[i++]=pluck.getData();
        }      
        return arr;
    }    
}

