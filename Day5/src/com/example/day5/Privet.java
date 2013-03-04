package com.example.day5;

import android.os.Bundle;
import android.widget.TextView;
import android.app.Activity;

public class Privet extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_privet);
		
		TextView tvInfo=(TextView)findViewById(R.id.textView4);
		
		String user="ЖЫвотное";
		String gift="дырку от бублика";		
		String sender="аноним";
		
		user=getIntent().getExtras().getString("username");
		gift=getIntent().getExtras().getString("gift");
		sender=getIntent().getExtras().getString("sender");

		tvInfo.setText(user+", вам передали "+gift+". Отправитель: "+sender);
	}

}
