package com.example.lsn09_baseactivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class BaseActivity extends Activity {
	private LinearLayout ly_content;
	private Button btn_left;
	private Button btn_right;
	private TextView tv_title;
	private View contenView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		/**
		 * 自定义BaseActivity,实现自动添加标题、按钮、及文本
		 * 
		 * 1、BaseActivity > xxx.xml 2、xxx_layout.addView (v);
		 * 3、添加一个方法：setContentLayout(View v) setContentLayout(int resId)
		 * 
		 * 4、再处理返回按钮，标题设置等
		 */

		setContentView(R.layout.common_title);

		// 找到布局文件
		ly_content = (LinearLayout) findViewById(R.id.ly_content);
		
		
		tv_title = (TextView) findViewById(R.id.tv_title);
		btn_left = (Button)findViewById(R.id.btn_left);
		btn_right = (Button)findViewById(R.id.btn_right);
		
		btn_left.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				finish();
			}
		});
	}
	

	//用protected，让继承的类可以调用此方法
	protected void setContentLayout(View contentview) {
		this.contenView = contentview;
		LayoutParams lp = new LayoutParams(LayoutParams.MATCH_PARENT,
				LayoutParams.MATCH_PARENT);
		contentview.setLayoutParams(lp);

		// 在布局中添加该view ,事先可做一个判断
		if (ly_content != null) {
			ly_content.addView(contentview);
		}
	}

	protected void setContentLayout(int resId) {
		//渲染成View 
		View contentview = View.inflate(getApplicationContext(), resId,null);

		setContentLayout(contentview);
	}
	
	protected Button getLeftBtn(){
		return btn_left;
	}
	
	protected Button getRightBtn(){
		return btn_right;
	}
	
	
	protected void hideLeftBtn(){
		if(btn_left != null){
			btn_left.setVisibility(View.INVISIBLE);
		}
	}
	
	protected void hideRightBtn(){
		if(btn_right != null){
			btn_right.setVisibility(View.INVISIBLE);
		}
	}
	
	protected void setTitle(String title){
		tv_title.setText(title);
	}
	
	protected View getContentView(){
		return contenView;
	}
	
	protected void setLeftBtnImage(int imgId){
		if(btn_left != null){
		btn_left.setBackgroundResource(imgId);
		}
	}
	
	protected void setRightBtnImage(int imgId){
		if(btn_right != null){
			btn_right.setBackgroundResource(imgId);
		}
	}
}
