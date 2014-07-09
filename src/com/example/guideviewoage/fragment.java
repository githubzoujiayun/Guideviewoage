package com.example.guideviewoage;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

@SuppressLint("ValidFragment")
public class fragment extends Fragment {

	private  String page = "";
	TextView textView;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	}



	public fragment() {
		// TODO Auto-generated constructor stub
	}

	public fragment(String guideString) {
		// TODO Auto-generated constructor stub
		page = guideString;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		System.out.println("str->" + page);
		View rootview = inflater.inflate(R.layout.fragement, null);
		textView = (TextView) rootview.findViewById(R.id.guidea);
		textView.setText(page);
		return rootview;
	}
}
