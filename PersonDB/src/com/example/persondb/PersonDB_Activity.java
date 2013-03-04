package com.example.persondb;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.app.Activity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;

public class PersonDB_Activity extends Activity
{
	private SQLiteDatabase sqdb;
	private String names;
	private EditText textNames;
	private IDS ds;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_person_db_);
		PersonDataBase sqh = new PersonDataBase(this);
	    sqdb = sqh.getWritableDatabase();
	    textNames=(EditText)findViewById(R.id.editText_names);
	    ds=DSFactory.getInstance("db");
	    ((DS_DB)ds).setDB(sqdb);
	    getNames();
	}
	private void getNames()
	{
		try
		{
			List<Person>arrayPerson=ds.read();
		//names=new String[arrayPerson.size()];
		names="";
		for(int i=0;i<arrayPerson.size();++i)
		{
			names=names+arrayPerson.get(i).getId()+" "+arrayPerson.get(i).getFName()+" "+arrayPerson.get(i).getLName()+"\n";
		}
		}
		catch(IllegalArgumentException ex)
		{
			names=ex.getMessage();
		}
	    textNames.setText(names);
	}
	public void onClick(View v)
	{
		switch (v.getId()) 
		{
		    case R.id.button_create:
		        Intent intentCreate = new Intent(PersonDB_Activity.this, PersonInfo_Activity.class);
		        intentCreate.putExtra("id", -1);
		        intentCreate.putExtra("fname", "");
		        intentCreate.putExtra("lname", "");
		        intentCreate.putExtra("age", 0);
		        startActivityForResult(intentCreate, 1);
		        break;
	        case R.id.button_delete:
		        Intent intentDelete = new Intent(PersonDB_Activity.this, PersonDelete_Activity.class);
		        intentDelete.putExtra("update", false);
		        startActivityForResult(intentDelete, 2);
		        break;
	        case R.id.button_update:
		        Intent intentUpdate = new Intent(PersonDB_Activity.this, PersonDelete_Activity.class);
		        intentUpdate.putExtra("update", true);
		        startActivityForResult(intentUpdate, 3);	
		        break;
	    }
	}
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);

		if (requestCode == 1||requestCode==2||requestCode==4)
		{
			if (resultCode == RESULT_OK)
			{
				getNames();
			}
		}
		else if(requestCode==3)
		{
			int idUpdated=getIntent().getExtras().getInt(PersonDelete_Activity.RES);
			Person p=ds.read(idUpdated);
			Intent intentUpdate=new Intent(PersonDB_Activity.this, PersonInfo_Activity.class);
			intentUpdate.putExtra("id", p.getId());
			intentUpdate.putExtra("fname", p.getFName());
			intentUpdate.putExtra("lname", p.getLName());
			intentUpdate.putExtra("age", p.getAge());
			startActivityForResult(intentUpdate, 4);
		}
	}
}
