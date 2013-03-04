package myarraylistfromandroid;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class IListTest
{   
    IList arr;

    @BeforeClass
    public static void setUpClass() throws Exception
    {
    }

    @AfterClass
    public static void tearDownClass() throws Exception
    {
    }
    @Before
    public void SetUp()
    {
        arr=new AList();
    }

    @After
    public void tearDown() throws Exception
    {
    }
    @Test
    public void testSize_MANY()
    {
        int[]a={78,79,3365,549,12,19};
        arr.init(a);
        assertEquals(6, arr.size());
    }
    @Test
    public void testSize_2()
    {
        int[]a={78,79};
        arr.init(a);
        assertEquals(2, arr.size());
    }
    @Test
    public void testSize_1()
    {
        int[]a={78};
        arr.init(a);
        assertEquals(1, arr.size());
    }
    @Test
    public void testSize_0()
    {
        int[]a={};
        arr.init(a);
        assertEquals(0, arr.size());
    }
    @Test
    public void testAddStart_MANY()
    {       
        int[]a={78,79,3365,549,12,19};
        arr.init(a);
        arr.addStart(1000);
        assertEquals(7, arr.size());
        assertEquals(1000, arr.get(0));
        assertEquals("1000 78 79 3365 549 12 19", arr.toString());
    }
    @Test
    public void testAddStart_2()
    {       
        int[]a={78,79};
        arr.init(a);
        arr.addStart(1000);
        assertEquals(3, arr.size());
        assertEquals(1000, arr.get(0));
        assertEquals("1000 78 79", arr.toString());
    }
    @Test
    public void testAddStart_1()
    {       
        int[]a={78};
        arr.init(a);
        arr.addStart(1000);
        assertEquals(2, arr.size());
        assertEquals(1000, arr.get(0));
        assertEquals("1000 78", arr.toString());
    }

    @Test
    public void testAddStart_0()
    {
        int[] a={};
        arr.init(a);
        arr.addStart(1000);
        assertEquals(1, arr.size());
        assertEquals(1000, arr.get(0));
        assertEquals("1000", arr.toString());
    }
    
    @Test
    public void testAddEnd_MANY()
    {
        int[]a={78,79,3365,549,12,19};
        arr.init(a);
        arr.addEnd(1000);
        assertEquals(7, arr.size());
        assertEquals(1000, arr.get(6));
        assertEquals("78 79 3365 549 12 19 1000", arr.toString());
    }
    @Test
    public void testAddEnd_2()
    {
        int[]a={78,79};
        arr.init(a);
        arr.addEnd(1000);
        assertEquals(3, arr.size());
        assertEquals(1000, arr.get(2));
        assertEquals("78 79 1000", arr.toString());
    }
    @Test
    public void testAddEnd_1()
    {
        int[]a={78};
        arr.init(a);
        arr.addEnd(1000);
        assertEquals(2, arr.size());
        assertEquals(1000, arr.get(1));
        assertEquals("78 1000", arr.toString());
    }
    @Test
    public void testAddEnd_0()
    {
        int[]a={};
        arr.init(a);
        arr.addEnd(1000);
        assertEquals(1, arr.size());
        assertEquals(1000, arr.get(0));
        assertEquals("1000", arr.toString());
    }
    @Test
    public void testAddPos_MANY()
    {
        int[]a={78,79,3365,549,12,19};
        arr.init(a);
        arr.addPos(2,1000);
        assertEquals(7, arr.size());
        assertEquals(1000, arr.get(2));
        assertEquals("78 79 1000 3365 549 12 19", arr.toString());
    }
    @Test
    public void testAddPos_2()
    {
        int[]a={78,79};
        arr.init(a);
        arr.addPos(1,1000);
        assertEquals(3, arr.size());
        assertEquals(1000, arr.get(1));
        assertEquals("78 1000 79", arr.toString());
    }
    @Test
    public void testAddPos_1()
    {
        int[]a={78};
        arr.init(a);
        arr.addPos(1,1000);
        assertEquals(2, arr.size());
        assertEquals(1000, arr.get(1));
        assertEquals("78 1000", arr.toString());
    }
    @Test
    public void testAddPos_0()
    {
        int[]a={};
        arr.init(a);
        arr.addPos(0,1000);
        assertEquals(1, arr.size());
        assertEquals(1000, arr.get(0));
        assertEquals("1000", arr.toString());
    }
    @Test
    public void testDelStart_MANY()
    {
        int[]a={78,79,3365,549,12,19};
        arr.init(a);
        arr.delStart();
        assertEquals(5, arr.size());
        assertEquals(79, arr.get(0));
        assertEquals("79 3365 549 12 19", arr.toString());
    }
    @Test
    public void testDelStart_2()
    {
        int[]a={78,79};
        arr.init(a);
        arr.delStart();
        assertEquals(1, arr.size());
        assertEquals(79, arr.get(0));
        assertEquals("79", arr.toString());
    }
    @Test
    public void testDelStart_1()
    {
        int[]a={78};
        arr.init(a);
        arr.delStart();
        assertEquals(0, arr.size());
        assertEquals("", arr.toString());
    }
    @Test
    public void testDelEnd_MANY()
    {
        int[]a={78,79,3365,549,12,19};
        arr.init(a);
        arr.delEnd();
        assertEquals(5, arr.size());
        assertEquals(12, arr.get(4));
        assertEquals("78 79 3365 549 12", arr.toString());
    }
    @Test
    public void testDelEnd_2()
    {
        int[]a={78,79};
        arr.init(a);
        arr.delEnd();
        assertEquals(1, arr.size());
        assertEquals(78, arr.get(0));
        assertEquals("78", arr.toString());
    }
    @Test
    public void testDelEnd_1()
    {
        int[]a={78};
        arr.init(a);
        arr.delEnd();
        assertEquals(0, arr.size());
        assertEquals("", arr.toString());
    }
    @Test
    public void testDelPos_MANY()
    {
        int[]a={78,79,3365,549,12,19};
        arr.init(a);
        arr.delPos(2);
        assertEquals(5, arr.size());
        assertEquals(549, arr.get(2));
        assertEquals("78 79 549 12 19", arr.toString());
    }
    @Test
    public void testDelPos_2()
    {
        int[]a={78,79};
        arr.init(a);
        arr.delPos(0);
        assertEquals(1, arr.size());
        assertEquals(79, arr.get(0));
        assertEquals("79", arr.toString());
    }
    @Test
    public void testDelPos_1()
    {
        int[]a={78};
        arr.init(a);
        arr.delPos(0);
        assertEquals(0, arr.size());
        assertEquals("", arr.toString());
    }
    @Test
    public void testSort_MANY()
    {
        int[]a={78,79,3365,549,12,19};
        arr.init(a);
        arr.sort();
        assertEquals(6, arr.size());
        assertEquals("12 19 78 79 549 3365", arr.toString());
    }
    @Test
    public void testSort_2()
    {
        int[]a={3365,549};
        arr.init(a);
        arr.sort();
        assertEquals(2, arr.size());
        assertEquals("549 3365", arr.toString());
    }
    @Test
    public void testSort_1()
    {
        int[]a={3365};
        arr.init(a);
        arr.sort();
        assertEquals(1, arr.size());
        assertEquals("3365", arr.toString());
    }
    @Test
    public void testSort_0()
    {
        int[]a={};
        arr.init(a);
        arr.sort();
        assertEquals(0, arr.size());
        assertEquals("", arr.toString());
    }
    @Test
    public void testSet()
    {
        int[]a={78,79,3365,549,12,19};
        arr.init(a);
        arr.set(2,-1);
        assertEquals(6, arr.size());
        assertEquals(-1, arr.get(2));
        assertEquals("78 79 -1 549 12 19", arr.toString());
    }
    @Test
    public void testGet()
    {
        int[]a={78,79,3365,549,12,19};
        arr.init(a);
        assertEquals(6, arr.size());
        assertEquals(3365, arr.get(2));
        assertEquals("78 79 3365 549 12 19", arr.toString());
    }
    @Test
    public void testClear()
    {
        int[]a={78,79,3365,549,12,19};
        arr.init(a);
        arr.clear();
        assertEquals(0, arr.size());
        assertEquals("", arr.toString());
    }
    @Test
    public void testCopy()
    {
        int[]a={78,79,3365,549,12,19};
        arr.init(a);
        IList temp=arr.copy();
        assertEquals(6, temp.size());
        assertEquals("78 79 3365 549 12 19", temp.toString());
    }
}
