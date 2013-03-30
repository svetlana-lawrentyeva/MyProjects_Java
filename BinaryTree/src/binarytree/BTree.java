package binarytree;

import java.util.Iterator;
import java.util.NoSuchElementException;


public class BTree implements ITree
{

    private Node root = null;

    public void init(int[] arr)
    {
        for (int i = 0; i < arr.length; ++i)
        {
            this.add(arr[i]);
        }
    }
    @Override
    public Object getRoot()
    {
        return root;
    }

    @Override
    public void add(int value)
    {
        root = add(root, value);
    }

    private Node add(Node current, int value)
    {
        if (current == null)
        {
            current = new Node(value);
        } else
        {
            if (value < current.data)
            {
                current.left = add(current.left, value);
            } else
            {
                current.right = add(current.right, value);
            }
        }
        return current;
    }

    private int countChild(Node current)
    {
        int result = 0;
        if (current.left == null & current.right == null)
        {
            result = 0;
        } else if (current.left != null & current.right != null)
        {
            result = 2;
        } else
        {
            result = 1;
        }
        return result;
    }

    @Override
    public void del(int value)
    {
        Node delNode = find(root, value);
        if (countChild(delNode) == 0)
        {
            if (delNode == root)
            {
                root = null;
            } else
            {
                Node parent = findParent(root, value);
                if (parent.left == delNode)
                {
                    parent.left = null;
                } else
                {
                    parent.right = null;
                }
            }
        } else if (countChild(delNode) == 1)
        {
            if (delNode == root)
            {
                if (root.left != null)
                {
                    root = root.left;
                } else
                {
                    root = root.right;
                }
            } else
            {
                Node parent = findParent(root, value);

                Node temp;
                if (delNode.left != null)
                {
                    temp = delNode.left;
                } else
                {
                    temp = delNode.right;
                }

                if (parent.left == delNode)
                {
                    parent.left = temp;
                } else
                {
                    parent.right = temp;
                }
            }
        } else
        {
            Node temp = findMax(delNode.left);
            del(temp.data);
            delNode.data = temp.data;
        }
    }

    private Node findParent(Node current, int value)
    {
        if (current.left != null)
        {
            if (current.left.data == value)
            {
                return current;
            }
        } else if (current.right != null)
        {
            if (current.right.data == value)
            {
                return current;
            }
        }
        if (value < current.data)
        {
            return findParent(current.left, value);
        }
        return findParent(current.right, value);
    }

    private Node find(Node current, int value)
    {
        if (current.data == value)
        {
            return current;
        }
        if (value < current.data)
        {
            return find(current.left, value);
        }
        return find(current.right, value);
    }

    private Node findMax(Node current)
    {
        if (current.right == null)
        {
            return current;
        }
        return findMax(current.right);
    }

    @Override
    public void clear()
    {
        root=null;
        iterator=new BTree_Iterator();
    }

    @Override
    public boolean equals(ITree tree)
    {
        Node treeRoot=(Node)((BTree)tree).getRoot();
        return equals(root, treeRoot);
    }
    private boolean equals(Node current1, Node current2)
    {
        if(current1==null&&current2==null)return true;
        if((current1==null&&current2!=null)||(current1!=null&&current2==null))return false;
        if(current1.data==current2.data)
        {
            return (equals(current1.left, current2.left) && equals(current1.right, current2.right));
        }
        return false;
    }
//---------------------------------------------------------------------------------------------------------------------------
    class BTree_Iterator implements Iterator<Integer>
    {
        int count=0;
        int []arr=toArray();
        
        public void setArray()
        {
            count=0;
            arr=toArray();
        }
        public boolean hasNext()
        {
            
            if(count<arr.length) return true;
            if(count>=arr.length || count==0)
            {
                setArray();
                count=0;
                return true;
            }
            count=0;
            return false;
        }

        @Override
        public Integer next()
        {
            if(count==arr.length)throw new NoSuchElementException();
            ++count;
            return arr[count-1];
        }

