/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testarraylist;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author nau
 */
public class DS_XML implements IDS
{
    private String fileName="x.xml";
    @Override
    public Plist Load()
    {
        throw new UnsupportedOperationException("Not supported yet.");
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
        pw.println("<Plist>");
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
