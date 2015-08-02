package com.tzvip.testone;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {
	private Button bt_save;
	private Button bt_call;
	private Button bt_sendmessage;

	private EditText et_phonenumber;
	private EditText et_messages;
	
	private String number ;
	private String messages ;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Log.i("MY_INFO", "我现在已进入到acitivity中来了！");
		MyLog.d("MY_INFO", "这是我自定义的日志信息");
		MyLog.write("这是我自定义的日志信息");
		/**
		 * adb logcat - help 查看logcat命令 adb logcat - s INFO 过滤tag日志
		 */
		et_phonenumber = (EditText) findViewById(R.id.et_phonenumber);
		et_messages = (EditText) findViewById(R.id.et_messages);

		bt_save = (Button) findViewById(R.id.bt_savelogs);
		bt_save.setOnClickListener(this);
		bt_call = (Button) findViewById(R.id.bt_call);
		bt_sendmessage = (Button) findViewById(R.id.bt_sendmessage);
		
		bt_call.setOnClickListener(this);
		bt_sendmessage.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {
		Toast.makeText(this, v.getTag()+"", 1).show();
		switch (v.getId()) {
		case R.id.bt_savelogs:
			// 控制cmd命令保存的日志
			// 模拟cmd命令采集日志
			ArrayList<String> cmdline = new ArrayList<String>();

			cmdline.add("logcat");// 日志采集命令
			cmdline.add("-d");// 只采集一次日志
			cmdline.add("-s"); // 过滤
			cmdline.add("MY_INFO"); // 过滤tag

			String[] strs = new String[cmdline.size()];
			try {
				// 得到这个进程
				Process process = Runtime.getRuntime().exec(
						cmdline.toArray(strs));
				// 通过进程，取得输入流
				InputStream is = process.getInputStream();

				BufferedReader br = new BufferedReader(
						new InputStreamReader(is));

				String str = null;
				StringBuffer sb = new StringBuffer();
				while ((str = br.readLine()) != null) {
					sb.append(str);
					sb.append("\n");
				}

				Toast.makeText(MainActivity.this, sb.toString().trim(),
						Toast.LENGTH_LONG).show();
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;

		case R.id.bt_call:
			number = et_phonenumber.getText().toString();
			Log.i("com.tzvip.testone", "打电话-->"+number);
			Intent intent = new Intent();
			intent.setAction("android.intent.action.CALL");
			intent.addCategory("android.intent.category.DEFAULT");
			intent.setData(Uri.parse("tel:"+number));
			startActivity(intent);
			break;

		case R.id.bt_sendmessage:
			number = et_phonenumber.getText().toString();
			messages = et_messages.getText().toString();
			Log.i("com.tzvip.testone", "发送信息-->"+messages);
			//产生一个短信管理器
			SmsManager manager = SmsManager.getDefault();
			ArrayList<String> contents = new ArrayList<String>();
			contents.add(messages);
			manager.sendMultipartTextMessage(
					number, 
					null, 
					contents, 
					null, 
					null);
			break;

		}

	}
}
