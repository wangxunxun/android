package com.example.testandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class LayoutActivity extends Activity{
	
	private Button table = null;
	private Button frame = null;
	private Button linear = null;
	private Button relative = null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_laout);
		table = (Button) findViewById(R.id.table);
		table.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(LayoutActivity.this,TableActivity.class);
				startActivity(intent);
				
			}
		});
		
		frame = (Button) findViewById(R.id.frame);
		frame.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(LayoutActivity.this,FrameActivity.class);
				startActivity(intent);
				
			}
		});
		
		linear = (Button) findViewById(R.id.linear);
		linear.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(LayoutActivity.this,LinearActivity.class);
				startActivity(intent);
				
			}
		});
		
		
		linear = (Button) findViewById(R.id.relative);
		linear.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(LayoutActivity.this,RelativeActivity.class);
				startActivity(intent);
				
			}
		});
	}



	
}
