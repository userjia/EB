package com.wms.activity;

import com.wms.fragment.ItemListFragment;
import com.wms.entity.*;

import android.app.Fragment;

public class MainActivity extends SingleFragmentActivity{
	@Override
	protected Fragment createFragment(){
		return new ItemListFragment<Task>();
	}
}
