/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persontofile;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author nau
 */
public class PersonTest {
    
    public PersonTest() {
        instance=new Person(1, "тарас", "кузнецов", 35);
    }


    /**
     * Test of getId method, of class Person.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        int expResult = 1;
        int result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class Person.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 2;
        instance.setId(id);
        assertEquals(id, instance.getId());
    }

    /**
     * Test of getFName method, of class Person.
     */
    @Test
    public void testGetFName() {
        System.out.println("getFName");
        String expResult = "тарас";
        String result = instance.getFName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFName method, of class Person.
     */
    @Test
    public void testSetFName() {
        System.out.println("setFName");
        String fName = "олег";
        instance.setFName(fName);
        assertEquals(fName, instance.getFName());
    }

    /**
     * Test of getLName method, of class Person.
     */
    @Test
    public void testGetLName() {
        System.out.println("getLName");
        String expResult = "кузнецов";
        String result = instance.getLName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLName method, of class Person.
     */
    @Test
    public void testSetLName() {
        System.out.println("setLName");
        String lName = "матросов";
        instance.setLName(lName);
        assertEquals(lName, instance.getLName());
    }

    /**
     * Test of getAge method, of class Person.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        int expResult = 35;
        int result = instance.getAge();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAge method, of class Person.
     */
    @Test
    public void testSetAge() {
        System.out.println("setAge");
        int age = 40;
        instance.setAge(age);
        assertEquals(age, instance.getAge());
    }
    private Person instance;
}
