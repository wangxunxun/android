package com.example.testandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class Big59Activity extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_big59);
		Intent intent=getIntent();	//获取Intent对象
		Bundle bundle=intent.getExtras();	//获取传递过来的数据包
		int imgId=bundle.getInt("imgId");
		ImageView iv=(ImageView)findViewById(R.id.imageView1);
		iv.setImageResource(imgId);		//设置要显示的图片
		
		Button button=(Button)findViewById(R.id.button1);
		button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				finish();	//返回
			}
		});
	}

}
