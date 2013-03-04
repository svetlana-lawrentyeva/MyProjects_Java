/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datasave;

import java.sql.SQLException;

/**
 *
 * @author nau
 */
public class DataSave {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        Person p1=new Person(3, "person1", "person1LastName", 10);
        Person p2=new Person(4, "person2", "person2LastName", 125);
        
        PList pList=new PList();
        pList.add(p1);
        pList.add(p2);
        
        DS ds=new DS_DB();
        ds.Save(pList);
        PList pList2=ds.Load();
        String s=pList2.printList();
        System.out.println(s);
    }
}
