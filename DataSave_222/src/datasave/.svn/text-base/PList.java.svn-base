package datasave;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nau
 */
public class PList extends ArrayList<Person> {
  
    
//    public void AddToList (Person aPerson) {
//        pList.add(aPerson);
//    }
//    public void DeleteFromList(Person aPerson) {
//        int index = pList.indexOf(aPerson);
//        pList.remove(index);
//    }
//    public int GetSize() {
//        return pList.size();
//    }
//    public Person GetPerson(int i) {
//        return pList.get(i);
//    }
    public int FindPerson(Person p1) {
        int i=0;
        for(Person p:this) {
            if(p.equals(p1))i=this.indexOf(p);
        }
        return i;
    }
//    public ArrayList<Person> getList() {
//        return pList;
//    }
    public String printList(){
        String result="";
        for(Person p:this) {
            result+=p.PrintPerson()+"\n-----------\n";
        }
        return result;
    }
    
    @Override
    public String toString() {
        String result="";
        for(Person p:this) {
            result+=p.toString()+"~\n";
        }
        return result;
    }
    
    public String toXML() {
        String result="<Plist>\n";
        for(Person p:this) {
            result+=p.toXML(1);
        }
        result+="</Plist>";
        return result;
    }
    
      public String toDB() {
        String result="";
        for(Person p:this) {
            result+=p.toDB();
        }
        return result;
    } 
    public static PList fromString(String s)
    {
        
        PList pl=new PList();
        if (s=="")
        {
            throw new IllegalArgumentException();
        }
        else
        {
            String[] sArray=s.split("~\n");
            for(String str:sArray)
            {
                Person p=Person.fromString(str);
                pl.add(p);
            }
        }
        return pl;
    }
    
     static PList fromXML(String s) {
        String[] sRowArray=s.split("\n");
        String tempString="";
        ArrayList<String> list=new ArrayList();
        for(int i=0; i<sRowArray.length;++i) {            
            if(!sRowArray[i].equals("<Person>")&&!sRowArray[i].equals("</Person>")) {
                tempString+=sRowArray[i]+"\n";
            }
            if((sRowArray[i]).equals("</Person>")) {
                list.add(tempString);
                tempString="";
            }
        }
        list.trimToSize();
        int size=list.size();
        String[] sArray=new String[size];
        for(int i=0; i<size;++i) {
            sArray[i]=list.get(i);
        }
        PList pl=new PList();
        for(String str:sArray) {
            Person p=Person.fromXML(str);
            pl.add(p);
        }
        return pl;
    }
     
}

