package binarytree;

import java.util.Iterator;

public class Main
{

    public static void main(String[] args)
    {
//        ITree tree=new BTree();
        ITree tree=new LBTree();
//        int[]arr={23,14,40,10,18,36,44,8,12,16,20,34,38,42,6,13,21};
//        int[]arr={23,14,40};
        int[]arr={23,45,1,66,0,9,67,-6,8,25,-44,-3,-100,-1000};
        int[]arr1={23,40,14,2};
        tree.init(arr);
        
//        ITree tree1=new BTree();        
        ITree tree1=new LBTree();
        tree1.init(arr1);
        System.out.println("equals: "+tree.equals(tree1));
        System.out.println("toString: "+tree.toString());
        System.out.println("countLeafs: "+tree.countLeafs());
        System.out.println("countBranches: "+tree.countBranches());
        System.out.println("countLevels: "+tree.countLevels());
        System.out.println("------------------------------------");
        tree.print();
        System.out.println("------------------------------------");
        System.out.println("countColumns: "+tree.countColumns());
        
        System.out.println("1:");
        for(int n:tree)
        {
            System.out.print(n+" ");
        }
        
        System.out.println("\n2:");
        Iterator it=tree.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next()+" ");
        }
    }
}
