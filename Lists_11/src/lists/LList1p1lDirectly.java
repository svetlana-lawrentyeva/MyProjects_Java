package lists;

public class LList1p1lDirectly implements IList
{
    Node root;
    @Override
    public void init(int[] initArray)
    {
        Node temp=root;
        for(int i=0;i<initArray.length;++i)
        {
            temp=new Node(initArray[i]);
            temp=temp.getNext();
        }
    }

    @Override
    public void addStart(int value)
    {
        Node temp=new Node(value);
        temp.setNext(root);
        root=temp;
    }

    @Override
    public void addEnd(int value)
    {
        Node pluck=root;
        while(pluck!=null)
        {
            pluck=pluck.getNext();
        }
        pluck=new Node(value);
    }

    @Override
    public void addPos(int position, int value)
    {
        if(position<0||position>size())throw new ArrayIndexOutOfBoundsException();
        Node pluck=root;
        int counter=0;
        while(counter++<=position)
        {
            pluck=pluck.getNext();
        }
        Node temp=new Node(value);
        temp.setNext(pluck.getNext());
        pluck.setNext(temp);
    }

    @Override
    public void delStart()
    {
        if(size()==0)throw new ArrayIndexOutOfBoundsException();
        if(size()==1)root=null;
        else
        {
            root=root.getNext();
        }        
    }

    @Override
    public void delEnd()
    {
        if(size()==0)throw new ArrayIndexOutOfBoundsException();
        if(size()==1)root=null;
        else
        {
            Node pluck=root;
            while(pluck.getNext().getNext()!=null)
            {
                pluck=pluck.getNext();
            }
            pluck.setNext(null);
        }
    }

    @Override
    public void delPos(int position)
    {
        if(position<0||position>=size())throw new ArrayIndexOutOfBoundsException();
        if(size()==1)
        {
            root=null;
        }
        Node pluck=root;
        int counter=0;
        while(counter++<position)
        {
            pluck=pluck.getNext();
        }
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
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int size()
    {
        throw new UnsupportedOperationException("Not supported yet.");
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
    
    protected class Node
    {
        private int data;
        private Node next;

        public Node()
        {
            data=0;
            next=null;
        }
        public Node(int data)
        {
            this.data=data;
            next=null;
        }
        public Node(int data, Node next)
        {
            this.data=data;
            this.next=next;
        }
        public int getData()
        {
            return this.data;
        }
        public void setData(int data)
        {
            this.data=data;
        }
        public Node getNext()
        {
            return this.next;
        }
        public void setNext(Node next)
        {
            this.next=next;
        }
    }
}
