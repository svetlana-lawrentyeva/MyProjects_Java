/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testhashcode;

import com.sun.org.apache.xalan.internal.xsltc.runtime.Hashtable;

/**
 *
 * @author nau
 */
public class TestHashCode
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
      /*  d d1=new d(1, "asd");
        d d2=new d(1, "asd");
        System.out.println(d1.hashCode());
        System.out.println(d2.hashCode());
        d2.changeId(10);
        System.out.println(d1.hashCode());
        System.out.println(d2.hashCode());
        System.out.println("-----------------------------");
        String s1="asd";
        String s2="asd";
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        s2+="qwerty";
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println("-----------------------------");*/
        Integer i1=new Integer(10);
        Integer i2=new Integer(10);
        System.out.println(i1.hashCode());
        System.out.println(i2.hashCode());
        System.out.println("-----------------------------");
        Hashtable ht=new Hashtable();
        int key=i2.hashCode();
        ht.put(i1.hashCode(), i1);        
        ht.put(i2.hashCode(), i2);
        System.out.println("i1 "+i1.hashCode());
        System.out.println("i2 "+i2.hashCode());
        i2+=12;
        System.out.println("i1 "+i1.hashCode());
        System.out.println("i2 "+i2.hashCode());
        Integer i3=(Integer)ht.get(ht.get(key));
        System.out.println("hash key "+key+"="+i3);
        
        Integer i4=(Integer)ht.get(ht.get(i2.hashCode()));
        System.out.println("hash key "+i4);
    }
}
class d
{
    int id;
    String name;
    public d(int _id, String _name)
    {
        id=_id;
        name=_name;
    }
    public void changeId(int i)
    {
        id+=i;
    }
}
