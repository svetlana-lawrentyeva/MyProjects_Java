package testarrayoop;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MyArrayTest
{
  //---------------------------------------------------------------------------
  @Test
  (expected=ArithmeticException.class)
  public void testMax_NULL()
  {
    MyArray arr = new MyArray();
    arr.init(null);
    arr.max();
  }
  @Test
  (expected=ArithmeticException.class)
  public void testMax_EMPTY()
  {
    MyArray arr = new MyArray();
    int[]initArray={};
    arr.init(initArray);
    arr.max();
  }
  @Test
  public void testMax_1()
  {
    MyArray arr = new MyArray();
    int[]initArray={34};
    arr.init(initArray);
    assertEquals(34, arr.max());
  }
  @Test
  public void testMax_BIG()
  {
    MyArray arr = new MyArray();
    int[]initArray={34, 23, 8, 78, 12, 45, 98, 56, 115, 42, 4, 8, 66, 0, 15, 16};
    arr.init(initArray);
    assertEquals(115, arr.max());
  }
  //---------------------------------------------------------------------------
  //---------------------------------------------------------------------------
  @Test
  (expected=ArithmeticException.class)
  public void testMin_NULL()
  {
    MyArray arr = new MyArray();
    arr.init(null);
    arr.min();
  }
  @Test
  (expected=ArithmeticException.class)
  public void testMin_EMPTY()
  {
    MyArray arr = new MyArray();
    int[]initArray={};
    arr.init(initArray);
    arr.min();
  }
  @Test
  public void testMin_1()
  {
    MyArray arr = new MyArray();
    int[]initArray={34};
    arr.init(initArray);
    assertEquals(34, arr.min());
  }
  @Test
  public void testMin_BIG()
  {
    MyArray arr = new MyArray();
    int[]initArray={34, 23, 8, 78, 12, 45, 98, 56, 115, 42, 4, 8, 66, 0, 15, 16};
    arr.init(initArray);
    assertEquals(0, arr.min());
  }
  //---------------------------------------------------------------------------
  @Test
  (expected=ArithmeticException.class)
  public void testMaxInd_NULL()
  {
    MyArray arr = new MyArray();
    arr.init(null);
    arr.maxInd();
  }
  @Test
  (expected=ArithmeticException.class)
  public void testMaxInd_EMPTY()
  {
    MyArray arr = new MyArray();
    int[]initArray={};
    arr.init(initArray);
    arr.maxInd();
  }
  @Test
  public void testMaxInd_1()
  {
    MyArray arr = new MyArray();
    int[]initArray={34};
    arr.init(initArray);
    assertEquals(0, arr.maxInd());
  }
  @Test
  public void testMaxInd_BIG()
  {
    MyArray arr = new MyArray();
    int[]initArray={34, 23, 8, 78, 12, 45, 98, 56, 115, 42, 4, 8, 66, 0, 15, 16};
    arr.init(initArray);
    assertEquals(8, arr.maxInd());
  }
  //---------------------------------------------------------------------------
  @Test
  (expected=ArithmeticException.class)
  public void testMinInd_NULL()
  {
    MyArray arr = new MyArray();
    arr.init(null);
    arr.minInd();
  }
  @Test
  (expected=ArithmeticException.class)
  public void testMinInd_EMPTY()
  {
    MyArray arr = new MyArray();
    int[]initArray={};
    arr.init(initArray);
    arr.minInd();
  }
  @Test
  public void testMinInd_1()
  {
    MyArray arr = new MyArray();
    int[]initArray={34};
    arr.init(initArray);
    assertEquals(0, arr.minInd());
  }
  @Test
  public void testMinInd_BIG()
  {
    MyArray arr = new MyArray();
    int[]initArray={34, 23, 8, 78, 12, 45, 98, 56, 115, 42, 4, 8, 66, 0, 15, 16};
    arr.init(initArray);
    assertEquals(13, arr.minInd());
  }
  //---------------------------------------------------------------------------
  @Test
  (expected=ArithmeticException.class)
  public void testBubbleSort_NULL()
  {
    MyArray arr = new MyArray();
    arr.init(null);
    arr.bubbleSort();
  }
  @Test
  (expected=ArithmeticException.class)
  public void testBubbleSort_EMPTY()
  {
    MyArray arr = new MyArray();
    int[]initArray={};
    arr.init(initArray);
    arr.bubbleSort();
  }
  @Test
  public void testBubbleSort_1()
  {
    MyArray arr = new MyArray();
    int[]initArray={34};
    arr.init(initArray);
    int[] goodArray = {34};
    arr.bubbleSort();
    assertArrayEquals(goodArray, arr.getArray());
  }
  @Test
  public void testBubbleSort_BIG()
  {
    MyArray arr = new MyArray();
    int[]initArray={34, 23, 8, 78, 12, 45, 98, 56, 115, 42, 4, 8, 66, 0, 15, 16};
    arr.init(initArray);
    int[] goodArray = {0, 4, 8, 8, 12, 15, 16, 23, 34, 42, 45, 56, 66, 78, 98, 115};
    arr.bubbleSort();
    assertArrayEquals(goodArray, arr.getArray());
  }
  //---------------------------------------------------------------------------
  @Test
  (expected=ArithmeticException.class)
  public void testSelectionSort_NULL()
  {
    MyArray arr = new MyArray();
    arr.init(null);
    arr.selectionSort();
  }
  @Test
  (expected=ArithmeticException.class)
  public void testSelectionSort_EMPTY()
  {
    MyArray arr = new MyArray();
    int[]initArray={};
    arr.selectionSort();
  }
  @Test
  public void testSelectionSort_1()
  {
    MyArray arr = new MyArray();
    int[]initArray={34};
    arr.init(initArray);
    int[] goodArray = {34};
    arr.selectionSort();
    assertArrayEquals(goodArray, arr.getArray());
  }
  @Test
  public void testSelectionSort_BIG()
  {
    MyArray arr = new MyArray();
    int[]initArray={34, 23, 8, 78, 12, 45, 98, 56, 115, 42, 4, 8, 66, 0, 15, 16};
    arr.init(initArray);
    int[] goodArray = {0, 4, 8, 8, 12, 15, 16, 23, 34, 42, 45, 56, 66, 78, 98, 115};
    arr.selectionSort();
    assertArrayEquals(goodArray, arr.getArray());
  }
  //---------------------------------------------------------------------------
  @Test
  (expected=ArithmeticException.class)
  public void testInsertionSort_NULL()
  {
    MyArray arr = new MyArray();
    arr.init(null);
    arr.insertionSort();
  }
  @Test
  (expected=ArithmeticException.class)
  public void testInsertionSort_EMPTY()
  {
    MyArray arr = new MyArray();
    int[]initArray={};
    arr.init(initArray);
    arr.insertionSort();
  }
  @Test
  public void testInsertionSort_1()
  {
    MyArray arr = new MyArray();
    int[]initArray={34};
    arr.init(initArray);
    int[] goodArray = {34};
    arr.insertionSort();
    assertArrayEquals(goodArray, arr.getArray());
  }
  @Test
  public void testInsertionSort_BIG()
  {
    MyArray arr = new MyArray();
    int[]initArray={34, 23, 8, 78, 12, 45, 98, 56, 115, 42, 4, 8, 66, 0, 15, 16};
    arr.init(initArray);
    int[] goodArray = {0, 4, 8, 8, 12, 15, 16, 23, 34, 42, 45, 56, 66, 78, 98, 115};
    arr.insertionSort();
    assertArrayEquals(goodArray, arr.getArray());
  }
  //---------------------------------------------------------------------------
  @Test
  (expected=ArithmeticException.class)
  public void testQuickSort_NULL()
  {
    MyArray arr = new MyArray();
    arr.init(null);
    arr.quickSort();
  }
  @Test
  (expected=ArithmeticException.class)
  public void testQuickSort_EMPTY()
  {
    MyArray arr = new MyArray();
    int[]initArray={};
    arr.init(initArray);
    arr.quickSort();
  }
  @Test
  public void testQuickSort_1()
  {
    MyArray arr = new MyArray();
    int[]initArray={34};
    arr.init(initArray);
    int[] goodArray = {34};
    arr.quickSort();
    assertArrayEquals(goodArray, arr.getArray());
  }
  @Test
  public void testQuickSort_BIG()
  {
    MyArray arr = new MyArray();
    int[]initArray={34, 23, 8, 78, 12, 45, 98, 56, 115, 42, 4, 8, 66, 0, 15, 16};
    arr.init(initArray);
    int[] goodArray = {0, 4, 8, 8, 12, 15, 16, 23, 34, 42, 45, 56, 66, 78, 98, 115};
    arr.quickSort();
    assertArrayEquals(goodArray, arr.getArray());
  }
  //---------------------------------------------------------------------------
  @Test
  (expected=ArithmeticException.class)
  public void testMergeSort_NULL()
  {
    MyArray arr = new MyArray();
    arr.init(null);
    arr.mergeSort();
  }
  @Test
  (expected=ArithmeticException.class)
  public void testMergeSort_EMPTY()
  {
    MyArray arr = new MyArray();
    int[]initArray={};
    arr.init(initArray);
    arr.mergeSort();
  }
  @Test
  public void testMergeSort_1()
  {
    MyArray arr = new MyArray();
    int[]initArray={34};
    arr.init(initArray);
    int[] goodArray = {34};
    arr.mergeSort();
    assertArrayEquals(goodArray, arr.getArray());
  }
  @Test
  public void testMergeSort_BIG()
  {
    MyArray arr = new MyArray();
    int[]initArray={34, 23, 8, 78, 12, 45, 98, 56, 115, 42, 4, 8, 66, 0, 15, 16};
    arr.init(initArray);
    int[] goodArray = {0, 4, 8, 8, 12, 15, 16, 23, 34, 42, 45, 56, 66, 78, 98, 115};
    arr.mergeSort();
    assertArrayEquals(goodArray, arr.getArray());
  }
  //---------------------------------------------------------------------------
  @Test
  (expected=ArithmeticException.class)
  public void testShellSort_NULL()
  {
    MyArray arr = new MyArray();
    arr.init(null);
    arr.shellSort();
  }
  @Test
  (expected=ArithmeticException.class)
  public void testShellSort_EMPTY()
  {
    MyArray arr = new MyArray();
    int[]initArray={};
    arr.init(initArray);
    arr.shellSort();
  }
  @Test
  public void testShellSort_1()
  {
    MyArray arr = new MyArray();
    int[]initArray={34};
    arr.init(initArray);
    int[] goodArray = {34};
    arr.shellSort();
    assertArrayEquals(goodArray, arr.getArray());
  }
  @Test
  public void testShellSort_BIG()
  {
    MyArray arr = new MyArray();
    int[]initArray={34, 23, 8, 78, 12, 45, 98, 56, 115, 42, 4, 8, 66, 0, 15, 16};
    arr.init(initArray);
    int[] goodArray = {0, 4, 8, 8, 12, 15, 16, 23, 34, 42, 45, 56, 66, 78, 98, 115};
    arr.shellSort();
    assertArrayEquals(goodArray, arr.getArray());
  }
}
