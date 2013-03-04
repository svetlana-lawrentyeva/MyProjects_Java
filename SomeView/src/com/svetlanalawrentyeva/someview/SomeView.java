package com.svetlanalawrentyeva.someview;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MotionEvent;
import android.view.View;

public class SomeView extends View 
{
	Bitmap bmp;
	Canvas cnv;
    Paint paint;
    float X;
    float Y;
    float x2;
    float y2;
    Context context;
    public int color=0x7f050006;
    public int getColor()
    {
    	return color;
    }
    public void setColor(int setColor)
    {
    	color=setColor;
    }
    
    
    public SomeView(Context context, AttributeSet attrs)
    {
        super(context, attrs);
        paint = new Paint();
        paint.setColor(Color.BLACK);
        paint.setStyle(Style.STROKE);
        paint.setStrokeWidth(6);
        int width=context.getResources().getDisplayMetrics().widthPixels;
        int height=context.getResources().getDisplayMetrics().heightPixels;
        bmp=Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        cnv=new Canvas(bmp);
        this.context=context;
    }
    @Override
    public boolean onTouchEvent(MotionEvent event)
    {
    	int action = event.getAction();
    	if(action==MotionEvent.ACTION_DOWN)
    	{
            X=event.getX();
            Y=event.getY();
    	}
    	else if(action==MotionEvent.ACTION_MOVE)
    	{
	        cnv.drawLine(X, Y, event.getX(), event.getY(), paint);
	        X=event.getX();
	        Y=event.getY();
    	}
        return true;
    }
    
    @Override
    protected void onDraw(Canvas canvas)// метод OnDraw вызвается Андроидом тогда, когда нужно отрисовать данный View
    {
	        canvas.drawBitmap(bmp, 0,0, null);
	        invalidate();// invalidate() нужен для того, чтобы оповестить Android, что нужно выполнить метод OnDraw снова, без него View не будет перериcовываться.
    }

}
