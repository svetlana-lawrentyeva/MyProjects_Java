package binarytree;

import java.util.Iterator;

public class LBTree implements ITree
{
    Link root=null;
    
    @Override
    public void init(int[] arr)
    {
        for(int i=0;i<arr.length;++i)
        {
            this.add(arr[i]);
        }
        iterator.initIterator(root);
    }
    @Override
    public Object getRoot()
    {
        return root;
    }

    @Override
    public void add(int value)
    {
        root=add(null, root, value);
    }
    private Link add(Link parent, Link current, int value)
    {
        if(current==null)
        {
            current=new Link(value);
            if(parent!=null)current.p.parent=parent;
        }
        else if(value<current.p.data) current.p.left=add(current, current.p.left, value);
        else current.p.right=add(current, current.p.right, value);
        
        return current;
    }

    @Override
    public void del(int value)
    {
        Link delLink=find(root, value);
        
        if(countChildren(delLink)==0)
        {
            if(delLink==root)
            {
                root=null;
            }
            else
            {
                if(delLink.p.parent.p.left==delLink) delLink.p.parent.p.left=null;
                else delLink.p.parent.p.right=null;
            }
        }
        else if(countChildren(delLink)==1)
        {
           if(delLink==root)
           {
               if(root.p.left!=null)
               {
                   root=root.p.left;
               }
               else root=root.p.right;
           }
           else
           {
               Link next=null;
               if(delLink.p.left!=null)next=delLink.p.left;
               else next=delLink.p.right;
               
               if(delLink.p.parent.p.left==delLink)delLink.p.parent.p.left=next;
               else delLink.p.parent.p.right=next;
               
               next.p.parent=delLink.p.parent;
           }
        }
        else
        {
            Link temp=findMax(delLink.p.left);
            del(temp.p.data);
            delLink.p.data=temp.p.data;
        }
    }
    private Link findMax(Link current)
    {
        if(current.p.right==null)return current;
        return findMax(current.p.right);
    }
    private Link find(Link current, int value)
    {
        if(current.p.data==value)return current;
        if(value<current.p.data)return find(current.p.left, value);
        return find(current.p.right, value);
    }
    private int countChildren(Link current)
    {
        if(current.p.left==null&&current.p.right==null)return 0;
        if(current.p.left!=null&&current.p.right!=null)return 2;
        return 1;
    }
    @Override
    public int count()
    {
        return count(root);
    }
    private int count(Link current)
    {
        if(current==null)return 0;
        return 1+count(current.p.left)+count(current.p.right);
    }
    
    @Override
    public int countLeafs()
    {
        return countLeafs(root);
    }
    private int countLeafs(Link current)
    {
        if(current==null)return 0;
        int res=1;
        if(countChildren(current)>0)res=0;
        return res+countLeafs(current.p.left)+countLeafs(current.p.right);
    }
    
    @Override
    public int countBranches()
    {        
        return countBranches(root);
    }
    private int countBranches(Link current)
    {
        if(current==null)return 0;
        int res=0;
        if(countChildren(current)>0)res=1;
        return res+countBranches(current.p.left)+countBranches(current.p.right);
    }

    @Override
    public int countLevels()
    {
        return countLevels(root, 0);
    }
    private int countLevels(Link current, int max)
    {
        if(current==null)return max;
        ++max;
        int leftMax=countLevels(current.p.left, max);
        int rightMax=countLevels(current.p.right, max);
        max=(leftMax>rightMax)?leftMax:rightMax;
        return max;
    }

    @Override
    public int countColumns()
    {
        return maxWidth();
    }
    private int width(Link current, int level)
    {
        if(current==null)return 0;
        if(level==1)return 1;
        return width(current.p.left,level-1)+width(current.p.right,level-1);
    }
    private int maxWidth()
    {
        if(root==null)return 0;
        int maxWidth=1;
        int currentWidth=1;
        int level=2;
        while(currentWidth!=0)
        {
            currentWidth=width(root, level++);
            maxWidth=(currentWidth>maxWidth)?currentWidth:maxWidth;
        }
        return maxWidth;
    }

    @Override
    public void print()
    {
        print(root,0);
    }
    private void print(Link current, int level)
    {
        if(current.p.right!=null)print(current.p.right,level+1);
        for(int i=0;i<level;++i)
        {
            System.out.print("    ");
        }
        System.out.println(current.p.data);
        if(current.p.left!=null)print(current.p.left,level+1);
    }
    
    public String toString()
    {
        return toString(root);
    }
    private String toString(Link current)
    {
        if(current==null)return " ";
        return toString(current.p.left)+current.p.data+toString(current.p.right);
    }

    @Override
    public void clear()
    {
        root=null;
        iterator=new LBTree_Iterator();
    }
@Override
    public boolean equals(ITree tree)
    {
        return equals(root, (Link)tree.getRoot());
    }
    private boolean equals(Link current1, Link current2)
    {
        if(current1==null&&current2==null)return true;
        if((current1==null&&current2!=null)||(current1!=null&&current2==null))return false;
        if(current1.p.data==current2.p.data)
        {
            return (equals(current1.p.left, current2.p.left) && equals(current1.p.right, current2.p.right));
        }
        return false;
    }

    LBTree_Iterator iterator=new LBTree_Iterator();
    @Override
    public Iterator<Integer> iterator()
    {
        return iterator;
    }
    
    class LBTree_Iterator implements Iterator<Integer>
    {
        Link p;
        boolean complete;
        
        public void initIterator(Link root)
        {
            p=root;
            complete=false;
            setNotVisited(root);
            if(p!=null)while(p.p.left!=null) p=p.p.left;
        }
        
        private void setNotVisited(Link n)
        {
            if(n!=null)
            {
                if(n.p.left!=null)setNotVisited(n.p.left);
                n.visited=false;
                if(n.p.right!=null)setNotVisited(n.p.right);
            }
        }
        
        @Override
        public boolean hasNext()
        {
            boolean result=!complete;
            if(complete)initIterator(root);
            return result;
        }

        @Override
        public Integer next()
        {
            if(complete) return null;
            Link tmp=p;
            p.visited=true;
            if(p.p.left!=null && !p.visited)
            {
                while(p.p.left!=null && !p.p.left.visited)p=p.p.left;
            }
            else if(p.p.right!=null && !p.p.right.visited)
            {
                p=p.p.right;
                while(p.p.left!=null && !p.p.left.visited)p=p.p.left;
            }
            else
            {
                while(p!=null && p.visited) p=p.p.parent;
                if(p==null)
                    complete=true;
            }
            return tmp.p.data;
        }

        @Override
        public void remove()
        {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    class Node
    {
        int data=0;
        Link parent=null;
        Link left=null;
        Link right=null;
        
        public Node(int value)
        {
            this.data=value;
        }
    }
    
    class Link
    {
        Node p = null;
        boolean visited=false;
        
        public Link(int value)
        {
            p=new Node(value);
        }
    }
}


