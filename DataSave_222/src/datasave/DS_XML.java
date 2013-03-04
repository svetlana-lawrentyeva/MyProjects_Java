/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datasave;

import java.beans.XMLEncoder;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nau
 */
public class DS_XML implements DS{

    @Override
    public int Save(PList pList) {
        int result=0;
        try {
            try (FileWriter wrt = new FileWriter(fileName))
            {
                CharSequence csq;
                String head="<?xml version=\"1.0\"?>\n";
                csq=head+pList.toXML();
                wrt.append(csq);
                wrt.flush();
            }
        result=1;
        } catch (IOException ex) {
            Logger.getLogger(PList.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    @Override
    public PList Load() {
        FileReader file; 
        String str="";       
        try {
            file = new FileReader(fileName);
        BufferedReader buff=new BufferedReader(file);
        String line;
            while((line=buff.readLine())!=null) {
                if(!line.equals("<Plist>")&&!line.equals("</Plist>")&&!line.substring(0, 5).equals("<?xml")) {
                    str+=line+"\n";
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(DS_TXT.class.getName()).log(Level.SEVERE, null, ex);
        }
        return PList.fromXML(str);        
    }
    private String fileName="x.xml";
}

