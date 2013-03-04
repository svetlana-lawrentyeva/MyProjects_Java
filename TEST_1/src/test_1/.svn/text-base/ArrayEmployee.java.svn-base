package test_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ArrayEmployee extends ArrayList<Employee>
{
    public boolean saveFile()
    {
        File f=new File("employees.txt");
        boolean result=false;
        try
        {
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(f)));
            for(Employee em:this)
            {
                    pw.println(em.toString());
                    result=true;
            }
            pw.close();
        } catch (IOException ex){}
        return  result;
    }
    public boolean LoadFile()
    {
        File f=new File("employees.txt");        
        boolean result=false;
        try
        {
            BufferedReader br=new BufferedReader(new FileReader(f));
            String tmp="";
            while((tmp+=br.readLine())!=null)
            {
                String []strArr=tmp.split("^");
                try
                {
                    try
                    {
                        try
                        {
                            Employee emp=(Employee) Class.forName(strArr[0]).getConstructor(String.class).newInstance(strArr[1]);
                            this.add(emp);
        //                    Class cl=Class.forName(strArr[0]);
        //                    Class[]classArgs=new Class[1];
        //                    Employee emp=cons.newInstance(strArr[1]);
        //                    Constructor cons = cl.getConstructor(classArgs);
        //                    Employee emp=cons.newInstance(strArr[1]);
                        } catch (InstantiationException ex)
                        {
                            Logger.getLogger(ArrayEmployee.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (IllegalAccessException ex)
                        {
                            Logger.getLogger(ArrayEmployee.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (IllegalArgumentException ex)
                        {
                            Logger.getLogger(ArrayEmployee.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (InvocationTargetException ex)
                        {
                            Logger.getLogger(ArrayEmployee.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } catch (NoSuchMethodException ex)
                    {
                        Logger.getLogger(ArrayEmployee.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (SecurityException ex)
                    {
                        Logger.getLogger(ArrayEmployee.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } catch (ClassNotFoundException ex)
                {
                    Logger.getLogger(ArrayEmployee.class.getName()).log(Level.SEVERE, null, ex);
                }
                result=true;
            }
        }
        catch(IOException ex){}
        return result;
    }
}
