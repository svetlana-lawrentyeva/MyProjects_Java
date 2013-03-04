/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datasave_new;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author nau
 */
public class DS_XML implements IDS
{
    private String fileName="x.xml";
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
                if(!tmp.equals("<PList>")&!tmp.equals("<Person>")
                        &!tmp.equals("</PList>")&!tmp.equals("</Person>")
                        &!tmp.substring(0, 5).equals("<?xml"))
                tmpArray.add(tmp);
            }
            br.close();
            
            for(int i=0; i<tmpArray.size();++i)
            {
                String str=tmpArray.get(i);
                int j=str.indexOf(">");
                str=str.substring(j+1);
                j=str.indexOf("<");
                str=str.substring(0, j);
                tmpArray.set(i, str);
            }
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
        pw.println("<?xml version=\"1.0\"?>");
        pw.println("<PList>");
        for(Person p:pl)
        {
            pw.println("<Person>");
            pw.println("<id>"+p.getId()+"</id>");
            pw.println("<fName>"+p.getFName()+"</fName>");
            pw.println("<lName>"+p.getLName()+"</lName>");
            pw.println("<age>"+p.getAge()+"</age>");
            pw.println("</Person>");
        }
        pw.println("</PList>");
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

