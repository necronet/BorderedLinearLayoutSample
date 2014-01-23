package com.example.borderlinesample;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class ColoredBorderedLayout extends LinearLayout {

	private Paint p;
	private int mBorderColor;
	
	public ColoredBorderedLayout(Context context, AttributeSet attrs) {
		super(context, attrs);
		
		init();
	}
	
	public ColoredBorderedLayout(Context context) {
		super(context);
		init();
	}
	
	public ColoredBorderedLayout(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		init();
	}
	
	private void init() {
		setWillNotDraw(false);
		p = new Paint(Paint.ANTI_ALIAS_FLAG);
		p.setStyle(Paint.Style.STROKE);
		p.setStrokeWidth(10f);
		p.setColor(mBorderColor);
		
	}
	
	public void setBorderColor(int borderColor) {
		mBorderColor = borderColor;
		invalidate();
	}
	
	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		p.setColor(mBorderColor);
		canvas.drawRect(0, 0, getMeasuredWidth(), getMeasuredHeight(), p);
	}

}
