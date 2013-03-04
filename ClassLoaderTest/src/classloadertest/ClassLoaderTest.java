/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classloadertest;

/**
 *
 * @author nau
 */
public class ClassLoaderTest
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException
    {
        // TODO code application logic here
        Person pr=new Person("tom", 12);
        Class p= Class.forName("classloadertest.Person");
        System.out.println(p.getClassLoader().toString());
        System.out.println(p.toString());
    }
}
class Person
{
    private String name;
    private int age;
    
    public Person(String name, int age)
    {
        this.name=name;
        this.age=age;
    }
}
