/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datasave;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nau
 */
public class DS_DB implements DS{
      
    @Override
    public int Save(PList p) {
        int result=0;
        Connection connection = null;
        ResultSet resultSet = null;
        Statement statement = null;
        try {
            Class.forName("org.h2.Driver");
           
            connection = DriverManager.getConnection("jdbc:h2:~/NetBeansProjects/DataSave/DS_db","sa","sa");
            statement = connection.createStatement();
            String line="";
            for(Person per:p) {
                line+=per.toDB();
            }
            statement.executeUpdate(line);
            result=1;
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DS_DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return result;
    }

    @Override
    public PList Load() {
        PList plist=new PList();
        Connection connection = null;
        ResultSet resultSet = null;
        Statement statement = null;
        String line="";
        try {
            Class.forName("org.h2.Driver");
            connection = DriverManager.getConnection("jdbc:h2:~/NetBeansProjects/DataSave/DS_db","sa","sa");
            statement = connection.createStatement();

            resultSet = statement.executeQuery("SELECT * FROM person");
            while (resultSet.next()) {
                line+=resultSet.getString("id")+"\n"+resultSet.getString("fname")+"\n";
                line+=resultSet.getString("lname")+"\n"+resultSet.getString("age")+"\n~\n";
             }
            //System.out.println(line);
            resultSet.close();
            statement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DS_DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return PList.fromString(line);
    }
}
