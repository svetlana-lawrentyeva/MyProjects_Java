package binarytree;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ITreeTest
{
    @Parameterized.Parameters
    public static Collection data()
    {
        return Arrays.asList
                (new Object[][]
                    {
                        {new BTree()},
                        {new LBTree()}
                    }
                );
    }
    private ITree tree;
    public ITreeTest(ITree tree)
    {
        this.tree=tree;
    }
    @Before
    public void setUp()
    {
        tree.clear();
    }
//------------------------------------------------------------------------------
    @Test
    public void testAdd_MANY()
    {
        int[]arr={23,45,1,66};
        tree.init(arr);
        tree.add(9999);
        assertEquals(5,tree.count());
        assertEquals(" 1 23 45 66 9999 ", tree.toString());
    }    
    @Test
    public void testAdd_2()
    {
        int[]arr={23,45};
        tree.init(arr);
        tree.add(9999);
        assertEquals(3,tree.count());
        assertEquals(" 23 45 9999 ", tree.toString());
    }      
    @Test
    public void testAdd_1()
    {
        int[]arr={23};
        tree.init(arr);
        tree.add(9999);
        assertEquals(2,tree.count());
        assertEquals(" 23 9999 ", tree.toString());
    }       
    @Test
    public void testAdd_0()
    {
        int[]arr={};
        tree.init(arr);
        tree.add(9999);
        assertEquals(1,tree.count());
        assertEquals(" 9999 ", tree.toString());
    }   
//------------------------------------------------------------------------------
    @Test
    public void testDel_MANY_inside_left()
    {
        int[]arr={23,45,1,66,9999,11};
        tree.init(arr);
        tree.del(1);
        int treeCount=tree.count();
        assertEquals(5,treeCount);
        assertEquals(" 11 23 45 66 9999 ", tree.toString());
    }
    @Test
    public void testDel_MANY_inside_right()
    {
        int[]arr={23,45,1,66,9999,11};
        tree.init(arr);
        tree.del(66);
        assertEquals(5,tree.count());
        assertEquals(" 1 11 23 45 9999 ", tree.toString());
    }
    @Test
    public void testDel_MANY_root()
    {
        int[]arr={23,45,1,66,9999,11};
        tree.init(arr);
        tree.del(23);
        assertEquals(5,tree.count());
        assertEquals(" 1 11 45 66 9999 ", tree.toString());
    }
    @Test
    public void testDel_2_inside()
    {
        int[]arr={23,45};
        tree.init(arr);
        tree.del(45);
        assertEquals(1,tree.count());
        assertEquals(" 23 ", tree.toString());
    }
    @Test
    public void testDel_2_root()
    {
        int[]arr={23,45};
        tree.init(arr);
        tree.del(23);
        assertEquals(1,tree.count());
        assertEquals(" 45 ", tree.toString());
    }
    @Test
    public void testDel_1()
    {
        int[]arr={23};
        tree.init(arr);
        tree.del(23);
        assertEquals(0,tree.count());
        assertEquals(" ", tree.toString());
    }
//------------------------------------------------------------------------------
    @Test
    public void testCount_MANY()
    {
       int[]arr={23,45,1,66,0,9,67,-6,8,25,-44,-3,-100,-1000};
        tree.init(arr);
        assertEquals(14,tree.count());
        assertEquals(" -1000 -100 -44 -6 -3 0 1 8 9 23 25 45 66 67 ", tree.toString());
    }
    @Test
    public void testCount_2()
    {
       int[]arr={23,45};
        tree.init(arr);
        assertEquals(2,tree.count());
        assertEquals(" 23 45 ", tree.toString());
    }
    @Test
    public void testCount_1()
    {
       int[]arr={23};
        tree.init(arr);
        assertEquals(1,tree.count());
        assertEquals(" 23 ", tree.toString());
    }
    @Test
    public void testCount_0()
    {
       int[]arr={};
        tree.init(arr);
        assertEquals(0,tree.count());
        assertEquals(" ", tree.toString());
    }
//------------------------------------------------------------------------------
    @Test
    public void testCountLeafs_MANY()
    {
        int[]arr={23,45,1,66,0,9,67,-6,8,25,-44,-3,-100,-1000};
        tree.init(arr);
        assertEquals(5,tree.countLeafs());
    }
    @Test
    public void testCountLeafs_2()
    {
        int[]arr={23,45};
        tree.init(arr);
        assertEquals(1,tree.countLeafs());
    }
    @Test
    public void testCountLeafs_1()
    {
        int[]arr={23};
        tree.init(arr);
        assertEquals(1,tree.countLeafs());
    }
    @Test
    public void testCountLeafs_0()
    {
        int[]arr={};
        tree.init(arr);
        assertEquals(0,tree.countLeafs());
    }
//------------------------------------------------------------------------------
    @Test
    public void testCountBranches_MANY()
    {
        int[]arr={23,45,1,66,0,9,67,-6,8,25,-44,-3,-100,-1000};
        tree.init(arr);
        assertEquals(9,tree.countBranches());
    }
    @Test
    public void testCountBranches_2()
    {
        int[]arr={23,45};
        tree.init(arr);
        assertEquals(1,tree.countBranches());
    }
    @Test
    public void testCountBranches_1()
    {
        int[]arr={23};
        tree.init(arr);
        assertEquals(0,tree.countBranches());
    }
    @Test
    public void testCountBranches_0()
    {
        int[]arr={};
        tree.init(arr);
        assertEquals(0,tree.countBranches());
    }
//------------------------------------------------------------------------------
    @Test
    public void testCountLevels_MANY()
    {
        int[]arr={23,45,1,66,0,9,67,-6,8,25,-44,-3,-100,-1000};
        tree.init(arr);
        assertEquals(7,tree.countLevels());
    }
    @Test
    public void testCountLevels_2()
    {
        int[]arr={23,45};
        tree.init(arr);
        assertEquals(2,tree.countLevels());
    }
    @Test
    public void testCountLevels_1()
    {
        int[]arr={23};
        tree.init(arr);
        assertEquals(1,tree.countLevels());
    }
    @Test
    public void testCountLevels_0()
    {
        int[]arr={};
        tree.init(arr);
        assertEquals(0,tree.countLevels());
    }
//------------------------------------------------------------------------------
    @Test
    public void testCountColumns_MANY()
    {
        int[]arr={23,45,1,66,0,9,67,-6,8,25,-44,-3,-100,-1000};
        tree.init(arr);
        assertEquals(4,tree.countColumns());
    }
    @Test
    public void testCountColumns_2()
    {
        int[]arr={23,45};
        tree.init(arr);
        int b=tree.countColumns();
        assertEquals(1,b);
    }
    @Test
    public void testCountColumns_1()
    {
        int[]arr={23};
        tree.init(arr);
        int b=tree.countColumns();
        assertEquals(1,b);
    }
    @Test
    public void testCountColumns_0()
    {
        int[]arr={};
        tree.init(arr);
        int b=tree.countColumns();
        assertEquals(0,b);
    }
//------------------------------------------------------------------------------
    @Test
    public void iterate_MANY()
    {
        int[]arr={23,45,1,66,0,9,67,-6,8,25,-44,-3,-100,-1000};
        tree.init(arr);
        Iterator it=tree.iterator();
        int []testArr=new int[arr.length];
        int counter=0;
        while(it.hasNext())
        {
            testArr[counter++]=(int)it.next();
        }
        Arrays.sort(arr);
        assertArrayEquals(arr, testArr);
        String testString=" ";
        for(int element:tree)
        {
            testString+=(""+element+" ");
        }
        assertEquals(tree.toString(), testString);
        
    }
    @Test
    public void iterate_2()
    {
        int[]arr={23,45};
        tree.init(arr);
        Iterator it=tree.iterator();
        int []testArr=new int[arr.length];
        int counter=0;
        while(it.hasNext())
        {
            testArr[counter++]=(int)it.next();
        }
        Arrays.sort(arr);
        assertArrayEquals(arr, testArr);
        String testString=" ";
        for(int element:tree)
        {
            testString+=(""+element+" ");
        }
        assertEquals(tree.toString(), testString);        
    }
    @Test
    public void iterate_1()
    {
        int[]arr={23};
        tree.init(arr);
        Iterator it=tree.iterator();
        int []testArr=new int[arr.length];
        int counter=0;
        while(it.hasNext())
        {
            testArr[counter++]=(int)it.next();
        }
        Arrays.sort(arr);
        assertArrayEquals(arr, testArr);
        String testString=" ";
        for(int element:tree)
        {
            testString+=(""+element+" ");
        }
        assertEquals(tree.toString(), testString);        
    }
    @Test (expected = NoSuchElementException.class)
    public void iterate_0_NoSuchElementException_00()
    {
        int[]arr={};
        tree.init(arr);
        Iterator it=tree.iterator();
        int []testArr=new int[arr.length];
        int counter=0;
        while(it.hasNext())
        {
            testArr[counter++]=(int)it.next();
        }     
    }
    @Test (expected = NoSuchElementException.class)
    public void iterate_0_NoSuchElementException_01()
    {
        int[]arr={};
        tree.init(arr);
        Iterator it=tree.iterator();
        String testString=" ";
        for(int element:tree)
        {
            testString+=(""+element+" ");
        }   
    }
}
