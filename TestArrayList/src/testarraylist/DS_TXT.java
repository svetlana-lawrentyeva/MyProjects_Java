/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testarraylist;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nau
 */
public class DS_TXT implements IDS
{
    private String fileName="t.txt";
    @Override
    public Plist Load()
    {
        Plist pl=new Plist();
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
            
            for(int i=0; i<tmpArray.size();i+=2)
            {
                Person p=new Person(tmpArray.get(i), Integer.parseInt(tmpArray.get(i+1)));
                pl.add(p);
            }
            } catch (IOException e)
            {
                e.printStackTrace();
            }
        return pl;
    }

    @Override
    public boolean Save(Plist pl)
    {
        boolean result=false;
        File f = new File(fileName);
        FileWriter fw = null;
        try
        {
            fw = new FileWriter(f, true);
       
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);
        for(Person p:pl)
        {
            pw.println(p.getName());
            pw.println(p.getAge());
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
