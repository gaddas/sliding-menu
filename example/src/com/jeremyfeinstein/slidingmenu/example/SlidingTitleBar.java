package com.jeremyfeinstein.slidingmenu.example;

import android.os.Bundle;

public class SlidingTitleBar extends BaseActivity {

	public SlidingTitleBar() {
		super(R.string.title_bar_slide);
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// set the Above View
		setContentView(R.layout.content_frame);
		getSupportFragmentManager()
		.beginTransaction()
		.replace(R.id.content_frame, new SampleListFragment())
		.commit();
		
		setSlidingActionBarEnabled(true);
	}
	
}
