/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ds;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author nau
 */
public class DS_CSV implements IDS
{
    private String fileName="c.csv";
    
    @Override
    public PList Load()
    {
        PList pl=new PList();
        
        
        File f=new File(fileName);
        FileReader fr=null;
        try
        {
            fr=new FileReader(f);
            BufferedReader br=new BufferedReader(fr);
            String tmp="";
            while((tmp=br.readLine())!=null)
            {
                pl.add(Person.fromCSV(tmp));
            }
        }
        catch(IOException | NoClassDefFoundError ex)
        {
            ex.printStackTrace();
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
                String tmp=p.toCSV();              
                pw.println(tmp);
            }
            pw.close();
            result=true;
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
        }
        
        return result;
    }

    @Override
    public void setFileName(String _fileName)
    {
        fileName=_fileName;
    }
    
}
