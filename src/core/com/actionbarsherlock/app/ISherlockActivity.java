package com.actionbarsherlock.app;

import com.actionbarsherlock.app.SherlockListeners.SherlockListenerActivity;
import com.actionbarsherlock.app.SherlockSupports.ActivitySupport.SherlockSupportActionBar;
import com.actionbarsherlock.app.SherlockSupports.ActivitySupport.SherlockSupportActionMode;
import com.actionbarsherlock.app.SherlockSupports.ActivitySupport.SherlockSupportInvalidateOptionsMenu;
import com.actionbarsherlock.app.SherlockSupports.ActivitySupport.SherlockSupportMenuInflater;
import com.actionbarsherlock.app.SherlockSupports.ActivitySupport.SherlockSupportProgress;
import com.actionbarsherlock.app.SherlockSupports.ActivitySupport.SherlockWindowFeatureSupport;

public interface ISherlockActivity extends 
SherlockListenerActivity, 
SherlockSupportProgress, 
SherlockSupportActionBar,
SherlockSupportActionMode,
SherlockSupportMenuInflater,
SherlockSupportInvalidateOptionsMenu,
SherlockWindowFeatureSupport {}
