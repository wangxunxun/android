package com.example.testandroid;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class NotificationActivity extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_notification);
		//获取通知管理器，用于发送通知
		final NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
		Button button1 = (Button) findViewById(R.id.button1);	//获取“显示通知”按钮
		//为“显示通知”按钮添加单击事件监听器
		button1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Notification notify = new Notification(); // 创建一个Notification对象
				notify.icon = R.drawable.advise;
				notify.tickerText = "显示第一个通知";
				notify.when = System.currentTimeMillis(); // 设置发送时间
				notify.defaults = Notification.DEFAULT_ALL;	//设置默认声音、默认振动和默认闪光灯
				notify.setLatestEventInfo(NotificationActivity.this, "无题", "每天进步一点点",
						null);//设置事件信息
				notificationManager.notify(1, notify); // 通过通知管理器发送通知
				// 添加第二个通知
				Notification notify1 = new Notification(R.drawable.advise2,
						"显示第二个通知", System.currentTimeMillis());
				notify1.flags|=Notification.FLAG_AUTO_CANCEL;	//打开应用程序后图标消失
				Intent intent=new Intent(NotificationActivity.this,ContentActivity.class);
				PendingIntent pendingIntent=PendingIntent.getActivity(NotificationActivity.this, 0, intent, 0);
				notify1.setLatestEventInfo(NotificationActivity.this, "通知",
						"查看详细内容", pendingIntent);//设置事件信息
				notificationManager.notify(2, notify1); // 通过通知管理器发送通知
			}
		});
		Button button2 = (Button) findViewById(R.id.button2);	//获取“删除通知”按钮
		//为“删除通知”按钮添加单击事件监听器
		button2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
//				notificationManager.cancel(1);	//清除ID号为常量NOTIFYID_1的通知
				notificationManager.cancelAll();	//清除全部通知

			}
		});
	}

}
