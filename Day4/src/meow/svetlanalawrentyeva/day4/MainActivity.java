package meow.svetlanalawrentyeva.day4;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {

	public TextView tvInfo;
	public RelativeLayout relativeLayout;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tvInfo=(TextView)findViewById(R.id.textView1);
		relativeLayout=(RelativeLayout)findViewById(R.id.relativelayout);
		Button buttonYellow=(Button)findViewById(R.id.buttonYellow);
		buttonYellow.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				tvInfo.setText(R.string.yellow);
				relativeLayout.setBackgroundResource(R.color.yellowColor);
			}
		});
	}
	public void buttonRed_Click(View v) {
		tvInfo.setText(R.string.red);
		relativeLayout.setBackgroundResource(R.color.redColor);
	}
	public void buttonGreen_Click(View v) {
		tvInfo.setText(R.string.green);
		relativeLayout.setBackgroundResource(R.color.greenColor);
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
