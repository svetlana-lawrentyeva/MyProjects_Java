package com.example.day5;

import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.content.Intent;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.button1:
			Intent intent = new Intent(MainActivity.this, AboutActivity.class);
			startActivity(intent);
			break;

		default:
			break;
		}
	}
	public void onClickAnimal(View v) {
		Intent intent=new Intent(MainActivity.this,PassingDataDemoActivity.class);
		startActivity(intent);
	}
}
