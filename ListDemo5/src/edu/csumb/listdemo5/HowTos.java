package edu.csumb.listdemo5;

import android.os.Build;
import android.os.Bundle;
import android.annotation.TargetApi;
import android.app.Activity;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.content.Intent;
/*import android.widget.EditText; */

public class HowTos extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_how_tos);
		// Show the Up button in the action bar.
		setupActionBar();
	}

	/**
	 * Set up the {@link android.app.ActionBar}, if the API is available.
	 */
	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	private void setupActionBar() {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
			getActionBar().setDisplayHomeAsUpEnabled(true);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.help_topic, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			// This ID represents the Home or Up button. In the case of this
			// activity, the Up button is shown. Use NavUtils to allow users
			// to navigate up one level in the application structure. For
			// more details, see the Navigation pattern on Android Design:
			//
			// http://developer.android.com/design/patterns/navigation.html#up-vs-back
			//
			NavUtils.navigateUpFromSameTask(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	public void getPageVirus(View view) {
		Intent intent = new Intent(this, PageVirus.class);
	    startActivity(intent);
	}
	
	public void getPageSlow(View view) {
		Intent intent = new Intent(this, PageSlow.class);
	    startActivity(intent);
	}
	
	public void getPageGuard(View view) {
		Intent intent = new Intent(this, PageGuard.class);
	    startActivity(intent);
	}
	
	public void getPageInternet(View view) {
		Intent intent = new Intent(this, PageInternet.class);
	    startActivity(intent);
	}
	
	public void getPageGoogle(View view) {
		Intent intent = new Intent(this, PageGoogle.class);
	    startActivity(intent);
	}
	
	public void getPageTopics(View view) {
		Intent intent = new Intent(this, PageMoreTopics.class);
	    startActivity(intent);
	}

}
