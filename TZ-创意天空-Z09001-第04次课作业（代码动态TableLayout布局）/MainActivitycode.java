package tzvip.lsn04_1_layout;

import android.R.color;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class MainActivity extends Activity {
	// Color[] colors =new color();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// setContentView(R.layout.activity_relativelayout_custom);
		/**
		 * 动态生成表格布局
		 */

		TableLayout tl = new TableLayout(this);
		TableLayout.LayoutParams tl_params = new TableLayout.LayoutParams(
				TableLayout.LayoutParams.MATCH_PARENT,
				TableLayout.LayoutParams.MATCH_PARENT);
		tl.setLayoutParams(tl_params);
		tl.setBackgroundColor(Color.BLACK);
		tl.setOrientation(TableLayout.HORIZONTAL);
		tl.setGravity(Gravity.TOP);

		TableRow tr;
		TextView tv;
		ViewGroup.LayoutParams tv_params;

		for (int i = 0; i < 5; i++) {
			tr = new TableRow(MainActivity.this);
			// 注意：TableRow是一个标签，不能添加控件
			TableLayout.LayoutParams tr_params = new TableLayout.LayoutParams(
					TableLayout.LayoutParams.WRAP_CONTENT,
					TableLayout.LayoutParams.WRAP_CONTENT);

			tr.setBackgroundColor(Color.WHITE);
			tr.setOrientation(TableLayout.HORIZONTAL);
			tr.setGravity(Gravity.TOP|Gravity.CENTER_HORIZONTAL);
			tr.setPadding(1, 1, 1, 1);

			for (int j = 0; j < 3; j++) {

				// if (i>2){
				// tr_params.weight=0;
				// tr.setLayoutParams(tr_params);
				// }else{
				// tr_params.weight=1;
				// tr.setLayoutParams(tr_params);
				// }
				tv = new TextView(this);
				TableLayout.LayoutParams tv_param = new TableLayout.LayoutParams(
						TableLayout.LayoutParams.WRAP_CONTENT,
						TableLayout.LayoutParams.WRAP_CONTENT);
				tv.setText("第" + (i + 1) + "行第" + (j + 1) + "列");
				tv.setTextColor(Color.BLACK);

				switch (j) {
				case 0:
					tv.setBackgroundColor(Color.RED);
					break;
				case 1:
					tv.setBackgroundColor(Color.GREEN);
					break;
				case 2:
					tv.setBackgroundColor(Color.BLUE);
					break;
				}
				tv.setPadding(15, 10, 15, 10);
				tv.setTextSize(16.0f);
				tv.setGravity(Gravity.CENTER);
				tr.addView(tv);

			}
			tl.addView(tr);
		}

		// 加载显示布局
		super.setContentView(tl);

	}
}
