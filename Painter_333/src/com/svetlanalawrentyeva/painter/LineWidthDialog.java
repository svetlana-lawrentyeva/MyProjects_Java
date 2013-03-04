package com.svetlanalawrentyeva.painter;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.TextView;

public class LineWidthDialog extends Dialog 
{
	public interface OnLineWidthChangeListener
	{
		public void lineWidthChange(int width);
	}
	
	private OnLineWidthChangeListener listener;
	private int initialWidth;
	
	public LineWidthDialog(Context context, OnLineWidthChangeListener listener, int initialWidth)
	{
		super(context);
		this.listener=listener;
		this.initialWidth=initialWidth;
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		OnLineWidthChangeListener l=new OnLineWidthChangeListener()
		{
			public void lineWidthChange(int width)
			{
				listener.lineWidthChange(width);
                dismiss();
			}
		};
		setContentView(new LineWidthView(getContext(), l, initialWidth));
	}
	class LineWidthView extends ScrollView implements SeekBar.OnSeekBarChangeListener
	{
		private OnLineWidthChangeListener listener;
		private SeekBar bar;
		int progr;
		
		LineWidthView(Context c, OnLineWidthChangeListener l, int width)
		{
			super(c);
			listener=l;
						
			bar=new SeekBar(c);
			this.addView(bar);
			bar.setMax(100);
			bar.setOnSeekBarChangeListener(this);	
			bar.setProgress(initialWidth);
			progr=initialWidth;
		}

		@Override
		public void onProgressChanged(SeekBar seekBar, int progress,
				boolean fromUser)
		{
			progr=progress;
		}

		@Override
		public void onStartTrackingTouch(SeekBar seekBar){}

		@Override
		public void onStopTrackingTouch(SeekBar seekBar){listener.lineWidthChange(progr);}
	}
}
