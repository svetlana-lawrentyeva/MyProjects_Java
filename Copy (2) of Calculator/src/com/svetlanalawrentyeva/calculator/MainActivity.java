package com.svetlanalawrentyeva.calculator;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.text.Layout;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends Activity{

	private GridView gridView;
	private FrameLayout frameLayout;
	private Context context;
	
	private int a;
	private int b;
	private char c;
    private boolean firstNumber=true;
    
	private Button[] buttonsDigit=new Button[10];
	
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
		
		context=MainActivity.this;
		frameLayout=new FrameLayout(context);
		gridView=new GridView(context);
	    frameLayout.addView(gridView);
		gridView.setNumColumns(4);
		
		for(int i=0;i<buttonsDigit.length;++i)
		{
			buttonsDigit[i]=new Button(context);
			buttonsDigit[i].setText(""+i);
			gridView.addView(buttonsDigit[i]);
		}
		
		btPlus=new Button(context);
		btMinus=new Button(context);
		btMult=new Button(context);
		btDev=new Button(context);
		btClear=new Button(context);
		btEquals=new Button(context);
		tvResult=new Button(context);
		
		btPlus.setText("+");
		btMinus.setText("-");
		btMult.setText("*");
		btDev.setText("/");
		btClear.setText("C");
		btEquals.setText("=");
		tvResult.setText("0");

		gridView.addView(btPlus);
		gridView.addView(btMinus);
		gridView.addView(btMult);
		gridView.addView(btDev);	
		gridView.addView(btClear);	
		gridView.addView(btEquals);	
		gridView.addView(tvResult);	
		setContentView(frameLayout);
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
