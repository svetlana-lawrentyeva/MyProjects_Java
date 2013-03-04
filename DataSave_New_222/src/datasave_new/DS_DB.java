/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datasave_new;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nau
 */
public class DS_DB implements IDS
{

    @Override
    public PList Load()
    {
        PList plist=new PList();
        Connection connection = null;
        ResultSet resultSet = null;
        Statement statement = null;
        String line="";
        try {
            Class.forName("org.h2.Driver");
            connection = DriverManager.getConnection("jdbc:h2:file:~/NetBeansProjects/DataSave_New/DS_db","sa","sa");
            statement = connection.createStatement();

            resultSet = statement.executeQuery("SELECT * FROM person");
            while (resultSet.next()) {
                String id=resultSet.getString("id");
                String fName=resultSet.getString("fname");
                String lName=resultSet.getString("lname");
                String age=resultSet.getString("age");
                Person p=new Person(Integer.parseInt(id), fName, lName, Integer.parseInt(age));
                plist.add(p);
            }
            resultSet.close();
            statement.close();
            connection.close();
        }
        catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DS_DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return plist;
    }

    @Override
    public boolean Save(PList pList)
    {
        
        boolean result=false;
        Connection connection = null;
        Statement statement = null;
        try {
            Class.forName("org.h2.Driver");
           
            connection = DriverManager.getConnection("jdbc:h2:file:~/NetBeansProjects/DataSave_New/DS_db","sa","sa");
            statement = connection.createStatement();
            String line="";
            for(Person p:pList) {
                line="insert into person values("+p.getId()+",'"+
                        p.getFName()+"','"+p.getLName()+"',"+p.getAge()+")";
                statement.executeUpdate(line);
            }
            result=true;
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DS_DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return result;
    }

    
}
