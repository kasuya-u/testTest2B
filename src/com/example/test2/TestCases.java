package com.example.test2;

import com.example.test2.MainActivity;
import android.test.ActivityInstrumentationTestCase2;

import android.app.Activity;




public class TestCases extends ActivityInstrumentationTestCase2<MainActivity> {

	private Activity    mActivity;


	public TestCases(String pkg, Class<MainActivity> activityClass) {
		super(pkg, activityClass);
		// TODO Auto-generated constructor stub
	}
	
	public TestCases(){
		super("com.example.test2", MainActivity.class);

	}
	
	@Override
	protected void setUp() throws Exception {
	    // TODO Auto-generated method stub
	    super.setUp();

	    //アクティビティを取得する
	    mActivity = getActivity();

	} 
	
	public void testInitEditText() {
	    assertTrue(((MainActivity) mActivity).add(-1,1) == 0);
	} 


}
