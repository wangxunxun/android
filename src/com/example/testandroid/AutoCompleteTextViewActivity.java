package com.example.testandroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Toast;

public class AutoCompleteTextViewActivity extends Activity{
	 private static final String[] COUNTRIES = new String[] {
		 "明日科技", "明日科技有限公司", "吉林省明日科技有限公司", "明日编程词典", "明日"};
	 private  AutoCompleteTextView textView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_autocompletetextview);
		
        textView=(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView1);	//获取自动完成文本框
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, 
        							android.R.layout.simple_dropdown_item_1line,COUNTRIES); //创建一个ArrayAdapter适配器
        textView.setAdapter(adapter);	//为自动完成文本框设置适配器
        Button button=(Button)findViewById(R.id.button1);	//获取搜索按钮
        //为搜索按钮添加单击事件监听
        button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(AutoCompleteTextViewActivity.this, textView.getText().toString(), Toast.LENGTH_SHORT).show();
			}
		});
	}
}
