/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ds;

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
public class DS_CSVTest
{
    private DS_CSV instance;
    private PList pl;
    public DS_CSVTest()
    {
        instance = new DS_CSV();
        Person c=new Client(1, "alina", "lawrentyeva", 13);
        ((Client)c).setDiscount(20);
        Person e=new Employee(2, "tonya", "sovatarovoit", 29, 50000.00);
        ((Employee)e).setLevel(3);
        pl = new PList();
        pl.add(c);
        pl.add(e);
    }
    
 
    /**
     * Test of Load method, of class DS_CSV.
     */
    @Test
    public void testLoad()
    {
        System.out.println("Load");
        instance.setFileName("cTestLoad.csv");
        PList result = instance.Load();
        assertEquals(pl, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of Save method, of class DS_CSV.
     */
    @Test
    public void testSave()
    {
        System.out.println("Save");
        instance.setFileName("cTestSave.csv");
        boolean result = instance.Save(pl);
        assertEquals(true, result);
        // TODO review the generated test code and remove the default call to fail.        
    }
}
