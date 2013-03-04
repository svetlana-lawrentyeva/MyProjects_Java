/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persontofile;

import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author nau
 */
public class PListTest {
    
    public PListTest() {
        instance=new PList();
        Person p1=new Person(1, "максим", "петров", 10);
        Person p2=p;
        instance.AddToList(p1);
        instance.AddToList(p2);
    }/*
    @Test
    public void testSomeMethod() {
    }*/

    /**
     * Test of AddToList method, of class PList.
     */
    @Test
    public void testAddToList() {
        System.out.println("AddToList");
        Person aPerson = new Person(3, "леонид", "матвеев", 20);
        instance.AddToList(aPerson);
        assertSame(aPerson, instance.GetPerson(instance.GetSize()-1));
    }

    /**
     * Test of DeleteFrmList method, of class PList.
     */
    @Test
    public void testDeleteFromList() {
        System.out.println("DeleteFrmList");
        Person aPerson = p;
        instance.DeleteFromList(aPerson);
        
    }

    /**
     * Test of Save method, of class PList.
     */
    @Test
    public void testSave() {
        System.out.println("Save");
        int expResult = 1;
        int result = instance.Save();
        assertEquals(expResult, result);
    }

    /**
     * Test of Load method, of class PList.
     */
    @Test
    public void testLoad() {
        System.out.println("Load");
        int expResult = 1;
        int result = instance.Load();
        assertEquals(expResult, result);
    }
    private PList instance;
    private Person p = new Person(2, "денис", "давыдов", 15);
}
