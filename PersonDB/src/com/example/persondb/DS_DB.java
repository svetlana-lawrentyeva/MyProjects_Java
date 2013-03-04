package com.example.persondb;

import java.util.ArrayList;
import java.util.List;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class DS_DB implements IDS
{
	private static SQLiteDatabase sqdb;
	
	public void setDB(SQLiteDatabase _sqdb)
	{
		sqdb=_sqdb;
	}
	@Override
	public void update(Person p)
	{
		String updateQuery = "UPDATE "+PersonDataBase.TABLE_NAME+
				" SET "+PersonDataBase.FNAME+"="+p.getFName()+","+
				PersonDataBase.LNAME+"="+p.getLName()+","+
				PersonDataBase.AGE+"="+p.getAge()+" WHERE ID="+p.getId();
	    sqdb.execSQL(updateQuery);
	}

	@Override
	public void delete(int id)
	{
		String deleteQuery = "DELETE FROM "+PersonDataBase.TABLE_NAME+" WHERE _id="+id;
	    sqdb.execSQL(deleteQuery);
	}

	@Override
	public void delete(Person p)
	{
		String deleteQuery = "DELETE FROM "+PersonDataBase.TABLE_NAME+" WHERE ID="+p.getId();
	    sqdb.execSQL(deleteQuery);
	}

	@Override
	public void create(Person p)
	{
		String insertQuery = "INSERT INTO " + PersonDataBase.TABLE_NAME + 
	     " ("+PersonDataBase.FNAME+","+PersonDataBase.LNAME+","+PersonDataBase.AGE+
	     ") VALUES ('"+p.getFName()+"','"+p.getLName()+"',"+p.getAge()+")";
	    sqdb.execSQL(insertQuery);
	}

	@Override
	public void create(List<Person> pList)
	{
		for(Person p:pList)
		{
			String insertQuery = "INSERT INTO " + PersonDataBase.TABLE_NAME + 
				     " ("+PersonDataBase.FNAME+","+PersonDataBase.LNAME+","+PersonDataBase.AGE+
				     ") VALUES ('"+p.getFName()+","+p.getLName()+","+p.getAge()+"')";
				    sqdb.execSQL(insertQuery);
		}		
	}

	@Override
	public Person read(int id)
	{
		Person p=new Person();
		String query = "SELECT "+PersonDataBase.FNAME+","+PersonDataBase.LNAME+","+
				PersonDataBase.AGE+" FROM "+PersonDataBase.TABLE_NAME+" WHERE ID="+id;
		Cursor cursor2 = sqdb.rawQuery(query, null);
		while (cursor2.moveToNext())
		{
			p.setId(id);
			p.setFName(cursor2.getString(cursor2
					.getColumnIndex(PersonDataBase.FNAME)));
			p.setLName(cursor2.getString(cursor2
					.getColumnIndex(PersonDataBase.LNAME)));
			p.setAge(Integer.parseInt(cursor2.getString(cursor2
					.getColumnIndex(PersonDataBase.AGE))));
		}
		cursor2.close();
		return p;
	}

	@Override
	public List<Person> read()
	{
		ArrayList<Person>pList=new ArrayList<Person>();
		try
		{
		String query = "SELECT "+PersonDataBase._ID+","+PersonDataBase.FNAME+","+PersonDataBase.LNAME+","+
				PersonDataBase.AGE+" FROM "+PersonDataBase.TABLE_NAME;
		Cursor cursor2 = sqdb.rawQuery(query, null);
		while (cursor2.moveToNext())
		{
			Person p=new Person();
			p.setId(Integer.parseInt(cursor2.getString(cursor2
					.getColumnIndex(PersonDataBase._ID))));
			p.setFName(cursor2.getString(cursor2
					.getColumnIndex(PersonDataBase.FNAME)));
			p.setLName(cursor2.getString(cursor2
					.getColumnIndex(PersonDataBase.LNAME)));
			p.setAge(Integer.parseInt(cursor2.getString(cursor2
					.getColumnIndex(PersonDataBase.AGE))));
			pList.add(p);
		}
		cursor2.close();
		}
		catch(Exception ex)
		{
			throw new IllegalArgumentException(ex.getMessage());
		}
		return pList;
	}
}