        @Override
        public void remove()
        {
        }
    }
    
    //------------------------------------------------------------------------------------------------
    
    BTree_Iterator iterator=new BTree_Iterator();
    
    @Override
    public Iterator<Integer> iterator()
    {
        return iterator;
    }
//-----------------------------------------------------------------------------------------------------
    interface Visitor
    {

        public void visit(Node p);
    }

    class NodeCount implements Visitor
    {

        public int count = 0;

        @Override
        public void visit(Node p)
        {
            ++count;
        }
    }

    @Override
    public int count()
    {
        NodeCount cc = new NodeCount();
        go(root, cc);
        return cc.count;
    }

    private void go(Node current, Visitor vv)
    {
        if (current == null)
        {
            return;
        }
        go(current.left, vv);
        vv.visit(null);
        go(current.right, vv);
    }

    @Override
    public int countLeafs()
    {
        return countLeafs(root);
    }

    private int countLeafs(Node current)
    {
        if (current == null)
        {
            return 0;
        }
        if (countChild(current) == 0)
        {
            return 1;
        }

        return countLeafs(current.left) + countLeafs(current.right);
    }

    @Override
    public int countBranches()
    {
        return countBranches(root);
    }

    private int countBranches(Node current)
    {
        if (current == null)
        {
            return 0;
        }
        if (countChild(current) == 0)
        {
            return 0;
        }

        return 1 + countBranches(current.left) + countBranches(current.right);
    }

    @Override
    public int countLevels()
    {
        return countLevels(root, 0);
    }

    private int countLevels(Node current, int max)
    {
        if (current == null)
        {
            return max;
        }
        ++max;
        int leftMax = countLevels(current.left, max);
        int rightMax = countLevels(current.right, max);
        if (leftMax > rightMax)
        {
            max = leftMax;
        } else
        {
            max = rightMax;
        }
        return max;
    }

    @Override
    public int countColumns()
    {
        return maxWidth();
    }

    private int width(Node currentRoot, int level)
    {
        if (currentRoot == null)return 0;
        if (level == 1)return 1;
        return width(currentRoot.left, level - 1) + width(currentRoot.right, level - 1);
    }

    int maxWidth()
    {
        if (root == null)return 0;
        int maxWidth = 1;
        int currentWidth = 1;
        int level = 2;
        while (currentWidth > 0)
        {
            currentWidth = width(root, level++);
            maxWidth=(currentWidth>maxWidth)?currentWidth:maxWidth;
        }
        return maxWidth;
    }

    @Override
    public void print()
    {
        print(root, 0);
    }
    private void print(Node current, int level)
    {
        if(current.right!=null)print(current.right,level+1);
        for(int i=0;i<level;++i)
        {
            System.out.print("    ");
        }
        System.out.println(current.data);
        if(current.left!=null)print(current.left,level+1);
    }

    public String toString()
    {
        return toString(root, "");
    }

    private String toString(Node current, String result)
    {
        if (current == null)
        {
            return " ";
        }
        return toString(current.left, result) + current.data + toString(current.right, result);
    }
    
    
    public int[] toArray()
    {
        int[] arr={};
        return toArray(root, arr);
    }

    private int[] toArray(Node current, int[]result)
    {
        if (current == null)
        {
            int[] arr={};
            return arr;
        }
        int []arrLeft=toArray(current.left, result);
        int []arrRight=toArray(current.right, result);
        int []resultArray=new int[arrLeft.length+1+arrRight.length];
        int resultArrayCount=0;
        for(int i=0;i<arrLeft.length;++i)
        {
            resultArray[resultArrayCount++]=arrLeft[i];
        }
        resultArray[resultArrayCount++]=current.data;
        for(int i=0;i<arrRight.length;++i)
        {
            resultArray[resultArrayCount++]=arrRight[i];
        }
        return resultArray;
    }
}
class Node
{

    public int data = 0;
    public Node left = null;
    public Node right = null;
    public boolean visited=false;

    public Node(int data)
    {
        this.data = data;
    }
}
