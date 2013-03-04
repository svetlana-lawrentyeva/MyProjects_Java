package datasave;


import java.io.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nau
 */
public class DS_TXT implements DS
{
    @Override
    public int Save(PList pList)
    {
        int result=0;
        try
        {
            try (FileWriter wrt = new FileWriter(fileName))
            {
                CharSequence csq;
                csq=pList.toString();
                wrt.append(csq);
                wrt.flush();
            }
            
            result=1;
        } catch (IOException ex)
        {
            Logger.getLogger(PList.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    @Override
    public PList Load()
    {
        FileReader file; 
        String str="";  
        PList pl=new PList();
        try
        {
            file = new FileReader(fileName);
        BufferedReader buff=new BufferedReader(file);
        String line;
            while((line=buff.readLine())!=null)
            {
                str+=line+"\n";
            }
            pl=PList.fromString(str);
        } catch (IOException ex)
        {
            Logger.getLogger(DS_TXT.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (IllegalArgumentException ex){}
        
        return pl;        
    }
    private String fileName="t.txt";
}
