package com.example.testandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login58Activity extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login58);
		Button button=(Button)findViewById(R.id.login);
		button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				String number=((EditText)findViewById(R.id.editText1)).getText().toString();
				String pwd=((EditText)findViewById(R.id.editText2)).getText().toString();
				boolean flag=false;	//用于记录登录是否成功的标记变量
				String nickname="";		//保存昵称的变量
				//通过遍历数据的形式判断输入的帐号和密码是否正确
				for(int i=0;i<Data58.USER.length;i++){
					if(number.equals(Data58.USER[i][0])){//判断帐号是否正确
						if(pwd.equals(Data58.USER[i][1])){	//判断密码是否正确
							nickname=Data58.USER[i][2];		//获取昵称
							flag=true;		//将标志变量设置为true
							break;		//跳出for循环
						}
					}
				}
				if(flag){
					Intent intent=new Intent(Login58Activity.this,Main58Activity.class);	//创建要显示Activity对应的Intent对象
					Bundle bundle=new Bundle();		//创建一个Bundle的对象bundle
					bundle.putString("nickname", nickname);	//保存昵称
					intent.putExtras(bundle);	//将数据包添加到intent对象中
					startActivity(intent);		//开启一个新的Activity
				}else{
					Toast.makeText(Login58Activity.this, "您输入的帐号或密码错误！", Toast.LENGTH_SHORT);
				}
				
			}
		});
		Button exit=(Button)findViewById(R.id.exit);
		exit.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				finish();	//关闭当前Activity
				
			}
		});
	}

}
