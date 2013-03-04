/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testarraylist;

import java.util.ArrayList;

/**
 *
 * @author nau
 */
public class Person
{
    private String name;
    private int age;
    public Person(String name, int age)
    {
        this.name=name;
        this.age=age;
    }
    @Override
    public String toString()
    {
        return "name "+name+"\nage "+age;
    }
    public ArrayList<String> getPersonString()
    {
        ArrayList<String> result=new ArrayList<String>();
        result.add("name "+name);
        result.add("age "+age);
        return result;
    }
    public String getName()
    {
        return this.name;
    }
    public int getAge()
    {
        return this.age;
    }
}
