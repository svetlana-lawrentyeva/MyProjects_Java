/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datasave_new;

import java.io.*;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nau
 */
public class DS_TXT implements IDS, Serializable
{
    private String fileName="t.csv";
    @Override
    public PList Load()
    {
        PList pl=new PList();
        try {
            BufferedReader br =
            new BufferedReader(new FileReader(fileName));
            ArrayList<String> tmpArray = new ArrayList<String>();
            String tmp="";
            while ((tmp = br.readLine()) != null)
            {
                tmpArray.add(tmp);
            }
            br.close();
            
            for(int i=0; i<tmpArray.size();i+=4)
            {
                Person p=new Person(Integer.parseInt(tmpArray.get(i)), tmpArray.get(i+1), tmpArray.get(i+2), Integer.parseInt(tmpArray.get(i+3)));
                pl.add(p);
            }
            } catch (IOException e)
            {
                e.printStackTrace();
            }
        return pl;
    }

    @Override
    public boolean Save(PList pl)
    {
        boolean result=false;
        File f = new File(fileName);
        FileWriter fw = null;
        try
        {
            fw = new FileWriter(f);
       
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);
        for(Person p:pl)
        {
            pw.println(p.getId()+";"+p.getFName()+";"+p.getLName()+";"+p.getAge());
//            pw.println(p.getFName());
//            pw.println(p.getLName());
//            pw.println(p.getAge());
        }
        pw.close();
        result=true;
         }
        catch (IOException e)
        {
            System.err.println("ошибка открытия потока " + e);
            System.exit(1);
        }
        return result;
    }
}
