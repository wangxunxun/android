package com.example.testandroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class ButtonActivity extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_button);
		
		Button login = (Button) findViewById(R.id.login);
		login.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast toast = Toast.makeText(ButtonActivity.this, "您单击了普通按钮", Toast.LENGTH_SHORT);
				toast.show();
				
			}
		});
	}
    public void myClick(View view){
    	Toast toast=Toast.makeText(ButtonActivity.this, "您单击了图片按钮", Toast.LENGTH_SHORT);
		toast.show();
    }
}
