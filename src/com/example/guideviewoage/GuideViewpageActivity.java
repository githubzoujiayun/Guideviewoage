package com.example.guideviewoage;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.app.ActionBar;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.os.Build;

public class GuideViewpageActivity extends FragmentActivity {
	private ViewPager viewPager;
	String[] guides;
	List<fragment> fragements;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		viewPager = new ViewPager(this);
		viewPager.setId(R.id.viewpager);
		setContentView(viewPager);
		guides = new String[] { "This is A page", "This is B page",
				"This is C page", "This is D page", "This is E page" };
		// fragement[] fragments=new Fragment(){fragement.getNewInstance(str)};
		fragements = new ArrayList<fragment>();
		for (int i = 0; i < guides.length; i++) {

			System.out.println(i + " has build");
			fragements.add(new fragment(guides[i]));
		}
		FragmentManager fm = getSupportFragmentManager();
		viewPager.setAdapter(new FragmentStatePagerAdapter(fm) {

			@Override
			public int getCount() {
				// TODO Auto-generated method stub
				return fragements.size();
			}

			@Override
			public Fragment getItem(int arg0) {
				// TODO Auto-generated method stub
				System.out.println("pageid-->" + arg0);

				return fragements.get(arg0);
			}
		});
		// viewPager.setCurrentItem(0);
	}
}
