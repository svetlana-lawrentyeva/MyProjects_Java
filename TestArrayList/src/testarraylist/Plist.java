/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testarraylist;

import java.security.interfaces.DSAKey;
import java.util.ArrayList;

/**
 *
 * @author nau
 */
public class Plist extends ArrayList<Person>
{
    @Override
    public String toString()
    {
        StringBuilder result=new StringBuilder();
        for(Person p:this)
        {
            result.append(p.toString()+"\n");
        }
        return result.toString();
    }
    public ArrayList<String> getPlistString()
    {
        ArrayList<String> result=new ArrayList<String>();
        for(int i=0; i<size();++i)
        {
            Person p=get(i);
            result.addAll(p.getPersonString());
        }
        return result;
    }
    
    public void Load(String format)
    {
        IDS ds=DSFactory.getInstatse(format);
        this.addAll(ds.Load());
    }
    public void Save(String format)
    {
        IDS ds=DSFactory.getInstatse(format);
        ds.Save(this);
    }
}

class DSFactory
{
    public static IDS getInstatse(String str)
    {
        IDS ds;
        if(str.equals("TXT")) ds=new DS_TXT();
        else ds=new DS_TXT();
        return ds;
    }
}
