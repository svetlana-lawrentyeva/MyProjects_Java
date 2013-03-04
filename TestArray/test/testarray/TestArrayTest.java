
package testarray;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestArrayTest
{
  @Test
  (expected=ArithmeticException.class)
  public void testMinEl_null()
  {
    int[] arr = null;
    TestArray.minEl(arr);
  }
  @Test
  (expected=ArithmeticException.class)
  public void testMinEl_empty()
  {
    int[] arr = {};
    TestArray.minEl(arr);
  }
  @Test
  public void testMinEl_5()
  {
    int[] arr = {10,2,5,70,1};
    assertEquals(1,TestArray.minEl(arr));
  }
  @Test
  public void testMinEl_1()
  {
    int[] arr = {10};
    assertEquals(10,TestArray.minEl(arr));
  }
  @Test
  (expected=ArithmeticException.class)
  public void testMaxEl_null()
  {
    int[] arr = null;
    TestArray.maxEl(arr);
  }
  @Test
  (expected=ArithmeticException.class)
  public void testMaxEl_empty()
  {
    int[] arr = {};
    TestArray.maxEl(arr);
  }
  @Test
  public void testMaxEl_1()
  {
    int[] arr = {10};
    assertEquals(10,TestArray.maxEl(arr));
  }
  @Test
  public void testMaxEl_5()
  {
    int[] arr = {10,2,5,70,1};
    assertEquals(70,TestArray.maxEl(arr));
  }
  @Test
  (expected=ArithmeticException.class)
  public void testMinInd_null()
  {
    int[] arr = null;
    TestArray.minInd(arr);
  }
  @Test
  (expected=ArithmeticException.class)
  public void testMinInd_empty()
  {
    int[] arr = {};
    TestArray.minInd(arr);
  }
  @Test
  public void testMinInd_1()
  {
    int[] arr = {10};
    assertEquals(0,TestArray.minInd(arr));
  }
  @Test
  public void testMinInd_5()
  {
    int[] arr = {10,2,5,70,1};
    assertEquals(4,TestArray.minInd(arr));
  }
  @Test
  (expected=ArithmeticException.class)
  public void testMaxInd_null()
  {
    int[] arr = null;
    TestArray.minInd(arr);
  }
  @Test
  (expected=ArithmeticException.class)
  public void testMaxInd_empty()
  {
    int[] arr = {};
    TestArray.minInd(arr);
  }
  @Test
  public void testMaxInd_1()
  {
    int[] arr = {10};
    assertEquals(0,TestArray.maxInd(arr));
  }
  @Test
  public void testMaxInd_5()
  {
    int[] arr = {10,2,5,70,1};
    assertEquals(3,TestArray.maxInd(arr));
  }
  @Test
  (expected=ArithmeticException.class)
  public void testSort1_null()
  {
    int[] arr = null;
    TestArray.sort1(arr);
  }
  @Test
  (expected=ArithmeticException.class)
  public void testSort1_empty()
  {
    int[] arr = {};
    TestArray.sort1(arr);
  }
  @Test
  public void testSort1_1()
  {
    int[] arr = {10};
    int[] arrRes = {10};
    TestArray.sort1(arr);
    assertArrayEquals(arrRes, arr);
  }
  @Test
  public void testSort1_5()
  {
    int[] arr = {10,2,5,70,1};
    int[] arrRes = {1,2,5,10,70};
    TestArray.sort1(arr);
    assertArrayEquals(arrRes, arr);
  }
  @Test
  (expected=ArithmeticException.class)
  public void testSort2_null()
  {
    int[] arr = null;
    TestArray.sort2(arr);
  }
  @Test
  (expected=ArithmeticException.class)
  public void testSort2_empty()
  {
    int[] arr = {};
    TestArray.sort2(arr);
  }
  @Test
  public void testSort2_1()
  {
    int[] arr = {10};
    int[] arrRes = {10};
    TestArray.sort2(arr);
    assertArrayEquals(arrRes, arr);
  }
  @Test
  public void testSort2_5()
  {
    int[] arr = {10,2,5,70,1};
    int[] arrRes = {1,2,5,10,70};
    TestArray.sort2(arr);
    assertArrayEquals(arrRes, arr);
  }
  @Test
  (expected=ArithmeticException.class)
  public void testSort3_null()
  {
    int[] arr = null;
    TestArray.sort3(arr);
  }
  @Test
  (expected=ArithmeticException.class)
  public void testSort3_empty()
  {
    int[] arr = {};
    TestArray.sort3(arr);
  }
  @Test
  public void testSort3_1()
  {
    int[] arr = {10};
    int[] arrRes = {10};
    TestArray.sort3(arr);
    assertArrayEquals(arrRes, arr);
  }
  @Test
  public void testSort3_5()
  {
    int[] arr = {10,2,5,70,1};
    int[] arrRes = {1,2,5,10,70};
    TestArray.sort3(arr);
    assertArrayEquals(arrRes, arr);
  }
  @Test
  (expected=ArithmeticException.class)
  public void testRevers_null()
  {
    int[] arr = null;
    TestArray.sort1(arr);
  }
  @Test
  (expected=ArithmeticException.class)
  public void testRevers_empty()
  {
    int[] arr = {};
    TestArray.sort1(arr);
  }
  @Test
  public void testRevers_1()
  {
    int[] arr = {10};
    int[] arrRes = {10};
    TestArray.revers(arr);
    assertArrayEquals(arrRes, arr);
  }
  @Test
  public void testRevers_5()
  {
    int[] arr = {10,2,5,70,1};
    int[] arrRes = {1,70,5,2,10};
    TestArray.revers(arr);
    assertArrayEquals(arrRes, arr);
  }
}
