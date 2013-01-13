package com.actionbarsherlock.app;

import com.actionbarsherlock.ActionBarSherlock.OnActionModeFinishedListener;
import com.actionbarsherlock.ActionBarSherlock.OnActionModeStartedListener;
import com.actionbarsherlock.view.ActionMode;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;
import com.actionbarsherlock.view.MenuItem;

public abstract class SherlockSupports {
	
	public static class ActivitySupport {	
		/** activity interface for progress callback */
		public interface SherlockSupportProgress {	
		    public void setSupportProgress(int progress);
		    public void setSupportProgressBarIndeterminate(boolean indeterminate);
		    public void setSupportProgressBarIndeterminateVisibility(boolean visible);
		    public void setSupportProgressBarVisibility(boolean visible);
		    public void setSupportSecondaryProgress(int secondaryProgress);
		}
		
		/** activity interface for actionbarsupport */
		public interface SherlockSupportActionBar {	
			public ActionBar getSupportActionBar();
		}
		
		/** activity interface for actionmode callbacks */
		public interface SherlockSupportActionMode  extends OnActionModeStartedListener, OnActionModeFinishedListener{
		    public ActionMode startActionMode(ActionMode.Callback callback);
		}
		
		/** activity interface for menuinflater support	 */
		public interface SherlockSupportMenuInflater {
			public MenuInflater getSupportMenuInflater();
		}
		
		/** activity interface for invalidateoptionsmenu */
		public interface SherlockSupportInvalidateOptionsMenu {
			public void supportInvalidateOptionsMenu();
		}
		
		/** activity interface for windowfeature support */
		public interface SherlockWindowFeatureSupport {
			public void requestWindowFeature(long featureId);
		}
	}
	
	public static class FragmentSupport {	
		/** Fragment interface for menu creation callback. */
		public interface OnCreateOptionsMenuListener {
		    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater);
		}
			
		/** Fragment interface for menu item selection callback. */
		public interface OnOptionsItemSelectedListener {
		  public boolean onOptionsItemSelected(MenuItem item);
		}
	
		/** Fragment interface for menu preparation callback. */
		public interface OnPrepareOptionsMenuListener {
		    public void onPrepareOptionsMenu(Menu menu);
		}
	}
}
