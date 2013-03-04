/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datasave;

import java.io.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.*;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author nau
 */
@RunWith(Parameterized.class)
public class DSTest
{
    private DS ds;
    private PList pl;
    
    @Parameterized.Parameters
    public static Collection data()
    {
       return Arrays.asList
               (new Object[][]
                    {
                        {new DS_XML()},
                        {new DS_TXT()},
                        {new DS_DB()}
                    }
                );
    }
    public DSTest(DS ds)
    {
        this.ds=ds;
        pl=new PList();
        pl.add(new Person(11, "testName", "testSurname", 11));
    }

    /**
     * Test of Load and Save method, of class DS.
     */
    @Test
    public void testSaveLoad() {
        System.out.println("Save");
        int res=ds.Save(pl);
        assertEquals(1, res);
        System.out.println("Load");
        PList plTemp=ds.Load();
        Person pTemp=plTemp.get(plTemp.size()-1);
        boolean b=pTemp.equals(pl.get(pl.size()-1));
        assertEquals(true, b);
    }

    /**
     * Test of Save method, of class DS.
     */
    @Test
    public void testSave()
    {
        System.out.println("Save");
        PList p = null;
        DS instance = new DSImpl();
        int expResult = 0;
        int result = instance.Save(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Load method, of class DS.
     */
    @Test
    public void testLoad()
    {
        System.out.println("Load");
        DS instance = new DSImpl();
        PList expResult = null;
        PList result = instance.Load();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class DSImpl implements DS
    {

        public int Save(PList p)
        {
            return 0;
        }

        public PList Load()
        {
            return null;
        }
    }
}
//------------------------------------------------------------
