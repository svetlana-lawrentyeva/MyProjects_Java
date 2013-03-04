/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datasave_new;

import java.security.interfaces.DSAKey;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author nau
 */
public class PList extends ArrayList<Person>
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
        switch (str)
        {
            case "TXT":
                ds=new DS_TXT();
                break;
            case "XML":
                ds=new DS_XML();
                break;
            case "DB":
                ds=new DS_DB();
                break;
            default:
                ds=new DS_TXT();
        }
        return ds;
    }
}