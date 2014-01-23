package com.example.borderlinesample;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends Activity implements OnClickListener {

	private ColoredBorderedLayout mContainer;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		findViewById(R.id.buttonRed).setOnClickListener(this);
		findViewById(R.id.buttonGray).setOnClickListener(this);
		findViewById(R.id.buttonOrange).setOnClickListener(this);
		
		mContainer = (ColoredBorderedLayout) findViewById(R.id.container);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		int color = 0;
		switch(v.getId()) {
		case R.id.buttonRed:
			color = Color.parseColor("#c60000");
			break;
		case R.id.buttonGray:
			color = Color.parseColor("#505050");
			break;
		case R.id.buttonOrange:
			color = Color.parseColor("#f05c15");
			break;
		}
		
		mContainer.setBorderColor(color);
	}

}
