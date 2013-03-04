package arrayMinMax;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyArrayTest {
	@Test
	public void testMax_MANY() {
		int[]tmp={12,56,8,54,122,1};
		MyArray arr=new MyArray(tmp);
		assertEquals(122,arr.getMax());
	}
	@Test (expected=ArithmeticException.class)
	public void testMax_EMPTY()
	{
		int[]tmp={};
		MyArray arr=new MyArray(tmp);
		arr.getMax();
	}
	@Test
	public void testMax_1()
	{
		int[]tmp={12};
		MyArray arr=new MyArray(tmp);
		assertEquals(12,arr.getMax());
	}
	@Test
	public void testMax_2()
	{
		int[]tmp={12,56};
		MyArray arr=new MyArray(tmp);
		assertEquals(56,arr.getMax());
	}
	@Test
	public void testMin_MANY() {
		int[]tmp={12,56,8,54,122,1};
		MyArray arr=new MyArray(tmp);
		assertEquals(1,arr.getMin());
	}
	@Test (expected=ArithmeticException.class)
	public void testMin_Empty() {
		int[]tmp={};
		MyArray arr=new MyArray(tmp);
		arr.getMin();
	}
	@Test
	public void testMin_1() {
		int[]tmp={12};
		MyArray arr=new MyArray(tmp);
		assertEquals(12,arr.getMin());
	}
	@Test
	public void testMin_2() {
		int[]tmp={12,56};
		MyArray arr=new MyArray(tmp);
		assertEquals(12,arr.getMin());
	}
	@Test
	public void testMaxInd_MANY() {
		int[]tmp={12,56,8,54,122,1};
		MyArray arr=new MyArray(tmp);
		assertEquals(4,arr.getMaxInd());
	}
	@Test (expected=ArithmeticException.class)
	public void testMaxInd_Empty() {
		int[]tmp={};
		MyArray arr=new MyArray(tmp);
		arr.getMaxInd();
	}
	@Test
	public void testMaxInd_1() {
		int[]tmp={12};
		MyArray arr=new MyArray(tmp);
		assertEquals(0,arr.getMaxInd());
	}
	@Test
	public void testMaxInd_2() {
		int[]tmp={12,56};
		MyArray arr=new MyArray(tmp);
		assertEquals(1,arr.getMaxInd());
	}
	@Test
	public void testMinInd_MANY() {
		int[]tmp={12,56,8,54,122,1};
		MyArray arr=new MyArray(tmp);
		assertEquals(5,arr.getMinInd());
	}
	@Test (expected=ArithmeticException.class)
	public void testMinInd_Empty() {
		int[]tmp={};
		MyArray arr=new MyArray(tmp);
		arr.getMinInd();
	}
	@Test
	public void testMinInd_1() {
		int[]tmp={12};
		MyArray arr=new MyArray(tmp);
		assertEquals(5,arr.getMinInd());
	}
	@Test
	public void testMinInd_2() {
		int[]tmp={12,56};
		MyArray arr=new MyArray(tmp);
		assertEquals(0,arr.getMinInd());
	}
	@Test
	public void testSort_MANY() {
		int[]tmp={12,56,8,54,122,1};
		MyArray arr=new MyArray(tmp);
		arr.sort();
		assertEquals("1 8 12 54 56 122",arr.toString());
	}
	@Test (expected=ArithmeticException.class)
	public void testSortEmpty() {
		int[]tmp={};
		MyArray arr=new MyArray(tmp);
		arr.sort();
	}

}
