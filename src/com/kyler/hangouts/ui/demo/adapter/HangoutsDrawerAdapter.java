package com.kyler.hangouts.ui.demo.adapter;

import java.util.ArrayList;

import com.kyler.hangouts.ui.demo.R;
import com.kyler.hangouts.ui.demo.ui.Icons;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class HangoutsDrawerAdapter extends BaseAdapter {

	private Context context;
	private ArrayList<Icons> navDrawerItems;

	public HangoutsDrawerAdapter(Context context, ArrayList<Icons> navDrawerItems) {
		this.context = context;
		this.navDrawerItems = navDrawerItems;
	}

	@Override
	public int getCount() {
		return navDrawerItems.size();
	}

	@Override
	public Object getItem(int position) {
		return navDrawerItems.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@SuppressLint("InflateParams")
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		if (convertView == null) {
			LayoutInflater mInflater = (LayoutInflater) context
					.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
			convertView = mInflater.inflate(R.layout.hangouts_drawer_adapter, null);
		}

		ImageView imgIcon = (ImageView) convertView
				.findViewById(R.id.iconPicture);
		TextView txtTitle = (TextView) convertView.findViewById(R.id.MDText);

		imgIcon.setImageResource(navDrawerItems.get(position).getIcon());
		txtTitle.setText(navDrawerItems.get(position).getTitle());



		return convertView;
	}

}
