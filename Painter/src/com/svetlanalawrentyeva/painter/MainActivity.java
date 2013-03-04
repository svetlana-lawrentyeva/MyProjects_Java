package com.svetlanalawrentyeva.painter;

import android.app.Activity;
import android.content.Context;
import android.graphics.*;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends Activity
 implements ColorPickerDialog.OnColorChangedListener, LineWidthDialog.OnLineWidthChangeListener
{
	private int strokeWidth;
	private int color;
	private Paint mPaint;

	private static final int COLOR_MENU_ID = Menu.FIRST;
	private static final int STROKE_WIDTH_MENU_ID = Menu.FIRST + 1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(new MyView(this));

		strokeWidth=12;
		color=0x7f050006;
		
		mPaint = new Paint();
		mPaint.setColor(color);
		mPaint.setStyle(Paint.Style.STROKE);
		mPaint.setStrokeJoin(Paint.Join.ROUND);
		mPaint.setStrokeCap(Paint.Cap.ROUND);
		mPaint.setStrokeWidth(strokeWidth);
	}

	public void colorChanged(int color)
	{
		mPaint.setColor(color);
	}	
	@Override
	public void lineWidthChange(int width)
	{
		mPaint.setStrokeWidth(width);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		super.onCreateOptionsMenu(menu);

		menu.add(0, COLOR_MENU_ID, 0, "Цвет");
		menu.add(0, STROKE_WIDTH_MENU_ID, 0, "Толщина линии");

		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{
		switch (item.getItemId())
		{
		case COLOR_MENU_ID:
			new ColorPickerDialog(this, this, mPaint.getColor()).show();
			return true;
		case STROKE_WIDTH_MENU_ID:
			new LineWidthDialog(this, this, (int)mPaint.getStrokeWidth()).show();
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	public class MyView extends View
	{
		private Bitmap mBitmap;
		private Canvas mCanvas;
		private Path mPath;
		private Paint mBitmapPaint;

		private float mX, mY;
		private static final float TOUCH_TOLERANCE = 4;

		public MyView(Context c)
		{
			super(c);

			mPath = new Path();
			mBitmapPaint = new Paint();
		}

		@Override
		protected void onSizeChanged(int w, int h, int oldw, int oldh)
		{
			super.onSizeChanged(w, h, oldw, oldh);
			
			mBitmap = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888);
			mCanvas = new Canvas(mBitmap);		
		}

		@Override
		protected void onDraw(Canvas canvas)
		{
			canvas.drawColor(0xFFAAAAAA);

			canvas.drawBitmap(mBitmap, 0, 0, mBitmapPaint);

			canvas.drawPath(mPath, mPaint);
		}

		private void touch_start(float x, float y)
		{
			mPath.reset();
			mPath.moveTo(x, y);
			mX = x;
			mY = y;
		}

		private void touch_move(float x, float y)
		{
			float dx = Math.abs(x - mX);
			float dy = Math.abs(y - mY);
			if (dx >= TOUCH_TOLERANCE || dy >= TOUCH_TOLERANCE)
			{
				mPath.quadTo(mX, mY, (x + mX) / 2, (y + mY) / 2);
				mX = x;
				mY = y;
			}
		}

		private void touch_up()
		{
			mPath.lineTo(mX, mY);
			// commit the path to our offscreen
			mCanvas.drawPath(mPath, mPaint);
			// kill this so we don't double draw
			mPath.reset();
		}

		@Override
		public boolean onTouchEvent(MotionEvent event)
		{
			float x = event.getX();
			float y = event.getY();

			switch (event.getAction())
			{
			case MotionEvent.ACTION_DOWN:
				touch_start(x, y);
				invalidate();
				break;
			case MotionEvent.ACTION_MOVE:
				touch_move(x, y);
				invalidate();
				break;
			case MotionEvent.ACTION_UP:
				touch_up();
				invalidate();
				break;
			}
			return true;
		}
	}
}