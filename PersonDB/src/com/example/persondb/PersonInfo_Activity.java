package com.example.persondb;

import android.app.Activity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class PersonInfo_Activity extends Activity
{
	private EditText editId;
	private EditText editFName;
	private EditText editLName;
	private EditText editAge;
	private IDS ds;
	private SQLiteDatabase sqdb;
	private Intent answerInent;
	private boolean newPerson=false;
	
	@Override
    protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person_info_);
        editId=(EditText)findViewById(R.id.editText_id);
        editFName=(EditText)findViewById(R.id.editText_fname);
        editLName=(EditText)findViewById(R.id.editText_lname);
        editAge=(EditText)findViewById(R.id.editText_age);
        ds=DSFactory.getInstance("db");
        answerInent = new Intent();
        int id=getIntent().getExtras().getInt("id");
        if(id==-1) newPerson=true;
        else
        {
        	editId.setText(id);
        	editFName.setText(getIntent().getExtras().getString("fname"));
        	editLName.setText(getIntent().getExtras().getString("lname"));
        	editAge.setText(getIntent().getExtras().getString("age"));
        }
    }
	public void onClick(View v)
	{
		switch (v.getId()) 
		{
		    case R.id.button_ok:
		    	if(newPerson)
		    	{
			        Person p=new Person();
			        p.setFName(editFName.getText().toString());
			        p.setLName(editLName.getText().toString());
			        p.setAge(Integer.parseInt(editAge.getText().toString()));
			        ds.create(p);
		    	}
		    	else
		    	{
		    		Person p=new Person();
		    		p.setId(Integer.parseInt(editId.getText().toString()));
			        p.setFName(editFName.getText().toString());
			        p.setLName(editLName.getText().toString());
			        p.setAge(Integer.parseInt(editAge.getText().toString()));
			        ds.update(p);
		    	}
		        break;
		    case R.id.button_cansel:
		    	finish();
	    }
		setResult(RESULT_OK, answerInent);
		finish();
	}
}
