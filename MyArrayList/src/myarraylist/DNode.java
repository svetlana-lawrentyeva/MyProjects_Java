package myarraylist;

public class DNode
{
    private int data;
    private DNode next;
    private DNode prev;
    
    public DNode()
    {
        this.data=0;
        this.next=null;
        this.prev=null;
    }
    public DNode(int value)
    {
        this.data=value;
        this.next=null;
        this.prev=null;
    }
    public void setData(int value)
    {
        this.data=value;
    }
    public int getData()
    {
        return this.data;
    }
    public void setNext(DNode next)
    {
        this.next=next;
    }
    public DNode getNext()
    {
        return this.next;
    }
    public void setPrev(DNode prev)
    {
        this.prev=prev;
    }
    public DNode getPrev()
    {
        return this.prev;
    }
    
}
