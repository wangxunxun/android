package com.example.testandroid;

import android.app.Activity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.Toast;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;

public class SeekBarActivity extends Activity{
	private SeekBar seekbar;	//拖动条	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_seekbar);
		final TextView result=(TextView)findViewById(R.id.textView1);
		seekbar = (SeekBar) findViewById(R.id.seekBar1);	//获取拖动条
		seekbar.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
			
			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {
				Toast.makeText(SeekBarActivity.this, "结束滑动", Toast.LENGTH_SHORT).show();
			}
			
			@Override
			public void onStartTrackingTouch(SeekBar seekBar) {
				Toast.makeText(SeekBarActivity.this, "开始滑动", Toast.LENGTH_SHORT).show();
			}
			
			@Override
			public void onProgressChanged(SeekBar seekBar, int progress,
					boolean fromUser) {
				result.setText("当前值："+progress);				//修改文本视图的值
				
			}
		});
		
	}

}
