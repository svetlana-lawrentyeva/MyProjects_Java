/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persontofile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nau
 */
public class PList {
    public PList() {
        pList=new ArrayList<>();
    }
    public void AddToList (Person aPerson) {
        pList.add(aPerson);
    }
    public void DeleteFromList(Person aPerson) {
        int index = pList.indexOf(aPerson);
        pList.remove(index);
    }
    public int Save() {
        ObjectOutputStream s;
        int result=0;
        try {
            s = new ObjectOutputStream(new FileOutputStream("f.txt"));
  	s.writeInt(pList.size());
  	for (Person p : pList) {
  	    s.writeObject(p);
  	}
  	s.close();
        result=1;
        } catch (IOException ex) {
            Logger.getLogger(PList.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
    public int Load() {
        ObjectInputStream s;
        int result=0;
        try {
  	s = new ObjectInputStream(new FileInputStream("f.txt"));
  	int size = s.readInt();
  	for (int i = 0; i < size; ++i) {
  	    Person p = (Person) s.readObject();
  	    pList.add(p);
  	}
  	s.close();
        result=1;
        } catch (ClassNotFoundException | IOException ex) {
            Logger.getLogger(PList.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
    public int GetSize() {
        return pList.size();
    }
    public Person GetPerson(int i) {
        return pList.get(i);
    }
    public int FindPerson(Person p1) {
        int i=0;
        for(Person p:pList) {
            if(p.equals(p1))i=pList.indexOf(p);
        }
        return i;
    }
    public List<Person> getList() {
        return pList;
    }
    private List<Person> pList;
}
