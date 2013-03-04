/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testxml;

import com.thoughtworks.xstream.XStream;
import sun.org.mozilla.javascript.internal.ObjArray;

/**
 *
 * @author nau
 */
public class TestXML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Integer i1=new Integer(2);
       Integer i2=new Integer(2);
       boolean b=((Object)i1).equals((Object)i2);
        System.out.println(b);
        System.out.println(i1.hashCode());
        System.out.println(i2.hashCode());
        Person o=new Person("ll", 12);
        Object p=new Object();
        String s=p.toString();
        System.out.println(s);
    }
}
