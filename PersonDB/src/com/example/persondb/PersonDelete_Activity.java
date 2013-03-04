package com.example.persondb;

import android.app.Activity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class PersonDelete_Activity extends Activity
{
	private IDS ds;
	private SQLiteDatabase sqdb;
	private Intent answerInent;
	private EditText deleteId;
	public final static String RES = "res";

	@Override
    protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person_delete_);
        deleteId=(EditText)findViewById(R.id.editText_deleteId);
        ds=DSFactory.getInstance("db");
        answerInent = new Intent();
    }

	public void onDeleteClick(View v)
	{
		switch (v.getId()) 
		{
		    case R.id.button_deleteOk:
		    	int id=Integer.parseInt(deleteId.getText().toString());
		    	boolean update=getIntent().getExtras().getBoolean("update");
		    	if(!update)
		    	{
			        ds.delete(id);
		    	}
		    	else
		    	{
			        answerInent.putExtra(RES, id);		    		
		    	}
		        break;
		    case R.id.button_cansel:
		    	finish();
	    }
		setResult(RESULT_OK, answerInent);
		finish();
	}
}
