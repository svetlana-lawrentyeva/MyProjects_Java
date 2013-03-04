/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testh2;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author nau
 */
public class TestH2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            // TODO code application logic here
            
            Connection connection = null;
            ResultSet resultSet = null;
            Statement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:h2:~/NetBeansProjects/TestH2",
        "sa", "sa");
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT fname FROM person");
            while (resultSet.next()) {
                System.out.println("Todo Item: " + resultSet.getString("fname"));
}           resultSet.close();
            statement.close();
            connection.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(TestH2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
