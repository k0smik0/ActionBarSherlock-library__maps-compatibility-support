package com.actionbarsherlock.app;

import com.actionbarsherlock.ActionBarSherlock.OnCreateOptionsMenuListener;
import com.actionbarsherlock.ActionBarSherlock.OnCreatePanelMenuListener;
import com.actionbarsherlock.ActionBarSherlock.OnMenuItemSelectedListener;
import com.actionbarsherlock.ActionBarSherlock.OnOptionsItemSelectedListener;
import com.actionbarsherlock.ActionBarSherlock.OnPrepareOptionsMenuListener;
import com.actionbarsherlock.ActionBarSherlock.OnPreparePanelListener;
import com.actionbarsherlock.app.SherlockSupports.ActivitySupport.SherlockSupportActionMode;

public abstract class SherlockListeners {
	
	public interface SherlockListenerMenu extends
		OnCreateOptionsMenuListener, 
		OnPrepareOptionsMenuListener,
		OnMenuItemSelectedListener,
		OnOptionsItemSelectedListener {}
	
	public interface SherlockListenerPanel extends
		OnCreatePanelMenuListener, 
		OnPreparePanelListener{}
	
	public interface SherlockListenerActivity extends 
		SherlockListenerPanel,
		SherlockListenerMenu,
		SherlockSupportActionMode {}	
	
	public interface SherlockListenerFragment extends 
		SherlockSupports.FragmentSupport.OnCreateOptionsMenuListener, 
		SherlockSupports.FragmentSupport.OnOptionsItemSelectedListener, 
		SherlockSupports.FragmentSupport.OnPrepareOptionsMenuListener {}
}
