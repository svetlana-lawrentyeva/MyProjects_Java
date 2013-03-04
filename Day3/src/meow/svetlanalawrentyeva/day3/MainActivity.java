package meow.svetlanalawrentyeva.day3;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {

	TextView tvHello;
	TextView tvCounter;
	Button buttCrowsCounter;
	Button buttCatsCounter;
	int countCats=0;
	int countCrows=0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tvHello=(TextView)findViewById(R.id.textView1);
		tvCounter=(TextView)findViewById(R.id.textView2);
		buttCrowsCounter=(Button)findViewById(R.id.buttCrowsCounter);
		buttCrowsCounter.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				tvCounter.setText("Я насчитал "+ ++countCrows + " ворон");
			}
		});
		buttCatsCounter=(Button)findViewById(R.id.buttCatsCounter);
		buttCatsCounter.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				tvCounter.setText("Я насчитал "+ ++countCats + " котов");
			}
		});
	}
	public void butHelloClick(View v)
	{
		tvHello.setText("Hello, Kitty!");
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
