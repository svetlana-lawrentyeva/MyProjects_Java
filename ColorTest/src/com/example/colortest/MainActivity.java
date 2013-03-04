package com.example.colortest;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends Activity {

	int color;
	int lineWidth;
	AlertDialog.Builder ad;
	Context context;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_color, menu);
		return true;
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item) 
	{
	    // Операции для выбранного пункта меню
	    switch (item.getItemId()) 
		{
	    case R.id.item1:
	        setColor();
	        return true;
	    case R.id.item2:
	        setLineWidth();
	        return true;
	    default:
	        return super.onOptionsItemSelected(item);
	    }
	}

	public void setColor()
	{
		color=1;
	}

	public void setLineWidth()
	{
		lineWidth=1;
	}
}
