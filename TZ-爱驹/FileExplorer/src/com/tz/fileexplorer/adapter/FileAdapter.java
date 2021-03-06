package com.tz.fileexplorer.adapter;

import java.util.List;

import com.tz.fileexplorer.R;
import com.tz.fileexplorer.bean.MyFile;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class FileAdapter extends BaseAdapter {

	private Context context;
	private List<MyFile> list;
	private LayoutInflater inflater;
	private ViewHolder holder;

	public FileAdapter(Context context, List<MyFile> list) {
		this.context = context;
		this.list = list;
		inflater = LayoutInflater.from(context);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return list.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		holder = new ViewHolder();
		MyFile mFile = list.get(position);
		if (convertView == null) {
			convertView = inflater.inflate(R.layout.listview_item, null);
			convertView.setTag(holder);
			holder.tv = (TextView) convertView.findViewById(R.id.tv_name);
			holder.iv = (ImageView) convertView.findViewById(R.id.iv_icon);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}
		holder.tv.setText(mFile.getName());
		holder.iv.setImageBitmap(mFile.getIcon());
		return convertView;
	}

	class ViewHolder {
		ImageView iv;
		TextView tv;
	}
	
	class LoadFileTask extends AsyncTask<String, Void, Void>{

		@Override
		protected Void doInBackground(String... params) {
			String path = params[0];
			String iconPosition = params[1];
			try {
				Bitmap icon = BitmapFactory.decodeFile(path);
				list.get(Integer.parseInt(iconPosition)).setIcon(icon);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return null;
		}

		@Override
		protected void onPostExecute(Void result) {
			super.onPostExecute(result);
			notifyDataSetChanged();
		}
	}
}
