package com.example.testandroid;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;

import android.widget.Toast;

public class First63Activity extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_first63);
        Button button = (Button) findViewById(R.id.button);// 通过ID值获得按钮对象
        button.setOnClickListener(new View.OnClickListener() {// 为按钮增加单击事件监听器

            public void onClick(View v) {
                Intent intent = new Intent();// 创建Intent对象
                intent.setAction(Intent.ACTION_VIEW);// 为Intent设置动作
                startActivity(intent);// 将Intent传递给Activity
            }
        });
        Button button1 = (Button) findViewById(R.id.button1);// 通过ID值获得按钮对象
        button1.setOnClickListener(new View.OnClickListener() {// 为按钮增加单击事件监听器

            public void onClick(View v) {
                Intent intent = new Intent();// 创建Intent对象
                intent.setAction(Intent.ACTION_VIEW);// 为Intent设置动作
                intent.setData(Uri.parse("http://www.baidu.com"));
                startActivity(intent);// 将Intent传递给Activity
            }
        });
        Button button2 = (Button) findViewById(R.id.button2);// 获得按钮控件
        button2.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {// 处理用户短时间单击按钮事件
                Toast.makeText(First63Activity.this, "短时间单击", Toast.LENGTH_SHORT).show();
            }
        });
        button.setOnLongClickListener(new OnLongClickListener() {
            public boolean onLongClick(View v) {// 处理用户长时间单击按钮事件
                Toast.makeText(First63Activity.this, "长时间单击", Toast.LENGTH_SHORT).show();
                return true; 
            }
        });
	}

}
