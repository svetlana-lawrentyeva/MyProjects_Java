package com.example.hello_world;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

	TextView tvHello;
	boolean b=false;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tvHello=(TextView)findViewById(R.id.textView1);
	}
	public void onClick(View v)
	{
		if(b)
		{
		tvHello.setText("Hello, Kitty!");
		b=false;
		}
		else
		{
			tvHello.setText("Bye bye!");
			b=true;
		}
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
