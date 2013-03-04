/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ds;

import java.util.ArrayList;

/**
 *
 * @author nau
 */
public class PList extends ArrayList<Person>
{
    IDS ds;
    public boolean Save()
    {
        ds=DSFactory.getInstance("csv");
        boolean result=ds.Save(this);
        return result;
    }
    public void Load()
    {
        ds=DSFactory.getInstance("csv");
        this.addAll(ds.Load());
    }
    
    @Override
    public boolean equals(Object o)
    {
        boolean result =false;
        int counter=0;
        PList tempPl=(PList)o;
        for(int i=0;i<this.size();++i)
        {
            if(tempPl.get(i).equals(this.get(i)))
            {
                ++counter;
            }
            if(counter==this.size())
            {
                result=true;
            }
        }
        return result;
    }
}
class DSFactory
{
    private static IDS ds;
    public static IDS getInstance(String dsName)
    {
        switch(dsName)
        {
            case "csv":
                ds=new DS_CSV();
                break;
            default:
                ds=new DS_CSV();
        }
        return ds;
    }    
}
