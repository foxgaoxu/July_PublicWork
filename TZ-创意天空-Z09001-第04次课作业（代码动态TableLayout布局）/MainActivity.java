package tzvip.lsn04_1_layout;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.TableRow.LayoutParams;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_relativelayout_custom);
		/**
		 * 动态生成表格布局
		 */
		
		TableLayout tl = new TableLayout(this);
		TableLayout.LayoutParams tl_params = new TableLayout.LayoutParams(
				TableLayout.LayoutParams.WRAP_CONTENT,
				TableLayout.LayoutParams.WRAP_CONTENT);
		tl.setLayoutParams(tl_params);
		//tl.setBackgroundColor(Color.BLUE);
		TableRow tr=null;
		TextView tv =null;
		
		for (int i=0;i<4;i++){
			tr = new TableRow(this);
			TableRow.LayoutParams tr_params = new TableRow.LayoutParams(
					TableRow.LayoutParams.WRAP_CONTENT,
					TableRow.LayoutParams.WRAP_CONTENT);
			tr.setBackgroundColor(Color.RED);
			tr.setLayoutParams(tr_params);
			
			for (int j=0;j<1; j++){
				
				tv = new TextView(this);
				 tv.setText("第"+i+"行"+j+"列");
				 tv.setTextColor(Color.BLACK);
				 tv.setTextSize(16.0f);
				 tv.setBackgroundColor(Color.MAGENTA);
				 TableLayout.LayoutParams tv_params = new TableLayout.LayoutParams(
						 TableLayout.LayoutParams.WRAP_CONTENT,
						 TableLayout.LayoutParams.WRAP_CONTENT);
				 tv.setLayoutParams(tv_params);
				 tr.addView(tv);
				
			}
			tl.addView(tr);
		}
		
		
		//加载显示布局 
		 setContentView(tl);
		
	}

}
