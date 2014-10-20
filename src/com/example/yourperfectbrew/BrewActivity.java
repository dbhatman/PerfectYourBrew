package com.example.yourperfectbrew;

import BrewBackEnd.BrewParameters;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class BrewActivity extends Activity {
	public final static String BREW_PARAMETERS = "com.example.perfectyourbrew.BREW";
	private BrewParameters brew;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_brew);

		// Get the message from the intent

		Intent intent = getIntent();
		brew = intent.getParcelableExtra(BREW_PARAMETERS);

		
		StringBuilder brew_content = new StringBuilder();
		// Create the text view for brew parameters
		TextView textView = new TextView(this);
		textView.setTextSize(16);
		brew_content.append(brew.getStyle().toString());
		// Create the text view for type of water amount
		brew_content.append("\nWater: " + Double.toString(brew.getWaterVolume())
				+ " oz (" + Double.toString(brew.getWaterWeight()) + " g)");
		brew_content.append("\nCoffee: " + Double.toString(brew.getCoffeeWeight()) + " g");
		
		textView.setText(brew_content);
		// Set the text view as the activity layout
		setContentView(textView);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.brew, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
