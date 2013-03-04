package com.example.day5;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.app.Activity;
import android.content.Intent;

public class PassingDataDemoActivity extends Activity {

	EditText edUserName;
	EditText edDescription;
	EditText edSender;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_passing_data_demo);
		edUserName=(EditText)findViewById(R.id.edUserName);
		edDescription=(EditText)findViewById(R.id.edDescription);
		edSender=(EditText)findViewById(R.id.edSender);
	}
	
	public void onClickData(View v) {
		Intent intent=new Intent(PassingDataDemoActivity.this, Privet.class);
		
		intent.putExtra("username", edUserName.getText().toString());
		intent.putExtra("gift", edDescription.getText().toString());
		intent.putExtra("sender", edSender.getText().toString());
		
		startActivity(intent);
	}
}
