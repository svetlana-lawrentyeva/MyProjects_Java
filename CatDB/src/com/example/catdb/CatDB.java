package com.example.catdb;

import android.os.Bundle;
import android.app.Activity;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CatDB extends Activity
{
	EditText txtData;
	Button b;
	SQLiteDatabase sqdb;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cat_db);
		txtData=(EditText)findViewById(R.id.editText1);
		CatDataBase sqh = new CatDataBase(this);
	    sqdb = sqh.getWritableDatabase();
	    //sqdb.close();
		//sqh.close();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_cat_db, menu);
		return true;
	}
	public void onClick(View v)
	{
		ContentValues cv = new ContentValues();
		cv.put(CatDataBase.CATNAME, txtData.getText().toString());
		// вызываем метод вставки
		sqdb.insert(CatDataBase.TABLE_NAME, CatDataBase.CATNAME, cv);
		txtData.setText("");
	}
	public void onClick2(View v)
	{
		String query = "SELECT " + CatDataBase._ID + ", "
				+ CatDataBase.CATNAME + " FROM " + CatDataBase.TABLE_NAME;
		Cursor cursor2 = sqdb.rawQuery(query, null);
		String r="";
		while (cursor2.moveToNext()) {
			int id = cursor2.getInt(cursor2
					.getColumnIndex(CatDataBase._ID));
			String name = cursor2.getString(cursor2
					.getColumnIndex(CatDataBase.CATNAME));
			r+=(" ROW " + id + " HAS NAME " + name);
		}
		TextView tv=(TextView)findViewById(R.id.textView1);
		tv.setText(r);
		cursor2.close();
	}
}
