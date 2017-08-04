package com.wms.activity;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;

//使用此抽象类可以复用使用单个fragment的activity创建fragment的代码
public abstract class SingleFragmentActivity extends Activity {//can't import appcompatactivity?fragmentactivity?
	//实现此方法实现生成不同的fragment
	protected abstract Fragment createFragment();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_single_activity);
		FragmentManager fm = getFragmentManager();
		Fragment fragment=fm.findFragmentById(R.id.fragment_container);
		if(fragment==null){
			fragment=createFragment();
			fm.beginTransaction().add(R.id.fragment_container,fragment).commit();
		}
	}
}
