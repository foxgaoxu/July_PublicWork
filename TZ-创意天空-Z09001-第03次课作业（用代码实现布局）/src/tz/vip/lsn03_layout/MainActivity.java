package tz.vip.lsn03_layout;

import android.R.layout;
import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.view.GravityCompat;
import android.text.Layout;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup.LayoutParams;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// etContentView(R.layout.activity_main);

		// 最外层LinearLayout
		LinearLayout ll = new LinearLayout(this);
		ll.setOrientation(LinearLayout.VERTICAL);
		LayoutParams layoutParams = new LayoutParams(LayoutParams.MATCH_PARENT,
				LayoutParams.MATCH_PARENT);
		ll.setLayoutParams(layoutParams);
		ll.setBackgroundColor(Color.LTGRAY);
		ll.setOrientation(LinearLayout.VERTICAL);
		

		// 顶部蓝色部分 {--------------------------------------
		LinearLayout fl_top = new LinearLayout(this);
		LinearLayout.LayoutParams fl_Top_Params = new LinearLayout.LayoutParams(
				LinearLayout.LayoutParams.MATCH_PARENT,
				70);
		fl_top.setBackgroundColor(Color.BLUE);
		fl_top.setLayoutParams(fl_Top_Params);
		fl_top.setGravity(Gravity.CENTER);//内部控件居中对齐
		fl_top.setOrientation(LinearLayout.HORIZONTAL);
		ll.addView(fl_top);
		

		
		//动态文字
		TextView et1 = new TextView(this);
		 et1.setText("动态");
		 et1.setTextColor(Color.WHITE);
		 et1.setTextSize(16.0f);
		 LinearLayout.LayoutParams et_lp1 = new LinearLayout.LayoutParams(
		 0,
		 LinearLayout.LayoutParams.WRAP_CONTENT);
		 et_lp1.weight = 1;
		 et1.setLayoutParams(et_lp1);
		 et1.setGravity(Gravity.CENTER);
		 fl_top.addView(et1);
		 
		 //更多文字
		 TextView et2 = new TextView(this);
		 et2.setText("更多");
		 et2.setTextColor(Color.WHITE);
		 et2.setTextSize(16.0f);
		 LinearLayout.LayoutParams et_lp2 = new LinearLayout.LayoutParams(
				 LinearLayout.LayoutParams.WRAP_CONTENT,
				 LinearLayout.LayoutParams.WRAP_CONTENT);
		 et_lp2.weight = 0;
		 et_lp2.setMargins(0, 0, 10, 0);
		 et2.setLayoutParams(et_lp2);
		 
		 fl_top.addView(et2);
		// 顶部蓝色部分 --------------------------------------}
			
				LinearLayout ll_main_top2 = new LinearLayout(this);
				LinearLayout.LayoutParams ll_main_top_Params2 = new LinearLayout.LayoutParams(
						LinearLayout.LayoutParams.MATCH_PARENT,
						LinearLayout.LayoutParams.WRAP_CONTENT);
				ll_main_top_Params2.setMargins(5, 5, 5, 5);
				ll_main_top2.setBackgroundColor(Color.WHITE);
				ll_main_top2.setLayoutParams(ll_main_top_Params2);
				ll_main_top2.setGravity(Gravity.CENTER);//内部控件居中对齐
				ll_main_top2.setOrientation(LinearLayout.HORIZONTAL);
				ll.addView(ll_main_top2);
				
				//水平放置1个ImageView
				ImageView iv_top2 = new ImageView(this);
				LinearLayout.LayoutParams iv_top2_params = new LinearLayout.LayoutParams(
						LinearLayout.LayoutParams.WRAP_CONTENT,
						LinearLayout.LayoutParams.WRAP_CONTENT);
				iv_top2.setLayoutParams(iv_top2_params);	
				iv_top2.setImageResource(R.drawable.kff);
				iv_top2.setPadding(0, 5, 0, 5);
				ll_main_top2.addView(iv_top2);
				
				//水平放置1个ImageView
				TextView tv_top2 = new TextView(this);
				LinearLayout.LayoutParams tv_top2_params = new LinearLayout.LayoutParams(
						LinearLayout.LayoutParams.WRAP_CONTENT,
						LinearLayout.LayoutParams.WRAP_CONTENT);
				tv_top2.setLayoutParams(tv_top2_params);	
				tv_top2.setText("自拍");
				tv_top2.setTextColor(Color.LTGRAY);
				ll_main_top2.addView(tv_top2);
			
			
			//----------
			LinearLayout ll_main_2 = new LinearLayout(this);
			LinearLayout.LayoutParams ll_main_2_Params = new LinearLayout.LayoutParams(
					LinearLayout.LayoutParams.MATCH_PARENT,
					60);
			ll_main_2.setBackgroundColor(Color.WHITE);
			ll_main_2.setLayoutParams(ll_main_2_Params);
			ll_main_2.setGravity(Gravity.CENTER);//内部控件居中对齐
			ll_main_2.setOrientation(LinearLayout.HORIZONTAL);
			ll.addView(ll_main_2);
			
			//水平放置3个ImageView
			ImageView iv_l = new ImageView(this);
			LinearLayout.LayoutParams iv1_params = new LinearLayout.LayoutParams(
					0,
					LinearLayout.LayoutParams.WRAP_CONTENT);
			iv1_params.weight=1;
			iv_l.setLayoutParams(iv1_params);	
			iv_l.setImageResource(R.drawable.igs);
			iv_l.setScaleType(ScaleType.CENTER_INSIDE);
			ll_main_2.addView(iv_l);
			
			ImageView iv_m = new ImageView(this);
			LinearLayout.LayoutParams ivm_params = new LinearLayout.LayoutParams(
					0,
					LinearLayout.LayoutParams.WRAP_CONTENT);
			ivm_params.weight=1;
			iv_m.setLayoutParams(ivm_params);	
			iv_m.setImageResource(R.drawable.eqc);
			iv_m.setScaleType(ScaleType.CENTER_INSIDE);
			ll_main_2.addView(iv_m);
			
			ImageView iv_r = new ImageView(this);
			LinearLayout.LayoutParams ivr_params = new LinearLayout.LayoutParams(
					0,
					LinearLayout.LayoutParams.WRAP_CONTENT);
			ivr_params.weight=1;
			iv_r.setLayoutParams(ivr_params);	
			iv_r.setImageResource(R.drawable.iei);
			iv_r.setScaleType(ScaleType.CENTER_INSIDE);
			ll_main_2.addView(iv_r);
			
			//----------
			LinearLayout ll_main_22 = new LinearLayout(this);
			LinearLayout.LayoutParams ll_main_22_Params = new LinearLayout.LayoutParams(
					LinearLayout.LayoutParams.MATCH_PARENT,
					LinearLayout.LayoutParams.WRAP_CONTENT);
			ll_main_22.setBackgroundColor(Color.WHITE);
			ll_main_22.setLayoutParams(ll_main_22_Params);
			ll_main_22.setGravity(Gravity.CENTER);//内部控件居中对齐
			ll_main_22.setOrientation(LinearLayout.HORIZONTAL);
			ll.addView(ll_main_22);
			
			//水平放置3个TextView
			TextView tv_l = new TextView(this);
			LinearLayout.LayoutParams tv1_params = new LinearLayout.LayoutParams(
					0,
					LinearLayout.LayoutParams.WRAP_CONTENT);
			tv1_params.weight=1;
			tv_l.setLayoutParams(tv1_params);
			tv_l.setText("好友动态");
			tv_l.setGravity(Gravity.CENTER|Gravity.TOP);
			ll_main_22.addView(tv_l);
			
			TextView tv_m = new TextView(this);
			LinearLayout.LayoutParams tvm_params = new LinearLayout.LayoutParams(
					0,
					LinearLayout.LayoutParams.WRAP_CONTENT);
			tvm_params.weight=1;
			tv_m.setLayoutParams(tvm_params);
			tv_m.setText("附近");
			tv_m.setGravity(Gravity.CENTER|Gravity.TOP);
			ll_main_22.addView(tv_m);
			
			TextView tv_r = new TextView(this);
			LinearLayout.LayoutParams tvr_params = new LinearLayout.LayoutParams(
					0,
					LinearLayout.LayoutParams.WRAP_CONTENT);
			tvr_params.weight=1;
			tv_r.setLayoutParams(tvr_params);	
			tv_r.setText("兴趣部落");
			tv_r.setGravity(Gravity.CENTER|Gravity.TOP);
			ll_main_22.addView(tv_r);
			
			//第1组
			//第1条-------------
			LinearLayout ll_main11 = new LinearLayout(this);
			LinearLayout.LayoutParams ll_main11_Params = new LinearLayout.LayoutParams(
					LinearLayout.LayoutParams.MATCH_PARENT,
					60);
			ll_main11_Params.setMargins(0, 20, 0, 0);
			ll_main11.setLayoutParams(ll_main11_Params);
			ll_main11.setBackgroundColor(Color.WHITE);
			ll_main11.setGravity(Gravity.LEFT|Gravity.CENTER_VERTICAL);//内部控件左对齐
			ll_main11.setOrientation(LinearLayout.HORIZONTAL);
			ll.addView(ll_main11);
			
				//水平放置ImageView
				ImageView iv11_l = new ImageView(this);
				LinearLayout.LayoutParams iv11_1_params = new LinearLayout.LayoutParams(
						40,40);
				iv11_1_params.setMargins(3, 8, 12, 8);
				iv11_l.setLayoutParams(iv11_1_params);	
				iv11_l.setImageResource(R.drawable.jyx);
				iv11_l.setScaleType(ScaleType.CENTER_INSIDE);
				ll_main11.addView(iv11_l);
				
				//水平放置TextView
				TextView tv11_1 = new TextView(this);
				LinearLayout.LayoutParams tv11_1_params = new LinearLayout.LayoutParams(
						0,
						LinearLayout.LayoutParams.WRAP_CONTENT);
				tv11_1_params.weight=1;
				tv11_1.setLayoutParams(tv11_1_params);	
				tv11_1.setText("游戏");
				tv11_1.setGravity(Gravity.LEFT|Gravity.CENTER_VERTICAL);
				ll_main11.addView(tv11_1);
		 
				//水平放置ImageView
				ImageView iv11_2 = new ImageView(this);
				LinearLayout.LayoutParams iv11_2_params = new LinearLayout.LayoutParams(
						40,40);
				iv11_2_params.setMargins(3, 8, 0, 8);
				iv11_2_params.weight=0;
				iv11_2.setLayoutParams(iv11_2_params);	
				iv11_2.setImageResource(R.drawable.jvh);
				iv11_2.setScaleType(ScaleType.CENTER_INSIDE);
				ll_main11.addView(iv11_2);
				
				
				//第2条-------------
				LinearLayout ll_main12 = new LinearLayout(this);
				LinearLayout.LayoutParams ll_main12_Params = new LinearLayout.LayoutParams(
						LinearLayout.LayoutParams.MATCH_PARENT,
						60);
				ll_main12_Params.setMargins(0, 1, 0, 0);
				ll_main12.setLayoutParams(ll_main12_Params);
				ll_main12.setBackgroundColor(Color.WHITE);
				ll_main12.setGravity(Gravity.LEFT|Gravity.CENTER_VERTICAL);//内部控件左对齐
				ll_main12.setOrientation(LinearLayout.HORIZONTAL);
				ll.addView(ll_main12);
				
				//水平放置ImageView
				ImageView iv12_l = new ImageView(this);
				LinearLayout.LayoutParams iv12_1_params = new LinearLayout.LayoutParams(
						40,40);
				iv12_1_params.setMargins(3, 8, 12, 8);
				iv12_l.setLayoutParams(iv12_1_params);	
				iv12_l.setImageResource(R.drawable.hlj);
				iv12_l.setScaleType(ScaleType.CENTER_INSIDE);
				ll_main12.addView(iv12_l);
				
				//水平放置TextView
				TextView tv12_1 = new TextView(this);
				LinearLayout.LayoutParams tv12_1_params = new LinearLayout.LayoutParams(
						0,
						LinearLayout.LayoutParams.WRAP_CONTENT);
				tv12_1_params.weight=1;
				tv12_1.setLayoutParams(tv12_1_params);	
				tv12_1.setText("购物");
				tv12_1.setGravity(Gravity.LEFT|Gravity.CENTER_VERTICAL);
				ll_main12.addView(tv12_1);
				
				//水平放置ImageView
				ImageView iv12_2 = new ImageView(this);
				LinearLayout.LayoutParams iv12_2_params = new LinearLayout.LayoutParams(
						40,40);
				iv12_2_params.setMargins(3, 8, 0, 8);
				iv12_2_params.weight=0;
				iv12_2.setLayoutParams(iv12_2_params);	
				iv12_2.setImageResource(R.drawable.jvh);
				iv12_2.setScaleType(ScaleType.CENTER_INSIDE);
				ll_main12.addView(iv12_2);
				
				
				//第3条-------------
				LinearLayout ll_main13 = new LinearLayout(this);
				LinearLayout.LayoutParams ll_main13_Params = new LinearLayout.LayoutParams(
						LinearLayout.LayoutParams.MATCH_PARENT,
						60);
				ll_main13_Params.setMargins(0, 1, 0, 0);
				ll_main13.setLayoutParams(ll_main13_Params);
				ll_main13.setBackgroundColor(Color.WHITE);
				ll_main13.setGravity(Gravity.LEFT|Gravity.CENTER_VERTICAL);//内部控件左对齐
				ll_main13.setOrientation(LinearLayout.HORIZONTAL);
				ll.addView(ll_main13);
				
				//水平放置ImageView
				ImageView iv13_l = new ImageView(this);
				LinearLayout.LayoutParams iv13_1_params = new LinearLayout.LayoutParams(
						40,40);
				iv13_1_params.setMargins(3, 8, 12, 8);
				iv13_l.setLayoutParams(iv13_1_params);	
				iv13_l.setImageResource(R.drawable.kwr);
				iv13_l.setScaleType(ScaleType.CENTER_INSIDE);
				ll_main13.addView(iv13_l);
				
				//水平放置TextView
				TextView tv13_1 = new TextView(this);
				LinearLayout.LayoutParams tv13_1_params = new LinearLayout.LayoutParams(
						0,
						LinearLayout.LayoutParams.WRAP_CONTENT);
				tv13_1_params.weight=1;
				tv13_1.setLayoutParams(tv13_1_params);	
				tv13_1.setText("应用宝");
				tv13_1.setGravity(Gravity.LEFT|Gravity.CENTER_VERTICAL);
				ll_main13.addView(tv13_1);
				
				//水平放置ImageView
				ImageView iv13_2 = new ImageView(this);
				LinearLayout.LayoutParams iv13_2_params = new LinearLayout.LayoutParams(
						40,40);
				iv13_2_params.setMargins(3, 8, 0, 8);
				iv13_2_params.weight=0;
				iv13_2.setLayoutParams(iv13_2_params);	
				iv13_2.setImageResource(R.drawable.jvh);
				iv13_2.setScaleType(ScaleType.CENTER_INSIDE);
				ll_main13.addView(iv13_2);
				
				
				
				//第2组
				//第1条-------------
				LinearLayout ll_main21 = new LinearLayout(this);
				LinearLayout.LayoutParams ll_main21_Params = new LinearLayout.LayoutParams(
						LinearLayout.LayoutParams.MATCH_PARENT,
						60);
				ll_main21_Params.setMargins(0, 20, 0, 0);
				ll_main21.setLayoutParams(ll_main21_Params);
				ll_main21.setBackgroundColor(Color.WHITE);
				ll_main21.setGravity(Gravity.LEFT|Gravity.CENTER_VERTICAL);//内部控件左对齐
				ll_main21.setOrientation(LinearLayout.HORIZONTAL);
				ll.addView(ll_main21);
				
				//水平放置ImageView
				ImageView iv21_l = new ImageView(this);
				LinearLayout.LayoutParams iv21_1_params = new LinearLayout.LayoutParams(
						40,40);
				iv21_1_params.setMargins(3, 8, 12, 8);
				iv21_l.setLayoutParams(iv21_1_params);	
				iv21_l.setImageResource(R.drawable.fnj);
				iv21_l.setScaleType(ScaleType.CENTER_INSIDE);
				ll_main21.addView(iv21_l);
				
				//水平放置TextView
				TextView tv21_1 = new TextView(this);
				LinearLayout.LayoutParams tv21_1_params = new LinearLayout.LayoutParams(
						0,
						LinearLayout.LayoutParams.WRAP_CONTENT);
				tv21_1_params.weight=1;
				tv21_1.setLayoutParams(tv21_1_params);	
				tv21_1.setText("附近的群");
				tv21_1.setGravity(Gravity.LEFT|Gravity.CENTER_VERTICAL);
				ll_main21.addView(tv21_1);
				
				//水平放置ImageView
				ImageView iv21_2 = new ImageView(this);
				LinearLayout.LayoutParams iv21_2_params = new LinearLayout.LayoutParams(
						40,40);
				iv21_2_params.setMargins(3, 8, 0, 8);
				iv21_2_params.weight=0;
				iv21_2.setLayoutParams(iv21_2_params);	
				iv21_2.setImageResource(R.drawable.jvh);
				iv21_2.setScaleType(ScaleType.CENTER_INSIDE);
				ll_main21.addView(iv21_2);
				
				
				//第2条-------------
				LinearLayout ll_main22 = new LinearLayout(this);
				LinearLayout.LayoutParams ll_main22_Params = new LinearLayout.LayoutParams(
						LinearLayout.LayoutParams.MATCH_PARENT,
						60);
				ll_main22_Params.setMargins(0, 1, 0, 0);
				ll_main22.setLayoutParams(ll_main22_Params);
				ll_main22.setBackgroundColor(Color.WHITE);
				ll_main22.setGravity(Gravity.LEFT|Gravity.CENTER_VERTICAL);//内部控件左对齐
				ll_main22.setOrientation(LinearLayout.HORIZONTAL);
				ll.addView(ll_main22);
				
				//水平放置ImageView
				ImageView iv22_l = new ImageView(this);
				LinearLayout.LayoutParams iv22_1_params = new LinearLayout.LayoutParams(
						40,40);
				iv22_1_params.setMargins(3, 8, 12, 8);
				iv22_l.setLayoutParams(iv22_1_params);	
				iv22_l.setImageResource(R.drawable.kty);
				iv22_l.setScaleType(ScaleType.CENTER_INSIDE);
				ll_main22.addView(iv22_l);
				
				//水平放置TextView
				TextView tv22_1 = new TextView(this);
				LinearLayout.LayoutParams tv22_1_params = new LinearLayout.LayoutParams(
						0,
						LinearLayout.LayoutParams.WRAP_CONTENT);
				tv22_1_params.weight=1;
				tv22_1.setLayoutParams(tv22_1_params);	
				tv22_1.setText("吃喝玩乐");
				tv22_1.setGravity(Gravity.LEFT|Gravity.CENTER_VERTICAL);
				ll_main22.addView(tv22_1);
				
				//水平放置ImageView
				ImageView iv22_2 = new ImageView(this);
				LinearLayout.LayoutParams iv22_2_params = new LinearLayout.LayoutParams(
						40,40);
				iv22_2_params.setMargins(3, 8, 0, 8);
				iv22_2_params.weight=0;
				iv22_2.setLayoutParams(iv22_2_params);	
				iv22_2.setImageResource(R.drawable.jvh);
				iv22_2.setScaleType(ScaleType.CENTER_INSIDE);
				ll_main22.addView(iv22_2);
				
				
				//第3条-------------
				LinearLayout ll_main33 = new LinearLayout(this);
				LinearLayout.LayoutParams ll_main33_Params = new LinearLayout.LayoutParams(
						LinearLayout.LayoutParams.MATCH_PARENT,
						60);
				ll_main33_Params.setMargins(0, 1, 0, 0);
				ll_main33.setLayoutParams(ll_main33_Params);
				ll_main33.setBackgroundColor(Color.WHITE);
				ll_main33.setGravity(Gravity.LEFT|Gravity.CENTER_VERTICAL);//内部控件左对齐
				ll_main33.setOrientation(LinearLayout.HORIZONTAL);
				ll.addView(ll_main33);
				
				//水平放置ImageView
				ImageView iv33_l = new ImageView(this);
				LinearLayout.LayoutParams iv33_1_params = new LinearLayout.LayoutParams(
						40,40);
				iv33_1_params.setMargins(3, 8, 12, 8);
				iv33_l.setLayoutParams(iv33_1_params);	
				iv33_l.setImageResource(R.drawable.ic_launcher);
				iv33_l.setScaleType(ScaleType.CENTER_INSIDE);
				ll_main33.addView(iv33_l);
				
				//水平放置TextView
				TextView tv33_1 = new TextView(this);
				LinearLayout.LayoutParams tv33_1_params = new LinearLayout.LayoutParams(
						0,
						LinearLayout.LayoutParams.WRAP_CONTENT);
				tv33_1_params.weight=1;
				tv33_1.setLayoutParams(tv33_1_params);	
				tv33_1.setText("同城服务");
				tv33_1.setGravity(Gravity.LEFT|Gravity.CENTER_VERTICAL);
				ll_main33.addView(tv33_1);
				
				//水平放置ImageView
				ImageView iv33_2 = new ImageView(this);
				LinearLayout.LayoutParams iv33_2_params = new LinearLayout.LayoutParams(
						40,40);
				iv33_2_params.setMargins(3, 8, 0, 8);
				iv33_2_params.weight=0;
				iv33_2.setLayoutParams(iv33_2_params);	
				iv33_2.setImageResource(R.drawable.jvh);
				iv33_2.setScaleType(ScaleType.CENTER_INSIDE);
				ll_main33.addView(iv33_2);
				
				
				//底部----------
				LinearLayout ll_main_00 = new LinearLayout(this);
				LinearLayout.LayoutParams ll_main_00_Params = new LinearLayout.LayoutParams(
						LinearLayout.LayoutParams.MATCH_PARENT,
						60);
				ll_main_00_Params.setMargins(0, 1, 0, 0);
				ll_main_00.setLayoutParams(ll_main_00_Params);
				ll_main_00.setGravity(Gravity.CENTER);//内部控件居中对齐
				ll_main_00.setBackgroundColor(Color.WHITE);
				ll_main_00.setOrientation(LinearLayout.HORIZONTAL);
				ll.addView(ll_main_00);
				
				//水平放置3个ImageView
				ImageView iv_00 = new ImageView(this);
				LinearLayout.LayoutParams iv00_params = new LinearLayout.LayoutParams(
						0,
						LinearLayout.LayoutParams.WRAP_CONTENT);
				iv00_params.weight=1;
				iv_00.setLayoutParams(iv00_params);	
				iv_00.setImageResource(R.drawable.lmb);
				iv_00.setScaleType(ScaleType.CENTER_INSIDE);
				ll_main_00.addView(iv_00);
				
				ImageView iv_01 = new ImageView(this);
				LinearLayout.LayoutParams iv01_params = new LinearLayout.LayoutParams(
						0,
						LinearLayout.LayoutParams.WRAP_CONTENT);
				iv01_params.weight=1;
				iv_01.setLayoutParams(iv01_params);	
				iv_01.setImageResource(R.drawable.iel);
				iv_01.setScaleType(ScaleType.CENTER_INSIDE);
				ll_main_00.addView(iv_01);
				
				ImageView iv_02 = new ImageView(this);
				LinearLayout.LayoutParams iv02_params = new LinearLayout.LayoutParams(
						0,
						LinearLayout.LayoutParams.WRAP_CONTENT);
				iv02_params.weight=1;
				iv_02.setLayoutParams(iv02_params);	
				iv_02.setImageResource(R.drawable.kfx);
				iv_02.setScaleType(ScaleType.CENTER_INSIDE);
				ll_main_00.addView(iv_02);
				
				//----------
				LinearLayout ll_main_001 = new LinearLayout(this);
				LinearLayout.LayoutParams ll_main_001_Params = new LinearLayout.LayoutParams(
						LinearLayout.LayoutParams.MATCH_PARENT,
						LinearLayout.LayoutParams.WRAP_CONTENT);
				ll_main_001.setBackgroundColor(Color.WHITE);
				ll_main_001.setLayoutParams(ll_main_001_Params);
				ll_main_001.setGravity(Gravity.CENTER);//内部控件居中对齐
				ll_main_001.setOrientation(LinearLayout.HORIZONTAL);
				ll.addView(ll_main_001);
				
				//水平放置3个TextView
				TextView tv_000 = new TextView(this);
				LinearLayout.LayoutParams tv000_params = new LinearLayout.LayoutParams(
						0,
						LinearLayout.LayoutParams.WRAP_CONTENT);
				tv000_params.weight=1;
				tv_000.setLayoutParams(tv000_params);
				tv_000.setText("消息");
				tv_000.setGravity(Gravity.CENTER|Gravity.TOP);
				ll_main_001.addView(tv_000);
				
				TextView tv_001 = new TextView(this);
				LinearLayout.LayoutParams tv001_params = new LinearLayout.LayoutParams(
						0,
						LinearLayout.LayoutParams.WRAP_CONTENT);
				tv001_params.weight=1;
				tv_001.setLayoutParams(tv001_params);
				tv_001.setText("联系人");
				tv_001.setGravity(Gravity.CENTER|Gravity.TOP);
				ll_main_001.addView(tv_001);
				
				TextView tv_002 = new TextView(this);
				LinearLayout.LayoutParams tv002_params = new LinearLayout.LayoutParams(
						0,
						LinearLayout.LayoutParams.WRAP_CONTENT);
				tv002_params.weight=1;
				tv_002.setLayoutParams(tv002_params);	
				tv_002.setText("动态");
				tv_002.setGravity(Gravity.CENTER|Gravity.TOP);
				ll_main_001.addView(tv_002);
				
		// 显示布局
		setContentView(ll);

	}
}
