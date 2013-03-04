/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datasave;

import java.util.Arrays;
import java.util.Collection;
import org.junit.*;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author nau
 */
@RunWith(Parameterized.class)
public class DSTest
{
    private DS ds;
    private PList pl;
 
    @Parameters
    public static Collection<Object[]> data()
    {
        DS ds_xml = new DS_XML();
        DS ds_txt = new DS_TXT();
        DS ds_db = new DS_DB();
        DS ds_m = new DS_Mock();
        
        
        PList pl_0=new PList();        
        PList pl_1=new PList();      
        PList pl_n=new PList();
        
        Person p1=new Person(21, "p1fName", "p1lName", 21);
        Person p2=new Person(21, "p1fName", "p1lName", 21);
        
        pl_1.add(p1);
        
        pl_n.add(p1);
        pl_n.add(p2);
 
        Object[][] data = new Object[][] {
                { ds_txt, pl_0 },
                { ds_xml, pl_0 },
                { ds_db, pl_0},
                { ds_m, pl_0},
                { ds_txt, pl_1 },
                { ds_xml, pl_1 },
                { ds_db, pl_1},
                { ds_m, pl_1},
                { ds_txt, pl_n },
                { ds_xml, pl_n },
                { ds_db, pl_n },
                { ds_m, pl_n}
            };
        return Arrays.asList(data);
    }
    public DSTest(DS ds, PList pl)
    {
        this.ds=ds;
        this.pl=pl;
    }


    /**
     * Test of Save method, of class DS.
     */
    @Test
    public void test_1_Save()
    {
        System.out.print("Save "+ds.getClass().toString()+" "+pl.size()+": ");
        int res=ds.Save(pl);
        System.out.println(res);
        assertEquals(1, res);
    }

    /**
     * Test of Load method, of class DS.
     */
    @Test
    public void test_2_Load()
    {
       System.out.print("Load "+ds.getClass().toString()+" "+pl.size()+": ");       
        PList plTemp=ds.Load();
        int counter=0;
        for(int i=0;i<pl.size();++i)
        {
            if(pl.get(i).equals(plTemp.get(plTemp.size()-pl.size()+i)))
                ++counter;
        }
        boolean b=false;
        if(counter==pl.size()) b=true;
        System.out.println(b);
        assertEquals(true, b);
    }

}
