package com.tzvip.example.lsn05_ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.AutoCompleteTextView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

public class AutoActivity extends Activity {

	private int[] icons = { R.drawable.face1, R.drawable.face2,
			R.drawable.face3, R.drawable.face4, R.drawable.face5,
			R.drawable.face6, R.drawable.face7, R.drawable.face8, };
	private AutoCompleteTextView actv;

	private ListView lv;

	private GridView gv;
	private SimpleAdapter adapter;
	protected Map map;
	private ArrayList<Map<String, Object>> data;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		gv = (GridView) findViewById(R.id.gv);

		data = new ArrayList<Map<String, Object>>();

		for (int i = 0; i < 8; i++) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("icon", icons[i]);
			map.put("name", "刘德华" + i);
			map.put("phone", "1888888" + i);
			data.add(map);
		}

		adapter = new SimpleAdapter(this, data, R.layout.itemlayout,
				new String[] { "icon", "name", "phone" }, new int[] { R.id.iv,
						R.id.tv_name, R.id.tv_tel });

		gv.setAdapter(adapter);

		gv.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// 点击有提示
				map = (Map) adapter.getItem(position);

				Toast.makeText(AutoActivity.this,
						"按下了 " + map.get("name").toString(), 1000).show();
			}
		});

		gv.setOnItemLongClickListener(new OnItemLongClickListener() {
			private int pos_delete;

			@Override
			public boolean onItemLongClick(AdapterView<?> parent, View view,
					int position, long id) {
				pos_delete = position;

				// 长按删除条目
				AlertDialog.Builder builder = new AlertDialog.Builder(
						AutoActivity.this);
				builder.setTitle("删除这个条目");
				builder.setPositiveButton("确定", new OnClickListener() {
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// 删除条目
						data.remove(pos_delete);
						adapter.notifyDataSetChanged();
						Toast.makeText(AutoActivity.this, "第"+(pos_delete+1) + "个删除成功！",
								1000).show();
					}
				}).setNegativeButton("取消", new OnClickListener() {
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// 取消删除
					}
				}).show();

				return false;
			}
		});
	}

}
