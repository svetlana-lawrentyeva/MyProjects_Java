package testarraylist;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MyAListTest
{
  @Test
  public void testAddStart_1()
  {
    IList arr=new MyAList();
    arr.addStart(2);
    assertEquals(2, arr.get(0));
    assertEquals(1, arr.size());
    assertEquals("2",arr.toString());
    int[]tmp={2};
    assertArrayEquals(tmp, arr.toArray());
  }
  @Test
  public void testAddStart_MANY()
  {
    int[]tmp={13,14,56,44,78,79};
    IList arr=new MyAList(tmp);
    arr.addStart(2);
    assertEquals(2, arr.get(0));
    assertEquals(7, arr.size());
    assertEquals("2 13 14 56 44 78 79", arr.toString());
    int[]res={2,13,14,56,44,78,79};
    assertArrayEquals(res, arr.toArray());
  }
  @Test
  public void testAddEnd_1()
  {
    IList arr=new MyAList();
    arr.addEnd(2);
    assertEquals(2, arr.get(0));
    assertEquals(1, arr.size());
    assertEquals("2",arr.toString());
    int[]tmp={2};
    assertArrayEquals(tmp, arr.toArray());
  }
  @Test
  public void testAddEnd_MANY()
  {
    int[]tmp={13,14,56,44,78,79};
    IList arr=new MyAList(tmp);
    arr.addEnd(2);
    assertEquals(2, arr.get(6));
    assertEquals(7, arr.size());
    assertEquals("13 14 56 44 78 79 2", arr.toString());
    int[]res={13,14,56,44,78,79,2};
    assertArrayEquals(res, arr.toArray());
  }
  @Test
  public void testAddPosition_1()
  {
    IList arr=new MyAList();
    arr.addPosition(0,2);
    assertEquals(2, arr.get(0));
    assertEquals(1, arr.size());
    assertEquals("2",arr.toString());
    int[]tmp={2};
    assertArrayEquals(tmp, arr.toArray());
  }
  @Test
  public void testAddPosition_MANY()
  {    
    int[]tmp={13,14,56,44,78,79};
    IList arr=new MyAList(tmp);
    arr.addPosition(3,2);
    assertEquals(2, arr.get(3));
    assertEquals(7, arr.size());
    assertEquals("13 14 56 2 44 78 79", arr.toString());
    int[]res={13,14,56,2,44,78,79};
    assertArrayEquals(res, arr.toArray());
  }
  @Test
  public void testDelStart_1()
  {
    int[]tmp={2};
    IList arr=new MyAList(tmp);
    arr.delStart();
    assertEquals(0, arr.size());
    assertEquals("", arr.toString());
    int[]res={};
    assertArrayEquals(res, arr.toArray());
  }
  @Test
  public void testDelStart_MANY()
  {       
    int[]tmp={13,14,56,44,78,79};
    IList arr=new MyAList(tmp);
    arr.delStart();
    assertEquals(14, arr.get(0));
    assertEquals(5, arr.size());
    assertEquals("14 56 44 78 79", arr.toString());
    int[]res={14,56,44,78,79};
    assertArrayEquals(res, arr.toArray());
  }
  @Test
  public void testDelEnd_1()
  {
    int[]tmp={2};
    IList arr=new MyAList(tmp);
    arr.delEnd();
    assertEquals(0, arr.size());
    assertEquals("", arr.toString());
    int[]res={};
    assertArrayEquals(res, arr.toArray());
  }
  @Test
  public void testDelPosition()
  {
  }
  @Test
  public void testSet()
  {
  }
  @Test
  public void testGet()
  {
  }
  @Test
  public void testClear()
  {
  }
  @Test
  public void testSize()
  {
  }

  @Test
  public void testSort()
  {
  }

  @Test
  public void testRevers()
  {
  }

  @Test
  public void testCopy()
  {
  }

  @Test
  public void testToString()
  {
  }
}
