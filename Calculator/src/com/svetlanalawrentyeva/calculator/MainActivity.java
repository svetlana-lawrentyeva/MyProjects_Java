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
    
	private Button bt0;
	private Button bt1;
	private Button bt2;
	private Button bt3;
	private Button bt4;
	private Button bt5;
	private Button bt6;
	private Button bt7;
	private Button bt8;
	private Button bt9;
	
	private Button btPlus;
	private Button btMinus;
	private Button btMult;
	private Button btDev;
	
	private Button btClear;
	
	private Button btEquals;
	
	private TextView tvResult;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		bt0=(Button)findViewById(R.id.button0);
		bt1=(Button)findViewById(R.id.button1);
		bt2=(Button)findViewById(R.id.button2);
		bt3=(Button)findViewById(R.id.button3);
		bt4=(Button)findViewById(R.id.button4);
		bt5=(Button)findViewById(R.id.button5);
		bt6=(Button)findViewById(R.id.button6);
		bt7=(Button)findViewById(R.id.button7);
		bt8=(Button)findViewById(R.id.button8);
		bt9=(Button)findViewById(R.id.button9);
		
		btPlus=(Button)findViewById(R.id.buttonPlus);
		btMinus=(Button)findViewById(R.id.buttonMinus);
		btMult=(Button)findViewById(R.id.buttonMult);
		btDev=(Button)findViewById(R.id.buttonDev);
		
		btClear=(Button)findViewById(R.id.buttonC);
		
		btEquals=(Button)findViewById(R.id.buttonEquals);
		
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
