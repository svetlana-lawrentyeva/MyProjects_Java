package com.example.dao_person;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DB_Person implements DAO_Person
{
	Connection connection = null;
    ResultSet resultSet = null;
    Statement statement = null;
    
	@Override
	public void update(Person p)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Person p)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void create(Person p)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public Person read(int id)
	{
		String line="";
		Person p=new Person();
        try {
            Class.forName("org.h2.Driver");
            connection = DriverManager.getConnection("jdbc:h2:file:~/GoogleDrive/workspace/DAO_Person/DS_db","sa","sa");
            statement = connection.createStatement();

            resultSet = statement.executeQuery("SELECT * FROM person where id="+id);
            while (resultSet.next())
            {
                String pId=resultSet.getString("id");
                String fName=resultSet.getString("fname");
                String lName=resultSet.getString("lname");
                String age=resultSet.getString("age");
                p=new Person(Integer.parseInt(pId), fName, lName, Integer.parseInt(age));
            }
            resultSet.close();
            statement.close();
            connection.close();
        }
        catch (Exception ex) {
            Logger.getLogger(DB_Person.class.getName()).log(Level.SEVERE, null, ex);
        }
        return p;
	}

	@Override
	public List<Person> read()
	{
		String line="";
		List<Person> pList=new ArrayList<Person>();
        try {
            Class.forName("org.h2.Driver");
            connection = DriverManager.getConnection("jdbc:h2:file:~/GoogleDrive/workspace/DAO_Person/DS_db","sa","sa");
            statement = connection.createStatement();

            resultSet = statement.executeQuery("SELECT * FROM person");
            while (resultSet.next())
            {
                String id=resultSet.getString("id");
                String fName=resultSet.getString("fname");
                String lName=resultSet.getString("lname");
                String age=resultSet.getString("age");
                Person p=new Person(Integer.parseInt(id), fName, lName, Integer.parseInt(age));
                pList.add(p);
            }
            resultSet.close();
            statement.close();
            connection.close();
        }
        catch (Exception ex) {
            Logger.getLogger(DB_Person.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pList;
	}

	@Override
	public void creatr(List<Person> pList)
	{
		// TODO Auto-generated method stub
		
	}

}
