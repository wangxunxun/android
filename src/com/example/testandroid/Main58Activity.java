package com.example.testandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Main58Activity extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main58);
		Intent intent=getIntent();	//获取Intent对象
		Bundle bundle=intent.getExtras();		//获取传递的数据包
		String nickname=bundle.getString("nickname");	//获取传递过来的昵称
		TextView tv=(TextView)findViewById(R.id.nickname);	//获取用于显示当前登录用户的TextView组件
		tv.setText("当前登录："+nickname);	//显示当前登录用户的昵称
		
		Button button=(Button)findViewById(R.id.m_exit);	//获取“退出登录”按钮
		button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				finish();		//关闭当前Activity
			}
		});
	}

}
