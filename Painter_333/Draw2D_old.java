package com.svetlanalawrentyeva.painter;

import android.R.color;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

public class Draw2D extends View{

	private float x = 0;
	private float y = 0;
	Paint paint;
	Canvas canvas;
	
	public Draw2D(Context context) {
		super(context);
		paint=new Paint();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		paint.setStyle(Paint.Style.FILL);
		paint.setColor(color.white);
		this.canvas=canvas;
		canvas.drawPaint(paint);
		paint.setStyle(Paint.Style.STROKE);
		paint.setColor(color.holo_blue_dark);
	}
	
	@Override
	public boolean onTouchEvent(MotionEvent e)
	{
		int action=e.getAction();
		if(action==MotionEvent.ACTION_DOWN)
		{
			x=e.getX();
			y=e.getY();
		}
		else if(action==MotionEvent.ACTION_MOVE)
		{
			canvas.drawLine(x, y, e.getX(), e.getY(), paint);
		}
		
		return true;
	}

}
