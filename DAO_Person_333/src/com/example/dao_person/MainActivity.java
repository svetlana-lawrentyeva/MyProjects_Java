package com.example.dao_person;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		DB_Person db=new DB_Person();
		Person p=db.read(0);
		TextView tv=(TextView) findViewById(R.id.textView1);
		tv.setText(p.getId()+" "+p.getFName()+" "+p.getLName()+" "+p.getAge());	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
