package com.example.testandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends Activity{
	
	private Button about = null;
	private Button layout = null;
	private Button textview = null;
	private Button edittext = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		about = (Button) findViewById(R.id.about);
		about.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this,AboutActivity.class);
				startActivity(intent);
				
			}
		});
		
		layout = (Button) findViewById(R.id.layout);
		layout.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this,LayoutActivity.class);
				startActivity(intent);
				
			}
		});
		
		textview = (Button) findViewById(R.id.textview);
		textview.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this,TextviewActivity.class);
				startActivity(intent);
			}
		});
	

		edittext= (Button) findViewById(R.id.edittext);
		edittext.setOnClickListener(new OnClickListener() {
		
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this,EditTextActivity.class);
				startActivity(intent);
			}
		});

		
		Button button= (Button) findViewById(R.id.button);
		button.setOnClickListener(new OnClickListener() {
		
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this,ButtonActivity.class);
				startActivity(intent);
			}
		});
		
		
		Button radiobutton= (Button) findViewById(R.id.radiobutton);
		radiobutton.setOnClickListener(new OnClickListener() {
		
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this,RadiobuttonActivity.class);
				startActivity(intent);
			}
		});
		
		Button checkbox= (Button) findViewById(R.id.checkbox);
		checkbox.setOnClickListener(new OnClickListener() {
		
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this,CheckBoxActivity.class);
				startActivity(intent);
			}
		});
		Button imageview= (Button) findViewById(R.id.imageview);
		imageview.setOnClickListener(new OnClickListener() {
		
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this,ImageViewActivity.class);
				startActivity(intent);
			}
		});
		
		Button spinner= (Button) findViewById(R.id.spinner);
		spinner.setOnClickListener(new OnClickListener() {
		
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this,SpinnerActivity.class);
				startActivity(intent);
			}
		});
		Button listview= (Button) findViewById(R.id.listview);
		listview.setOnClickListener(new OnClickListener() {
		
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this,ListViewActivity.class);
				startActivity(intent);
			}
		});
		Button gameshoes= (Button) findViewById(R.id.gameshoes);
		gameshoes.setOnClickListener(new OnClickListener() {
		
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this,GameShoesActivity.class);
				startActivity(intent);
			}
		});
		Button dataandtimepicker= (Button) findViewById(R.id.dataandtimepicker);
		dataandtimepicker.setOnClickListener(new OnClickListener() {
		
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this,DateAndTimePickerActivity.class);
				startActivity(intent);
			}
		});
		
		Button chronometer= (Button) findViewById(R.id.chronometer);
		chronometer.setOnClickListener(new OnClickListener() {
		
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this,ChronometerActivity.class);
				startActivity(intent);
			}
		});
		Button iconlist= (Button) findViewById(R.id.li1);
		iconlist.setOnClickListener(new OnClickListener() {
		
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this,Li1Activity.class);
				startActivity(intent);
			}
		});
		
		Button autocompletetextview= (Button) findViewById(R.id.autocompletetextview);
		autocompletetextview.setOnClickListener(new OnClickListener() {
		
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this,AutoCompleteTextViewActivity.class);
				startActivity(intent);
			}
		});
		
		Button progressbar= (Button) findViewById(R.id.progressbar);
		progressbar.setOnClickListener(new OnClickListener() {
		
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this,ProgressBarActivity.class);
				startActivity(intent);
			}
		});
		Button seekbar= (Button) findViewById(R.id.seekbar);
		seekbar.setOnClickListener(new OnClickListener() {
		
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this,SeekBarActivity.class);
				startActivity(intent);
			}
		});
		Button ratingbar= (Button) findViewById(R.id.ratingbar);
		ratingbar.setOnClickListener(new OnClickListener() {
		
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this,RatingBarActivity.class);
				startActivity(intent);
			}
		});
		Button tabhost= (Button) findViewById(R.id.tabhost1);
		tabhost.setOnClickListener(new OnClickListener() {
		
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this,TabHostActivity.class);
				startActivity(intent);
			}
		});
	}
}
