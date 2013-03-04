package com.svetlanalawrentyeva.calculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	private int a;
	private int b;
	private char c;
    private boolean firstNumber=true;
    
	
	private TextView tvResult;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);	
		
		tvResult=(TextView)findViewById(R.id.textViewResult);
	}

	public void onClickDigital(View v)
	{
		String value=((Button)v).getText().toString();
		String prevalue=tvResult.getText().toString();
        if(firstNumber)
        {
            tvResult.setText(value);
            firstNumber=false;
        }
        else
        {
        	tvResult.setText(prevalue+value);
        }
	}
	public void onClickOper(View v)
	{
		char value=((Button)v).getText().toString().charAt(0);
		switch(value)
        {
		case '+':
	        a=Integer.parseInt(tvResult.getText().toString());
	        c=value;
	        firstNumber=true;
	        break;
	    case '-':
	        a=Integer.parseInt(tvResult.getText().toString());
	        c=value;
	        firstNumber=true;
	        break;
	    case '*':
	        a=Integer.parseInt(tvResult.getText().toString());
	        c=value;
	        firstNumber=true;
	        break;
	    case '/':
	        a=Integer.parseInt(tvResult.getText().toString());
	        c=value;
	        firstNumber=true;
	        break;
        }
	}
	public void onClickClear(View v)
	{
		tvResult.setText("0");
        a=0;
        b=0;
        firstNumber=true;
	}
	public void onClickEquals(View v)
	{
		b=Integer.parseInt(tvResult.getText().toString());
        try
        {
        	tvResult.setText(""+Calculator.count(a, b, c));
        }
        catch(ArithmeticException e)
        {
        	tvResult.setText("Err");
        }
        catch(IllegalArgumentException e)
        {
        	tvResult.setText("Err");
        }
        firstNumber=true;
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
}
