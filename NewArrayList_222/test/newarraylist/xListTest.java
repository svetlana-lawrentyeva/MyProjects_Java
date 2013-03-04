/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package newarraylist;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nau
 */
public class xListTest
{
    private xList instance;
    public xListTest()
    {
        instance = new xList();
        instance.add(50);
    }
    
    /**
     * Test of add method, of class xList.
     */
    @Test
    public void testAdd_int()
    {
        System.out.println("add");
        int value = 10;
        instance.add(value);
        int size=instance.size();
        assertEquals(value, instance.getAt(size-1));
    }

    /**
     * Test of add method, of class xList.
     */
    @Test
    public void testAdd_int_int()
    {
        System.out.println("add");
        int value = 20;
        int position = 0;
        instance.add(value, position);
        assertEquals(value, instance.getAt(position));
    }

    /**
     * Test of deleteAt method, of class xList.
     */
    @Test
    public void testDeleteAt()
    {
        System.out.println("deleteAt");
        int position = 0;
        int size=instance.size();
        instance.deleteAt(position);
        assertEquals(size-1, instance.size());
    }

    /**
     * Test of set method, of class xList.
     */
    @Test
    public void testSet()
    {
        System.out.println("set");
        int value = 30;
        int position = 0;
        instance.set(value, position);
         assertEquals(value, instance.getAt(position));
    }

    /**
     * Test of clear method, of class xList.
     */
    @Test
    public void testClear()
    {
        System.out.println("clear");
        instance.clear();
         assertEquals(0, instance.size());
    }

    /**
     * Test of sort method, of class xList.
     */
    @Test
    public void testSort()
    {
        System.out.println("sort");
        instance.clear();
        instance.add(46);
        instance.add(17);
        instance.add(-1);
        instance.sort();
        boolean result=false;
        if(instance.getAt(0)==-1&instance.getAt(1)==17&instance.getAt(2)==46)
            result=true;
        assertTrue(result);
    }

    /**
     * Test of getAt method, of class xList.
     */
    @Test
    public void testGetAt()
    {
        System.out.println("getAt");
        int position = 0;
        instance.set(12, position);
        int result = instance.getAt(position);
        assertEquals(12, result);
    }

    /**
     * Test of size method, of class xList.
     */
    @Test
    public void testSize()
    {
        System.out.println("size");
        instance.clear();
        instance.add(46);
        instance.add(17);
        instance.add(-1);
        int result = instance.size();
        assertEquals(3, result);
    }
}
