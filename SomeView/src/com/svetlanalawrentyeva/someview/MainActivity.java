package com.svetlanalawrentyeva.someview;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.app.Activity;
import android.content.Intent;

public class MainActivity extends Activity  implements ColorPickerDialog.OnColorChangedListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);		
	}

	@Override
	public void colorChanged(int color) {
		// TODO Auto-generated method stub
		
	}

	public boolean onCreateOptionsMenu(Menu menu)
	{
		MenuInflater inflater=getMenuInflater();
		inflater.inflate(R.menu.paint_menu, menu);
		//Intent intent=new Intent(MainActivity.this, Colors.class);
		
		return true;
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item) 
	{
	    // Операции для выбранного пункта меню
	    switch (item.getItemId()) 
		{
	    case R.id.colors:
	        setColor();
	        return true;
	    case R.id.line_width:
	        setLineWidth();
	        return true;
	    default:
	        return super.onOptionsItemSelected(item);
	    }
	}
	public void setColor()
	{
		new ColorPickerDialog(this, this, mPaint.getColor()).show();
	}
	public void setLineWidth()
	{
		
	}
}
